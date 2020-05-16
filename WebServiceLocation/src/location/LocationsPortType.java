
package location;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocationsPortType", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationsPortType {


    /**
     * 
     * @param latitudeTo
     * @param longitudeFrom
     * @param longitudeTo
     * @param latitudeFrom
     * @return
     *     returns double
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/#distanceByGPS")
    @WebResult(name = "distance", targetNamespace = "")
    @RequestWrapper(localName = "distanceByGPS", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.DistanceByGPS")
    @ResponseWrapper(localName = "distanceByGPSResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.DistanceByGPSResponse")
    public double distanceByGPS(
        @WebParam(name = "latitudeFrom", targetNamespace = "")
        double latitudeFrom,
        @WebParam(name = "longitudeFrom", targetNamespace = "")
        double longitudeFrom,
        @WebParam(name = "latitudeTo", targetNamespace = "")
        double latitudeTo,
        @WebParam(name = "longitudeTo", targetNamespace = "")
        double longitudeTo);

    /**
     * 
     * @param zipTo
     * @param zipFrom
     * @return
     *     returns double
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/#distanceByZIP")
    @WebResult(name = "distance", targetNamespace = "")
    @RequestWrapper(localName = "distanceByZIP", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.DistanceByZIP")
    @ResponseWrapper(localName = "distanceByZIPResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.DistanceByZIPResponse")
    public double distanceByZIP(
        @WebParam(name = "zip_from", targetNamespace = "")
        String zipFrom,
        @WebParam(name = "zip_to", targetNamespace = "")
        String zipTo);

    /**
     * 
     * @param zip
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/#validateZIPCode")
    @WebResult(name = "exists", targetNamespace = "")
    @RequestWrapper(localName = "validateZIPCode", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.ValidateZIPCode")
    @ResponseWrapper(localName = "validateZIPCodeResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", className = "location.ValidateZIPCodeResponse")
    public boolean validateZIPCode(
        @WebParam(name = "zip", targetNamespace = "")
        String zip);

}