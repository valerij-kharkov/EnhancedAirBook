
package vvs.com.ua.stub.rqrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationMatrix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrixID" />
 *                 &lt;attribute name="newRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Child" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrixID" />
 *                 &lt;attribute name="newRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="elementId" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrixID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationMatrix", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "name",
    "parent",
    "child"
})
public class AssociationMatrix {

    @XmlElement(name = "Name", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
    protected String name;
    @XmlElement(name = "Parent", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
    protected AssociationMatrix.Parent parent;
    @XmlElement(name = "Child", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
    protected List<AssociationMatrix.Child> child;
    @XmlAttribute(name = "elementId")
    protected String elementId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationMatrix.Parent }
     *     
     */
    public AssociationMatrix.Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationMatrix.Parent }
     *     
     */
    public void setParent(AssociationMatrix.Parent value) {
        this.parent = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationMatrix.Child }
     * 
     * 
     */
    public List<AssociationMatrix.Child> getChild() {
        if (child == null) {
            child = new ArrayList<AssociationMatrix.Child>();
        }
        return this.child;
    }

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementId(String value) {
        this.elementId = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrixID" />
     *       &lt;attribute name="newRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Child {

        @XmlAttribute(name = "ref")
        protected String ref;
        @XmlAttribute(name = "newRef")
        protected String newRef;
        @XmlAttribute(name = "key")
        protected String key;
        @XmlAttribute(name = "value")
        protected String value;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

        /**
         * Gets the value of the newRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewRef() {
            return newRef;
        }

        /**
         * Sets the value of the newRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewRef(String value) {
            this.newRef = value;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
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
        public void setValue(String value) {
            this.value = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ref" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrixID" />
     *       &lt;attribute name="newRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Parent {

        @XmlAttribute(name = "ref")
        protected String ref;
        @XmlAttribute(name = "newRef")
        protected String newRef;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

        /**
         * Gets the value of the newRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewRef() {
            return newRef;
        }

        /**
         * Sets the value of the newRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewRef(String value) {
            this.newRef = value;
        }

    }

}
