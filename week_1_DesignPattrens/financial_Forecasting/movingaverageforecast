package financialforecasting;

import java.util.List;

public class MovingAverageForecast implements ForecastStrategy {
    private final int windowSize;

    public MovingAverageForecast(int windowSize) {
        this.windowSize = windowSize;
    }

    @Override
    public double predict(List<Double> historicalData) {
        int size = historicalData.size();
        if (size < windowSize) {
            return 0;
        }

        double sum = 0;
        for (int i = size - windowSize; i < size; i++) {
            sum += historicalData.get(i);
        }

        return sum / windowSize;
    }
}
