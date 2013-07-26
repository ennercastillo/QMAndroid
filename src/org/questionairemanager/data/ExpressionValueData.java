package org.questionairemanager.data;

public class ExpressionValueData {

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
    public ExpressionValueData(String sExpressionValueGuid, String sValue) {
        this.sExpressionValueGuid = sExpressionValueGuid;
        this.sValue = sValue;
    }
    
    public ExpressionValueData(){
        this.sExpressionValueGuid = "";
        this.sValue = "";
    }
    

}
