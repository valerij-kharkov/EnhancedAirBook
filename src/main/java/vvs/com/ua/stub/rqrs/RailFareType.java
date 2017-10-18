
package vvs.com.ua.stub.rqrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RailFareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fare" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerReferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PassengerRef" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SegmentReferences" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SegmentRef" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FareDescription" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Condition" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Fees" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Fee" type="{http://services.sabre.com/sp/eab/v3_8}FeeType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FarePrice" type="{http://services.sabre.com/sp/eab/v3_8}PriceType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailFareType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "fare"
})
public class RailFareType {

    @XmlElement(name = "Fare", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected List<RailFareType.Fare> fare;

    /**
     * Gets the value of the fare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareType.Fare }
     * 
     * 
     */
    public List<RailFareType.Fare> getFare() {
        if (fare == null) {
            fare = new ArrayList<RailFareType.Fare>();
        }
        return this.fare;
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
     *       &lt;sequence>
     *         &lt;element name="PassengerReferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PassengerRef" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SegmentReferences" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SegmentRef" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FareDescription" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Condition" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Fees" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Fee" type="{http://services.sabre.com/sp/eab/v3_8}FeeType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FarePrice" type="{http://services.sabre.com/sp/eab/v3_8}PriceType" minOccurs="0"/>
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
        "passengerReferences",
        "segmentReferences",
        "classOfService",
        "fareDescription",
        "farePrice"
    })
    public static class Fare {

