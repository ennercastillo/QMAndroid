/**
 * 
 */
package org.questionairemanager.data;

/**
 * @author ennercastillo
 *
 */
public class Node {
    
    //PK
    private String sNodeguid;
    
    private String sParentGuid;
    private String sType;
    private String sOrdinal;
    private Boolean bVisible;
    private String sNumber;
    private Boolean bHideNext;
    private Boolean bHideBack;
    private Boolean bConfirmNext;
    private Boolean bConfirmBack;
    private String sOnLoad;
    private String sOnUnload;
    private String sComment;
    
    /**
     * Constructor class without data
     */
    public Node() {
        this.sNodeguid = "";
        this.sParentGuid = "";
        this.sType = "";
        this.sOrdinal = "";
        this.bVisible = false;
        this.sNumber = "";
        this.bHideNext = false;
        this.bHideBack = false;
        this.bConfirmNext = false;
        this.bConfirmBack = false;
        this.sOnLoad = "";
        this.sOnUnload = "";
        this.sComment = "";
    }

    /**
     * Constructor class with data
     * @param sNodeguid
     * @param sParentGuid
     * @param sType
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
    public Node(String sNodeguid, String sParentGuid, String sType, String sOrdinal,
            Boolean bVisible, String sNumber, Boolean bHideNext, Boolean bHideBack,
            Boolean bConfirmNext, Boolean bConfirmBack, String sOnLoad, String sOnUnload,
            String sComment) {
        
        this.sNodeguid = sNodeguid;
        this.sParentGuid = sParentGuid;
        this.sType = sType;
        this.sOrdinal = sOrdinal;
        this.bVisible = bVisible;
        this.sNumber = sNumber;
        this.bHideNext = bHideNext;
        this.bHideBack = bHideBack;
        this.bConfirmNext = bConfirmNext;
        this.bConfirmBack = bConfirmBack;
        this.sOnLoad = sOnLoad;
        this.sOnUnload = sOnUnload;
        this.sComment = sComment;
    }

    /**
     * @return the sNodeguid
     */
    public String getsNodeguid() {
        return sNodeguid;
    }

    /**
     * @return the sParentGuid
     */
    public String getsParentGuid() {
        return sParentGuid;
    }

    /**
     * @return the sType
     */
    public String getsType() {
        return sType;
    }

    /**
     * @return the sOrdinal
     */
    public String getsOrdinal() {
        return sOrdinal;
    }

    /**
     * @return the bVisible
     */
    public Boolean getbVisible() {
        return bVisible;
    }

    /**
     * @return the sNumber
     */
    public String getsNumber() {
        return sNumber;
    }

    /**
     * @return the bHideNext
     */
    public Boolean getbHideNext() {
        return bHideNext;
    }

    /**
     * @return the bHideBack
     */
    public Boolean getbHideBack() {
        return bHideBack;
    }

    /**
     * @return the bConfirmNext
     */
    public Boolean getbConfirmNext() {
        return bConfirmNext;
    }

    /**
     * @return the bConfirmBack
     */
    public Boolean getbConfirmBack() {
        return bConfirmBack;
    }

    /**
     * @return the sOnLoad
     */
    public String getsOnLoad() {
        return sOnLoad;
    }

    /**
     * @return the sOnUnload
     */
    public String getsOnUnload() {
        return sOnUnload;
    }

    /**
     * @return the sComment
     */
    public String getsComment() {
        return sComment;
    }
    
    

}
