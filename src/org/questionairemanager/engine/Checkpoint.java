/**
 * 
 */

package org.questionnairemanager.engine.core;

/**
 * Class for Checkpoint
 * 
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 19, 2013</date>
 */
public class Checkpoint extends Node {

    private String sCheckPointGuid;	// Guid Checkpoint
    private String sCondition;		// Condition to evaluate
    private String sBranchIf;		// Branchif
    private String sOnBranch;		// is on branch

    /**
     * @return the sCheckPointGuid
     */
    public String getsCheckPointGuid() {

	return sCheckPointGuid;
    }

    /**
     * @return the sCondition
     */
    public String getsCondition() {

	return sCondition;
    }

    /**
     * @return the sBranchIf
     */
    public String getsBranchIf() {

	return sBranchIf;
    }

    /**
     * @return the sOnBranch
     */
    public String getsOnBranch() {

	return sOnBranch;
    }

    /**
     * @param sCheckPointGuid the sCheckPointGuid to set
     */
    public void setsCheckPointGuid(String sCheckPointGuid) {

	this.sCheckPointGuid = sCheckPointGuid;
    }

    /**
     * @param sCondition the sCondition to set
     */
    public void setsCondition(String sCondition) {

	this.sCondition = sCondition;
    }

    /**
     * @param sBranchIf the sBranchIf to set
     */
    public void setsBranchIf(String sBranchIf) {

	this.sBranchIf = sBranchIf;
    }

    /**
     * @param sOnBranch the sOnBranch to set
     */
    public void setsOnBranch(String sOnBranch) {

	this.sOnBranch = sOnBranch;
    }

    /**
     * @param sCheckPointGuid
     * @param sCondition
     * @param sBranchIf
     * @param sOnBranch
     */
    public Checkpoint(Node nData, String sCheckPointGuid, String sCondition, String sBranchIf, String sOnBranch) {

	super(nData);
	this.sCheckPointGuid = sCheckPointGuid;
	this.sCondition = sCondition;
	this.sBranchIf = sBranchIf;
	this.sOnBranch = sOnBranch;
    }

    /**
     * 
     */
    public Checkpoint() {

	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @param nData
     */
    public Checkpoint(Node nData) {

	super(nData);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param sNodeguid
     * @param sParentGuid
     * @param sTypeNode
     * @param sOrdinal
     * @param bVisible
     * @param sNumber
     * @param bHideNext
     * @param bHideBack
     * @param bConfirmNext
     * @param bConfirmBack
     * @param sOnLoad
     * @param sOnUnload
     * @param sComment
     */
    public Checkpoint(String sNodeguid, String sParentGuid, TypeNode sTypeNode, String sOrdinal, Boolean bVisible, String sNumber, Boolean bHideNext,
	    Boolean bHideBack, Boolean bConfirmNext, Boolean bConfirmBack, String sOnLoad, String sOnUnload, String sComment) {

	super(sNodeguid, sParentGuid, sTypeNode, sOrdinal, bVisible, sNumber, bHideNext, bHideBack, bConfirmNext, bConfirmBack, sOnLoad, sOnUnload, sComment);
	// TODO Auto-generated constructor stub
    }

    public void ShowInformation() {

	this.PrintNodeInformation();
	System.out.println("guid ch" + this.getsCheckPointGuid());
	System.out.println("condition " + this.getsCondition());
	System.out.println("branch if " + this.getsBranchIf());
	System.out.println("on branch " + this.getsOnBranch());
    }

}
