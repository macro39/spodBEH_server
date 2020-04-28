
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cities" type="{http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types}ArrayOfCities"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByNameResponse", propOrder = {
    "cities"
})
public class SearchByNameResponse {

    @XmlElement(required = true)
    protected ArrayOfCities cities;

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCities }
     *     
     */
    public ArrayOfCities getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCities }
     *     
     */
    public void setCities(ArrayOfCities value) {
        this.cities = value;
    }

}
