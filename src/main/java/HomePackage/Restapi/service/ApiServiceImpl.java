package HomePackage.Restapi.service;

import HomePackage.Restapi.models.WeatherData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService{


    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherData getWeatherData(String name) {
        WeatherData weatherData = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=2ee4308c6d9061e40c94bebe09d5a399&units=metric", WeatherData.class);
        return weatherData;
    }

    @Override
    public void saveWeatherData(WeatherData weatherData) {

    }
}
