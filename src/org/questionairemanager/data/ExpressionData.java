/**
 * 
 */
package org.questionairemanager.data;

/**
 * @author ennercastillo
 *
 */
public class ExpressionData {

    private String sExpressionGuid;
    private String sVariableName;
    private String sDataType;
    private Boolean bAutoTriggered;
    
    /**
     * @return the sExpressionGuid
     */
    public String getsExpressionGuid() {
        return sExpressionGuid;
    }
    /**
     * @return the sVariableName
     */
    public String getsVariableName() {
        return sVariableName;
    }
    /**
     * @return the sDataType
     */
    public String getsDataType() {
        return sDataType;
    }
    /**
     * @return the bAutoTriggered
     */
    public Boolean getbAutoTriggered() {
        return bAutoTriggered;
    }
    
    /**
     * @param sExpressionGuid
     * @param sVariableName
     * @param sDataType
     * @param bAutoTriggered
     */
    public ExpressionData(String sExpressionGuid, String sVariableName, String sDataType,
            Boolean bAutoTriggered) {
        this.sExpressionGuid = sExpressionGuid;
        this.sVariableName = sVariableName;
        this.sDataType = sDataType;
        this.bAutoTriggered = bAutoTriggered;
    }
    
    public ExpressionData (){
        this.sExpressionGuid = "";
        this.sVariableName = "";
        this.sDataType = "";
        this.bAutoTriggered = false;
    }
    
}
