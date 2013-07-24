package org.questionairemanager.data;

public class ExpressionValue {

    private String sExpressionValueGuid;
    private String sValue;
    
    /**
     * @return the sExpressionValueGuid
     */
    public String getsExpressionValueGuid() {
        return sExpressionValueGuid;
    }
    
    /**
     * @return the sValue
     */
    public String getsValue() {
        return sValue;
    }
    
    /**
     * @param sExpressionValueGuid
     * @param sValue
     */
    public ExpressionValue(String sExpressionValueGuid, String sValue) {
        this.sExpressionValueGuid = sExpressionValueGuid;
        this.sValue = sValue;
    }
    
    public ExpressionValue(){
        this.sExpressionValueGuid = "";
        this.sValue = "";
    }
    

}
