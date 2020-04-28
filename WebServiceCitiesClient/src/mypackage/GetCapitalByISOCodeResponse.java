
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCapitalByISOCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCapitalByISOCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types}City"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCapitalByISOCodeResponse", propOrder = {
    "city"
})
public class GetCapitalByISOCodeResponse {

    @XmlElement(required = true)
    protected City city;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

}
