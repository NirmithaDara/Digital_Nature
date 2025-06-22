package financialforecasting;

import java.util.List;

public class LinearForecast implements ForecastStrategy {

    @Override
    public double predict(List<Double> historicalData) {
        if (historicalData.isEmpty()) {
            return 0;
        }

        int n = historicalData.size();
        double lastValue = historicalData.get(n - 1);
        double firstValue = historicalData.get(0);

        double trend = (lastValue - firstValue) / (n - 1);
        return lastValue + trend;
    }
}
