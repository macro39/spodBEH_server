
package peaks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peak" type="{http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types}Peak"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getByIdResponse", propOrder = {
    "peak"
})
public class GetByIdResponse {

    @XmlElement(required = true)
    protected Peak peak;

    /**
     * Gets the value of the peak property.
     * 
     * @return
     *     possible object is
     *     {@link Peak }
     *     
     */
    public Peak getPeak() {
        return peak;
    }

    /**
     * Sets the value of the peak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Peak }
     *     
     */
    public void setPeak(Peak value) {
        this.peak = value;
    }

}
