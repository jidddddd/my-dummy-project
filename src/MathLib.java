public final class MathLib {
    private MathLib() {
    }

    public static double add(double left, double right) {
        return left + right;
    }

    public static double subtract(double left, double right) {
        return left - right;
    }

    public static double multiply(double left, double right) {
        return left * right;
    }

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }

        return dividend / divisor;
    }
}
