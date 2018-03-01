
package authentication.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.authentication.xsd.BFDBiometricRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the authentication.org.xsd package. 
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

    private final static QName _PIDBlockFingerPrintAuthServiceResponseReturn_QNAME = new QName("http://authentication/org/xsd", "return");
    private final static QName _SecuredBiometricAuthServiceBinaryTemplate_QNAME = new QName("http://authentication/org/xsd", "Binary_template");
    private final static QName _SecuredBiometricAuthServiceFingerPosition_QNAME = new QName("http://authentication/org/xsd", "Finger_position");
    private final static QName _SecuredBiometricAuthServiceAgencyName_QNAME = new QName("http://authentication/org/xsd", "agency_name");
    private final static QName _SecuredBiometricAuthServiceUidNum_QNAME = new QName("http://authentication/org/xsd", "uid_num");
    private final static QName _SecuredBiometricAuthServiceSessionKey_QNAME = new QName("http://authentication/org/xsd", "sessionKey");
    private final static QName _SecuredBiometricAuthServiceUDC_QNAME = new QName("http://authentication/org/xsd", "UDC");
    private final static QName _SecuredBiometricAuthServiceAgencyCode_QNAME = new QName("http://authentication/org/xsd", "agency_code");
    private final static QName _ScholorBFDBiometricAuthServiceStudentId_QNAME = new QName("http://authentication/org/xsd", "studentId");
    private final static QName _ScholorBFDBiometricAuthServiceUid_QNAME = new QName("http://authentication/org/xsd", "uid");
    private final static QName _ScholorBFDBiometricAuthServiceDmhCode_QNAME = new QName("http://authentication/org/xsd", "dmhCode");
    private final static QName _ScholorBFDBiometricAuthServiceUdc_QNAME = new QName("http://authentication/org/xsd", "udc");
    private final static QName _DemoAuthenticationserviceBeneficiaryName_QNAME = new QName("http://authentication/org/xsd", "beneficiary_name");
    private final static QName _DemoAuthenticationserviceGender_QNAME = new QName("http://authentication/org/xsd", "gender");
    private final static QName _PIDBlockIrisAuthServiceEncHmac_QNAME = new QName("http://authentication/org/xsd", "encHmac");
    private final static QName _PIDBlockIrisAuthServiceCertificateIdentifier_QNAME = new QName("http://authentication/org/xsd", "certificateIdentifier");
    private final static QName _PIDBlockIrisAuthServiceEncryptedPid_QNAME = new QName("http://authentication/org/xsd", "encryptedPid");
    private final static QName _PIDBlockIrisAuthServiceEncSessionKey_QNAME = new QName("http://authentication/org/xsd", "encSessionKey");
    private final static QName _PIDBlockIrisAuthServiceDataType_QNAME = new QName("http://authentication/org/xsd", "dataType");
    private final static QName _SrdhUidVerificationEidNum_QNAME = new QName("http://authentication/org/xsd", "eid_num");
    private final static QName _IRISBiometricAuthServiceIrisPosition_QNAME = new QName("http://authentication/org/xsd", "Iris_position");
    private final static QName _BFDBiometricAuthServiceBfdBiometricRequest_QNAME = new QName("http://authentication/org/xsd", "bfdBiometricRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: authentication.org.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BiometricAuthServiceResponse }
     * 
     */
    public BiometricAuthServiceResponse createBiometricAuthServiceResponse() {
        return new BiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link IRISBiometricAuthServiceResponse }
     * 
     */
    public IRISBiometricAuthServiceResponse createIRISBiometricAuthServiceResponse() {
        return new IRISBiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link DemoAuthenticationserviceResponse }
     * 
     */
    public DemoAuthenticationserviceResponse createDemoAuthenticationserviceResponse() {
        return new DemoAuthenticationserviceResponse();
    }

    /**
     * Create an instance of {@link BFDBiometricAuthService }
     * 
     */
    public BFDBiometricAuthService createBFDBiometricAuthService() {
        return new BFDBiometricAuthService();
    }

    /**
     * Create an instance of {@link SrdhUidVerification }
     * 
     */
    public SrdhUidVerification createSrdhUidVerification() {
        return new SrdhUidVerification();
    }

    /**
     * Create an instance of {@link SrdhUidVerificationResponse }
     * 
     */
    public SrdhUidVerificationResponse createSrdhUidVerificationResponse() {
        return new SrdhUidVerificationResponse();
    }

    /**
     * Create an instance of {@link DemoAuthenticationservice }
     * 
     */
    public DemoAuthenticationservice createDemoAuthenticationservice() {
        return new DemoAuthenticationservice();
    }

    /**
     * Create an instance of {@link PIDBlockFingerPrintAuthService }
     * 
     */
    public PIDBlockFingerPrintAuthService createPIDBlockFingerPrintAuthService() {
        return new PIDBlockFingerPrintAuthService();
    }

    /**
     * Create an instance of {@link BiometricAuthService }
     * 
     */
    public BiometricAuthService createBiometricAuthService() {
        return new BiometricAuthService();
    }

    /**
     * Create an instance of {@link IRISBiometricAuthService }
     * 
     */
    public IRISBiometricAuthService createIRISBiometricAuthService() {
        return new IRISBiometricAuthService();
    }

    /**
     * Create an instance of {@link ScholorBFDBiometricAuthService }
     * 
     */
    public ScholorBFDBiometricAuthService createScholorBFDBiometricAuthService() {
        return new ScholorBFDBiometricAuthService();
    }

    /**
     * Create an instance of {@link BFDBiometricAuthServiceResponse }
     * 
     */
    public BFDBiometricAuthServiceResponse createBFDBiometricAuthServiceResponse() {
        return new BFDBiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link ScholorBiometricAuthService }
     * 
     */
    public ScholorBiometricAuthService createScholorBiometricAuthService() {
        return new ScholorBiometricAuthService();
    }

    /**
     * Create an instance of {@link PIDBlockIrisAuthServiceResponse }
     * 
     */
    public PIDBlockIrisAuthServiceResponse createPIDBlockIrisAuthServiceResponse() {
        return new PIDBlockIrisAuthServiceResponse();
    }

    /**
     * Create an instance of {@link SecuredBiometricAuthService }
     * 
     */
    public SecuredBiometricAuthService createSecuredBiometricAuthService() {
        return new SecuredBiometricAuthService();
    }

    /**
     * Create an instance of {@link PIDBlockIrisAuthService }
     * 
     */
    public PIDBlockIrisAuthService createPIDBlockIrisAuthService() {
        return new PIDBlockIrisAuthService();
    }

    /**
     * Create an instance of {@link ScholorBFDBiometricAuthServiceResponse }
     * 
     */
    public ScholorBFDBiometricAuthServiceResponse createScholorBFDBiometricAuthServiceResponse() {
        return new ScholorBFDBiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link ScholorBiometricAuthServiceResponse }
     * 
     */
    public ScholorBiometricAuthServiceResponse createScholorBiometricAuthServiceResponse() {
        return new ScholorBiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link PIDBlockFingerPrintAuthServiceResponse }
     * 
     */
    public PIDBlockFingerPrintAuthServiceResponse createPIDBlockFingerPrintAuthServiceResponse() {
        return new PIDBlockFingerPrintAuthServiceResponse();
    }

    /**
     * Create an instance of {@link SecuredBiometricAuthServiceResponse }
     * 
     */
    public SecuredBiometricAuthServiceResponse createSecuredBiometricAuthServiceResponse() {
        return new SecuredBiometricAuthServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = PIDBlockFingerPrintAuthServiceResponse.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, PIDBlockFingerPrintAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Binary_template", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceBinaryTemplate(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceBinaryTemplate_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Finger_position", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceFingerPosition(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceFingerPosition_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "sessionKey", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceSessionKey(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceSessionKey_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "UDC", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceUDC(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUDC_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = SecuredBiometricAuthService.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, SecuredBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "studentId", scope = ScholorBFDBiometricAuthService.class)
    public JAXBElement<String> createScholorBFDBiometricAuthServiceStudentId(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceStudentId_QNAME, String.class, ScholorBFDBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid", scope = ScholorBFDBiometricAuthService.class)
    public JAXBElement<String> createScholorBFDBiometricAuthServiceUid(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceUid_QNAME, String.class, ScholorBFDBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "dmhCode", scope = ScholorBFDBiometricAuthService.class)
    public JAXBElement<String> createScholorBFDBiometricAuthServiceDmhCode(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceDmhCode_QNAME, String.class, ScholorBFDBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "udc", scope = ScholorBFDBiometricAuthService.class)
    public JAXBElement<String> createScholorBFDBiometricAuthServiceUdc(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceUdc_QNAME, String.class, ScholorBFDBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = ScholorBiometricAuthServiceResponse.class)
    public JAXBElement<String> createScholorBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, ScholorBiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = PIDBlockIrisAuthServiceResponse.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, PIDBlockIrisAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = SrdhUidVerificationResponse.class)
    public JAXBElement<String> createSrdhUidVerificationResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, SrdhUidVerificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = ScholorBFDBiometricAuthServiceResponse.class)
    public JAXBElement<String> createScholorBFDBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, ScholorBFDBiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = SecuredBiometricAuthServiceResponse.class)
    public JAXBElement<String> createSecuredBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, SecuredBiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "beneficiary_name", scope = DemoAuthenticationservice.class)
    public JAXBElement<String> createDemoAuthenticationserviceBeneficiaryName(String value) {
        return new JAXBElement<String>(_DemoAuthenticationserviceBeneficiaryName_QNAME, String.class, DemoAuthenticationservice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = DemoAuthenticationservice.class)
    public JAXBElement<String> createDemoAuthenticationserviceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, DemoAuthenticationservice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = DemoAuthenticationservice.class)
    public JAXBElement<String> createDemoAuthenticationserviceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, DemoAuthenticationservice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "gender", scope = DemoAuthenticationservice.class)
    public JAXBElement<String> createDemoAuthenticationserviceGender(String value) {
        return new JAXBElement<String>(_DemoAuthenticationserviceGender_QNAME, String.class, DemoAuthenticationservice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = DemoAuthenticationservice.class)
    public JAXBElement<String> createDemoAuthenticationserviceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, DemoAuthenticationservice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = IRISBiometricAuthServiceResponse.class)
    public JAXBElement<String> createIRISBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, IRISBiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = DemoAuthenticationserviceResponse.class)
    public JAXBElement<String> createDemoAuthenticationserviceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, DemoAuthenticationserviceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encHmac", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceEncHmac(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncHmac_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "certificateIdentifier", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceCertificateIdentifier(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceCertificateIdentifier_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encryptedPid", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceEncryptedPid(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncryptedPid_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encSessionKey", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceEncSessionKey(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncSessionKey_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "dataType", scope = PIDBlockIrisAuthService.class)
    public JAXBElement<String> createPIDBlockIrisAuthServiceDataType(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceDataType_QNAME, String.class, PIDBlockIrisAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = BFDBiometricAuthServiceResponse.class)
    public JAXBElement<String> createBFDBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, BFDBiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Binary_template", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceBinaryTemplate(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceBinaryTemplate_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Finger_position", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceFingerPosition(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceFingerPosition_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "studentId", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceStudentId(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceStudentId_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "dmhCode", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceDmhCode(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceDmhCode_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "udc", scope = ScholorBiometricAuthService.class)
    public JAXBElement<String> createScholorBiometricAuthServiceUdc(String value) {
        return new JAXBElement<String>(_ScholorBFDBiometricAuthServiceUdc_QNAME, String.class, ScholorBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = SrdhUidVerification.class)
    public JAXBElement<String> createSrdhUidVerificationUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, SrdhUidVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "eid_num", scope = SrdhUidVerification.class)
    public JAXBElement<String> createSrdhUidVerificationEidNum(String value) {
        return new JAXBElement<String>(_SrdhUidVerificationEidNum_QNAME, String.class, SrdhUidVerification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Binary_template", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceBinaryTemplate(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceBinaryTemplate_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Iris_position", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceIrisPosition(String value) {
        return new JAXBElement<String>(_IRISBiometricAuthServiceIrisPosition_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "UDC", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceUDC(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUDC_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = IRISBiometricAuthService.class)
    public JAXBElement<String> createIRISBiometricAuthServiceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, IRISBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BFDBiometricRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "bfdBiometricRequest", scope = BFDBiometricAuthService.class)
    public JAXBElement<BFDBiometricRequest> createBFDBiometricAuthServiceBfdBiometricRequest(BFDBiometricRequest value) {
        return new JAXBElement<BFDBiometricRequest>(_BFDBiometricAuthServiceBfdBiometricRequest_QNAME, BFDBiometricRequest.class, BFDBiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encHmac", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceEncHmac(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncHmac_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "certificateIdentifier", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceCertificateIdentifier(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceCertificateIdentifier_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encryptedPid", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceEncryptedPid(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncryptedPid_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "encSessionKey", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceEncSessionKey(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceEncSessionKey_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "dataType", scope = PIDBlockFingerPrintAuthService.class)
    public JAXBElement<String> createPIDBlockFingerPrintAuthServiceDataType(String value) {
        return new JAXBElement<String>(_PIDBlockIrisAuthServiceDataType_QNAME, String.class, PIDBlockFingerPrintAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "return", scope = BiometricAuthServiceResponse.class)
    public JAXBElement<String> createBiometricAuthServiceResponseReturn(String value) {
        return new JAXBElement<String>(_PIDBlockFingerPrintAuthServiceResponseReturn_QNAME, String.class, BiometricAuthServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Binary_template", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceBinaryTemplate(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceBinaryTemplate_QNAME, String.class, BiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "Finger_position", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceFingerPosition(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceFingerPosition_QNAME, String.class, BiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_name", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceAgencyName(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyName_QNAME, String.class, BiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "uid_num", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceUidNum(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUidNum_QNAME, String.class, BiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "UDC", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceUDC(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceUDC_QNAME, String.class, BiometricAuthService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication/org/xsd", name = "agency_code", scope = BiometricAuthService.class)
    public JAXBElement<String> createBiometricAuthServiceAgencyCode(String value) {
        return new JAXBElement<String>(_SecuredBiometricAuthServiceAgencyCode_QNAME, String.class, BiometricAuthService.class, value);
    }

}
