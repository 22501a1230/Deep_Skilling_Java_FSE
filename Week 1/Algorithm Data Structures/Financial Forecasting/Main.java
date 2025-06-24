public class Main {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.05; // 5% annual growth
        int years = 10;

        double futureRecursive = FinancialForecast.futureValueRecursive(presentValue, growthRate, years);
        System.out.println("Recursive Forecast: $" + futureRecursive);

        double[] memo = new double[years + 1];
        double futureMemo = FinancialForecast.futureValueMemo(presentValue, growthRate, years, memo);
        System.out.println("Memoized Forecast: $" + futureMemo);

        double futureIter = FinancialForecast.futureValueIterative(presentValue, growthRate, years);
        System.out.println("Iterative Forecast: $" + futureIter);
    }
}
