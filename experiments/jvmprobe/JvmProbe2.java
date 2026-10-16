package jvmprobe2;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.system.ControlledAccess;
import net.rim.device.api.system.CodeSigningKey;
import net.rim.device.api.system.EventLogger;

/**
 * JvmProbe2 v1.0.0
 *
 * Unsigned probe that references ONLY non-secure (secureIndex 255) API classes:
 * EventLogger, ControlledAccess, CodeSigningKey. All work is done from the
 * static initializer so that, if the VM runs &lt;clinit&gt; at link time, results are
 * produced without the app ever being launched.
 */
public class JvmProbe2 extends UiApplication {

    private static final long GUID = 0x4A564D50524F4232L; // "JVMPROB2"
    private static final StringBuffer SB = new StringBuffer();

    private static void L(String s) {
        SB.append(s).append('\n');
        try { EventLogger.logEvent(GUID, s.getBytes(), EventLogger.ALWAYS_LOG); } catch (Throwable t) {}
    }

    static {
        try { EventLogger.register(GUID, "jvmprobe2", EventLogger.ALWAYS_LOG); } catch (Throwable t) {}
        L("JP2 clinit " + System.currentTimeMillis());
        try {
            L("RRT=" + Integer.toHexString(CodeSigningKey.RRT_SIGNER_ID));
            L("RBB=" + Integer.toHexString(CodeSigningKey.RBB_SIGNER_ID));
            L("RCC=" + Integer.toHexString(CodeSigningKey.RCC_SIGNER_ID));
            L("RCR=" + Integer.toHexString(CodeSigningKey.RCR_SIGNER_ID));
        } catch (Throwable t) { L("signerIds: " + t); }
        try { L("vs(RRT)=" + ControlledAccess.verifySignatures(true, CodeSigningKey.RRT_SIGNER_ID)); }
        catch (Throwable t) { L("vs RRT: " + t); }
        try { L("vs(RBB)=" + ControlledAccess.verifySignatures(true, CodeSigningKey.RBB_SIGNER_ID)); }
        catch (Throwable t) { L("vs RBB: " + t); }
        try { L("vs(51)=" + ControlledAccess.verifySignatures(true, 0x33)); }
        catch (Throwable t) { L("vs 51: " + t); }
        try {
            CodeSigningKey k = CodeSigningKey.get(CodeSigningKey.RRT_SIGNER_ID, 0);
            L("key(RRT)=" + (k == null ? "null" : (k.getSignerId() + " pklen=" + (k.getPublicKey() == null ? -1 : k.getPublicKey().length))));
        } catch (Throwable t) { L("key: " + t); }
        L("JP2 clinit done");
    }

    public static void main(String[] args) {
        new JvmProbe2().enterEventDispatcher();
    }

    public JvmProbe2() {
        MainScreen sc = new MainScreen();
        sc.setTitle("JVM Probe2 v1.0.0");
        L("JP2 main ran");
        sc.add(new RichTextField(SB.toString()));
        pushScreen(sc);
    }
}
