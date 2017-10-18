
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://services.sabre.com/sp/eab/v3_8}AddressType" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="AirportInfo" type="{http://services.sabre.com/sp/eab/v3_8}AirportInfoType" minOccurs="0"/>
 *           &lt;element name="RailwayStationInfo" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://services.sabre.com/sp/eab/v3_8}RailwayStationInfoType">
 *                   &lt;sequence>
 *                     &lt;element name="StationName" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="LocalStationName" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="LocationCodes" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Code" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="codeContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Amenities" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Amenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="borderPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationDetailsType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "address",
    "dateTime",
    "airportInfo",
    "railwayStationInfo",
    "comments"
})
public class LocationDetailsType {

    @XmlElement(name = "Address", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected AddressType address;
    @XmlElement(name = "DateTime", namespace = "http://services.sabre.com/sp/eab/v3_8")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "AirportInfo", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected AirportInfoType airportInfo;
    @XmlElement(name = "RailwayStationInfo", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected LocationDetailsType.RailwayStationInfo railwayStationInfo;
    @XmlElement(name = "Comments", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String comments;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the airportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirportInfoType }
     *     
     */
    public AirportInfoType getAirportInfo() {
        return airportInfo;
    }

    /**
     * Sets the value of the airportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportInfoType }
     *     
     */
    public void setAirportInfo(AirportInfoType value) {
        this.airportInfo = value;
    }

    /**
     * Gets the value of the railwayStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType.RailwayStationInfo }
     *     
     */
    public LocationDetailsType.RailwayStationInfo getRailwayStationInfo() {
        return railwayStationInfo;
    }

    /**
     * Sets the value of the railwayStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType.RailwayStationInfo }
     *     
     */
    public void setRailwayStationInfo(LocationDetailsType.RailwayStationInfo value) {
        this.railwayStationInfo = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://services.sabre.com/sp/eab/v3_8}RailwayStationInfoType">
     *       &lt;sequence>
     *         &lt;element name="StationName" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocalStationName" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="codeContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Amenities" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Amenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="borderPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stationName",
        "localStationName",
        "locationCodes",
        "amenities"
    })
    public static class RailwayStationInfo
        extends RailwayStationInfoType
    {

        @XmlElement(name = "StationName", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected LocationDetailsType.RailwayStationInfo.StationName stationName;
        @XmlElement(name = "LocalStationName", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected LocationDetailsType.RailwayStationInfo.LocalStationName localStationName;
        @XmlElement(name = "LocationCodes", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected LocationDetailsType.RailwayStationInfo.LocationCodes locationCodes;
        @XmlElement(name = "Amenities", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected LocationDetailsType.RailwayStationInfo.Amenities amenities;
        @XmlAttribute(name = "borderPoint")
        @XmlSchemaType(name = "anySimpleType")
        protected String borderPoint;

        /**
         * Gets the value of the stationName property.
         * 
         * @return
         *     possible object is
         *     {@link LocationDetailsType.RailwayStationInfo.StationName }
         *     
         */
        public LocationDetailsType.RailwayStationInfo.StationName getStationName() {
            return stationName;
        }

        /**
         * Sets the value of the stationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationDetailsType.RailwayStationInfo.StationName }
         *     
         */
        public void setStationName(LocationDetailsType.RailwayStationInfo.StationName value) {
            this.stationName = value;
        }

        /**
         * Gets the value of the localStationName property.
         * 
         * @return
         *     possible object is
         *     {@link LocationDetailsType.RailwayStationInfo.LocalStationName }
         *     
         */
        public LocationDetailsType.RailwayStationInfo.LocalStationName getLocalStationName() {
            return localStationName;
        }

        /**
         * Sets the value of the localStationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationDetailsType.RailwayStationInfo.LocalStationName }
         *     
         */
        public void setLocalStationName(LocationDetailsType.RailwayStationInfo.LocalStationName value) {
            this.localStationName = value;
        }

        /**
         * Gets the value of the locationCodes property.
         * 
         * @return
         *     possible object is
         *     {@link LocationDetailsType.RailwayStationInfo.LocationCodes }
         *     
         */
        public LocationDetailsType.RailwayStationInfo.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        /**
         * Sets the value of the locationCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationDetailsType.RailwayStationInfo.LocationCodes }
         *     
         */
        public void setLocationCodes(LocationDetailsType.RailwayStationInfo.LocationCodes value) {
            this.locationCodes = value;
        }

        /**
         * Gets the value of the amenities property.
         * 
         * @return
         *     possible object is
         *     {@link LocationDetailsType.RailwayStationInfo.Amenities }
         *     
         */
        public LocationDetailsType.RailwayStationInfo.Amenities getAmenities() {
            return amenities;
        }

        /**
         * Sets the value of the amenities property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationDetailsType.RailwayStationInfo.Amenities }
         *     
         */
        public void setAmenities(LocationDetailsType.RailwayStationInfo.Amenities value) {
            this.amenities = value;
        }

        /**
         * Gets the value of the borderPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBorderPoint() {
            return borderPoint;
        }

        /**
         * Sets the value of the borderPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBorderPoint(String value) {
            this.borderPoint = value;
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
         *         &lt;element name="Amenity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "amenity"
        })
        public static class Amenities {

            @XmlElement(name = "Amenity", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
            protected List<String> amenity;

            /**
             * Gets the value of the amenity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amenity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmenity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAmenity() {
                if (amenity == null) {
                    amenity = new ArrayList<String>();
                }
                return this.amenity;
            }

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
        public static class LocalStationName {

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
         *         &lt;element name="Code" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="codeContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "code"
        })
        public static class LocationCodes {

            @XmlElement(name = "Code", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
            protected List<LocationDetailsType.RailwayStationInfo.LocationCodes.Code> code;

            /**
             * Gets the value of the code property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LocationDetailsType.RailwayStationInfo.LocationCodes.Code }
             * 
             * 
             */
            public List<LocationDetailsType.RailwayStationInfo.LocationCodes.Code> getCode() {
                if (code == null) {
                    code = new ArrayList<LocationDetailsType.RailwayStationInfo.LocationCodes.Code>();
                }
                return this.code;
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
             *       &lt;attribute name="codeContext" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Code {

                @XmlAttribute(name = "codeContext")
                @XmlSchemaType(name = "anySimpleType")
                protected String codeContext;

                /**
                 * Gets the value of the codeContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeContext() {
                    return codeContext;
                }

                /**
                 * Sets the value of the codeContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeContext(String value) {
                    this.codeContext = value;
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
        public static class StationName {

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

    }

}
