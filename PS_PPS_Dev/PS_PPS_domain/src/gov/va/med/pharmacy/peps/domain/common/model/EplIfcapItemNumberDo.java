/**
 * Source file created in 2006 by Southwest Research Institute
 */



package gov.va.med.pharmacy.peps.domain.common.model;


// Generated Aug 19, 2008 10:17:52 AM by Hibernate Tools 3.2.0.bet8

import java.util.Date;


/**
 * EplIfcapItemNumberDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplIfcapItemNumberDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements
    java.io.Serializable {

    // Fields
    public static final String IFCAP_ITEM_NUMBER = "ifcapItemNumber";
    
    private static final long serialVersionUID = 1L;

    private Long id;
    private String ifcapItemNumber;
    private EplProductDo eplProduct;

    // Constructors

    /** default constructor */

    public EplIfcapItemNumberDo() {
    }

    /** minimal constructor */

    public EplIfcapItemNumberDo(Long id, String ifcapItemNumber, String createdBy, Date createdDtm) {
        this.id = id;
        this.ifcapItemNumber = ifcapItemNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplIfcapItemNumberDo(Long id, String ifcapItemNumber, String createdBy, Date createdDtm, String lastModifiedBy,
                                Date lastModifiedDtm, EplProductDo eplProduct) {
        this.id = id;
        this.ifcapItemNumber = ifcapItemNumber;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplProduct = eplProduct;
    }

    // Property accessors
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIfcapItemNumber() {
        return this.ifcapItemNumber;
    }

    public void setIfcapItemNumber(String ifcapItemNumber) {
        this.ifcapItemNumber = ifcapItemNumber;
    }

    public EplProductDo getEplProduct() {
        return this.eplProduct;
    }

    public void setEplProduct(EplProductDo eplProduct) {
        this.eplProduct = eplProduct;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("ifcapItemNumber").append("='").append(getIfcapItemNumber()).append("' ");
        buffer.append("createdBy").append("='").append(getCreatedBy()).append("' ");
        buffer.append("createdDtm").append("='").append(getCreatedDtm()).append("' ");
        buffer.append("lastModifiedBy").append("='").append(getLastModifiedBy()).append("' ");
        buffer.append("lastModifiedDtm").append("='").append(getLastModifiedDtm()).append("' ");
        buffer.append("]");

        return buffer.toString();
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        
        if ((other == null)) {
            return false;
        }
        
        if (!(other instanceof EplIfcapItemNumberDo)) {
            return false;
        }

        EplIfcapItemNumberDo castOther = (EplIfcapItemNumberDo) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null && this.getId()
            .equals(castOther.getId())))
            && ((this.getIfcapItemNumber() == castOther.getIfcapItemNumber()) || (this.getIfcapItemNumber() != null
                && castOther.getIfcapItemNumber() != null && this.getIfcapItemNumber()
                .equals(castOther.getIfcapItemNumber())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())))
            && ((this.getEplProduct() == castOther.getEplProduct()) || (this.getEplProduct() != null
                && castOther.getEplProduct() != null && this.getEplProduct().equals(castOther.getEplProduct())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result = 37 * result + (getIfcapItemNumber() == null ? 0 : this.getIfcapItemNumber().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());
        result = 37 * result + (getEplProduct() == null ? 0 : this.getEplProduct().hashCode());
        
        return result;
    }

}