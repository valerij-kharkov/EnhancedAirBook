
package vvs.com.ua.stub.header;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" type="{http://www.ebxml.org/namespaces/messageHeader}non-empty-string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "PartyId", namespace = "http://www.ebxml.org/namespaces/messageHeader")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PartyId {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "type", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

}
