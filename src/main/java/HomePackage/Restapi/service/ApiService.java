package HomePackage.Restapi.service;

import HomePackage.Restapi.models.WeatherData;

public interface ApiService {

    WeatherData getWeatherData(String name);
    void saveWeatherData(WeatherData weatherData);
}
