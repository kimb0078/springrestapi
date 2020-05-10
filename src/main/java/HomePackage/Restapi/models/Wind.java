
package HomePackage.Restapi.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Wind implements Serializable
{

    private Double speed;
    private Integer deg;

    private WeatherData weatherData;

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

}
