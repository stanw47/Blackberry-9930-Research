package jvmprobe4;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.MenuItem;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.RichTextField;

/**
 * JvmProbe4 v1.0.0
 *
 * Isolates the LINK-TIME class-level access-control failure. The entry class
 * contains NO reference to any secureIndex!=255 class, so the module should
 * load if verification is lazy. The only secure reference lives in helper class
 * SecureTouch (secureIndex=4 CodeModuleManager) and is reached solely via the
 * "Touch secure class" menu item.
 *
 *  - If the module fails to load/install => verification is eager (whole module).
 *  - If it loads and the menu item faults => verification is lazy (per class).
 *  - In all cases the outcome is shown on screen (readable via screenshot).
 */
public class JvmProbe4 extends UiApplication {

    private final StringBuffer _sb = new StringBuffer();
    private MainScreen _sc;

    public static void main(String[] args) {
        new JvmProbe4().enterEventDispatcher();
    }

    public JvmProbe4() {
        _sc = new MainScreen();
        _sc.setTitle("JVM Probe4 v1.0.0");
        pushScreen(_sc);
        line("JvmProbe4 LOADED OK " + System.currentTimeMillis());
        line("entry class verified; helper not yet touched");
        line("menu > 'Plain test' / 'Touch secure class'");

        _sc.addMenuItem(new MenuItem("Plain test", 0x100000, 0x100000) {
            public void run() { line("plain: 0x" + Integer.toHexString(0xABCDEF)); }
        });

        _sc.addMenuItem(new MenuItem("Touch secure class", 0x200000, 0x200000) {
            public void run() {
                line(">> SecureTouch.go()");
                try { line("OK " + SecureTouch.go()); }
                catch (Throwable t) {
                    line("EX " + t.getClass().getName() + (t.getMessage() == null ? "" : (": " + t.getMessage())));
                }
            }
        });
    }

    private void line(String s) {
        _sb.append(s).append('\n');
        _sc.add(new RichTextField(s.length() == 0 ? " " : s));
    }
}
