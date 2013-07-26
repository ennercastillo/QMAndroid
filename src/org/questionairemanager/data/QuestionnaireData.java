/**
 * 
 */

package org.questionairemanager.data;

import java.util.ArrayList;


/**
 * @author ennercastillo
 */
public class QuestionnaireData {

    private String sQuestionnaireGuid;
    private String sShortName;
    private String sOnNew;
    private Boolean bModifiable;
    private Boolean bMultipleInstance;
    private String sMultipleInstanceAbsMin;
    private String sMultipleInstanceAbsMax;
    private String sMultipleInstancePromptUnder;
    private String sMultipleInstancePromptOver;
    private String sSearchVariables;
    private String sConfirmVariables;
    private Boolean bRequired;
    private String sUnique;
    
    private ArrayList<QuestionData> alQuestions;
    
    
    // Screens this questionnaire
    private ArrayList<ScreenData> alScreens;
    

    /**
	 * @return the alScreens
	 */
	public ArrayList<ScreenData> getAlScreens() {
		return alScreens;
	}

	/**
	 * @param alScreens the alScreens to set
	 */
	public void setAlScreens(ArrayList<ScreenData> alScreens) {
		this.alScreens = alScreens;
	}


	/**
     * @return the sQuestionnaireGuid
     */
    public String getsQuestionnaireGuid() {
        return sQuestionnaireGuid;
    }

    /**
     * @param sQuestionnaireGuid the sQuestionnaireGuid to set
     */
    public void setsQuestionnaireGuid(String sQuestionnaireGuid) {
        this.sQuestionnaireGuid = sQuestionnaireGuid;
    }

    /**
     * @return the sShortName
     */
    public String getsShortName() {
        return sShortName;
    }

    /**
     * @param sShortName the sShortName to set
     */
    public void setsShortName(String sShortName) {
        this.sShortName = sShortName;
    }

    /**
     * @return the sOnNew
     */
    public String getsOnNew() {
        return sOnNew;
    }

    /**
     * @param sOnNew the sOnNew to set
     */
    public void setsOnNew(String sOnNew) {
        this.sOnNew = sOnNew;
    }

    /**
     * @return the bModifiable
     */
    public Boolean getbModifiable() {
        return bModifiable;
    }

    /**
     * @param bModifiable the bModifiable to set
     */
    public void setbModifiable(Boolean bModifiable) {
        this.bModifiable = bModifiable;
    }

    /**
     * @return the sMultipleInstance
     */
    public Boolean getbMultipleInstance() {
        return bMultipleInstance;
    }

    /**
     * @param sMultipleInstance the sMultipleInstance to set
     */
    public void setsMultipleInstance(Boolean bMultipleInstance) {
        this.bMultipleInstance = bMultipleInstance;
    }

    /**
     * @return the sMultipleInstanceAbsMin
     */
    public String getsMultipleInstanceAbsMin() {
        return sMultipleInstanceAbsMin;
    }

    /**
     * @param sMultipleInstanceAbsMin the sMultipleInstanceAbsMin to set
     */
    public void setsMultipleInstanceAbsMin(String sMultipleInstanceAbsMin) {
        this.sMultipleInstanceAbsMin = sMultipleInstanceAbsMin;
    }

    /**
     * @return the sMultipleInstanceAbsMax
     */
    public String getsMultipleInstanceAbsMax() {
        return sMultipleInstanceAbsMax;
    }

    /**
     * @param sMultipleInstanceAbsMax the sMultipleInstanceAbsMax to set
     */
    public void setsMultipleInstanceAbsMax(String sMultipleInstanceAbsMax) {
        this.sMultipleInstanceAbsMax = sMultipleInstanceAbsMax;
    }

    /**
     * @return the sMultipleInstancePromptUnder
     */
    public String getsMultipleInstancePromptUnder() {
        return sMultipleInstancePromptUnder;
    }

