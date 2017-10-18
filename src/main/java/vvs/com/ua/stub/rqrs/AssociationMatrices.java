
package vvs.com.ua.stub.rqrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssociationMatrices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociationMatrices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociationMatrix" type="{http://services.sabre.com/sp/eab/v3_8}AssociationMatrix" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociationMatrices", namespace = "http://services.sabre.com/sp/eab/v3_8", propOrder = {
    "associationMatrix"
})
public class AssociationMatrices {

    @XmlElement(name = "AssociationMatrix", namespace = "http://services.sabre.com/sp/eab/v3_8", required = true)
    protected List<AssociationMatrix> associationMatrix;

    /**
     * Gets the value of the associationMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationMatrix }
     * 
     * 
     */
    public List<AssociationMatrix> getAssociationMatrix() {
        if (associationMatrix == null) {
            associationMatrix = new ArrayList<AssociationMatrix>();
        }
        return this.associationMatrix;
    }

}
