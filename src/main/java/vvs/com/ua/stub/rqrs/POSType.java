
package vvs.com.ua.stub.rqrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Point of Sale (POS) is the details identifying the party or connection channel making the request.
 *             
 * 
 * <p>Java class for POSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://services.sabre.com/sp/eab/v3_8}SourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "source"
})
public class POSType {

    @XmlElement(name = "Source", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected SourceType source;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

}
