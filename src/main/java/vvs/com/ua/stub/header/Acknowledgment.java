
package vvs.com.ua.stub.header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Timestamp"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}RefToMessageId"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}From" minOccurs="0"/>
 *         &lt;element ref="{http://www.ebxml.org/namespaces/messageHeader}Reference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.ebxml.org/namespaces/messageHeader}headerExtension.grp"/>
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}actor"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "timestamp",
    "refToMessageId",
    "from",
    "reference",
    "any"
})
@XmlRootElement(name = "Acknowledgment", namespace = "http://www.ebxml.org/namespaces/messageHeader")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Acknowledgment {

    @XmlElement(name = "Timestamp", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String timestamp;
    @XmlElement(name = "RefToMessageId", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String refToMessageId;
    @XmlElement(name = "From", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected From from;
    @XmlElement(name = "Reference", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Reference> reference;
    @XmlAnyElement(lax = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> any;
    @XmlAttribute(name = "actor", namespace = "http://schemas.xmlsoap.org/soap/envelope/")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String actor;
    @XmlAttribute(name = "id", namespace = "http://www.ebxml.org/namespaces/messageHeader")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlAttribute(name = "version", namespace = "http://www.ebxml.org/namespaces/messageHeader", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String version;
    @XmlAnyAttribute
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the refToMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRefToMessageId() {
        return refToMessageId;
    }

    /**
     * Sets the value of the refToMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRefToMessageId(String value) {
        this.refToMessageId = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link From }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public From getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link From }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFrom(From value) {
        this.from = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reference }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Reference> getReference() {
        if (reference == null) {
            reference = new ArrayList<Reference>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getActor() {
        return actor;
    }

    /**
     * Sets the value of the actor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setActor(String value) {
        this.actor = value;
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

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2017-10-18T12:35:12+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
