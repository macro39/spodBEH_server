
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CitiesService", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities", wsdlLocation = "http://pis.predmety.fiit.stuba.sk/pis/ws/GeoServices/Cities?WSDL")
public class CitiesService
    extends Service
{

    private final static URL CITIESSERVICE_WSDL_LOCATION;
    private final static WebServiceException CITIESSERVICE_EXCEPTION;
    private final static QName CITIESSERVICE_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities", "CitiesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://pis.predmety.fiit.stuba.sk/pis/ws/GeoServices/Cities?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CITIESSERVICE_WSDL_LOCATION = url;
        CITIESSERVICE_EXCEPTION = e;
    }

    public CitiesService() {
        super(__getWsdlLocation(), CITIESSERVICE_QNAME);
    }

    public CitiesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CITIESSERVICE_QNAME, features);
    }

    public CitiesService(URL wsdlLocation) {
        super(wsdlLocation, CITIESSERVICE_QNAME);
    }

    public CitiesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CITIESSERVICE_QNAME, features);
    }

    public CitiesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CitiesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CitiesPortType
     */
    @WebEndpoint(name = "CitiesPort")
    public CitiesPortType getCitiesPort() {
        return super.getPort(new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities", "CitiesPort"), CitiesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CitiesPortType
     */
    @WebEndpoint(name = "CitiesPort")
    public CitiesPortType getCitiesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities", "CitiesPort"), CitiesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CITIESSERVICE_EXCEPTION!= null) {
            throw CITIESSERVICE_EXCEPTION;
        }
        return CITIESSERVICE_WSDL_LOCATION;
    }

}
