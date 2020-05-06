
package peaks;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PeaksPortType", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeaksPortType {


    /**
     * 
     * @param name
     * @return
     *     returns peaks.Peak
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/#getByName")
    @WebResult(name = "peak", targetNamespace = "")
    @RequestWrapper(localName = "getByName", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetByName")
    @ResponseWrapper(localName = "getByNameResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetByNameResponse")
    public Peak getByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns peaks.ArrayOfPeaks
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/#searchByName")
    @WebResult(name = "peaks", targetNamespace = "")
    @RequestWrapper(localName = "searchByName", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.SearchByName")
    @ResponseWrapper(localName = "searchByNameResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.SearchByNameResponse")
    public ArrayOfPeaks searchByName(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param ids
     * @return
     *     returns peaks.ArrayOfPeaks
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/#getByIds")
    @WebResult(name = "peaks", targetNamespace = "")
    @RequestWrapper(localName = "getByIds", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetByIds")
    @ResponseWrapper(localName = "getByIdsResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetByIdsResponse")
    public ArrayOfPeaks getByIds(
        @WebParam(name = "ids", targetNamespace = "")
        ArrayOfIds ids);

    /**
     * 
     * @param id
     * @return
     *     returns peaks.Peak
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/#getById")
    @WebResult(name = "peak", targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetByIdResponse")
    public Peak getById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param peakId
     * @return
     *     returns int
     */
    @WebMethod(action = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/#getHeight")
    @WebResult(name = "vyska", targetNamespace = "")
    @RequestWrapper(localName = "getHeight", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetHeight")
    @ResponseWrapper(localName = "getHeightResponse", targetNamespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", className = "peaks.GetHeightResponse")
    public int getHeight(
        @WebParam(name = "peak_id", targetNamespace = "")
        int peakId);

}
