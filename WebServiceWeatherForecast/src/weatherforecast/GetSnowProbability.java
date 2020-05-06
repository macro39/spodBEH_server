
package weatherforecast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSnowProbability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSnowProbability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coord_lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coord_lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSnowProbability", propOrder = {
    "date",
    "coordLat",
    "coordLon"
})
public class GetSnowProbability {

    @XmlElement(required = true)
    protected String date;
    @XmlElement(name = "coord_lat")
    protected double coordLat;
    @XmlElement(name = "coord_lon")
    protected double coordLon;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the coordLat property.
     * 
     */
    public double getCoordLat() {
        return coordLat;
    }

    /**
     * Sets the value of the coordLat property.
     * 
     */
    public void setCoordLat(double value) {
        this.coordLat = value;
    }

    /**
     * Gets the value of the coordLon property.
     * 
     */
    public double getCoordLon() {
        return coordLon;
    }

    /**
     * Sets the value of the coordLon property.
     * 
     */
    public void setCoordLon(double value) {
        this.coordLon = value;
    }

}
