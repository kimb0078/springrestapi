package HomePackage.Restapi.controllers;

import HomePackage.Restapi.models.Weather;
import HomePackage.Restapi.models.WeatherData;
import HomePackage.Restapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ApiService apiService;

    @GetMapping("/")
    public String index(Model model){
        return "home";
    }

    @PostMapping("/weatherData")
    public String weatherData(WebRequest webRequest){
        String name = webRequest.getParameter("name");
        return "redirect:/weatherData/" + name;
    }

    @GetMapping("weatherData/{name}")
    public String index(@PathVariable String name, Model model){
        WeatherData weatherData = apiService.getWeatherData(name);
        model.addAttribute("weatherData", weatherData);
        List<Weather> weather = weatherData.getWeather();
        model.addAttribute("weather", weather);
        apiService.saveWeatherData(weatherData);
        return "weatherData";
    }
}

