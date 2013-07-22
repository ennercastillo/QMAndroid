package org.questionairemanager.data;

public class ScreenTemplate {
    
    private String sScreenTemplateGuid;
    private String sScreenTemplateName;
    private String sDataType;
    private String sReference;
    private String sVariableNameReq;
    /**
     * @return the sScreenTemplateGuid
     */
    public String getsScreenTemplateGuid() {
        return sScreenTemplateGuid;
    }
    /**
     * @param sScreenTemplateGuid the sScreenTemplateGuid to set
     */
    public void setsScreenTemplateGuid(String sScreenTemplateGuid) {
        this.sScreenTemplateGuid = sScreenTemplateGuid;
    }
    /**
     * @return the sScreenTemplateName
     */
    public String getsScreenTemplateName() {
        return sScreenTemplateName;
    }
    /**
     * @param sScreenTemplateName the sScreenTemplateName to set
     */
    public void setsScreenTemplateName(String sScreenTemplateName) {
        this.sScreenTemplateName = sScreenTemplateName;
    }
    /**
     * @return the sDataType
     */
    public String getsDataType() {
        return sDataType;
    }
    /**
     * @param sDataType the sDataType to set
     */
    public void setsDataType(String sDataType) {
        this.sDataType = sDataType;
    }
    /**
     * @return the sReference
     */
    public String getsReference() {
        return sReference;
    }
    /**
     * @param sReference the sReference to set
     */
    public void setsReference(String sReference) {
        this.sReference = sReference;
    }
    /**
     * @return the sVariableNameReq
     */
    public String getsVariableNameReq() {
        return sVariableNameReq;
    }
    /**
     * @param sVariableNameReq the sVariableNameReq to set
     */
    public void setsVariableNameReq(String sVariableNameReq) {
        this.sVariableNameReq = sVariableNameReq;
    }
    /**
     * @param sScreenTemplateGuid
     * @param sScreenTemplateName
     * @param sDataType
     * @param sReference
     * @param sVariableNameReq
     */
    public ScreenTemplate(String sScreenTemplateGuid, String sScreenTemplateName, String sDataType,
            String sReference, String sVariableNameReq) {
        this.sScreenTemplateGuid = sScreenTemplateGuid;
        this.sScreenTemplateName = sScreenTemplateName;
        this.sDataType = sDataType;
        this.sReference = sReference;
        this.sVariableNameReq = sVariableNameReq;
    }
    
    /**
     * 
     */
    public ScreenTemplate (){
        this.sScreenTemplateGuid = "";
        this.sScreenTemplateName = "";
        this.sDataType = "";
        this.sReference = "";
        this.sVariableNameReq = "";
    }

}
