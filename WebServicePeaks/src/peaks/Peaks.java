
package peaks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Peaks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Peaks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="country_iso_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coord_lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coord_lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="countryarea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Peaks", propOrder = {
    "id",
    "name",
    "height",
    "countryIsoCode",
    "coordLat",
    "coordLon",
    "countryarea"
})
public class Peaks {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected int height;
    @XmlElement(name = "country_iso_code", required = true)
    protected String countryIsoCode;
    @XmlElement(name = "coord_lat")
    protected double coordLat;
    @XmlElement(name = "coord_lon")
    protected double coordLon;
    @XmlElement(required = true)
    protected String countryarea;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the countryIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    /**
     * Sets the value of the countryIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIsoCode(String value) {
        this.countryIsoCode = value;
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

    /**
     * Gets the value of the countryarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryarea() {
        return countryarea;
    }

    /**
     * Sets the value of the countryarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryarea(String value) {
        this.countryarea = value;
    }

}
