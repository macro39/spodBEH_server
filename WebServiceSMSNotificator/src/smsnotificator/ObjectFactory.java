
package smsnotificator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the smsnotificator package. 
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

    private final static QName _Notify_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", "notify");
    private final static QName _GetPrice_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", "getPrice");
    private final static QName _NotifyResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", "notifyResponse");
    private final static QName _GetPriceResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", "getPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: smsnotificator
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link NotifyResponse }
     * 
     */
    public NotifyResponse createNotifyResponse() {
        return new NotifyResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notify }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", name = "notify")
    public JAXBElement<Notify> createNotify(Notify value) {
        return new JAXBElement<Notify>(_Notify_QNAME, Notify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", name = "notifyResponse")
    public JAXBElement<NotifyResponse> createNotifyResponse(NotifyResponse value) {
        return new JAXBElement<NotifyResponse>(_NotifyResponse_QNAME, NotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

}
