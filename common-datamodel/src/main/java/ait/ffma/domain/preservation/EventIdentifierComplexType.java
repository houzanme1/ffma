package ait.ffma.domain.preservation;

import ait.ffma.domain.BaseFfmaDomainObject;
import ait.ffma.domain.FieldDefEnum;
import ait.ffma.factory.ComponentNameConstants;


//
//This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
//See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//Any modifications to this file will be lost upon recompilation of the source schema. 
//Generated on: 2010.11.11 at 09:31:52 AM MEZ 
//


/**
* <p>Java class for eventIdentifierComplexType complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType name="eventIdentifierComplexType">
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element ref="{info:lc/xmlns/premis-v2}eventIdentifierType"/>
*         &lt;element ref="{info:lc/xmlns/premis-v2}eventIdentifierValue"/>
*       &lt;/sequence>
*       &lt;attGroup ref="{http://www.w3.org/1999/xlink}simpleLink"/>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
public class EventIdentifierComplexType extends BaseFfmaDomainObject {

	private static final long serialVersionUID = 1715472252153514134L;

	public enum FieldsEnum implements FieldDefEnum {
		EventIdentifierType        { public Class<?> evalType() { return String.class; } },
		EventIdentifierValue       { public Class<?> evalType() { return String.class; } },
		Type                       { public Class<?> evalType() { return String.class; } };

		public String evalName() { return this.name(); }
	}
	
	public FieldDefEnum[] getFieldsEnum() {
		return FieldsEnum.values();
	}


		public EventIdentifierComplexType () {
			setFfmaObjectName(EventIdentifierComplexType.class.getSimpleName());
			setComponentName(ComponentNameConstants.COMPONENT_PRESERVATION_RISKMANAGEMENT);
		}
		
	    
	 /**
	  * Gets the value of the eventIdentifierType property.
	  * 
	  * @return
	  *     possible object is
	  *     {@link String }
	  *     
	  */
	 public String getEventIdentifierType() {
		 return getString(FieldsEnum.EventIdentifierType.name());	
	 }
	
	 /**
	  * Sets the value of the eventIdentifierType property.
	  * 
	  * @param value
	  *     allowed object is
	  *     {@link String }
	  *     
	  */
	 public void setEventIdentifierType(String value) {
		 put(FieldsEnum.EventIdentifierType.name(), value);	
	 }
	
	 /**
	  * Gets the value of the eventIdentifierValue property.
	  * 
	  * @return
	  *     possible object is
	  *     {@link String }
	  *     
	  */
	 public String getEventIdentifierValue() {
		 return getString(FieldsEnum.EventIdentifierValue.name());	
	 }
	
	 /**
	  * Sets the value of the eventIdentifierValue property.
	  * 
	  * @param value
	  *     allowed object is
	  *     {@link String }
	  *     
	  */
	 public void setEventIdentifierValue(String value) {
		 put(FieldsEnum.EventIdentifierValue.name(), value);	
	 }
	
	 /**
	  * Gets the value of the type property.
	  * 
	  * @return
	  *     possible object is
	  *     {@link String }
	  *     
	  */
	 public String getType() {
	         return getString(FieldsEnum.Type.name());
	 }
	
	 /**
	  * Sets the value of the type property.
	  * 
	  * @param value
	  *     allowed object is
	  *     {@link String }
	  *     
	  */
	 public void setType(String value) {
		 put(FieldsEnum.Type.name(), value);	
	 }

}
