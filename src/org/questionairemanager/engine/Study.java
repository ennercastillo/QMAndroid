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
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email> 
 * <date>July 02, 2013</date>
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
     * @return the sStudyGuid
     */
    public String getsStudyGuid() {
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
     * @return the sCurrentLanguageId
     */
    public String getsCurrentLanguageId() {
        return sCurrentLanguageId;
    }

    /**
     * @return the bExclusive
     */
    public Boolean getbExclusive() {
        return bExclusive;
    }

    /**
     * @return the bSorted
     */
    public Boolean getbSorted() {
        return bSorted;
    }

    /**
     * @return the sSchema
     */
    public String getsSchema() {
        return sSchema;
    }

    /**
     * @return the sLogSchema
     */
    public String getsLogSchema() {
        return sLogSchema;
    }

    /**
     * @return the sLVSSchema
     */
    public String getsLVSSchema() {
        return sLVSSchema;
    }

    /**
     * @return the sAnalysisSchema
     */
    public String getsAnalysisSchema() {
        return sAnalysisSchema;
    }

    /**
     * @return the sSearchVariables
     */
    public String getsSearchVariables() {
        return sSearchVariables;
    }

    /**
     * @return the sConfirmVariables
     */
    public String getsConfirmVariables() {
        return sConfirmVariables;
    }

    /**
     * @return the alQuestionnaires
     */
    public ArrayList<Questionnaire> getAlQuestionnaires() {
        return alQuestionnaires;
    }

    /**
     * @return the sReportsSiteCode
     */
    public String getsReportsSiteCode() {
        return sReportsSiteCode;
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
     * Compare two studies
     * 
     * @param pStudy1, First study
     * @param pStudy2, Second study
     * @return TRUE both studies are equals, FALSE the studies are different or
     *         not exists.
     */
    public Boolean Equals(Study pStudy1, Study pStudy2) {

        return pStudy1.equals(pStudy2);

    }

    /**
     * Compare two studies with not equals
     * 
     * @param pStudy1, First study
     * @param pStudy2, Second study
     * @return TRUE both studies are not equals, FALSE both studies are equals
     *         or not exists.
     */
    public Boolean NotEquals(Study pStudy1, Study pStudy2) {
        return !(pStudy1.equals(pStudy2));
    }

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
