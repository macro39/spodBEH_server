
package smsnotificator;

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
@WebService(name = "SMSPortType", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SMSPortType {


    /**
     * 
     * @param password
     * @param phone
     * @param subject
     * @param teamId
     * @param message
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/#notify")
    @WebResult(name = "success", targetNamespace = "")
    @RequestWrapper(localName = "notify", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", className = "smsnotificator.Notify")
    @ResponseWrapper(localName = "notifyResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", className = "smsnotificator.NotifyResponse")
    public boolean notify(
        @WebParam(name = "team_id", targetNamespace = "")
        String teamId,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "phone", targetNamespace = "")
        String phone,
        @WebParam(name = "subject", targetNamespace = "")
        String subject,
        @WebParam(name = "message", targetNamespace = "")
        String message);

    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/#getPrice")
    @WebResult(name = "price", targetNamespace = "")
    @RequestWrapper(localName = "getPrice", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", className = "smsnotificator.GetPrice")
    @ResponseWrapper(localName = "getPriceResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/notificationservices/sms/types", className = "smsnotificator.GetPriceResponse")
    public double getPrice(
        @WebParam(name = "amount", targetNamespace = "")
        int amount);

}
