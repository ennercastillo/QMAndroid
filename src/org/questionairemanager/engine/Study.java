/**
 * 
 */

package org.questionairemanager.engine;

import java.util.ArrayList;
import java.util.Date;

import org.questionairemanager.data.QuestionnaireData;

/**
 * Represents a Study
 * 
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email> <date>July 02,
 *         2013</date>
 */
public class Study {

    private String sStudyGuid;
    private String sShortName;
    private String sVersion;
    private String sDesignerVersion;
    private Date dCreationDateTime;
    private Date dLastModificationDateTime;
    private String sCurrentLanguageId;
    private Boolean bExclusive;
    private Boolean bSorted;
    private String sSchema;
    private String sLogSchema;
    private String sLVSSchema;
    private String sAnalysisSchema;
    private String sSearchVariables;
    private String sConfirmVariables;

    private ArrayList<Questionnaire> alQuestionnaires;

    // private ListArray<QuestionnaireSet> lstQuestionnaireSets;
    private ArrayList<Report> lstReports;
    private String sReportsSiteCode;


    /**
     * Return questionnaires of study
     * @return
     */
    public ArrayList<Questionnaire> getQuestionnaire(){
        return alQuestionnaires;
    }

    /**
     * Return identifier of study
     * 
     * @return the sStudyId
     */
    public String getsStudyId() {
        return sStudyGuid;
    }

    /**
     * @return the sShortName
     */
    public String getsShortName() {
        return sShortName;
    }

    /**
     * @return the sVersion
     */
    public String getsVersion() {
        return sVersion;
    }

    /**
     * @return the sDesignerVersion
     */
    public String getsDesignerVersion() {
        return sDesignerVersion;
    }

    /**
     * @return the dCreationDateTime
     */
    public Date getdCreationDateTime() {
        return dCreationDateTime;
    }

    /**
     * @return the dLastModificationDateTime
     */
    public Date getdLastModificationDateTime() {
        return dLastModificationDateTime;
    }

    /**
     * @return the sStudyGuid
     */
    public String getsStudyGuid() {
        return sStudyGuid;
    }

    /**
     * @param sStudyGuid the sStudyGuid to set
     */
    public void setsStudyGuid(String sStudyGuid) {
        this.sStudyGuid = sStudyGuid;
    }

    /**
     * @return the iCurrentLanguageId
     */
    public String getsCurrentLanguageId() {
        return sCurrentLanguageId;
    }

    /**
     * @param iCurrentLanguageId the iCurrentLanguageId to set
     */
    public void setsCurrentLanguageId(String sCurrentLanguageId) {
        this.sCurrentLanguageId = sCurrentLanguageId;
    }

    /**
     * @return the sExclusive
     */
    public Boolean getbExclusive() {
        return bExclusive;
    }

    /**
     * @param sExclusive the sExclusive to set
     */
    public void setbExclusive(Boolean bExclusive) {
        this.bExclusive = bExclusive;
    }

    /**
     * @return the bSorted
     */
    public Boolean getbSorted() {
        return bSorted;
    }

    /**
     * @param bSorted the bSorted to set
     */
    public void setbSorted(Boolean bSorted) {
        this.bSorted = bSorted;
    }

    /**
     * @return the sSchema
     */
    public String getsSchema() {
        return sSchema;
    }

    /**
     * @param sSchema the sSchema to set
     */
    public void setsSchema(String sSchema) {
        this.sSchema = sSchema;
    }

    /**
     * @return the sLogSchema
     */
    public String getsLogSchema() {
        return sLogSchema;
    }

    /**
     * @param sLogSchema the sLogSchema to set
     */
    public void setsLogSchema(String sLogSchema) {
        this.sLogSchema = sLogSchema;
    }

    /**
     * @return the sLVSSchema
     */
    public String getsLVSSchema() {
        return sLVSSchema;
    }

    /**
     * @param sLVSSchema the sLVSSchema to set
     */
    public void setsLVSSchema(String sLVSSchema) {
        this.sLVSSchema = sLVSSchema;
    }

    /**
     * @return the sAnalysisSchema
     */
    public String getsAnalysisSchema() {
        return sAnalysisSchema;
    }

