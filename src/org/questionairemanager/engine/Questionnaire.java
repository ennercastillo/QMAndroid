/**
 * 
 */

package org.questionairemanager.engine;

import java.util.ArrayList;

/**
 * Class of questionnaire information.
 * 
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
 * <date>Jul, 30 2013</date>
 */
public class Questionnaire {

    private String sQuestionnaireGuid; // GUID Questionnaire
    private String sShortName; // Name of Questionnaire
    private String sOnNew; // On new
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

    private ArrayList<Question> alQuestions;

    // Screens this questionnaire
    private ArrayList<Screen> alScreens;

    /**
     * @return the alScreens
     */
    public ArrayList<Screen> getAlScreens() {
        return alScreens;
    }

    /**
     * @return the sQuestionnaireGuid
     */
    public String getsQuestionnaireGuid() {
        return sQuestionnaireGuid;
    }

    /**
     * @return the sShortName
     */
    public String getsShortName() {
        return sShortName;
    }

    /**
     * @return the sOnNew
     */
    public String getsOnNew() {
        return sOnNew;
    }

    /**
     * @return the bModifiable
     */
    public Boolean getbModifiable() {
        return bModifiable;
    }

    /**
     * @return the sMultipleInstance
     */
    public Boolean getbMultipleInstance() {
        return bMultipleInstance;
    }

    /**
     * @return the sMultipleInstanceAbsMin
     */
    public String getsMultipleInstanceAbsMin() {
        return sMultipleInstanceAbsMin;
    }

    /**
     * @return the sMultipleInstanceAbsMax
     */
    public String getsMultipleInstanceAbsMax() {
        return sMultipleInstanceAbsMax;
    }

    /**
     * @return the sMultipleInstancePromptUnder
     */
    public String getsMultipleInstancePromptUnder() {
        return sMultipleInstancePromptUnder;
    }

    /**
     * @return the sMultipleInstancePromptOver
     */
    public String getsMultipleInstancePromptOver() {
        return sMultipleInstancePromptOver;
    }

    /**
     * @return the sSearchVariables
     */
    public String getsSearchVariables() {
        return sSearchVariables;
    }

    /**
     * @return the bConfirmVariables
     */
    public String getsConfirmVariables() {
        return sConfirmVariables;
    }

    /**
     * @return the bRequired
     */
    public Boolean getbRequired() {
        return bRequired;
    }

    /**
     * @return the unique
     */
    public String getsUnique() {
        return sUnique;
    }

    /**
     * @return the alQuestions
     */
    public ArrayList<Question> getAlQuestions() {
        return alQuestions;
    }

    /**
     * Constructor class
     */
    public Questionnaire() {
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
        this.alQuestions = new ArrayList<Question>();
    }

    /**
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
    public Questionnaire(String sQuestionnaireGuid, String sShortName, String sOnNew,
            Boolean bModifiable, Boolean bMultipleInstance, String sMultipleInstanceAbsMin,
            String sMultipleInstanceAbsMax, String sMultipleInstancePromptUnder,
            String sMultipleInstancePromptOver, String sSearchVariables, String sConfirmVariables,
            Boolean bRequired, String sUnique, ArrayList<Question> alQuestions) {

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
