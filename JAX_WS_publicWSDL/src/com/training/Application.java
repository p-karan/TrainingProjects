package com.training;

import com.training.generic.Weather;
import com.training.generic.WeatherDescription;
import com.training.generic.WeatherReturn;
import com.training.generic.WeatherSoap;

public class Application {
    public static void main(String[] args) {
        Weather weather=new Weather();
        WeatherSoap proxy=weather.getWeatherSoap();
        WeatherReturn details=proxy.getCityWeatherByZIP("20505");
        System.out.println(details);
    }
}
