/**
 * 
 */

package org.questionairemanager.data;

/**
 * @author ennercastillo
 */
public class Checkpoint {

    private String sCheckPointGuid;
    private String sCondition;
    private Boolean bBranchIf;
    private String sOnBranch;

    /**
     * @return the sCheckPointGuid
     */
    public String getsCheckPointGuid() {
        return sCheckPointGuid;
    }

    /**
     * @param sCheckPointGuid the sCheckPointGuid to set
     */
    public void setsCheckPointGuid(String sCheckPointGuid) {
        this.sCheckPointGuid = sCheckPointGuid;
    }

    /**
     * @return the sCondition
     */
    public String getsCondition() {
        return sCondition;
    }

    /**
     * @param sCondition the sCondition to set
     */
    public void setsCondition(String sCondition) {
        this.sCondition = sCondition;
    }

    /**
     * @return the sBranchIf
     */
    public Boolean getbBranchIf() {
        return bBranchIf;
    }

    /**
     * @param sBranchIf the sBranchIf to set
     */
    public void setbBranchIf(Boolean sBranchIf) {
        this.bBranchIf = sBranchIf;
    }

    /**
     * @return the bOnBranch
     */
    public String getsOnBranch() {
        return sOnBranch;
    }

    /**
     * @param bOnBranch the bOnBranch to set
     */
    public void setsOnBranch(String sOnBranch) {
        this.sOnBranch = sOnBranch;
    }

    /**
     * @param sCheckPointGuid
     * @param sCondition
     * @param sBranchIf
     * @param bOnBranch
     */
    public Checkpoint(String sCheckPointGuid, String sCondition, Boolean bBranchIf, String sOnBranch) {
        this.sCheckPointGuid = sCheckPointGuid;
        this.sCondition = sCondition;
        this.bBranchIf = bBranchIf;
        this.sOnBranch = sOnBranch;
    }

    /**
     * 
     */
    public Checkpoint() {
        this.sCheckPointGuid = "";
        this.sCondition = "";
        this.bBranchIf = false;
        this.sOnBranch = "";
    }

}
