package org.questionairemanager.data;

public class ScreenTemplateData {
    
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
     * @param sScreenTemplateGuid
     * @param sScreenTemplateName
     * @param sDataType
     * @param sReference
     * @param sVariableNameReq
     */
    public ScreenTemplateData(String sScreenTemplateGuid, String sScreenTemplateName, String sDataType,
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
    public ScreenTemplateData (){
        this.sScreenTemplateGuid = "";
        this.sScreenTemplateName = "";
        this.sDataType = "";
        this.sReference = "";
        this.bVariableNameReq = false;
    }

}
