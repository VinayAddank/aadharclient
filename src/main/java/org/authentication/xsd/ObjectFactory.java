
package org.authentication.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.authentication.xsd package. 
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

    private final static QName _FingerPositionTemplateModelBinaryTemplate_QNAME = new QName("http://authentication.org/xsd", "binary_template");
    private final static QName _BFDBiometricRequestAgencyName_QNAME = new QName("http://authentication.org/xsd", "agency_name");
    private final static QName _BFDBiometricRequestUidNum_QNAME = new QName("http://authentication.org/xsd", "uid_num");
    private final static QName _BFDBiometricRequestAgencyCode_QNAME = new QName("http://authentication.org/xsd", "agency_code");
    private final static QName _BFDBiometricRequestUDC_QNAME = new QName("http://authentication.org/xsd", "uDC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.authentication.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BFDBiometricRequest }
     * 
     */
    public BFDBiometricRequest createBFDBiometricRequest() {
        return new BFDBiometricRequest();
    }

    /**
     * Create an instance of {@link FingerPositionTemplateModel }
     * 
     */
    public FingerPositionTemplateModel createFingerPositionTemplateModel() {
        return new FingerPositionTemplateModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.org/xsd", name = "binary_template", scope = FingerPositionTemplateModel.class)
    public JAXBElement<String> createFingerPositionTemplateModelBinaryTemplate(String value) {
        return new JAXBElement<String>(_FingerPositionTemplateModelBinaryTemplate_QNAME, String.class, FingerPositionTemplateModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.org/xsd", name = "agency_name", scope = BFDBiometricRequest.class)
    public JAXBElement<String> createBFDBiometricRequestAgencyName(String value) {
        return new JAXBElement<String>(_BFDBiometricRequestAgencyName_QNAME, String.class, BFDBiometricRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.org/xsd", name = "uid_num", scope = BFDBiometricRequest.class)
    public JAXBElement<String> createBFDBiometricRequestUidNum(String value) {
        return new JAXBElement<String>(_BFDBiometricRequestUidNum_QNAME, String.class, BFDBiometricRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.org/xsd", name = "agency_code", scope = BFDBiometricRequest.class)
    public JAXBElement<String> createBFDBiometricRequestAgencyCode(String value) {
        return new JAXBElement<String>(_BFDBiometricRequestAgencyCode_QNAME, String.class, BFDBiometricRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authentication.org/xsd", name = "uDC", scope = BFDBiometricRequest.class)
    public JAXBElement<String> createBFDBiometricRequestUDC(String value) {
        return new JAXBElement<String>(_BFDBiometricRequestUDC_QNAME, String.class, BFDBiometricRequest.class, value);
    }

}
