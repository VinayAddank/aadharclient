
package authentication.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dmhCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Binary_template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Finger_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="udc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentId",
    "dmhCode",
    "uidNum",
    "binaryTemplate",
    "fingerPosition",
    "udc"
})
@XmlRootElement(name = "scholorBiometricAuthService")
public class ScholorBiometricAuthService {

    @XmlElementRef(name = "studentId", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentId;
    @XmlElementRef(name = "dmhCode", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmhCode;
    @XmlElementRef(name = "uid_num", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidNum;
    @XmlElementRef(name = "Binary_template", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> binaryTemplate;
    @XmlElementRef(name = "Finger_position", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fingerPosition;
    @XmlElementRef(name = "udc", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udc;

    /**
     * Gets the value of the studentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentId(JAXBElement<String> value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the dmhCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDmhCode() {
        return dmhCode;
    }

    /**
     * Sets the value of the dmhCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDmhCode(JAXBElement<String> value) {
        this.dmhCode = value;
    }

    /**
     * Gets the value of the uidNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidNum() {
        return uidNum;
    }

    /**
     * Sets the value of the uidNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidNum(JAXBElement<String> value) {
        this.uidNum = value;
    }

    /**
     * Gets the value of the binaryTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBinaryTemplate() {
        return binaryTemplate;
    }

    /**
     * Sets the value of the binaryTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBinaryTemplate(JAXBElement<String> value) {
        this.binaryTemplate = value;
    }

    /**
     * Gets the value of the fingerPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFingerPosition() {
        return fingerPosition;
    }

    /**
     * Sets the value of the fingerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFingerPosition(JAXBElement<String> value) {
        this.fingerPosition = value;
    }

    /**
     * Gets the value of the udc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUdc() {
        return udc;
    }

    /**
     * Sets the value of the udc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUdc(JAXBElement<String> value) {
        this.udc = value;
    }

}
