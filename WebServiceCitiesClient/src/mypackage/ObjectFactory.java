
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _GetByName_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getByName");
    private final static QName _Cities_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "Cities");
    private final static QName _GetArea_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getArea");
    private final static QName _GetCapitalByCountryNameResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getCapitalByCountryNameResponse");
    private final static QName _GetByNameResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getByNameResponse");
    private final static QName _SearchByName_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "searchByName");
    private final static QName _GetById_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getById");
    private final static QName _SearchByNameResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "searchByNameResponse");
    private final static QName _GetAreaResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getAreaResponse");
    private final static QName _City_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "City");
    private final static QName _GetCapitalByISOCode_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getCapitalByISOCode");
    private final static QName _GetPopulation_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getPopulation");
    private final static QName _GetAll_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getAll");
    private final static QName _GetByIdResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getByIdResponse");
    private final static QName _GetCapitalByISOCodeResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getCapitalByISOCodeResponse");
    private final static QName _GetAllResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getAllResponse");
    private final static QName _GetCapitalByCountryName_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getCapitalByCountryName");
    private final static QName _GetPopulationResponse_QNAME = new QName("http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", "getPopulationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPopulation }
     * 
     */
    public GetPopulation createGetPopulation() {
        return new GetPopulation();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link GetCapitalByISOCodeResponse }
     * 
     */
    public GetCapitalByISOCodeResponse createGetCapitalByISOCodeResponse() {
        return new GetCapitalByISOCodeResponse();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetCapitalByCountryName }
     * 
     */
    public GetCapitalByCountryName createGetCapitalByCountryName() {
        return new GetCapitalByCountryName();
    }

    /**
     * Create an instance of {@link GetPopulationResponse }
     * 
     */
    public GetPopulationResponse createGetPopulationResponse() {
        return new GetPopulationResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link GetCapitalByISOCode }
     * 
     */
    public GetCapitalByISOCode createGetCapitalByISOCode() {
        return new GetCapitalByISOCode();
    }

    /**
     * Create an instance of {@link GetCapitalByCountryNameResponse }
     * 
     */
    public GetCapitalByCountryNameResponse createGetCapitalByCountryNameResponse() {
        return new GetCapitalByCountryNameResponse();
    }

    /**
     * Create an instance of {@link GetByNameResponse }
     * 
     */
    public GetByNameResponse createGetByNameResponse() {
        return new GetByNameResponse();
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
     * Create an instance of {@link GetAreaResponse }
     * 
     */
    public GetAreaResponse createGetAreaResponse() {
        return new GetAreaResponse();
    }

    /**
     * Create an instance of {@link GetByName }
     * 
     */
    public GetByName createGetByName() {
        return new GetByName();
    }

    /**
     * Create an instance of {@link Cities }
     * 
     */
    public Cities createCities() {
        return new Cities();
    }

    /**
     * Create an instance of {@link GetArea }
     * 
     */
    public GetArea createGetArea() {
        return new GetArea();
    }

    /**
     * Create an instance of {@link ArrayOfCities }
     * 
     */
    public ArrayOfCities createArrayOfCities() {
        return new ArrayOfCities();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getByName")
    public JAXBElement<GetByName> createGetByName(GetByName value) {
        return new JAXBElement<GetByName>(_GetByName_QNAME, GetByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "Cities")
    public JAXBElement<Cities> createCities(Cities value) {
        return new JAXBElement<Cities>(_Cities_QNAME, Cities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getArea")
    public JAXBElement<GetArea> createGetArea(GetArea value) {
        return new JAXBElement<GetArea>(_GetArea_QNAME, GetArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapitalByCountryNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getCapitalByCountryNameResponse")
    public JAXBElement<GetCapitalByCountryNameResponse> createGetCapitalByCountryNameResponse(GetCapitalByCountryNameResponse value) {
        return new JAXBElement<GetCapitalByCountryNameResponse>(_GetCapitalByCountryNameResponse_QNAME, GetCapitalByCountryNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getByNameResponse")
    public JAXBElement<GetByNameResponse> createGetByNameResponse(GetByNameResponse value) {
        return new JAXBElement<GetByNameResponse>(_GetByNameResponse_QNAME, GetByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "searchByName")
    public JAXBElement<SearchByName> createSearchByName(SearchByName value) {
        return new JAXBElement<SearchByName>(_SearchByName_QNAME, SearchByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "searchByNameResponse")
    public JAXBElement<SearchByNameResponse> createSearchByNameResponse(SearchByNameResponse value) {
        return new JAXBElement<SearchByNameResponse>(_SearchByNameResponse_QNAME, SearchByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getAreaResponse")
    public JAXBElement<GetAreaResponse> createGetAreaResponse(GetAreaResponse value) {
        return new JAXBElement<GetAreaResponse>(_GetAreaResponse_QNAME, GetAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link City }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "City")
    public JAXBElement<City> createCity(City value) {
        return new JAXBElement<City>(_City_QNAME, City.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapitalByISOCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getCapitalByISOCode")
    public JAXBElement<GetCapitalByISOCode> createGetCapitalByISOCode(GetCapitalByISOCode value) {
        return new JAXBElement<GetCapitalByISOCode>(_GetCapitalByISOCode_QNAME, GetCapitalByISOCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopulation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getPopulation")
    public JAXBElement<GetPopulation> createGetPopulation(GetPopulation value) {
        return new JAXBElement<GetPopulation>(_GetPopulation_QNAME, GetPopulation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapitalByISOCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getCapitalByISOCodeResponse")
    public JAXBElement<GetCapitalByISOCodeResponse> createGetCapitalByISOCodeResponse(GetCapitalByISOCodeResponse value) {
        return new JAXBElement<GetCapitalByISOCodeResponse>(_GetCapitalByISOCodeResponse_QNAME, GetCapitalByISOCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapitalByCountryName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getCapitalByCountryName")
    public JAXBElement<GetCapitalByCountryName> createGetCapitalByCountryName(GetCapitalByCountryName value) {
        return new JAXBElement<GetCapitalByCountryName>(_GetCapitalByCountryName_QNAME, GetCapitalByCountryName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPopulationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pis.predmety.fiit.stuba.sk/pis/geoservices/cities/types", name = "getPopulationResponse")
    public JAXBElement<GetPopulationResponse> createGetPopulationResponse(GetPopulationResponse value) {
        return new JAXBElement<GetPopulationResponse>(_GetPopulationResponse_QNAME, GetPopulationResponse.class, null, value);
    }

}