    /**
     * @param sMultipleInstancePromptUnder the sMultipleInstancePromptUnder to
     *            set
     */
    public void setsMultipleInstancePromptUnder(String sMultipleInstancePromptUnder) {
        this.sMultipleInstancePromptUnder = sMultipleInstancePromptUnder;
    }

    /**
     * @return the sMultipleInstancePromptOver
     */
    public String getsMultipleInstancePromptOver() {
        return sMultipleInstancePromptOver;
    }

    /**
     * @param sMultipleInstancePromptOver the sMultipleInstancePromptOver to set
     */
    public void setsMultipleInstancePromptOver(String sMultipleInstancePromptOver) {
        this.sMultipleInstancePromptOver = sMultipleInstancePromptOver;
    }

    /**
     * @return the sSearchVariables
     */
    public String getsSearchVariables() {
        return sSearchVariables;
    }

    /**
     * @param sSearchVariables the sSearchVariables to set
     */
    public void setsSearchVariables(String sSearchVariables) {
        this.sSearchVariables = sSearchVariables;
    }

    /**
     * @return the bConfirmVariables
     */
    public String getsConfirmVariables() {
        return sConfirmVariables;
    }

    /**
     * @param bConfirmVariables the bConfirmVariables to set
     */
    public void setbConfirmVariables(String sConfirmVariables) {
        this.sConfirmVariables = sConfirmVariables;
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
     * @return the unique
     */
    public String getsUnique() {
        return sUnique;
    }

    /**
     * @param unique the unique to set
     */
    public void setUnique(String sUnique) {
        this.sUnique = sUnique;
    }
    
    /**
     * @return the alQuestions
     */
    public ArrayList<QuestionData> getAlQuestions() {
        return alQuestions;
    }

    /**
     * Constructor class
     */
    public QuestionnaireData() {
        this.sQuestionnaireGuid = "";
        this.sShortName = "";
        this.sOnNew = "";
        this.bModifiable = false;
        this.bMultipleInstance = false;
        this.sMultipleInstanceAbsMin = "";
        this.sMultipleInstanceAbsMax = "";
        this.sMultipleInstancePromptUnder = "";
        this.sMultipleInstancePromptOver = "";
        this.sSearchVariables = "";
        this.sConfirmVariables = "";
        this.bRequired = false;
        this.sUnique = "";
        this.alQuestions = null;
    }

    /**
     * 
     * @param sQuestionnaireGuid
     * @param sShortName
     * @param sOnNew
     * @param bModifiable
     * @param bMultipleInstance
     * @param sMultipleInstanceAbsMin
     * @param sMultipleInstanceAbsMax
     * @param sMultipleInstancePromptUnder
     * @param sMultipleInstancePromptOver
     * @param sSearchVariables
     * @param sConfirmVariables
     * @param bRequired
     * @param sUnique
     */
    public QuestionnaireData(String sQuestionnaireGuid, String sShortName, String sOnNew,
            Boolean bModifiable, Boolean bMultipleInstance, String sMultipleInstanceAbsMin,
            String sMultipleInstanceAbsMax, String sMultipleInstancePromptUnder,
            String sMultipleInstancePromptOver, String sSearchVariables, String sConfirmVariables,
            Boolean bRequired, String sUnique, ArrayList<QuestionData> alQuestions) {

        this.sQuestionnaireGuid = sQuestionnaireGuid;
        this.sShortName = sShortName;
        this.sOnNew = sOnNew;
        this.bModifiable = bModifiable;
        this.bMultipleInstance = bMultipleInstance;
        this.sMultipleInstanceAbsMin = sMultipleInstanceAbsMin;
        this.sMultipleInstanceAbsMax = sMultipleInstanceAbsMax;
        this.sMultipleInstancePromptUnder = sMultipleInstancePromptUnder;
        this.sMultipleInstancePromptOver = sMultipleInstancePromptOver;
        this.sSearchVariables = sSearchVariables;
        this.sConfirmVariables = sConfirmVariables;
        this.bRequired = bRequired;
        this.sUnique = sUnique;
        this.alQuestions = alQuestions;
    }

    

}
