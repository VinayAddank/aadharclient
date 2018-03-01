
package services.ecentric.com.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.ecentric.com.xsd package. 
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

    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCEncPID_QNAME = new QName("http://services/ecentric/com/xsd", "encPID");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCEncSessionKey_QNAME = new QName("http://services/ecentric/com/xsd", "encSessionKey");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCEKYCOption_QNAME = new QName("http://services/ecentric/com/xsd", "eKYCOption");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCUidNum_QNAME = new QName("http://services/ecentric/com/xsd", "uidNum");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCAgencyCode_QNAME = new QName("http://services/ecentric/com/xsd", "agencyCode");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCEncHmac_QNAME = new QName("http://services/ecentric/com/xsd", "encHmac");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCAgencyName_QNAME = new QName("http://services/ecentric/com/xsd", "agencyName");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCTimeStamp_QNAME = new QName("http://services/ecentric/com/xsd", "TimeStamp");
    private final static QName _GetAadhaarDemographicDataBySRDHSecuredeKYCResponseReturn_QNAME = new QName("http://services/ecentric/com/xsd", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.ecentric.com.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAadhaarDemographicDataBySRDHSecuredeKYC }
     * 
     */
    public GetAadhaarDemographicDataBySRDHSecuredeKYC createGetAadhaarDemographicDataBySRDHSecuredeKYC() {
        return new GetAadhaarDemographicDataBySRDHSecuredeKYC();
    }

    /**
     * Create an instance of {@link GetAadhaarDemographicDataBySRDHSecuredeKYCResponse }
     * 
     */
    public GetAadhaarDemographicDataBySRDHSecuredeKYCResponse createGetAadhaarDemographicDataBySRDHSecuredeKYCResponse() {
        return new GetAadhaarDemographicDataBySRDHSecuredeKYCResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "encPID", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<byte[]> createGetAadhaarDemographicDataBySRDHSecuredeKYCEncPID(byte[] value) {
        return new JAXBElement<byte[]>(_GetAadhaarDemographicDataBySRDHSecuredeKYCEncPID_QNAME, byte[].class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "encSessionKey", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<byte[]> createGetAadhaarDemographicDataBySRDHSecuredeKYCEncSessionKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetAadhaarDemographicDataBySRDHSecuredeKYCEncSessionKey_QNAME, byte[].class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "eKYCOption", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCEKYCOption(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCEKYCOption_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "uidNum", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCUidNum(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCUidNum_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "agencyCode", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCAgencyCode(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCAgencyCode_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "encHmac", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<byte[]> createGetAadhaarDemographicDataBySRDHSecuredeKYCEncHmac(byte[] value) {
        return new JAXBElement<byte[]>(_GetAadhaarDemographicDataBySRDHSecuredeKYCEncHmac_QNAME, byte[].class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "agencyName", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCAgencyName(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCAgencyName_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "TimeStamp", scope = GetAadhaarDemographicDataBySRDHSecuredeKYC.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCTimeStamp(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCTimeStamp_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/ecentric/com/xsd", name = "return", scope = GetAadhaarDemographicDataBySRDHSecuredeKYCResponse.class)
    public JAXBElement<String> createGetAadhaarDemographicDataBySRDHSecuredeKYCResponseReturn(String value) {
        return new JAXBElement<String>(_GetAadhaarDemographicDataBySRDHSecuredeKYCResponseReturn_QNAME, String.class, GetAadhaarDemographicDataBySRDHSecuredeKYCResponse.class, value);
    }

}
