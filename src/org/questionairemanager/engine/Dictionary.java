/**
 * 
 */

package org.questionairemanager.engine;

/**
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 7, 2013</date>
 */
public class Dictionary {

    private String sGuid;
    private String sLanguageId;
    private String sProperty;
    private String sText;

    /**
     * @return the sGuid
     */
    public String getsGuid() {

	return sGuid;
    }

    /**
     * @return the sLanguageId
     */
    public String getsLanguageId() {

	return sLanguageId;
    }

    /**
     * @return the sProperty
     */
    public String getsProperty() {

	return sProperty;
    }

    /**
     * @return the sText
     */
    public String getsText() {

	return sText;
    }

    /**
     * @param sGuid the sGuid to set
     */
    public void setsGuid(String sGuid) {

	this.sGuid = sGuid;
    }

    /**
     * @param sLanguageId the sLanguageId to set
     */
    public void setsLanguageId(String sLanguageId) {

	this.sLanguageId = sLanguageId;
    }

    /**
     * @param sProperty the sProperty to set
     */
    public void setsProperty(String sProperty) {

	this.sProperty = sProperty;
    }

    /**
     * @param sText the sText to set
     */
    public void setsText(String sText) {

	this.sText = sText;
    }

    /**
     * @param sGuid
     * @param sLanguageId
     * @param sProperty
     * @param sText
     */
    public Dictionary(String sGuid, String sLanguageId, String sProperty, String sText) {

	this.sGuid = sGuid;
	this.sLanguageId = sLanguageId;
	this.sProperty = sProperty;
	this.sText = sText;
    }

    public Dictionary() {

    }

}
