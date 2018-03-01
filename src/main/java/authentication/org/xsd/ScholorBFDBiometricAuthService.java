
package authentication.org.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.authentication.xsd.FingerPositionTemplateModel;


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
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dmhCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerPositionTemplateModel" type="{http://authentication.org/xsd}FingerPositionTemplateModel" maxOccurs="unbounded" minOccurs="0"/>
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
    "uid",
    "studentId",
    "dmhCode",
    "fingerPositionTemplateModel",
    "udc"
})
@XmlRootElement(name = "scholorBFDBiometricAuthService")
public class ScholorBFDBiometricAuthService {

    @XmlElementRef(name = "uid", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uid;
    @XmlElementRef(name = "studentId", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentId;
    @XmlElementRef(name = "dmhCode", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dmhCode;
    @XmlElement(nillable = true)
    protected List<FingerPositionTemplateModel> fingerPositionTemplateModel;
    @XmlElementRef(name = "udc", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udc;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUid(JAXBElement<String> value) {
        this.uid = value;
    }

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
     * Gets the value of the fingerPositionTemplateModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fingerPositionTemplateModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFingerPositionTemplateModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FingerPositionTemplateModel }
     * 
     * 
     */
    public List<FingerPositionTemplateModel> getFingerPositionTemplateModel() {
        if (fingerPositionTemplateModel == null) {
            fingerPositionTemplateModel = new ArrayList<FingerPositionTemplateModel>();
        }
        return this.fingerPositionTemplateModel;
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
