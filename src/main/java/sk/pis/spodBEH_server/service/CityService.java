package sk.pis.spodBEH_server.service;

import mypackage.ArrayOfCities;
import mypackage.Cities;
import mypackage.CitiesPortType;
import mypackage.CitiesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CityService {

    CitiesPortType service = new CitiesService().getPort(CitiesPortType.class);

    public ArrayList<Cities> getSKCities() {
        ArrayOfCities cities = service.getAll();
        ArrayList<Cities> response = new ArrayList<>();

        for (Cities city : cities.getCity()) {
            if (city.getCountryIsoCode().equals("SK")) {
                response.add(city);
            }
        }

        return response;
    }
}
