
package vvs.com.ua.stub.header;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignatureValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureValueType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValueType", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SignatureValueType {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected byte[] value;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

}
