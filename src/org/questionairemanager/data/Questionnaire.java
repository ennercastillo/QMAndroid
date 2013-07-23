/**
 * 
 */

package org.questionairemanager.data;

import java.util.ArrayList;

/**
 * @author ennercastillo
 */
public class Questionnaire {

    private String sQuestionnaireGuid;
    private String sShortName;
    private String sOnNew;
    private Boolean bModifiable;
    private String sMultipleInstance;
    private String sMultipleInstanceAbsMin;
    private String sMultipleInstanceAbsMax;
    private String sMultipleInstancePromptUnder;
    private String sMultipleInstancePromptOver;
    private String sSearchVariables;
    private Boolean bConfirmVariables;
    private Boolean bRequired;
    private Boolean Unique;
    
    private ArrayList<Study> alStudies;

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
    public String getsMultipleInstance() {
        return sMultipleInstance;
    }

    /**
     * @param sMultipleInstance the sMultipleInstance to set
     */
    public void setsMultipleInstance(String sMultipleInstance) {
        this.sMultipleInstance = sMultipleInstance;
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
    public Boolean getbConfirmVariables() {
        return bConfirmVariables;
    }

    /**
     * @param bConfirmVariables the bConfirmVariables to set
     */
    public void setbConfirmVariables(Boolean bConfirmVariables) {
        this.bConfirmVariables = bConfirmVariables;
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
    public Boolean getUnique() {
        return Unique;
    }

    /**
     * @param unique the unique to set
     */
    public void setUnique(Boolean unique) {
        Unique = unique;
    }

    /**
     * Constructor class
     */
    public Questionnaire() {
        this.sQuestionnaireGuid = "";
        this.sShortName = "";
        this.sOnNew = "";
        this.bModifiable = false;
        this.sMultipleInstance = "";
        this.sMultipleInstanceAbsMin = "";
        this.sMultipleInstanceAbsMax = "";
        this.sMultipleInstancePromptUnder = "";
        this.sMultipleInstancePromptOver = "";
        this.sSearchVariables = "";
        this.bConfirmVariables = false;
        this.bRequired = false;
        this.Unique = false;
    }

    /**
     * @param sQuestionnaireGuid
     * @param sShortName
     * @param sOnNew
     * @param bModifiable
     * @param sMultipleInstance
     * @param sMultipleInstanceAbsMin
     * @param sMultipleInstanceAbsMax
     * @param sMultipleInstancePromptUnder
     * @param sMultipleInstancePromptOver
     * @param sSearchVariables
     * @param bConfirmVariables
     * @param bRequired
     * @param unique
     */
    public Questionnaire(String sQuestionnaireGuid, String sShortName, String sOnNew,
            Boolean bModifiable, String sMultipleInstance, String sMultipleInstanceAbsMin,
            String sMultipleInstanceAbsMax, String sMultipleInstancePromptUnder,
            String sMultipleInstancePromptOver, String sSearchVariables, Boolean bConfirmVariables,
            Boolean bRequired, Boolean unique) {

        this.sQuestionnaireGuid = sQuestionnaireGuid;
        this.sShortName = sShortName;
        this.sOnNew = sOnNew;
        this.bModifiable = bModifiable;
        this.sMultipleInstance = sMultipleInstance;
        this.sMultipleInstanceAbsMin = sMultipleInstanceAbsMin;
        this.sMultipleInstanceAbsMax = sMultipleInstanceAbsMax;
        this.sMultipleInstancePromptUnder = sMultipleInstancePromptUnder;
        this.sMultipleInstancePromptOver = sMultipleInstancePromptOver;
        this.sSearchVariables = sSearchVariables;
        this.bConfirmVariables = bConfirmVariables;
        this.bRequired = bRequired;
        this.Unique = unique;
    }

    /**
     * @return the alStudies
     */
    public ArrayList<Study> getAlStudies() {
        return alStudies;
    }

    /**
     * @param alStudies the alStudies to set
     */
    public void setAlStudies(ArrayList<Study> alStudies) {
        this.alStudies = alStudies;
    }

}
