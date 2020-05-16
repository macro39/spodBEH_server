package sk.pis.spodBEH_server.service;

import location.LocationsPortType;
import location.LocationsService;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    LocationsPortType service = new LocationsService().getPort(LocationsPortType.class);

    public Double calculateDistance(double latitudeFrom, double longtitudeFrom, double latitudeTo, double longtitudeTo) {
        return service.distanceByGPS(latitudeFrom, longtitudeFrom, latitudeTo, longtitudeTo);
    }

}
