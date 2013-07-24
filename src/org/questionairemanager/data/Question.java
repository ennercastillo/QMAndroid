/**
 * 
 */

package org.questionairemanager.data;

/**
 * @author ennercastillo
 */
public class Question {

    private String sQuestionGuid;
    private String sLegalValueTableGuid;
    private String sVariableName;
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
     * @return the sLegalValueTableGuid
     */
    public String getsLegalValueTableGuid() {
        return sLegalValueTableGuid;
    }

    /**
     * @return the sScreenTemplateGuid
     */
    public String getsScreenTemplateGuid() {
        return sScreenTemplateGuid;
    }

    /**
     * @return the sArguments
     */
    public String getsArguments() {
        return sArguments;
    }

    /**
     * @return the bRequired
     */
    public Boolean getbRequired() {
        return bRequired;
    }

    /**
     * @return the sAbsMin
     */
    public String getsAbsMin() {
        return sAbsMin;
    }

    /**
     * @return the sAbsMax
     */
    public String getsAbsMax() {
        return sAbsMax;
    }

    /**
     * @return the sPromptUnder
     */
    public String getsPromptUnder() {
        return sPromptUnder;
    }

    /**
     * @return the sPromptOver
     */
    public String getsPromptOver() {
        return sPromptOver;
    }

    /**
     * @return the sCustomValidationExpressionGuid
     */
    public String getsCustomValidationExpressionGuid() {
        return sCustomValidationExpressionGuid;
    }

    /**
     * @return the sOnChange
     */
    public String getsOnChange() {
        return sOnChange;
    }

    /**
     * @return the sUnique
     */
    public String getsUnique() {
        return sUnique;
    }

    /**
     * @return the sVariableName
     */
    public String getsVariableName() {
        return sVariableName;
    }

    /**
     * Constructor without data
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
        this.sVariableName = "";

    }

    /**
     * Constructor with data
     * 
     * @param sQuestionGuid
     * @param sLegalValueTableGuid
     * @param sVariableName
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
    public Question(String sQuestionGuid, String sLegalValueTableGuid, String sVariableName,
            String sScreenTemplateGuid, String sArguments, Boolean bRequired, String sAbsMin,
            String sAbsMax, String sPromptUnder, String sPromptOver,
            String sCustomValidationExpressionGuid, String sOnChange, String sUnique) {
        
        this.sQuestionGuid = sQuestionGuid;
        this.sLegalValueTableGuid = sLegalValueTableGuid;
        this.sVariableName = sVariableName;
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

}
