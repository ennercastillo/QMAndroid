package org.questionairemanager.core;

public class Transition {
    
    private Integer iTransitionId;
    private Integer iScreenIdInitial;
    private Integer iScreenIdNext;
    private String sCondition;
    
    /**
     * @return the iTransitionId
     */
    public Integer getiTransitionId() {
        return iTransitionId;
    }
    /**
     * @param iTransitionId the iTransitionId to set
     */
    public void setiTransitionId(Integer iTransitionId) {
        this.iTransitionId = iTransitionId;
    }
    /**
     * @return the iScreenIdInitial
     */
    public Integer getiScreenIdInitial() {
        return iScreenIdInitial;
    }
    /**
     * @param iScreenIdInitial the iScreenIdInitial to set
     */
    public void setiScreenIdInitial(Integer iScreenIdInitial) {
        this.iScreenIdInitial = iScreenIdInitial;
    }
    /**
     * @return the iScreenIdNext
     */
    public Integer getiScreenIdNext() {
        return iScreenIdNext;
    }
    /**
     * @param iScreenIdNext the iScreenIdNext to set
     */
    public void setiScreenIdNext(Integer iScreenIdNext) {
        this.iScreenIdNext = iScreenIdNext;
    }
    /**
     * @return the oCondition
     */
    public String getoCondition() {
        return sCondition;
    }
    /**
     * @param oCondition the oCondition to set
     */
    public void setoCondition(String sPCondition) {
        this.sCondition = sPCondition;
    }
    
    
    /**
     * @param iTransitionId
     * @param iScreenIdInitial
     * @param iScreenIdNext
     * @param oCondition
     */
    public Transition(Integer iTransitionId, Integer iScreenIdInitial, Integer iScreenIdNext,
            String sPCondition) {
        this.iTransitionId = iTransitionId;
        this.iScreenIdInitial = iScreenIdInitial;
        this.iScreenIdNext = iScreenIdNext;
        this.sCondition = sPCondition;
    }
    
    /**
     * Constructor class
     */
    public Transition () {
        this.iTransitionId = Integer.valueOf(0);
        this.iScreenIdNext = Integer.valueOf(0);
        this.iScreenIdInitial = Integer.valueOf(0);
        this.sCondition = new String();
    }
    
    /**
     * Add elements to this class
     * @param iTransitionId
     * @param iScreenIdInitial
     * @param iScreenIdNext
     * @param oCondition
     */
    public void Add(Integer iTransitionId, Integer iScreenIdInitial, Integer iScreenIdNext, String sPCondition){
        this.iScreenIdInitial = iScreenIdInitial;
        this.iScreenIdNext = iScreenIdNext;
        this.iTransitionId = iTransitionId;
        this.sCondition = sPCondition;
    }
    
    

}
