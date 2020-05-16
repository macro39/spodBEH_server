
package location;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distanceByZIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distanceByZIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zip_from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip_to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distanceByZIP", propOrder = {
    "zipFrom",
    "zipTo"
})
public class DistanceByZIP {

    @XmlElement(name = "zip_from", required = true)
    protected String zipFrom;
    @XmlElement(name = "zip_to", required = true)
    protected String zipTo;

    /**
     * Gets the value of the zipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipFrom() {
        return zipFrom;
    }

    /**
     * Sets the value of the zipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipFrom(String value) {
        this.zipFrom = value;
    }

    /**
     * Gets the value of the zipTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipTo() {
        return zipTo;
    }

    /**
     * Sets the value of the zipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipTo(String value) {
        this.zipTo = value;
    }

}
