package financialforecasting;

import java.util.List;

public interface ForecastStrategy {
    double predict(List<Double> historicalData);
}
