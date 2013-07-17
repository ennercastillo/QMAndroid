/**
 * 
 */
package org.questionairemanager.core;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Study
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email>
 * <date>July 02, 2013</date>
 *
 */
public class Study {
    
    private String sStudyId;
    private String sSecurityFile;
    private String sConfigFile;
    private String sDataFile;
    
    private String sShortName;
    private String sName;
    private String sVersion;
    private String sDesignerVersion;
    private String sGeneratorVersion;
    private Date dCreationDateTime;
    private Date dLastModificationDateTime;
    private Date dGenerationDateTime;
    
    //private ListArray<QuestionnaireSet> lstQuestionnaireSets;
    private ArrayList<Report> lstReports;
    private String sReportsSiteCode;
    private ArrayList<Study> lstStudiesList;
    
    /**
     * Return identifier of study
     * @return the sStudyId
     */
    public String getsStudyId() {
        return sStudyId;
    }
    /**
     * @return the sSecurityFile
     */
    public String getsSecurityFile() {
        return sSecurityFile;
    }
    /**
     * @return the sConfigFile
     */
    public String getsConfigFile() {
        return sConfigFile;
    }
    /**
     * @return the sDataFile
     */
    public String getsDataFile() {
        return sDataFile;
    }
    /**
     * @return the sShortName
     */
    public String getsShortName() {
        return sShortName;
    }
    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
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
     * @return the sGeneratorVersion
     */
    public String getsGeneratorVersion() {
        return sGeneratorVersion;
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
     * @return the dGenerationDateTime
     */
    public Date getdGenerationDateTime() {
        return dGenerationDateTime;
    }
    /**
     * @return the lstQuestionnaireSets
     */
//    public ListArray<QuestionnaireSet> getLstQuestionnaireSets() {
//        
//        
//        
//        if (this.lstQuestionnaireSets == null)
//            return null;
//        else
//            return lstQuestionnaireSets;
//    }
    
    /**
     * Get all reports for this study
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 11, 2013</date>
     * @return the lstReports
     */
    public ArrayList<Report> getLstReports() {
        
        if (this.sReportsSiteCode != ""){
            
            this.lstReports = Report.getAll ();
            return lstReports;
        }
        
        return null;
        
    }
    
    /**
     * Get all reports for this study
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 11, 2013</date>
     * @param sSiteCode, Number of site
     * @return Array List with all reports
     */
    public ArrayList<Report> getLstReports (String sSiteCode){
        
        if (this.sReportsSiteCode != ""){
            
            this.lstReports = Report.getAll(sSiteCode);
            this.sReportsSiteCode = sSiteCode;
        
            return this.lstReports;
        }
        
        return null;
        
    }
    
    /**
     * Get all studies
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 11, 2013</date>
     * @return ArrayList of all the studies
     */
    public ArrayList<Study> getAllStudies (){
        if (this.lstStudiesList.isEmpty()){
            this.lstStudiesList = new ArrayList<Study> ();
            
            // TODO: Add elements of DataBase of DA.StudyRegistry.GetAll()
            // element by element
        }
        
        return this.lstStudiesList;
            
    }
    
    /**
     * @return the sReportsSiteCode
     */
    public String getsReportsSiteCode() {
        return sReportsSiteCode;
    }
    
    
    public Boolean Equals (Study pStudy1, Study pStudy2){
        
        return pStudy1.equals(pStudy2);
        
    }
    
    public Boolean NotEquals (Study pStudy1, Study pStudy2){
        return !(pStudy1.equals(pStudy2));
    }
    
    /**
     * Initializes a new instance of the Study class
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>July 11, 2013</date>
     * @param oRegistryRow, an array list with the study properties from the registry
     */
    public Study (ArrayList<Object> oRegistryRow){
        
        
        this.PopulateRegistryProperties(oRegistryRow);
        
        this.PopulateDatabaseProperties(/*DA.StudyTable.GetSingle(this.sConfigFile)*/);
        
    }
    
    
    
    
    /**
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 11, 2013</date>
     */
    private void PopulateDatabaseProperties() {
        // TODO Auto-generated method stub
        // get elements of an arry list
        
        this.sShortName = "";
        
        
    }
    /**
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 11, 2013</date>
     * @param oRegistryRow, an array list with the study properties from the registry
     */
    private void PopulateRegistryProperties(ArrayList<Object> oRegistryRow) {
        // TODO Auto-generated method stub, Recorrer el array
        
        
        // Get element of array list
        for (Object oRegistry : oRegistryRow){
            this.sStudyId = ((Study)oRegistry).getsStudyId();
            //.
            //.
            //.
            
        }
        
        
        
    }
    
    
    
    
    
    /**
     * Constructor of class
     * @author Enner Escobedo C. <email>eriec.42@gmail.com</email>
     * <date>July 02, 2013</date>
     * 
     * @param sStudyId
     * @param sSecurityFile
     * @param sConfigFile
     * @param sDataFile
     * @param sShortName
     * @param sName
     * @param sVersion
     * @param sDesignerVersion
     * @param sGeneratorVersion
     * @param dCreationDateTime
     * @param dLastModificationDateTime
     * @param dGenerationDateTime
     * @param lstQuestionnaireSets
     * @param lstReports
     * @param sReportsSiteCode
     */
    public Study(String sStudyId, String sSecurityFile, String sConfigFile, String sDataFile,
            String sShortName, String sName, String sVersion, String sDesignerVersion,
            String sGeneratorVersion, Date dCreationDateTime, Date dLastModificationDateTime,
            Date dGenerationDateTime, /*ArrayList<QuestionnaireSet> lstQuestionnaireSets, */
            ArrayList<Report> lstReports, String sReportsSiteCode) {
        this.sStudyId = sStudyId;
        this.sSecurityFile = sSecurityFile;
        this.sConfigFile = sConfigFile;
        this.sDataFile = sDataFile;
        this.sShortName = sShortName;
        this.sName = sName;
        this.sVersion = sVersion;
        this.sDesignerVersion = sDesignerVersion;
        this.sGeneratorVersion = sGeneratorVersion;
        this.dCreationDateTime = dCreationDateTime;
        this.dLastModificationDateTime = dLastModificationDateTime;
        this.dGenerationDateTime = dGenerationDateTime;
        // this.lstQuestionnaireSets = lstQuestionnaireSets;
        // this.lstReports = lstReports;
        this.sReportsSiteCode = sReportsSiteCode;
    }
    
    
    public Study (/** TODO: DA.StudyTable.GetSingle(Me._configFile) */){
        this.sShortName = "row(ShortName)";
        //.
        //.
        //.
    }
    
    

}
