
package org.authentication.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FingerPositionTemplateModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FingerPositionTemplateModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binary_template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finger_position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FingerPositionTemplateModel", propOrder = {
    "binaryTemplate",
    "fingerPosition"
})
public class FingerPositionTemplateModel {

    @XmlElementRef(name = "binary_template", namespace = "http://authentication.org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> binaryTemplate;
    @XmlElement(name = "finger_position")
    protected Integer fingerPosition;

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
     *     {@link Integer }
     *     
     */
    public Integer getFingerPosition() {
        return fingerPosition;
    }

    /**
     * Sets the value of the fingerPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFingerPosition(Integer value) {
        this.fingerPosition = value;
    }

}
