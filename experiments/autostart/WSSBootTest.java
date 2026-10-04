package wss;

import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.RichTextField;
import net.rim.device.api.system.EventLogger;
import java.util.Timer;
import java.util.TimerTask;

/**
 * WSS Boot Test v1.0.2
 * Autostart module. Repeatedly requests the foreground after boot (Home tends
 * to hold focus), and logs an event-log marker so execution is provable even
 * if the UI never surfaces.
 */
public class WSSBootTest extends UiApplication {

    private static final long GUID = 0x575353424F4F5450L; // "WSSBOOTP"

    public static void main(String[] args) {
        WSSBootTest app = new WSSBootTest();
        app.enterEventDispatcher();
    }

    public WSSBootTest() {
        final MainScreen screen = new MainScreen();
        screen.setTitle("WSS Boot Module");
        screen.add(new LabelField("WSS custom boot module: AUTOSTART OK"));
        screen.add(new RichTextField("v1.0.2 - started at device boot."));
        pushScreen(screen);

        // Proof-of-execution marker in the system event log.
        try {
            EventLogger.register(GUID, "wssboot", EventLogger.ALWAYS_LOG);
            EventLogger.logEvent(GUID,
                ("WSSBOOT v1.0.2 main() ran at " + System.currentTimeMillis()).getBytes(),
                EventLogger.ALWAYS_LOG);
        } catch (Throwable t) {
            // EventLogger may be a controlled API; ignore if denied.
        }

        // Keep asking for the foreground for ~12s to beat the Home screen.
        final WSSBootTest self = this;
        for (int i = 1; i <= 6; i++) {
            try {
                new Timer().schedule(new TimerTask() {
                    public void run() {
                        self.invokeLater(new Runnable() {
                            public void run() {
                                try { self.requestForeground(); } catch (Throwable t) {}
                            }
                        });
                    }
                }, i * 2000L);
            } catch (Throwable t) {
            }
        }
    }
}
