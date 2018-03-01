
package services.ecentric.com.xsd;

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
 *         &lt;element name="encPID" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="encSessionKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="encHmac" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="uidNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eKYCOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "encPID",
    "encSessionKey",
    "encHmac",
    "uidNum",
    "agencyName",
    "agencyCode",
    "ekycOption",
    "timeStamp"
})
@XmlRootElement(name = "getAadhaarDemographicDataBySRDHSecuredeKYC")
public class GetAadhaarDemographicDataBySRDHSecuredeKYC {

    @XmlElementRef(name = "encPID", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> encPID;
    @XmlElementRef(name = "encSessionKey", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> encSessionKey;
    @XmlElementRef(name = "encHmac", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> encHmac;
    @XmlElementRef(name = "uidNum", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidNum;
    @XmlElementRef(name = "agencyName", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyName;
    @XmlElementRef(name = "agencyCode", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyCode;
    @XmlElementRef(name = "eKYCOption", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ekycOption;
    @XmlElementRef(name = "TimeStamp", namespace = "http://services/ecentric/com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeStamp;

    /**
     * Gets the value of the encPID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getEncPID() {
        return encPID;
    }

    /**
     * Sets the value of the encPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setEncPID(JAXBElement<byte[]> value) {
        this.encPID = value;
    }

    /**
     * Gets the value of the encSessionKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getEncSessionKey() {
        return encSessionKey;
    }

    /**
     * Sets the value of the encSessionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setEncSessionKey(JAXBElement<byte[]> value) {
        this.encSessionKey = value;
    }

    /**
     * Gets the value of the encHmac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getEncHmac() {
        return encHmac;
    }

    /**
     * Sets the value of the encHmac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setEncHmac(JAXBElement<byte[]> value) {
        this.encHmac = value;
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
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencyName(JAXBElement<String> value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencyCode(JAXBElement<String> value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the ekycOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEKYCOption() {
        return ekycOption;
    }

    /**
     * Sets the value of the ekycOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEKYCOption(JAXBElement<String> value) {
        this.ekycOption = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeStamp(JAXBElement<String> value) {
        this.timeStamp = value;
    }

}
