
package vvs.com.ua.stub.rqrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTYRecordLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTYRecordLocatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRSLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IataNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERSPUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstPointOfDeparture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTYRecordLocatorType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "crsLocator",
    "crsCode",
    "recordLocator",
    "agencyId",
    "iataNumber",
    "agencyLocation",
    "userType",
    "countryCode",
    "currency",
    "dutyCode",
    "erspUserId",
    "firstPointOfDeparture"
})
public class TTYRecordLocatorType {

    @XmlElement(name = "CRSLocator", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String crsLocator;
    @XmlElement(name = "CRSCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String crsCode;
    @XmlElement(name = "RecordLocator", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String recordLocator;
    @XmlElement(name = "AgencyId", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String agencyId;
    @XmlElement(name = "IataNumber", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String iataNumber;
    @XmlElement(name = "AgencyLocation", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String agencyLocation;
    @XmlElement(name = "UserType", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String userType;
    @XmlElement(name = "CountryCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String countryCode;
    @XmlElement(name = "Currency", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String currency;
    @XmlElement(name = "DutyCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String dutyCode;
    @XmlElement(name = "ERSPUserId", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String erspUserId;
    @XmlElement(name = "FirstPointOfDeparture", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String firstPointOfDeparture;

    /**
     * Gets the value of the crsLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSLocator() {
        return crsLocator;
    }

    /**
     * Sets the value of the crsLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSLocator(String value) {
        this.crsLocator = value;
    }

    /**
     * Gets the value of the crsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRSCode() {
        return crsCode;
    }

    /**
     * Sets the value of the crsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRSCode(String value) {
        this.crsCode = value;
    }

    /**
     * Gets the value of the recordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordLocator() {
        return recordLocator;
    }

    /**
     * Sets the value of the recordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordLocator(String value) {
        this.recordLocator = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumber(String value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the agencyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyLocation() {
        return agencyLocation;
    }

    /**
     * Sets the value of the agencyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyLocation(String value) {
        this.agencyLocation = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the erspUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSPUserId() {
        return erspUserId;
    }

    /**
     * Sets the value of the erspUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSPUserId(String value) {
        this.erspUserId = value;
    }

    /**
     * Gets the value of the firstPointOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPointOfDeparture() {
        return firstPointOfDeparture;
    }

    /**
     * Sets the value of the firstPointOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPointOfDeparture(String value) {
        this.firstPointOfDeparture = value;
    }

}
