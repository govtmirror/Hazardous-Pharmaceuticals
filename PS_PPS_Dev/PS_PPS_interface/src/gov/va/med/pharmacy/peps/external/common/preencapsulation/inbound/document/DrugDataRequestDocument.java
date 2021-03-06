/**
 * Source file created in 2007 by Southwest Research Institute
 */


package gov.va.med.pharmacy.peps.external.common.preencapsulation.inbound.document;


import gov.va.med.pharmacy.peps.external.common.vo.inbound.drug.data.request.DrugData;


/**
 * Marshal and unmarshal XML into Java objects.
 */
public class DrugDataRequestDocument extends gov.va.med.pharmacy.peps.external.common.utility.XmlDocument<DrugData> {

    private static final String[] CDATA_ELEMENTS = {};
    private static final String[] SCHEMA_FILES = new String[] { "xml/schema/drug/data/localDrugDataRequest.xsd" };
    private static final String[] XSL_FILES = new String[] {};
    private static final DrugDataRequestDocument INSTANCE = new DrugDataRequestDocument();

    /**
     * Protected constructor
     */
    private DrugDataRequestDocument() {
        super(DrugData.class, CDATA_ELEMENTS, SCHEMA_FILES, XSL_FILES);
    }

    /**
     * Get instance of document.
     * 
     * @return instance
     */
    public static DrugDataRequestDocument instance() {
        return INSTANCE;
    }

}
