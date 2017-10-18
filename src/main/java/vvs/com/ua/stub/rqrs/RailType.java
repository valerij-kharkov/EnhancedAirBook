
package vvs.com.ua.stub.rqrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Open" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CrossBorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingCarrier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://services.sabre.com/sp/eab/v3_8}CompanyType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperatingCarrier" type="{http://services.sabre.com/sp/eab/v3_8}ServiceProviderType" minOccurs="0"/>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Passenger" type="{http://services.sabre.com/sp/eab/v3_8}PassengerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplementaryServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SupplementaryService" type="{http://services.sabre.com/sp/eab/v3_8}SupplementaryServiceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TrainInfo" type="{http://services.sabre.com/sp/eab/v3_8}TrainDetailsType" minOccurs="0"/>
 *         &lt;element name="Accommodation" type="{http://services.sabre.com/sp/eab/v3_8}RailAccommodationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartDetails" type="{http://services.sabre.com/sp/eab/v3_8}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="StopDetails" type="{http://services.sabre.com/sp/eab/v3_8}LocationDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EndDetails" type="{http://services.sabre.com/sp/eab/v3_8}LocationDetailsType" minOccurs="0"/>
 *         &lt;element name="RailFares" type="{http://services.sabre.com/sp/eab/v3_8}RailFareType" minOccurs="0"/>
 *         &lt;element name="Documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Document" type="{http://services.sabre.com/sp/eab/v3_8}DocumentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "RailType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "statusCode",
    "open",
    "crossBorder",
    "duration",
    "marketingCarrier",
    "operatingCarrier",
    "passengers",
    "supplementaryServices",
    "trainInfo",
    "accommodation",
    "startDetails",
    "stopDetails",
    "endDetails",
    "railFares",
    "documents",
    "details"
})
public class RailType {

