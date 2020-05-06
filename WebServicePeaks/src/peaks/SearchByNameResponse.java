
package peaks;

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
 *         &lt;element name="peaks" type="{http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types}ArrayOfPeaks"/>
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
    "peaks"
})
public class SearchByNameResponse {

    @XmlElement(required = true)
    protected ArrayOfPeaks peaks;

    /**
     * Gets the value of the peaks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeaks }
     *     
     */
    public ArrayOfPeaks getPeaks() {
        return peaks;
    }

    /**
     * Sets the value of the peaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeaks }
     *     
     */
    public void setPeaks(ArrayOfPeaks value) {
        this.peaks = value;
    }

}
