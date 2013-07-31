/**
 * 
 */
package org.questionairemanager.engine;

import java.util.ArrayList;

/**
 * Elements to send and receive by android dispositive
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
 * <date>Jul, 31 2013</date>
 */
public class ScreenElements {

    private String sTextElement;    // Element text
    private String sTypeElement;    // Type of element
    private ArrayList<Answer> alItems; // List of items for this element
    
    
    private String sGuid;
    /**
     * @return the sGuid
     */
    public String getsGuid() {
        return sGuid;
    }

    /**
     * @return the sTextElement
     */
    public String getsTextElement() {
        return sTextElement;
    }

    /**
     * @return the sTypeElement
     */
    public String getsTypeElement() {
        return sTypeElement;
    }

    /**
     * @return the alAnswers
     */
    public ArrayList<Answer> getAlAnswers() {
        return alItems;
    }

    /**
     * @param sTextElement the sTextElement to set
     */
    public void setsTextElement(String sTextElement) {
        this.sTextElement = sTextElement;
    }

    /**
     * @param sTypeElement the sTypeElement to set
     */
    public void setsTypeElement(String sTypeElement) {
        this.sTypeElement = sTypeElement;
    }

    /**
     * @param alItems the alItems to set
     */
    public void setAlItems(ArrayList<Answer> alItems) {
        this.alItems = alItems;
    }

    /**
     * @param sGuid the sGuid to set
     */
    public void setsGuid(String sGuid) {
        this.sGuid = sGuid;
    }

    /**
     * Class constructor
     */
    public ScreenElements(){
        this.sTextElement = "";   // Element text
        this.sTypeElement = "";    // Type of element
        this.alItems = new ArrayList<Answer>();
    }

    /** 
     * Class constructor
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul, 31 2013 </date>
     * 
     * @param sTextElement
     * @param sTypeElement
     * @param alItems
     * @param sGuid
     */
    public ScreenElements(String sTextElement, String sTypeElement, ArrayList<Answer> alItems,
            String sGuid) {
        this.sTextElement = sTextElement;
        this.sTypeElement = sTypeElement;
        this.alItems = alItems;
        this.sGuid = sGuid;
    }
    
    /**
     * Send an object with all elements of this class to Android Device
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date> Jul, 31 2013</date>
     * 
     * @return ScreenElements, object with all information this class
     */
    public ScreenElements SendElements (){
        
        ScreenElements screenElementsToSend = new ScreenElements();
        
        screenElementsToSend.setAlItems(this.getAlAnswers());
        screenElementsToSend.setsGuid(this.getsGuid());
        screenElementsToSend.setsTextElement(this.getsTextElement());
        screenElementsToSend.setsTypeElement(this.getsTypeElement());
      
        return screenElementsToSend;
        
    }
    
    /**
     * Receive elements from Android Device to operate with this project
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 31, 2013</date>
     *
     * @param screenElementsToReceive
     */
    public void ReceiveElements (ScreenElements screenElementsToReceive){
        this.setAlItems(screenElementsToReceive.getAlAnswers());
        this.setsGuid(screenElementsToReceive.getsGuid());
        this.setsTextElement(screenElementsToReceive.getsTextElement());
        this.setsTypeElement(screenElementsToReceive.getsTypeElement());
        
    }
    
}
