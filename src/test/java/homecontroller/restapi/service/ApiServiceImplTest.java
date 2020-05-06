package homecontroller.restapi.service;

import homecontroller.restapi.Weather;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Test
    public Map<String, Object> testGetWeather(String q) throws Exception{
        Weather weather = apiService.getWeather("Copenhagen");
        return weather.getAdditionalProperties();


    }
}