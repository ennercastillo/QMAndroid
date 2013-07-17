/**
 * 
 */
package org.questionairemanager.engine;

import java.util.ArrayList;

/**
 * Get the address of the screen
 * @author Enner Escobedo C. <email>eriec.42@gmail.com</email>
 * <date>Jul 04, 2013</date>
 *
 */
public class ScreenTemplate {

    private Integer iScreenTemplateId;
    private String sDotNetClassName;
    
    /**
     * @return the iScreenTemplateId
     */
    public Integer getiScreenTemplateId() {
        return iScreenTemplateId;
    }
    /**
     * @return the sDotNetClassName
     */
    public String getsDotNetClassName() {
        return sDotNetClassName;
    }
    
    public ScreenTemplate (Integer iScreenTemplateId){
        
        ArrayList<Object> alRow = null;
        //TODO: DA.ScreenTemplate.GetSingle(iScreenTemplateId)
        PopulateProperties (alRow);
    }
    
    
    /**
     * Assign the properties values
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 4, 2013</date>
     * @param alRow, Array list with the data 
     */
    private void PopulateProperties(ArrayList<Object> alRow) {
        // TODO Auto-generated method stub
        for(Object scrTemplate : alRow){

            
            this.iScreenTemplateId = ((ScreenTemplate)scrTemplate).getiScreenTemplateId();
            this.sDotNetClassName = ((ScreenTemplate)scrTemplate).getsDotNetClassName();
        }
        
    }
    
    
    
    
    
}
