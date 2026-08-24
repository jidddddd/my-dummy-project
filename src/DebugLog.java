public final class DebugLog {
    private static boolean enabled = true;

    private DebugLog() {
    }

    public static void setEnabled(boolean enabled) {
        DebugLog.enabled = enabled;
    }

    public static void log(String message) {
        if (enabled) {
            System.err.println("[DEBUG] " + message);
        }
    }
}
