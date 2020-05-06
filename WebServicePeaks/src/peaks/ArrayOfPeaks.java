
package peaks;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPeaks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPeaks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peak" type="{http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types}Peaks" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPeaks", propOrder = {
    "peak"
})
public class ArrayOfPeaks {

    @XmlElement(nillable = true)
    protected List<Peaks> peak;

    /**
     * Gets the value of the peak property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peak property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeak().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Peaks }
     * 
     * 
     */
    public List<Peaks> getPeak() {
        if (peak == null) {
            peak = new ArrayList<Peaks>();
        }
        return this.peak;
    }

}
