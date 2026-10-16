package jvmprobe4;

/**
 * Helper that references a secureIndex=4 class (CodeModuleManager, RIM Runtime
 * API). Kept in its OWN class so it is not touched by the entry class until the
 * menu item asks for it, letting us distinguish eager whole-module link-time
 * verification from lazy per-class verification.
 */
public class SecureTouch {

    public static String go() {
        int[] h = net.rim.device.api.system.CodeModuleManager.getModuleHandles();
        return "handles=" + (h == null ? -1 : h.length);
    }
}
