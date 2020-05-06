package homecontroller.restapi.service;

import java.util.Map;
public interface ApiService {

    Map<String, Object> getWeather(String q);
}
