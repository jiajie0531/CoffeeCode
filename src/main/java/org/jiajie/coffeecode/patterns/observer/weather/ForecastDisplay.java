package org.jiajie.coffeecode.patterns.observer.weather;

/**
 * @author jay
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPreesure = 29.92f;
    private float lastPreesure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPreesure > lastPreesure){
            System.out.println("Improving weather on the way!");
        } else if (currentPreesure == lastPreesure) {
            System.out.println("More of the same");
        } else if (currentPreesure < lastPreesure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPreesure = currentPreesure;
        currentPreesure = pressure;
        display();
    }
}
