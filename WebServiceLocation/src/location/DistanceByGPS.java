
package location;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distanceByGPS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distanceByGPS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitudeFrom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitudeFrom" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="latitudeTo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitudeTo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distanceByGPS", propOrder = {
    "latitudeFrom",
    "longitudeFrom",
    "latitudeTo",
    "longitudeTo"
})
public class DistanceByGPS {

    protected double latitudeFrom;
    protected double longitudeFrom;
    protected double latitudeTo;
    protected double longitudeTo;

    /**
     * Gets the value of the latitudeFrom property.
     * 
     */
    public double getLatitudeFrom() {
        return latitudeFrom;
    }

    /**
     * Sets the value of the latitudeFrom property.
     * 
     */
    public void setLatitudeFrom(double value) {
        this.latitudeFrom = value;
    }

    /**
     * Gets the value of the longitudeFrom property.
     * 
     */
    public double getLongitudeFrom() {
        return longitudeFrom;
    }

    /**
     * Sets the value of the longitudeFrom property.
     * 
     */
    public void setLongitudeFrom(double value) {
        this.longitudeFrom = value;
    }

    /**
     * Gets the value of the latitudeTo property.
     * 
     */
    public double getLatitudeTo() {
        return latitudeTo;
    }

    /**
     * Sets the value of the latitudeTo property.
     * 
     */
    public void setLatitudeTo(double value) {
        this.latitudeTo = value;
    }

    /**
     * Gets the value of the longitudeTo property.
     * 
     */
    public double getLongitudeTo() {
        return longitudeTo;
    }

    /**
     * Sets the value of the longitudeTo property.
     * 
     */
    public void setLongitudeTo(double value) {
        this.longitudeTo = value;
    }

}
