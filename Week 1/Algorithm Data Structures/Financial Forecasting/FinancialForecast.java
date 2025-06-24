public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    // Optimized using Memoization (to avoid redundant computation)
    public static double futureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }

    // Iterative approach (most efficient)
    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        double result = presentValue;
        for (int i = 1; i <= years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}
