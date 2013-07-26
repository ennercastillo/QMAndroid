package org.questionairemanager.data;

import java.util.ArrayList;
import java.util.Date;

public class StudyData {

    
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
    
    private ArrayList<QuestionnaireData> alQuestionnaires;


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
     * @return the iCurrentLanguageId
     */
    public String getsCurrentLanguageId() {
        return sCurrentLanguageId;
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
     * Constructor class without data
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
     */
    public StudyData() {

        Date date = new Date();
    
        this.sStudyGuid = "";
        this.sShortName = "";
        this.sVersion = "";
        
        this.sDesignerVersion = "";
        this.dCreationDateTime = date;
        this.dLastModificationDateTime = date;
        
        this.sCurrentLanguageId = "";
        this.bExclusive = false;
        this.bSorted = false;
        this.sSchema = "";
        this.sLogSchema = "";
        this.sLVSSchema = "";
        this.sAnalysisSchema = "";
        this.sSearchVariables = "";
        this.sConfirmVariables = "";
    }

	public ArrayList<QuestionnaireData> getAlQuestionnaires() {
		return alQuestionnaires;
	}


	public void setAlQuestionnaires(ArrayList<QuestionnaireData> alQuestionnaires) {
		this.alQuestionnaires = alQuestionnaires;
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
     */
    public StudyData(String sStudyGuid, String sShortName, String sVersion, String sDesignerVersion,
            Date dCreationDateTime, Date dLastModificationDateTime, String sCurrentLanguageId,
            Boolean bExclusive, Boolean bSorted, String sSchema, String sLogSchema,
            String sLVSSchema, String sAnalysisSchema, String sSearchVariables,
            String sConfirmVariables, ArrayList<QuestionnaireData> alQuestionnaires) {
        
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
    }



}
