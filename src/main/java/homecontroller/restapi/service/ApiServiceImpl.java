package homecontroller.restapi.service;

import homecontroller.restapi.models.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService{


    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Map<String, Object> getWeather(String q) {
        Weather weather = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+ q + "&appid=2ee4308c6d9061e40c94bebe09d5a399", Weather.class);
        return weather.getAdditionalProperties();
    }
}
