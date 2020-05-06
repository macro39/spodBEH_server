
package peaks;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the peaks package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetByIdResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getByIdResponse");
    private final static QName _GetHeightResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getHeightResponse");
    private final static QName _GetByNameResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getByNameResponse");
    private final static QName _Peaks_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "Peaks");
    private final static QName _GetHeight_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getHeight");
    private final static QName _GetByIds_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getByIds");
    private final static QName _SearchByNameResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "searchByNameResponse");
    private final static QName _SearchByName_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "searchByName");
    private final static QName _GetById_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getById");
    private final static QName _Peak_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "Peak");
    private final static QName _GetByIdsResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getByIdsResponse");
    private final static QName _GetByName_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", "getByName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: peaks
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetByIds }
     * 
     */
    public GetByIds createGetByIds() {
        return new GetByIds();
    }

    /**
     * Create an instance of {@link GetByNameResponse }
     * 
     */
    public GetByNameResponse createGetByNameResponse() {
        return new GetByNameResponse();
    }

    /**
     * Create an instance of {@link Peaks }
     * 
     */
    public Peaks createPeaks() {
        return new Peaks();
    }

    /**
     * Create an instance of {@link GetHeight }
     * 
     */
    public GetHeight createGetHeight() {
        return new GetHeight();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link GetHeightResponse }
     * 
     */
    public GetHeightResponse createGetHeightResponse() {
        return new GetHeightResponse();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link GetByName }
     * 
     */
    public GetByName createGetByName() {
        return new GetByName();
    }

    /**
     * Create an instance of {@link GetByIdsResponse }
     * 
     */
    public GetByIdsResponse createGetByIdsResponse() {
        return new GetByIdsResponse();
    }

    /**
     * Create an instance of {@link Peak }
     * 
     */
    public Peak createPeak() {
        return new Peak();
    }

    /**
     * Create an instance of {@link ArrayOfIds }
     * 
     */
    public ArrayOfIds createArrayOfIds() {
        return new ArrayOfIds();
    }

    /**
     * Create an instance of {@link ArrayOfPeaks }
     * 
     */
    public ArrayOfPeaks createArrayOfPeaks() {
        return new ArrayOfPeaks();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getHeightResponse")
    public JAXBElement<GetHeightResponse> createGetHeightResponse(GetHeightResponse value) {
        return new JAXBElement<GetHeightResponse>(_GetHeightResponse_QNAME, GetHeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getByNameResponse")
    public JAXBElement<GetByNameResponse> createGetByNameResponse(GetByNameResponse value) {
        return new JAXBElement<GetByNameResponse>(_GetByNameResponse_QNAME, GetByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Peaks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "Peaks")
    public JAXBElement<Peaks> createPeaks(Peaks value) {
        return new JAXBElement<Peaks>(_Peaks_QNAME, Peaks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getHeight")
    public JAXBElement<GetHeight> createGetHeight(GetHeight value) {
        return new JAXBElement<GetHeight>(_GetHeight_QNAME, GetHeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getByIds")
    public JAXBElement<GetByIds> createGetByIds(GetByIds value) {
        return new JAXBElement<GetByIds>(_GetByIds_QNAME, GetByIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "searchByNameResponse")
    public JAXBElement<SearchByNameResponse> createSearchByNameResponse(SearchByNameResponse value) {
        return new JAXBElement<SearchByNameResponse>(_SearchByNameResponse_QNAME, SearchByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "searchByName")
    public JAXBElement<SearchByName> createSearchByName(SearchByName value) {
        return new JAXBElement<SearchByName>(_SearchByName_QNAME, SearchByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Peak }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "Peak")
    public JAXBElement<Peak> createPeak(Peak value) {
        return new JAXBElement<Peak>(_Peak_QNAME, Peak.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getByIdsResponse")
    public JAXBElement<GetByIdsResponse> createGetByIdsResponse(GetByIdsResponse value) {
        return new JAXBElement<GetByIdsResponse>(_GetByIdsResponse_QNAME, GetByIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/peaks/types", name = "getByName")
    public JAXBElement<GetByName> createGetByName(GetByName value) {
        return new JAXBElement<GetByName>(_GetByName_QNAME, GetByName.class, null, value);
    }

}
