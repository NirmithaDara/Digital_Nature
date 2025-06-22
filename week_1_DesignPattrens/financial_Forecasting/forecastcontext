package financialforecasting;

import java.util.List;

public class ForecastContext {
    private ForecastStrategy strategy;

    public void setStrategy(ForecastStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeForecast(List<Double> data) {
        if (strategy == null) {
            throw new IllegalStateException("Forecast strategy not set.");
        }
        return strategy.predict(data);
    }
}