    /**
     * @param sAnalysisSchema the sAnalysisSchema to set
     */
    public void setsAnalysisSchema(String sAnalysisSchema) {
        this.sAnalysisSchema = sAnalysisSchema;
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
    public void setsConfirmVariables(String sConfirmVariables) {
        this.sConfirmVariables = sConfirmVariables;
    }

    /**
     * @param sShortName the sShortName to set
     */
    public void setsShortName(String sShortName) {
        this.sShortName = sShortName;
    }

    /**
     * @param sVersion the sVersion to set
     */
    public void setsVersion(String sVersion) {
        this.sVersion = sVersion;
    }

    /**
     * @param sDesignerVersion the sDesignerVersion to set
     */
    public void setsDesignerVersion(String sDesignerVersion) {
        this.sDesignerVersion = sDesignerVersion;
    }

    /**
     * @param dCreationDateTime the dCreationDateTime to set
     */
    public void setdCreationDateTime(Date dCreationDateTime) {
        this.dCreationDateTime = dCreationDateTime;
    }

    /**
     * @param dLastModificationDateTime the dLastModificationDateTime to set
     */
    public void setdLastModificationDateTime(Date dLastModificationDateTime) {
        this.dLastModificationDateTime = dLastModificationDateTime;
    }

    /**
     * @param lstReports the lstReports to set
     */
    public void setLstReports(ArrayList<Report> lstReports) {
        this.lstReports = lstReports;
    }

    /**
     * @param sReportsSiteCode the sReportsSiteCode to set
     */
    public void setsReportsSiteCode(String sReportsSiteCode) {
        this.sReportsSiteCode = sReportsSiteCode;
    }

    /**
     * Get all reports for this study
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     *         <date>Jul 11, 2013</date>
     * @return the lstReports
     */
    public ArrayList<Report> getLstReports() {

        if (this.sReportsSiteCode != "") {

            this.lstReports = Report.getAll();
            return lstReports;
        }

        return null;

    }

    /**
     * Get all reports for this study
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     *         <date>Jul 11, 2013</date>
     * @param sSiteCode, Number of site
     * @return Array List with all reports
     */
    public ArrayList<Report> getLstReports(String sSiteCode) {

        if (this.sReportsSiteCode != "") {

            this.lstReports = Report.getAll(sSiteCode);
            this.sReportsSiteCode = sSiteCode;

            return this.lstReports;
        }

        return null;

    }

    /**
     * @return the sReportsSiteCode
     */
    public String getsReportsSiteCode() {
        return sReportsSiteCode;
    }

    public Boolean Equals(Study pStudy1, Study pStudy2) {

        return pStudy1.equals(pStudy2);

    }

    public Boolean NotEquals(Study pStudy1, Study pStudy2) {
        return !(pStudy1.equals(pStudy2));
    }

    /**
     * Initializes a new instance of the Study class
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     *         <date>July 11, 2013</date>
     * @param oRegistryRow, an array list with the study properties from the
     *            registry
     */
/*    public Study(ArrayList<Object> oRegistryRow) {

        this.PopulateRegistryProperties(oRegistryRow);

        this.PopulateDatabaseProperties(
                                         * DA.StudyTable.GetSingle(this.sConfigFile
                                         * )
                                         );

    }*/

    /**
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     *         <date>Jul 11, 2013</date>
     */
    private void PopulateDatabaseProperties() {
        // TODO Auto-generated method stub
        // get elements of an arry list

        this.sShortName = "";

    }

    /**
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     *         <date>Jul 11, 2013</date>
     * @param oRegistryRow, an array list with the study properties from the
     *            registry
     */
/*    private void PopulateRegistryProperties(ArrayList<Object> oRegistryRow) {
        // TODO Auto-generated method stub, Recorrer el array

        // Get element of array list
        for (Object oRegistry : oRegistryRow) {
            this.sStudyId = ((Study) oRegistry).getsStudyId();
            // .
            // .
            // .

        }

    }*/
/*
    public Study(/** TODO: DA.StudyTable.GetSingle(Me._configFile) * /
    ) {
        this.sShortName = "row(ShortName)";
        // .
        // .
        // .
    } */

    
    /**
     * @param sStudyGuid
     * @param sShortName
     * @param sVersion
     * @param sDesignerVersion
     * @param dCreationDateTime
     * @param dLastModificationDateTime
     * @param sCurrentLanguageId
     * @param bExclusive
     * @param bSorted
     * @param sSchema
     * @param sLogSchema
     * @param sLVSSchema
     * @param sAnalysisSchema
     * @param sSearchVariables
     * @param sConfirmVariables
     * @param alQuestionnaires
     * @param lstReports
     * @param sReportsSiteCode
     */
    public Study(String sStudyGuid, String sShortName, String sVersion, String sDesignerVersion,
            Date dCreationDateTime, Date dLastModificationDateTime, String sCurrentLanguageId,
            Boolean bExclusive, Boolean bSorted, String sSchema, String sLogSchema,
            String sLVSSchema, String sAnalysisSchema, String sSearchVariables,
            String sConfirmVariables, ArrayList<Questionnaire> alQuestionnaires,
            ArrayList<Report> lstReports, String sReportsSiteCode) {

        this.sStudyGuid = sStudyGuid;
        this.sShortName = sShortName;
        this.sVersion = sVersion;
        this.sDesignerVersion = sDesignerVersion;
        this.dCreationDateTime = dCreationDateTime;
        this.dLastModificationDateTime = dLastModificationDateTime;
        this.sCurrentLanguageId = sCurrentLanguageId;
        this.bExclusive = bExclusive;
        this.bSorted = bSorted;
        this.sSchema = sSchema;
        this.sLogSchema = sLogSchema;
        this.sLVSSchema = sLVSSchema;
        this.sAnalysisSchema = sAnalysisSchema;
        this.sSearchVariables = sSearchVariables;
        this.sConfirmVariables = sConfirmVariables;
        this.alQuestionnaires = alQuestionnaires;
        this.lstReports = lstReports;
        this.sReportsSiteCode = sReportsSiteCode;
    }

}
