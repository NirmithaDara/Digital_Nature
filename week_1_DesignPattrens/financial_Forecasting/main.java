package financialforecasting;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> revenueHistory = Arrays.asList(10000.0, 10500.0, 11000.0, 11500.0, 12000.0);

        ForecastContext context = new ForecastContext();

       
        context.setStrategy(new LinearForecast());
        double linearResult = context.executeForecast(revenueHistory);
        System.out.println("Linear Forecast Prediction: ₹" + linearResult);

        
        context.setStrategy(new MovingAverageForecast(3));
        double movingAvgResult = context.executeForecast(revenueHistory);
        System.out.println("Moving Average Forecast Prediction: ₹" + movingAvgResult);
    }
}