    @XmlElement(name = "StatusCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String statusCode;
    @XmlElement(name = "Open", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected Boolean open;
    @XmlElement(name = "CrossBorder", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected Boolean crossBorder;
    @XmlElement(name = "Duration", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String duration;
    @XmlElement(name = "MarketingCarrier", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailType.MarketingCarrier marketingCarrier;
    @XmlElement(name = "OperatingCarrier", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected ServiceProviderType operatingCarrier;
    @XmlElement(name = "Passengers", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailType.Passengers passengers;
    @XmlElement(name = "SupplementaryServices", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailType.SupplementaryServices supplementaryServices;
    @XmlElement(name = "TrainInfo", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected TrainDetailsType trainInfo;
    @XmlElement(name = "Accommodation", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected List<RailAccommodationType> accommodation;
    @XmlElement(name = "StartDetails", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected LocationDetailsType startDetails;
    @XmlElement(name = "StopDetails", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected List<LocationDetailsType> stopDetails;
    @XmlElement(name = "EndDetails", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected LocationDetailsType endDetails;
    @XmlElement(name = "RailFares", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailFareType railFares;
    @XmlElement(name = "Documents", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailType.Documents documents;
    @XmlElement(name = "Details", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected RailType.Details details;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpen(Boolean value) {
        this.open = value;
    }

    /**
     * Gets the value of the crossBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Sets the value of the crossBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrossBorder(Boolean value) {
        this.crossBorder = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link RailType.MarketingCarrier }
     *     
     */
    public RailType.MarketingCarrier getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType.MarketingCarrier }
     *     
     */
    public void setMarketingCarrier(RailType.MarketingCarrier value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderType }
     *     
     */
    public ServiceProviderType getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderType }
     *     
     */
    public void setOperatingCarrier(ServiceProviderType value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link RailType.Passengers }
     *     
     */
    public RailType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType.Passengers }
     *     
     */
    public void setPassengers(RailType.Passengers value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the supplementaryServices property.
     * 
     * @return
     *     possible object is
     *     {@link RailType.SupplementaryServices }
     *     
     */
    public RailType.SupplementaryServices getSupplementaryServices() {
        return supplementaryServices;
    }

    /**
     * Sets the value of the supplementaryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType.SupplementaryServices }
     *     
     */
    public void setSupplementaryServices(RailType.SupplementaryServices value) {
        this.supplementaryServices = value;
    }

    /**
     * Gets the value of the trainInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDetailsType }
     *     
     */
    public TrainDetailsType getTrainInfo() {
        return trainInfo;
    }

    /**
     * Sets the value of the trainInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDetailsType }
     *     
     */
    public void setTrainInfo(TrainDetailsType value) {
        this.trainInfo = value;
    }

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAccommodationType }
     * 
     * 
     */
    public List<RailAccommodationType> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<RailAccommodationType>();
        }
        return this.accommodation;
    }

    /**
     * Gets the value of the startDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getStartDetails() {
        return startDetails;
    }

    /**
     * Sets the value of the startDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setStartDetails(LocationDetailsType value) {
        this.startDetails = value;
    }

    /**
     * Gets the value of the stopDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDetailsType }
     * 
     * 
     */
    public List<LocationDetailsType> getStopDetails() {
        if (stopDetails == null) {
            stopDetails = new ArrayList<LocationDetailsType>();
        }
        return this.stopDetails;
    }

    /**
     * Gets the value of the endDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDetailsType }
     *     
     */
    public LocationDetailsType getEndDetails() {
        return endDetails;
    }

    /**
     * Sets the value of the endDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDetailsType }
     *     
     */
    public void setEndDetails(LocationDetailsType value) {
        this.endDetails = value;
    }

    /**
     * Gets the value of the railFares property.
     * 
     * @return
     *     possible object is
     *     {@link RailFareType }
     *     
     */
    public RailFareType getRailFares() {
        return railFares;
    }

    /**
     * Sets the value of the railFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailFareType }
     *     
     */
    public void setRailFares(RailFareType value) {
        this.railFares = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link RailType.Documents }
     *     
     */
    public RailType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType.Documents }
     *     
     */
    public void setDocuments(RailType.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link RailType.Details }
     *     
     */
    public RailType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailType.Details }
     *     
     */
    public void setDetails(RailType.Details value) {
        this.details = value;
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
     *         &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "detail"
    })
    public static class Details {

        @XmlElement(name = "Detail", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
        protected List<String> detail;

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
     *         &lt;element name="Document" type="{http://services.sabre.com/sp/eab/v3_8}DocumentType" maxOccurs="unbounded"/>
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
        "document"
    })
    public static class Documents {

        @XmlElement(name = "Document", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
        protected List<DocumentType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentType }
         * 
         * 
         */
        public List<DocumentType> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentType>();
            }
            return this.document;
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
     *     &lt;extension base="{http://services.sabre.com/sp/eab/v3_8}CompanyType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MarketingCarrier
        extends CompanyType
    {


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
     *         &lt;element name="Passenger" type="{http://services.sabre.com/sp/eab/v3_8}PassengerType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "passenger"
    })
    public static class Passengers {

        @XmlElement(name = "Passenger", namespace = "http://services.sabre.com/sp/eab/v3_8")
        protected List<PassengerType> passenger;
        @XmlAttribute(name = "quantity")
        protected String quantity;

        /**
         * Gets the value of the passenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerType }
         * 
         * 
         */
        public List<PassengerType> getPassenger() {
            if (passenger == null) {
                passenger = new ArrayList<PassengerType>();
            }
            return this.passenger;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
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
     *         &lt;element name="SupplementaryService" type="{http://services.sabre.com/sp/eab/v3_8}SupplementaryServiceType" maxOccurs="unbounded"/>
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
        "supplementaryService"
    })
    public static class SupplementaryServices {

        @XmlElement(name = "SupplementaryService", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
        protected List<SupplementaryServiceType> supplementaryService;

        /**
         * Gets the value of the supplementaryService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplementaryService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplementaryService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SupplementaryServiceType }
         * 
         * 
         */
        public List<SupplementaryServiceType> getSupplementaryService() {
            if (supplementaryService == null) {
                supplementaryService = new ArrayList<SupplementaryServiceType>();
            }
            return this.supplementaryService;
        }

    }

}
