package jvmprobe3;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.system.ControlledAccess;
import net.rim.device.api.system.CodeSigningKey;
import net.rim.device.api.system.EventLogger;

/**
 * JvmProbe3 v1.0.0
 *
 * Disambiguates the session34 runtime fault. References ONLY non-secure
 * (secureIndex 255) API classes so the module links, then exercises each API
 * step-by-step from a worker thread, rendering every step's outcome on screen
 * (readable with "JavaLoader -u screenshot") because EventLogger output is not
 * available to an unsigned module.
 *
 * Hypotheses under test:
 *   (a) pure Java works; only NATIVE API methods are gated (RIMAPPSA2), or
 *   (b) all protected API members are gated regardless of native-ness.
 */
public class JvmProbe3 extends UiApplication {

    private static final long GUID = 0x4A564D50524F4233L; // "JVMPROB3"

    private final StringBuffer _sb = new StringBuffer();
    private MainScreen _sc;

    public static void main(String[] args) {
        new JvmProbe3().enterEventDispatcher();
    }

    public JvmProbe3() {
        _sc = new MainScreen();
        _sc.setTitle("JVM Probe3 v1.0.0");
        pushScreen(_sc);
        line("JvmProbe3 start " + System.currentTimeMillis());
        Thread t = new Thread(new Runnable() { public void run() { steps(); } });
        t.start();
    }

    private void line(final String s) {
        _sb.append(s).append('\n');
        final RichTextField f = new RichTextField(s.length() == 0 ? " " : s);
        invokeLater(new Runnable() { public void run() { try { _sc.add(f); } catch (Throwable ignore) {} } });
    }

    private void pre(String s) { line(">> " + s); sleep(600); }
    private void post(String s) { line("   " + s); sleep(400); }

    private static String tn(Throwable t) {
        String m = t.getMessage();
        return t.getClass().getName() + (m == null ? "" : (": " + m));
    }

    private void sleep(long ms) { try { Thread.sleep(ms); } catch (Throwable t) {} }

    private void steps() {
        pre("S1 pure java");
        try { post("ok t=" + System.currentTimeMillis()); }
        catch (Throwable t) { post("EX " + tn(t)); }

        pre("S2 Integer.toHexString (lib, non-native?)");
        try { post("0x" + Integer.toHexString(0xDEADBEEF)); }
        catch (Throwable t) { post("EX " + tn(t)); }

        pre("S3 EventLogger.register");
        try { post("-> " + EventLogger.register(GUID, "jvmprobe3", EventLogger.ALWAYS_LOG)); }
        catch (Throwable t) { post("EX " + tn(t)); }

        pre("S4 EventLogger.logEvent");
        try { EventLogger.logEvent(GUID, "hello".getBytes(), EventLogger.ALWAYS_LOG); post("-> returned ok"); }
        catch (Throwable t) { post("EX " + tn(t)); }

        pre("S5 CodeSigningKey.get(RRT,0)");
        try {
            CodeSigningKey k = CodeSigningKey.get(CodeSigningKey.RRT_SIGNER_ID, 0);
            post("-> " + (k == null ? "null" : ("signerId=" + k.getSignerId())));
        } catch (Throwable t) { post("EX " + tn(t)); }

        pre("S6 ControlledAccess.verifySignatures(true,RRT)");
        try { post("-> " + ControlledAccess.verifySignatures(true, CodeSigningKey.RRT_SIGNER_ID)); }
        catch (Throwable t) { post("EX " + tn(t)); }

        pre("S7 done");
        post("END (app still running)");
    }
}
