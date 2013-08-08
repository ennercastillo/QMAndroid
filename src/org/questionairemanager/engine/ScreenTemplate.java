/**
 * 
 */

package org.questionairemanager.engine;

/**
 * Gets the type of this screen
 * 
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email> <date>Jul 04,2013</date>
 */
public class ScreenTemplate {

    private String sScreenTemplateGuid;
    private String sScreenTemplateName;
    private String sDataType;
    private String sReference;
    private Boolean bVariableNameReq;
    /**
     * @return the sScreenTemplateGuid
     */
    public String getsScreenTemplateGuid() {
        return sScreenTemplateGuid;
    }
    /**
     * @return the sScreenTemplateName
     */
    public String getsScreenTemplateName() {
        return sScreenTemplateName;
    }
    /**
     * @return the sDataType
     */
    public String getsDataType() {
        return sDataType;
    }
    /**
     * @return the sReference
     */
    public String getsReference() {
        return sReference;
    }
    /**
     * @return the sVariableNameReq
     */
    public Boolean getbVariableNameReq() {
        return bVariableNameReq;
    }


    /**
     * @param sScreenTemplateGuid the sScreenTemplateGuid to set
     */
    public void setsScreenTemplateGuid(String sScreenTemplateGuid) {
    
        this.sScreenTemplateGuid = sScreenTemplateGuid;
    }
    
    /**
     * @param sScreenTemplateName the sScreenTemplateName to set
     */
    public void setsScreenTemplateName(String sScreenTemplateName) {
    
        this.sScreenTemplateName = sScreenTemplateName;
    }
    
    /**
     * @param sDataType the sDataType to set
     */
    public void setsDataType(String sDataType) {
    
        this.sDataType = sDataType;
    }
    
    /**
     * @param sReference the sReference to set
     */
    public void setsReference(String sReference) {
    
        this.sReference = sReference;
    }
    
    /**
     * @param bVariableNameReq the bVariableNameReq to set
     */
    public void setbVariableNameReq(Boolean bVariableNameReq) {
    
        this.bVariableNameReq = bVariableNameReq;
    }
    /**
     * @param sScreenTemplateGuid
     * @param sScreenTemplateName
     * @param sDataType
     * @param sReference
     * @param sVariableNameReq
     */
    public ScreenTemplate(String sScreenTemplateGuid, String sScreenTemplateName, String sDataType,
            String sReference, Boolean bVariableNameReq) {
        this.sScreenTemplateGuid = sScreenTemplateGuid;
        this.sScreenTemplateName = sScreenTemplateName;
        this.sDataType = sDataType;
        this.sReference = sReference;
        this.bVariableNameReq = bVariableNameReq;
    }
    
    /**
     * 
     */
    public ScreenTemplate(){
        this.sScreenTemplateGuid = "";
        this.sScreenTemplateName = "";
        this.sDataType = "";
        this.sReference = "";
        this.bVariableNameReq = false;
    }

}
