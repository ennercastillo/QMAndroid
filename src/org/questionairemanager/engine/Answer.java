package org.questionairemanager.engine;

/**
 * Answer for the elements to screen
 * 
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
 * <date>Jul 31, 2013</date>
 */
public class Answer {

    // / ATTRIBUTES
    private String sGuidAnswer;
    private String sValueAnswer;
    private String sTextAnswer;

    /**
     * @return the sGuidAnswer
     */
    public String getsGuidAnswer() {
        return sGuidAnswer;
    }

    /**
     * @return the sValueAnswer
     */
    public String getsValueAnswer() {
        return sValueAnswer;
    }

    /**
     * @return the sTextAnswer
     */
    public String getsTextAnswer() {
        return sTextAnswer;
    }

    /**
     * @param sGuidAnswer the sGuidAnswer to set
     */
    public void setsGuidAnswer(String sGuidAnswer) {
        this.sGuidAnswer = sGuidAnswer;
    }

    /**
     * @param sValueAnswer the sValueAnswer to set
     */
    public void setsValueAnswer(String sValueAnswer) {
        this.sValueAnswer = sValueAnswer;
    }

    /**
     * @param sTextAnswer the sTextAnswer to set
     */
    public void setsTextAnswer(String sTextAnswer) {
        this.sTextAnswer = sTextAnswer;
    }

    /**
     * Class constructor with out data
     */
    public Answer() {
        this.sGuidAnswer = "";
        this.sValueAnswer = "";
        this.sTextAnswer = "";
    }

    /**
     * Class constructor with data
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 31, 2013</date>
     * 
     * @param sGuidAnswer
     * @param sValueAnswer
     * @param sTextAnswer
     */
    public Answer(String sGuidAnswer, String sValueAnswer, String sTextAnswer) {
        this.sGuidAnswer = sGuidAnswer;
        this.sValueAnswer = sValueAnswer;
        this.sTextAnswer = sTextAnswer;
    }

    /**
     * Is an answer object empty
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 31, 2013</date>
     *
     * @return Boolean, TRUE is empty, FALSE with data
     */
    public Boolean isEmpty() {
        return (this.sGuidAnswer.isEmpty() && this.sTextAnswer.isEmpty() && this.sValueAnswer.isEmpty()) ? true : false;
    }

    /**
     * Receive answer of dispositive android
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 31, 2013</date>
     * @param aResponse, response android
     */
    public Boolean ReceiveAnswer(Answer aResponse) {
        if (!aResponse.isEmpty()) {
            this.setsGuidAnswer(aResponse.getsGuidAnswer());
            this.setsTextAnswer(aResponse.getsTextAnswer());
            this.setsValueAnswer(aResponse.getsValueAnswer());
            return true; // Add answer is ok
        }
        return false; // Add answer error, not data
    }

    /**
     * Send answer to android dispositive
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
     * <date>Jul 31, 2013</date>
     *
     * @return Answer, object with all data
     */
    public Answer SendAnswer() {
        
        Answer answerResponse = new Answer();
        
        answerResponse.setsGuidAnswer(this.sGuidAnswer);
        answerResponse.setsTextAnswer(this.sTextAnswer);
        answerResponse.setsValueAnswer(this.sValueAnswer);
        
        
        return answerResponse;
    }

}
