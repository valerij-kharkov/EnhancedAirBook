
package vvs.com.ua.stub.rqrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OACType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OACType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartitionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingOfficeStationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OACType", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "partitionId",
    "accountingCityCode",
    "accountingCode",
    "accountingOfficeStationCode"
})
public class OACType {

    @XmlElement(name = "PartitionId", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String partitionId;
    @XmlElement(name = "AccountingCityCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String accountingCityCode;
    @XmlElement(name = "AccountingCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String accountingCode;
    @XmlElement(name = "AccountingOfficeStationCode", namespace = "http://services.sabre.com/sp/eab/v3_8")
    protected String accountingOfficeStationCode;

    /**
     * Gets the value of the partitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionId() {
        return partitionId;
    }

    /**
     * Sets the value of the partitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionId(String value) {
        this.partitionId = value;
    }

    /**
     * Gets the value of the accountingCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCityCode() {
        return accountingCityCode;
    }

    /**
     * Sets the value of the accountingCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCityCode(String value) {
        this.accountingCityCode = value;
    }

    /**
     * Gets the value of the accountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Sets the value of the accountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCode(String value) {
        this.accountingCode = value;
    }

    /**
     * Gets the value of the accountingOfficeStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingOfficeStationCode() {
        return accountingOfficeStationCode;
    }

    /**
     * Sets the value of the accountingOfficeStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingOfficeStationCode(String value) {
        this.accountingOfficeStationCode = value;
    }

}