        @XmlElement(name = "PassengerReferences", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected RailFareType.Fare.PassengerReferences passengerReferences;
        @XmlElement(name = "SegmentReferences", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected RailFareType.Fare.SegmentReferences segmentReferences;
        @XmlElement(name = "ClassOfService", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected String classOfService;
        @XmlElement(name = "FareDescription", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected RailFareType.Fare.FareDescription fareDescription;
        @XmlElement(name = "FarePrice", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected PriceType farePrice;

        /**
         * Gets the value of the passengerReferences property.
         * 
         * @return
         *     possible object is
         *     {@link RailFareType.Fare.PassengerReferences }
         *     
         */
        public RailFareType.Fare.PassengerReferences getPassengerReferences() {
            return passengerReferences;
        }

        /**
         * Sets the value of the passengerReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailFareType.Fare.PassengerReferences }
         *     
         */
        public void setPassengerReferences(RailFareType.Fare.PassengerReferences value) {
            this.passengerReferences = value;
        }

        /**
         * Gets the value of the segmentReferences property.
         * 
         * @return
         *     possible object is
         *     {@link RailFareType.Fare.SegmentReferences }
         *     
         */
        public RailFareType.Fare.SegmentReferences getSegmentReferences() {
            return segmentReferences;
        }

        /**
         * Sets the value of the segmentReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailFareType.Fare.SegmentReferences }
         *     
         */
        public void setSegmentReferences(RailFareType.Fare.SegmentReferences value) {
            this.segmentReferences = value;
        }

        /**
         * Gets the value of the classOfService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassOfService() {
            return classOfService;
        }

        /**
         * Sets the value of the classOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassOfService(String value) {
            this.classOfService = value;
        }

        /**
         * Gets the value of the fareDescription property.
         * 
         * @return
         *     possible object is
         *     {@link RailFareType.Fare.FareDescription }
         *     
         */
        public RailFareType.Fare.FareDescription getFareDescription() {
            return fareDescription;
        }

        /**
         * Sets the value of the fareDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link RailFareType.Fare.FareDescription }
         *     
         */
        public void setFareDescription(RailFareType.Fare.FareDescription value) {
            this.fareDescription = value;
        }

        /**
         * Gets the value of the farePrice property.
         * 
         * @return
         *     possible object is
         *     {@link PriceType }
         *     
         */
        public PriceType getFarePrice() {
            return farePrice;
        }

        /**
         * Sets the value of the farePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceType }
         *     
         */
        public void setFarePrice(PriceType value) {
            this.farePrice = value;
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
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Condition" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Fees" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Fee" type="{http://services.sabre.com/sp/eab/v3_8}FeeType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "name",
            "code",
            "detail",
            "condition",
            "fees"
        })
        public static class FareDescription {

            @XmlElement(name = "Name", namespace = "http://services.sabre.com/sp/eab/v3_8")
            protected String name;
            @XmlElement(name = "Code", namespace = "http://services.sabre.com/sp/eab/v3_8")
            protected String code;
            @XmlElement(name = "Detail", namespace = "http://services.sabre.com/sp/eab/v3_8")
            protected List<String> detail;
            @XmlElement(name = "Condition", namespace = "http://services.sabre.com/sp/eab/v3_8")
            protected List<RailFareType.Fare.FareDescription.Condition> condition;
            @XmlElement(name = "Fees", namespace = "http://services.sabre.com/sp/eab/v3_8")
            protected RailFareType.Fare.FareDescription.Fees fees;

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
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the detail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDetail() {
                if (detail == null) {
                    detail = new ArrayList<String>();
                }
                return this.detail;
            }

            /**
             * Gets the value of the condition property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the condition property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCondition().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RailFareType.Fare.FareDescription.Condition }
             * 
             * 
             */
            public List<RailFareType.Fare.FareDescription.Condition> getCondition() {
                if (condition == null) {
                    condition = new ArrayList<RailFareType.Fare.FareDescription.Condition>();
                }
                return this.condition;
            }

            /**
             * Gets the value of the fees property.
             * 
             * @return
             *     possible object is
             *     {@link RailFareType.Fare.FareDescription.Fees }
             *     
             */
            public RailFareType.Fare.FareDescription.Fees getFees() {
                return fees;
            }

            /**
             * Sets the value of the fees property.
             * 
             * @param value
             *     allowed object is
             *     {@link RailFareType.Fare.FareDescription.Fees }
             *     
             */
            public void setFees(RailFareType.Fare.FareDescription.Fees value) {
                this.fees = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            public static class Condition {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "lang")
                protected String lang;

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

                /**
                 * Gets the value of the lang property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLang() {
                    return lang;
                }

                /**
                 * Sets the value of the lang property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLang(String value) {
                    this.lang = value;
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
             *       &lt;sequence>
             *         &lt;element name="Fee" type="{http://services.sabre.com/sp/eab/v3_8}FeeType" maxOccurs="unbounded"/>
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
                "fee"
            })
            public static class Fees {

                @XmlElement(name = "Fee", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
                protected List<FeeType> fee;

                /**
                 * Gets the value of the fee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FeeType }
                 * 
                 * 
                 */
                public List<FeeType> getFee() {
                    if (fee == null) {
                        fee = new ArrayList<FeeType>();
                    }
                    return this.fee;
                }

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
         *       &lt;sequence>
         *         &lt;element name="PassengerRef" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "passengerRef"
        })
        public static class PassengerReferences {

            @XmlElement(name = "PassengerRef", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
            protected List<RailFareType.Fare.PassengerReferences.PassengerRef> passengerRef;

            /**
             * Gets the value of the passengerRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RailFareType.Fare.PassengerReferences.PassengerRef }
             * 
             * 
             */
            public List<RailFareType.Fare.PassengerReferences.PassengerRef> getPassengerRef() {
                if (passengerRef == null) {
                    passengerRef = new ArrayList<RailFareType.Fare.PassengerReferences.PassengerRef>();
                }
                return this.passengerRef;
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
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PassengerRef {

                @XmlAttribute(name = "id")
                @XmlSchemaType(name = "anySimpleType")
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setId(String value) {
                    this.id = value;
                }

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
         *       &lt;sequence>
         *         &lt;element name="SegmentRef" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "segmentRef"
        })
        public static class SegmentReferences {

            @XmlElement(name = "SegmentRef", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
            protected List<RailFareType.Fare.SegmentReferences.SegmentRef> segmentRef;

            /**
             * Gets the value of the segmentRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSegmentRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RailFareType.Fare.SegmentReferences.SegmentRef }
             * 
             * 
             */
            public List<RailFareType.Fare.SegmentReferences.SegmentRef> getSegmentRef() {
                if (segmentRef == null) {
                    segmentRef = new ArrayList<RailFareType.Fare.SegmentReferences.SegmentRef>();
                }
                return this.segmentRef;
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
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SegmentRef {

                @XmlAttribute(name = "id")
                @XmlSchemaType(name = "anySimpleType")
                protected String id;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
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
                public void setId(String value) {
                    this.id = value;
                }

            }

        }

    }

}
