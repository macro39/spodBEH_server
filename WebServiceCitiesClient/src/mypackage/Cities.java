
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name_en" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="continent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_iso_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Cities", propOrder = {
    "id",
    "name",
    "nameEn",
    "population",
    "area",
    "continent",
    "countryIsoCode",
    "coordLat",
    "coordLon"
})
public class Cities {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "name_en", required = true)
    protected String nameEn;
    protected int population;
    protected int area;
    @XmlElement(required = true)
    protected String continent;
    @XmlElement(name = "country_iso_code", required = true)
    protected String countryIsoCode;
    @XmlElement(name = "coord_lat")
    protected double coordLat;
    @XmlElement(name = "coord_lon")
    protected double coordLon;

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
     * Gets the value of the nameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * Sets the value of the nameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEn(String value) {
        this.nameEn = value;
    }

    /**
     * Gets the value of the population property.
     * 
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Sets the value of the population property.
     * 
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Gets the value of the area property.
     * 
     */
    public int getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     */
    public void setArea(int value) {
        this.area = value;
    }

    /**
     * Gets the value of the continent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinent() {
        return continent;
    }

    /**
     * Sets the value of the continent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinent(String value) {
        this.continent = value;
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

}
