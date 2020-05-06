
package weatherforecast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAverageWindStrength complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAverageWindStrength">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "getAverageWindStrength", propOrder = {
    "year",
    "coordLat",
    "coordLon"
})
public class GetAverageWindStrength {

    protected int year;
    @XmlElement(name = "coord_lat")
    protected double coordLat;
    @XmlElement(name = "coord_lon")
    protected double coordLon;

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
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
