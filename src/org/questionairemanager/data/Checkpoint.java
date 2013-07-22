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
    private String sBranchIf;
    private Boolean bOnBranch;

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
    public String getsBranchIf() {
        return sBranchIf;
    }

    /**
     * @param sBranchIf the sBranchIf to set
     */
    public void setsBranchIf(String sBranchIf) {
        this.sBranchIf = sBranchIf;
    }

    /**
     * @return the bOnBranch
     */
    public Boolean getbOnBranch() {
        return bOnBranch;
    }

    /**
     * @param bOnBranch the bOnBranch to set
     */
    public void setbOnBranch(Boolean bOnBranch) {
        this.bOnBranch = bOnBranch;
    }

    /**
     * @param sCheckPointGuid
     * @param sCondition
     * @param sBranchIf
     * @param bOnBranch
     */
    public Checkpoint(String sCheckPointGuid, String sCondition, String sBranchIf, Boolean bOnBranch) {
        this.sCheckPointGuid = sCheckPointGuid;
        this.sCondition = sCondition;
        this.sBranchIf = sBranchIf;
        this.bOnBranch = bOnBranch;
    }

    /**
     * 
     */
    public Checkpoint() {
        this.sCheckPointGuid = "";
        this.sCondition = "";
        this.sBranchIf = "";
        this.bOnBranch = false;
    }

}
