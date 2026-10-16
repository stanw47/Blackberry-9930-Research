package jvmprobe;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.system.ControlledAccess;
import net.rim.device.api.system.CodeSigningKey;
import net.rim.device.api.system.CodeModuleManager;
import net.rim.device.api.system.EventLogger;

/**
 * JvmProbe v1.0.0
 *
 * Unsigned probe module. Exercises the public code-signing / controlled-access
 * API from an unsigned app and logs the outcome to the system event log so the
 * result is readable back over JavaLoader regardless of the UI.
 */
public class JvmProbe extends UiApplication {

    private static final long GUID = 0x4A564D50524F4245L; // "JVMPROBE"
    private static final StringBuffer SB = new StringBuffer();

    private static void L(String s) {
        SB.append(s).append('\n');
        try { EventLogger.logEvent(GUID, s.getBytes(), EventLogger.ALWAYS_LOG); } catch (Throwable t) {}
    }

    public static void main(String[] args) {
        try { EventLogger.register(GUID, "jvmprobe", EventLogger.ALWAYS_LOG); } catch (Throwable t) {}
        new JvmProbe().enterEventDispatcher();
    }

    public JvmProbe() {
        MainScreen sc = new MainScreen();
        sc.setTitle("JVM Probe v1.0.0");
        L("JvmProbe start " + System.currentTimeMillis());

        int h = -1;
        try { h = CodeModuleManager.getModuleHandle("JvmProbe"); } catch (Throwable t) { L("getModuleHandle: " + t); }
        L("self handle=" + h);
        try { L("self name=" + CodeModuleManager.getModuleName(h) + " codeSize=" + CodeModuleManager.getModuleCodeSize(h)); }
        catch (Throwable t) { L("self name: " + t); }

        try {
            L("RRT_SIGNER_ID=" + Integer.toHexString(CodeSigningKey.RRT_SIGNER_ID));
            L("RBB_SIGNER_ID=" + Integer.toHexString(CodeSigningKey.RBB_SIGNER_ID));
            L("RCC_SIGNER_ID=" + Integer.toHexString(CodeSigningKey.RCC_SIGNER_ID));
            L("RCR_SIGNER_ID=" + Integer.toHexString(CodeSigningKey.RCR_SIGNER_ID));
        } catch (Throwable t) { L("signerIds: " + t); }

        try { L("verifySignatures(true,RRT)=" + ControlledAccess.verifySignatures(true, CodeSigningKey.RRT_SIGNER_ID)); }
        catch (Throwable t) { L("vs RRT: " + t); }
        try { L("verifySignatures(true,RBB)=" + ControlledAccess.verifySignatures(true, CodeSigningKey.RBB_SIGNER_ID)); }
        catch (Throwable t) { L("vs RBB: " + t); }
        try { L("verifySignatures(true,0x33)=" + ControlledAccess.verifySignatures(true, 0x33)); }
        catch (Throwable t) { L("vs 0x33: " + t); }

        try {
            CodeSigningKey k = CodeSigningKey.get(CodeSigningKey.RRT_SIGNER_ID, 0);
            L("key(RRT)=" + (k == null ? "null" : (k.getSignerId() + " len=" + (k.getPublicKey() == null ? -1 : k.getPublicKey().length))));
            if (k != null) {
                try { L("verifyCodeModuleSignature(self,key)=" + ControlledAccess.verifyCodeModuleSignature(h, k)); }
                catch (Throwable t) { L("vcms: " + t); }
            }
        } catch (Throwable t) { L("key: " + t); }

        try {
            int[] hs = CodeModuleManager.getModuleHandles();
            L("moduleHandles=" + (hs == null ? -1 : hs.length));
            int n = hs == null ? 0 : hs.length;
            for (int i = 0; i < n && i < 15; i++) {
                String nm = "?";
                try { nm = CodeModuleManager.getModuleName(hs[i]); } catch (Throwable t) {}
                L("  m[" + i + "] h=" + hs[i] + " " + nm);
            }
        } catch (Throwable t) { L("enum: " + t); }

        L("JvmProbe done");
        sc.add(new RichTextField(SB.toString()));
        pushScreen(sc);
    }
}
