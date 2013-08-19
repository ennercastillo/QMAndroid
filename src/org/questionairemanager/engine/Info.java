/**
 * 
 */

package org.questionnairemanager.engine.core;

/**
 * @author ennercastillo
 */
public class Info extends Node {

    private String sInfoGuid;
    private String sInfoType;

    /**
     * @return the sInfoGuid
     */
    public String getsInfoGuid() {

	return sInfoGuid;
    }

    /**
     * @return the sInfoType
     */
    public String getsInfoType() {

	return sInfoType;
    }

    /**
     * @param sInfoGuid the sInfoGuid to set
     */
    public void setsInfoGuid(String sInfoGuid) {

	this.sInfoGuid = sInfoGuid;
    }

    /**
     * @param sInfoType the sInfoType to set
     */
    public void setsInfoType(String sInfoType) {

	this.sInfoType = sInfoType;
    }

    /**
     * @param sInfoGuid
     * @param sInfoType
     */
    public Info(Node nData, String sInfoGuid, String sInfoType) {

	super(nData);
	this.sInfoGuid = sInfoGuid;
	this.sInfoType = sInfoType;
    }

    public void ShowInformation() {

	super.PrintNodeInformation();
	System.out.println("guid info " + this.getsInfoGuid());
	System.out.println("info type " + this.getsInfoType());

    }

}
