
package location;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the location package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DistanceByZIP_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "distanceByZIP");
    private final static QName _ValidateZIPCodeResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "validateZIPCodeResponse");
    private final static QName _DistanceByGPS_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "distanceByGPS");
    private final static QName _DistanceByGPSResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "distanceByGPSResponse");
    private final static QName _ValidateZIPCode_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "validateZIPCode");
    private final static QName _DistanceByZIPResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", "distanceByZIPResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: location
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanceByZIPResponse }
     * 
     */
    public DistanceByZIPResponse createDistanceByZIPResponse() {
        return new DistanceByZIPResponse();
    }

    /**
     * Create an instance of {@link DistanceByGPS }
     * 
     */
    public DistanceByGPS createDistanceByGPS() {
        return new DistanceByGPS();
    }

    /**
     * Create an instance of {@link DistanceByGPSResponse }
     * 
     */
    public DistanceByGPSResponse createDistanceByGPSResponse() {
        return new DistanceByGPSResponse();
    }

    /**
     * Create an instance of {@link ValidateZIPCode }
     * 
     */
    public ValidateZIPCode createValidateZIPCode() {
        return new ValidateZIPCode();
    }

    /**
     * Create an instance of {@link DistanceByZIP }
     * 
     */
    public DistanceByZIP createDistanceByZIP() {
        return new DistanceByZIP();
    }

    /**
     * Create an instance of {@link ValidateZIPCodeResponse }
     * 
     */
    public ValidateZIPCodeResponse createValidateZIPCodeResponse() {
        return new ValidateZIPCodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceByZIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "distanceByZIP")
    public JAXBElement<DistanceByZIP> createDistanceByZIP(DistanceByZIP value) {
        return new JAXBElement<DistanceByZIP>(_DistanceByZIP_QNAME, DistanceByZIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateZIPCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "validateZIPCodeResponse")
    public JAXBElement<ValidateZIPCodeResponse> createValidateZIPCodeResponse(ValidateZIPCodeResponse value) {
        return new JAXBElement<ValidateZIPCodeResponse>(_ValidateZIPCodeResponse_QNAME, ValidateZIPCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceByGPS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "distanceByGPS")
    public JAXBElement<DistanceByGPS> createDistanceByGPS(DistanceByGPS value) {
        return new JAXBElement<DistanceByGPS>(_DistanceByGPS_QNAME, DistanceByGPS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceByGPSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "distanceByGPSResponse")
    public JAXBElement<DistanceByGPSResponse> createDistanceByGPSResponse(DistanceByGPSResponse value) {
        return new JAXBElement<DistanceByGPSResponse>(_DistanceByGPSResponse_QNAME, DistanceByGPSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateZIPCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "validateZIPCode")
    public JAXBElement<ValidateZIPCode> createValidateZIPCode(ValidateZIPCode value) {
        return new JAXBElement<ValidateZIPCode>(_ValidateZIPCode_QNAME, ValidateZIPCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceByZIPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/locations/types", name = "distanceByZIPResponse")
    public JAXBElement<DistanceByZIPResponse> createDistanceByZIPResponse(DistanceByZIPResponse value) {
        return new JAXBElement<DistanceByZIPResponse>(_DistanceByZIPResponse_QNAME, DistanceByZIPResponse.class, null, value);
    }

}
