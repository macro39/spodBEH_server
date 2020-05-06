package sk.pis.spodBEH_server.service;

import org.springframework.stereotype.Service;
import weatherforecast.WeatherForecastPortType;
import weatherforecast.WeatherForecastService;

@Service
public class WeatherService {

    WeatherForecastPortType service = new WeatherForecastService().getPort(WeatherForecastPortType.class);

    public String getWeather() {
//        return service.getTemperatureByDate(new Date(), 0.0, 0.0);
        return "";
    }
}
