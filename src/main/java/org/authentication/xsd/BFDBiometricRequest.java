
package org.authentication.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BFDBiometricRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BFDBiometricRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agency_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fingerPositionTemplateModel" type="{http://authentication.org/xsd}FingerPositionTemplateModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uid_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BFDBiometricRequest", propOrder = {
    "agencyCode",
    "agencyName",
    "fingerPositionTemplateModel",
    "udc",
    "uidNum"
})
public class BFDBiometricRequest {

    @XmlElementRef(name = "agency_code", namespace = "http://authentication.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyCode;
    @XmlElementRef(name = "agency_name", namespace = "http://authentication.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencyName;
    @XmlElement(nillable = true)
    protected List<FingerPositionTemplateModel> fingerPositionTemplateModel;
    @XmlElementRef(name = "uDC", namespace = "http://authentication.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> udc;
    @XmlElementRef(name = "uid_num", namespace = "http://authentication.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidNum;

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
    public JAXBElement<String> getUDC() {
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
    public void setUDC(JAXBElement<String> value) {
        this.udc = value;
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

}
