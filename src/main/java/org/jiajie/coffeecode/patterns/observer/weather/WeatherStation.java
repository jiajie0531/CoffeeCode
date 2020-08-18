package org.jiajie.coffeecode.patterns.observer.weather;

/**
 * @author jay
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMesaurements(80, 65, 30.4f);
        weatherData.setMesaurements(82, 70, 29.2f);
        weatherData.setMesaurements(78, 90, 29.2f);
    }
}
