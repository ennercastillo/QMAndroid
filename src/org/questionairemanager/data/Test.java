/**
 * 
 */

package org.questionairemanager.data;

import java.util.Date;

/**
 * @author ennercastillo
 */
public class Test {

    /** 
     * Ejecuci—n de la funci—n principal
     * @param args
     */
    public static void main(String[] args) {
        
        Date date = new Date();
        
        Study sStudy = new Study();

        sStudy.setsStudyGuid("abc");
        sStudy.setsShortName("studyShortName");
        sStudy.setsVersion("1.1");
        
        sStudy.setsDesignerVersion("1.0");
        sStudy.setdCreationDateTime(date);
        sStudy.setdLastModificationDateTime(date);
        
        sStudy.setiCurrentLanguageId(Integer.valueOf(0));
        sStudy.setsExclusive("exclusive");
        sStudy.setbSorted(true);
        sStudy.setsSchema ("setschema");
        sStudy.setsLogSchema("logschema");
        sStudy.setsLVSSchema("lvsschema");
        sStudy.setsAnalysisSchema ("schema");
        sStudy.setsSearchVariables("uno");
        sStudy.setbConfirmVariables (true);
        
        

    }
}
