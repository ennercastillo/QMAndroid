/**
 * 
 */
package org.questionairemanager.engine;

/**
 * Gets the type of this screen
 * 
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email> 
 * <date>Jul 04,2013</date>
 * 
 */
public class ScreenTemplate {

	private String sScreenTemplateGuid;
	private String sScreenTemplateName;
	private ScreenTemplateTypes sttDataType;

	// / TODO: Pendientes para uso futuro
	private String Reference;
	private String VariableNameReq;

	/**
	 * @return the screenTemplateGuid
	 */
	public String getScreenTemplateGuid() {
		return sScreenTemplateGuid;
	}

	/**
	 * @return the screenTemplateName
	 */
	public String getScreenTemplateName() {
		return sScreenTemplateName;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return sttDataType.ToString();
	}

	/**
	 * Class constructor
	 * @param screenTemplateGuid, Identifier for this Object
	 * @param screenTemplateName, Name of ScreenTemplate
	 * @param dataType, Data type of this Screen Template
	 */
	public ScreenTemplate(String screenTemplateGuid, String screenTemplateName,
			ScreenTemplateTypes dataType) {
		
		sScreenTemplateGuid = screenTemplateGuid; // GUID of this class
		sScreenTemplateName = screenTemplateName; // Name of this Screen Template
		sttDataType = dataType; // Datatype of this screen
	}
	
	

}
