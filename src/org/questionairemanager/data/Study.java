package org.questionairemanager.data;

import java.util.Date;

public class Study {

    
    private String sStudyGuid;
    private String sShortName;
    private String sVersion;
    private String sDesignerVersion;
    private Date dCreationDateTime;
    private Date dLastModificationDateTime;
    private Integer iCurrentLanguageId;
    private String sExclusive;
    private Boolean bSorted;
    private String sSchema;
    private String sLogSchema;
    private String sLVSSchema;
    private String sAnalysisSchema;
    private String sSearchVariables;
    private Boolean bConfirmVariables;


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
     * @return the sVersion
     */
    public String getsVersion() {
        return sVersion;
    }


    /**
     * @param sVersion the sVersion to set
     */
    public void setsVersion(String sVersion) {
        this.sVersion = sVersion;
    }


    /**
     * @return the sDesignerVersion
     */
    public String getsDesignerVersion() {
        return sDesignerVersion;
    }


    /**
     * @param sDesignerVersion the sDesignerVersion to set
     */
    public void setsDesignerVersion(String sDesignerVersion) {
        this.sDesignerVersion = sDesignerVersion;
    }


    /**
     * @return the dCreationDateTime
     */
    public Date getdCreationDateTime() {
        return dCreationDateTime;
    }


    /**
     * @param dCreationDateTime the dCreationDateTime to set
     */
    public void setdCreationDateTime(Date dCreationDateTime) {
        this.dCreationDateTime = dCreationDateTime;
    }


    /**
     * @return the dLastModificationDateTime
     */
    public Date getdLastModificationDateTime() {
        return dLastModificationDateTime;
    }


    /**
     * @param dLastModificationDateTime the dLastModificationDateTime to set
     */
    public void setdLastModificationDateTime(Date dLastModificationDateTime) {
        this.dLastModificationDateTime = dLastModificationDateTime;
    }


    /**
     * @return the iCurrentLanguageId
     */
    public Integer getiCurrentLanguageId() {
        return iCurrentLanguageId;
    }


    /**
     * @param iCurrentLanguageId the iCurrentLanguageId to set
     */
    public void setiCurrentLanguageId(Integer iCurrentLanguageId) {
        this.iCurrentLanguageId = iCurrentLanguageId;
    }


    /**
     * @return the sExclusive
     */
    public String getsExclusive() {
        return sExclusive;
    }


    /**
     * @param sExclusive the sExclusive to set
     */
    public void setsExclusive(String sExclusive) {
        this.sExclusive = sExclusive;
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
     * Constructor class without data
     * @param sStudyGuid
     * @param sShortName
     * @param sVersion
     * @param sDesignerVersion
     * @param dCreationDateTime
     * @param dLastModificationDateTime
     * @param iCurrentLanguageId
     * @param sExclusive
     * @param bSorted
     * @param sSchema
     * @param sLogSchema
     * @param sLVSSchema
     * @param sAnalysisSchema
     * @param sSearchVariables
     * @param bConfirmVariables
     */
    public Study() {

        Date date = new Date();
    
        this.sStudyGuid = "";
        this.sShortName = "";
        this.sVersion = "";
        
        this.sDesignerVersion = "";
        this.dCreationDateTime = date;
        this.dLastModificationDateTime = date;
        
        this.iCurrentLanguageId = Integer.valueOf(0);
        this.sExclusive = "";
        this.bSorted = false;
        this.sSchema = "";
        this.sLogSchema = "";
        this.sLVSSchema = "";
        this.sAnalysisSchema = "";
        this.sSearchVariables = "";
        this.bConfirmVariables = false;
    }

    /**
     * Add elements this class
     * @param oData
     */
    public void Add(Object oData){
        
        this.sStudyGuid = ((Study)oData).getsStudyGuid();
        this.sShortName = ((Study)oData).getsShortName();
        this.sVersion = ((Study)oData).getsVersion();
        
        this.sDesignerVersion = ((Study)oData).getsDesignerVersion();
        this.dCreationDateTime = ((Study)oData).getdCreationDateTime();
        this.dLastModificationDateTime = ((Study)oData).getdLastModificationDateTime();
        
        this.iCurrentLanguageId = ((Study)oData).getiCurrentLanguageId();
        this.sExclusive = ((Study)oData).getsExclusive();
        this.bSorted = ((Study)oData).getbSorted();
        this.sSchema = ((Study)oData).getsSchema();
        this.sLogSchema = ((Study)oData).getsLogSchema();
        this.sLVSSchema = ((Study)oData).getsLVSSchema();
        this.sAnalysisSchema = ((Study)oData).getsAnalysisSchema();
        this.sSearchVariables = ((Study)oData).getsSearchVariables();
        this.bConfirmVariables = ((Study)oData).getbConfirmVariables();
        
    }



}
