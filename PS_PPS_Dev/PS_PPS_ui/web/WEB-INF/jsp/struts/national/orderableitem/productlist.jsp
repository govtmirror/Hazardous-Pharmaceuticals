<%@ taglib
    prefix="s"
    uri="/struts-tags"%>
<%@ taglib
    prefix="peps"
    tagdir="/WEB-INF/tags"%>
<%@ taglib 
	prefix="spring" 
	uri="http://www.springframework.org/tags" %> 
<%@taglib 
	prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core"%>  
<%
            java.util.Map parameters = new java.util.HashMap();
            parameters.put(gov.va.med.pharmacy.peps.presentation.common.action.ManagedItemAction.TAB_ELEMENT_ID,
                gov.va.med.pharmacy.peps.presentation.common.action.ManagedItemAction.CHILDREN_TAB);
%>

<peps:table
    tableId="<%= gov.va.med.pharmacy.peps.presentation.common.action.ManagedItemAction.PRODUCT_LIST_TABLE %>"
    dataOgnl="products"
    fieldsOgnl="productListPrintTemplate"
    sortExportLinkParameters="<%=parameters%>" />
<s:set
    scope="page"
    name="itemId"
    value="item.id" />
<%--<c:set
    scope="page"
    var="itemId"
    value="item.id" />
 --%>
 
<%--<s:set
    scope="page"
    name="openBlankChildTemplate"
    value="%{getText('button.open.blank.product.template')}" /> --%>
<c:set var="openBlankChildTemplateStr" value="button.open.blank.product.template" />
<spring:message var="openBlankChildTemplate" scope="page" code="${openBlankChildTemplateStr}" />

<peps:redirectFlowLink
    text="${openBlankChildTemplate}"
    flowId="manageTemplate"
    itemId="${itemId}"
    itemType="PRODUCT"
    templateMethod="openBlankChildTemplate" />