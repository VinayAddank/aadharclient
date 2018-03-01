
package authentication.org.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.authentication.xsd.BFDBiometricRequest;


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
 *         &lt;element name="bfdBiometricRequest" type="{http://authentication.org/xsd}BFDBiometricRequest" minOccurs="0"/>
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
    "bfdBiometricRequest"
})
@XmlRootElement(name = "BFDBiometricAuthService")
public class BFDBiometricAuthService {

    @XmlElementRef(name = "bfdBiometricRequest", namespace = "http://authentication/org/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BFDBiometricRequest> bfdBiometricRequest;

    /**
     * Gets the value of the bfdBiometricRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BFDBiometricRequest }{@code >}
     *     
     */
    public JAXBElement<BFDBiometricRequest> getBfdBiometricRequest() {
        return bfdBiometricRequest;
    }

    /**
     * Sets the value of the bfdBiometricRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BFDBiometricRequest }{@code >}
     *     
     */
    public void setBfdBiometricRequest(JAXBElement<BFDBiometricRequest> value) {
        this.bfdBiometricRequest = value;
    }

}
