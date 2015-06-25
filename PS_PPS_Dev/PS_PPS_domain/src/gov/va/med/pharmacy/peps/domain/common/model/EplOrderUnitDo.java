/**
 * Source file created in 2008 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.domain.common.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * EplOrderUnitDo generated by hbm2java
 * 
 * @hibernate.class
 */
public class EplOrderUnitDo extends gov.va.med.pharmacy.peps.domain.common.model.DataObject implements java.io.Serializable {

    public static final String ABBREV = "abbrev";
    public static final String ITEM_STATUS = "itemStatus";
    public static final String REQUEST_STATUS = "requestStatus";
    public static final String INACTIVATION_DATE = "inactivationDate";
    public static final String EPL_ID = "eplId";

    private static final long serialVersionUID = 1L;

    // Fields

    private Long eplId;
    private String abbrev;
    private String orderUnitName;
    private String itemStatus;
    private String orderUnitExpansion;
    private String requestStatus;
    private String rejectReasonText;
    private String requestRejectReason;
    private Long revisionNumber;
    private Date inactivationDate;
    private Set<EplSynonymDo> eplSynonyms = new HashSet<EplSynonymDo>(0);
    private Set<EplNdcDo> eplNdcs = new HashSet<EplNdcDo>(0);

    // Constructors

    /** default constructor */

    public EplOrderUnitDo() {
    }

    /** minimal constructor */

    public EplOrderUnitDo(Long eplId, String orderUnitName, String createdBy, Date createdDtm) {
        this.eplId = eplId;
        this.orderUnitName = orderUnitName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
    }

    /** full constructor */

    public EplOrderUnitDo(Long eplId, String abbrev, String orderUnitName, String createdBy, Date createdDtm,
                          String lastModifiedBy, Date lastModifiedDtm, Set<EplSynonymDo> eplSynonyms, Set<EplNdcDo> eplNdcs) {
        this.eplId = eplId;
        this.abbrev = abbrev;
        this.orderUnitName = orderUnitName;
        this.setCreatedBy(createdBy);
        this.setCreatedDtm(createdDtm);
        this.setLastModifiedBy(lastModifiedBy);
        this.setLastModifiedDtm(lastModifiedDtm);
        this.eplSynonyms = eplSynonyms;
        this.eplNdcs = eplNdcs;
    }

    // Property accessors
    public Long getEplId() {
        return this.eplId;
    }

    public void setEplId(Long eplId) {
        this.eplId = eplId;
    }

    public String getAbbrev() {
        return this.abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getOrderUnitName() {
        return this.orderUnitName;
    }

    public void setOrderUnitName(String orderUnitName) {
        this.orderUnitName = orderUnitName;
    }

    public Set<EplSynonymDo> getEplSynonyms() {
        return this.eplSynonyms;
    }

    public void setEplSynonyms(Set<EplSynonymDo> eplSynonyms) {
        this.eplSynonyms = eplSynonyms;
    }

    public Set<EplNdcDo> getEplNdcs() {
        return this.eplNdcs;
    }

    public void setEplNdcs(Set<EplNdcDo> eplNdcs) {
        this.eplNdcs = eplNdcs;
    }

    /**
     * toString
     * 
     * @return String
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
        buffer.append("abbrev").append("='").append(getAbbrev()).append("' ");
        buffer.append("orderUnitName").append("='").append(getOrderUnitName()).append("' ");
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

        if (!(other instanceof EplOrderUnitDo)) {
            return false;
        }

        EplOrderUnitDo castOther = (EplOrderUnitDo) other;

        return ((this.getEplId() == castOther.getEplId()) || (this.getEplId() != null && castOther.getEplId() != null && this
            .getEplId().equals(castOther.getEplId())))
            && ((this.getAbbrev() == castOther.getAbbrev()) || (this.getAbbrev() != null && castOther.getAbbrev() != null && this
                .getAbbrev().equals(castOther.getAbbrev())))
            && ((this.getOrderUnitName() == castOther.getOrderUnitName()) || (this.getOrderUnitName() != null
                && castOther.getOrderUnitName() != null && this.getOrderUnitName().equals(castOther.getOrderUnitName())))
            && ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
                && castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
            && ((this.getCreatedDtm() == castOther.getCreatedDtm()) || (this.getCreatedDtm() != null
                && castOther.getCreatedDtm() != null && this.getCreatedDtm().equals(castOther.getCreatedDtm())))
            && ((this.getLastModifiedBy() == castOther.getLastModifiedBy()) || (this.getLastModifiedBy() != null
                && castOther.getLastModifiedBy() != null && this.getLastModifiedBy().equals(castOther.getLastModifiedBy())))
            && ((this.getLastModifiedDtm() == castOther.getLastModifiedDtm()) || (this.getLastModifiedDtm() != null
                && castOther.getLastModifiedDtm() != null && this.getLastModifiedDtm()
                .equals(castOther.getLastModifiedDtm())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getEplId() == null ? 0 : this.getEplId().hashCode());
        result = 37 * result + (getAbbrev() == null ? 0 : this.getAbbrev().hashCode());
        result = 37 * result + (getOrderUnitName() == null ? 0 : this.getOrderUnitName().hashCode());
        result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
        result = 37 * result + (getCreatedDtm() == null ? 0 : this.getCreatedDtm().hashCode());
        result = 37 * result + (getLastModifiedBy() == null ? 0 : this.getLastModifiedBy().hashCode());
        result = 37 * result + (getLastModifiedDtm() == null ? 0 : this.getLastModifiedDtm().hashCode());

        return result;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getOrderUnitExpansion() {
        return orderUnitExpansion;
    }

    public void setOrderUnitExpansion(String orderUnitExpansion) {
        this.orderUnitExpansion = orderUnitExpansion;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getRejectReasonText() {
        return rejectReasonText;
    }

    public void setRejectReasonText(String rejectReasonText) {
        this.rejectReasonText = rejectReasonText;
    }

    public String getRequestRejectReason() {
        return requestRejectReason;
    }

    public void setRequestRejectReason(String requestRejectReason) {
        this.requestRejectReason = requestRejectReason;
    }

    public Long getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Long revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public Date getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

}