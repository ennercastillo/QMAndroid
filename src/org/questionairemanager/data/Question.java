/**
 * 
 */
package org.questionairemanager.data;

/**
 * @author ennercastillo
 *
 */
public class Question {
    
    private String sQuestionGuid;
    private String sLegalValueTableGuid;
    private String sScreenTemplateGuid;
    private String sArguments;
    private Boolean bRequired;
    private String sAbsMin;
    private String sAbsMax;
    private String sPromptUnder;
    private String sPromptOver;
    private String sCustomValidationExpressionGuid;
    private String sOnChange;
    private String sUnique;
    /**
     * @return the sQuestionGuid
     */
    public String getsQuestionGuid() {
        return sQuestionGuid;
    }
    /**
     * @param sQuestionGuid the sQuestionGuid to set
     */
    public void setsQuestionGuid(String sQuestionGuid) {
        this.sQuestionGuid = sQuestionGuid;
    }
    /**
     * @return the sLegalValueTableGuid
     */
    public String getsLegalValueTableGuid() {
        return sLegalValueTableGuid;
    }
    /**
     * @param sLegalValueTableGuid the sLegalValueTableGuid to set
     */
    public void setsLegalValueTableGuid(String sLegalValueTableGuid) {
        this.sLegalValueTableGuid = sLegalValueTableGuid;
    }
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
     * @return the sArguments
     */
    public String getsArguments() {
        return sArguments;
    }
    /**
     * @param sArguments the sArguments to set
     */
    public void setsArguments(String sArguments) {
        this.sArguments = sArguments;
    }
    /**
     * @return the bRequired
     */
    public Boolean getbRequired() {
        return bRequired;
    }
    /**
     * @param bRequired the bRequired to set
     */
    public void setbRequired(Boolean bRequired) {
        this.bRequired = bRequired;
    }
    /**
     * @return the sAbsMin
     */
    public String getsAbsMin() {
        return sAbsMin;
    }
    /**
     * @param sAbsMin the sAbsMin to set
     */
    public void setsAbsMin(String sAbsMin) {
        this.sAbsMin = sAbsMin;
    }
    /**
     * @return the sAbsMax
     */
    public String getsAbsMax() {
        return sAbsMax;
    }
    /**
     * @param sAbsMax the sAbsMax to set
     */
    public void setsAbsMax(String sAbsMax) {
        this.sAbsMax = sAbsMax;
    }
    /**
     * @return the sPromptUnder
     */
    public String getsPromptUnder() {
        return sPromptUnder;
    }
    /**
     * @param sPromptUnder the sPromptUnder to set
     */
    public void setsPromptUnder(String sPromptUnder) {
        this.sPromptUnder = sPromptUnder;
    }
    /**
     * @return the sPromptOver
     */
    public String getsPromptOver() {
        return sPromptOver;
    }
    /**
     * @param sPromptOver the sPromptOver to set
     */
    public void setsPromptOver(String sPromptOver) {
        this.sPromptOver = sPromptOver;
    }
    /**
     * @return the sCustomValidationExpressionGuid
     */
    public String getsCustomValidationExpressionGuid() {
        return sCustomValidationExpressionGuid;
    }
    /**
     * @param sCustomValidationExpressionGuid the sCustomValidationExpressionGuid to set
     */
    public void setsCustomValidationExpressionGuid(String sCustomValidationExpressionGuid) {
        this.sCustomValidationExpressionGuid = sCustomValidationExpressionGuid;
    }
    /**
     * @return the sOnChange
     */
    public String getsOnChange() {
        return sOnChange;
    }
    /**
     * @param sOnChange the sOnChange to set
     */
    public void setsOnChange(String sOnChange) {
        this.sOnChange = sOnChange;
    }
    /**
     * @return the sUnique
     */
    public String getsUnique() {
        return sUnique;
    }
    /**
     * @param sUnique the sUnique to set
     */
    public void setsUnique(String sUnique) {
        this.sUnique = sUnique;
    }
    
    /**
     * @param sQuestionGuid
     * @param sLegalValueTableGuid
     * @param sScreenTemplateGuid
     * @param sArguments
     * @param bRequired
     * @param sAbsMin
     * @param sAbsMax
     * @param sPromptUnder
     * @param sPromptOver
     * @param sCustomValidationExpressionGuid
     * @param sOnChange
     * @param sUnique
     */
    public Question(String sQuestionGuid, String sLegalValueTableGuid, String sScreenTemplateGuid,
            String sArguments, Boolean bRequired, String sAbsMin, String sAbsMax,
            String sPromptUnder, String sPromptOver, String sCustomValidationExpressionGuid,
            String sOnChange, String sUnique) {
        this.sQuestionGuid = sQuestionGuid;
        this.sLegalValueTableGuid = sLegalValueTableGuid;
        this.sScreenTemplateGuid = sScreenTemplateGuid;
        this.sArguments = sArguments;
        this.bRequired = bRequired;
        this.sAbsMin = sAbsMin;
        this.sAbsMax = sAbsMax;
        this.sPromptUnder = sPromptUnder;
        this.sPromptOver = sPromptOver;
        this.sCustomValidationExpressionGuid = sCustomValidationExpressionGuid;
        this.sOnChange = sOnChange;
        this.sUnique = sUnique;
    }
    
    /**
     * 
     */
    public Question() {
        this.sQuestionGuid = "";
        this.sLegalValueTableGuid = "";
        this.sScreenTemplateGuid = "";
        this.sArguments = "";
        this.bRequired = false;
        this.sAbsMin = "";
        this.sAbsMax = "";
        this.sPromptUnder = "";
        this.sPromptOver = "";
        this.sCustomValidationExpressionGuid = "";
        this.sOnChange = "";
        this.sUnique = "";
        
    }
    
    

}
