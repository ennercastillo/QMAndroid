/**
 * 
 */

package org.questionnairemanager.engine.core;

import java.util.ArrayList;

/**
 * Class for questionnaire
 * 
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 20, 2013</date>
 */
public class Questionnaire extends Node {

    private String sQuestionnaireGuid; // GUID Questionnaire
    private String sShortName; // Name of Questionnaire
    private String sOnNew; // On new
    private Boolean bModifiable;
    private Boolean bMultipleInstance;

    private String sMultipleInstanceAbsMin;
    private String sMultipleInstanceAbsMax;
    private String sMultipleInstancePromptUnder;
    private String sMultipleInstancePromptOver;

    private String sSearchVariables;
    private String sConfirmVariables;

    private Boolean bRequired;
    private String sUnique;

    private ArrayList<Node> alQuestions = new ArrayList<Node>();

    // Screens this questionnaire
    private ArrayList<Screen> alScreens = new ArrayList<Screen>();

    /**
     * @return the alScreens
     */
    public ArrayList<Screen> getAlScreens() {

	return alScreens;
    }

    /**
     * @return the sQuestionnaireGuid
     */
    public String getsQuestionnaireGuid() {

	return sQuestionnaireGuid;
    }

    /**
     * @return the sShortName
     */
    public String getsShortName() {

	return sShortName;
    }

    /**
     * @return the sOnNew
     */
    public String getsOnNew() {

	return sOnNew;
    }

    /**
     * @return the bModifiable
     */
    public Boolean getbModifiable() {

	return bModifiable;
    }

    /**
     * @return the sMultipleInstance
     */
    public Boolean getbMultipleInstance() {

	return bMultipleInstance;
    }

    /**
     * @return the sMultipleInstanceAbsMin
     */
    public String getsMultipleInstanceAbsMin() {

	return sMultipleInstanceAbsMin;
    }

    /**
     * @return the sMultipleInstanceAbsMax
     */
    public String getsMultipleInstanceAbsMax() {

	return sMultipleInstanceAbsMax;
    }

    /**
     * @return the sMultipleInstancePromptUnder
     */
    public String getsMultipleInstancePromptUnder() {

	return sMultipleInstancePromptUnder;
    }

    /**
     * @return the sMultipleInstancePromptOver
     */
    public String getsMultipleInstancePromptOver() {

	return sMultipleInstancePromptOver;
    }

    /**
     * @return the sSearchVariables
     */
    public String getsSearchVariables() {

	return sSearchVariables;
    }

    /**
     * @return the bConfirmVariables
     */
    public String getsConfirmVariables() {

	return sConfirmVariables;
    }

    /**
     * @return the bRequired
     */
    public Boolean getbRequired() {

	return bRequired;
    }

    /**
     * @return the unique
     */
    public String getsUnique() {

	return sUnique;
    }

    /**
     * @return the alQuestions
     */
    public ArrayList<Node> getAlQuestions() {

	return alQuestions;
    }

    /**
     * Add questions to this questionnaire
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>13/08/2013</date>
     * @param alQuestions, array list of questions for this questionnaire
     */
    public void setAlQuestions(ArrayList<Node> alQuestions) {

	if (this.alQuestions.isEmpty()) this.alQuestions = new ArrayList<Node>();

	this.alQuestions = alQuestions;
    }

    /**
     * Constructor class
     */
    public Questionnaire() {

	this.sQuestionnaireGuid = "";
	this.sShortName = "";
	this.sOnNew = "";
	this.bModifiable = false;
	this.bMultipleInstance = false;
	this.sMultipleInstanceAbsMin = "";
	this.sMultipleInstanceAbsMax = "";
	this.sMultipleInstancePromptUnder = "";
	this.sMultipleInstancePromptOver = "";
	this.sSearchVariables = "";
	this.sConfirmVariables = "";
	this.bRequired = false;
	this.sUnique = "";
    }

    /**
     * @param sQuestionnaireGuid
     * @param sShortName
     * @param sOnNew
     * @param bModifiable
     * @param bMultipleInstance
     * @param sMultipleInstanceAbsMin
     * @param sMultipleInstanceAbsMax
     * @param sMultipleInstancePromptUnder
     * @param sMultipleInstancePromptOver
     * @param sSearchVariables
     * @param sConfirmVariables
     * @param bRequired
     * @param sUnique
     */
    public Questionnaire(Node nData, String sQuestionnaireGuid, String sShortName, String sOnNew, Boolean bModifiable, Boolean bMultipleInstance,
	    String sMultipleInstanceAbsMin, String sMultipleInstanceAbsMax, String sMultipleInstancePromptUnder, String sMultipleInstancePromptOver,
	    String sSearchVariables, String sConfirmVariables, Boolean bRequired, String sUnique) {

	super(nData);
	this.sQuestionnaireGuid = sQuestionnaireGuid;
	this.sShortName = sShortName;
	this.sOnNew = sOnNew;
	this.bModifiable = bModifiable;
	this.bMultipleInstance = bMultipleInstance;
	this.sMultipleInstanceAbsMin = sMultipleInstanceAbsMin;
	this.sMultipleInstanceAbsMax = sMultipleInstanceAbsMax;
	this.sMultipleInstancePromptUnder = sMultipleInstancePromptUnder;
	this.sMultipleInstancePromptOver = sMultipleInstancePromptOver;
	this.sSearchVariables = sSearchVariables;
	this.sConfirmVariables = sConfirmVariables;
	this.bRequired = bRequired;
	this.sUnique = sUnique;

    }

    /**
     * Class constructor with Node
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 20, 2013</date>
     * @param nData, Information node
     */
    public Questionnaire(Node nData) {

	super(nData);
    }

    /**
     * Show the information for Questionnaire
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>14/08/2013</date>
     */
    public void ShowInformation() {

	this.PrintNodeInformation();

	System.out.println("questionnaire guid" + this.getsQuestionnaireGuid());
	System.out.println("short name " + this.getsShortName());
	System.out.println("s on new" + this.getsOnNew());
	System.out.println("is modifiable " + this.getbModifiable());
	System.out.println("is absmin " + this.getsMultipleInstanceAbsMin());
	System.out.println("is absmax " + this.getsMultipleInstanceAbsMax());
	System.out.println("prompt under " + this.getsMultipleInstancePromptUnder());
	System.out.println("prompt over " + this.getsMultipleInstancePromptOver());
	System.out.println("search variable" + this.getsSearchVariables());
	System.out.println("confirm var " + this.getsConfirmVariables());
	System.out.println("is required " + this.getbRequired());
	System.out.println("unique " + this.getsUnique());
    }

    public void setQuestionsForQuestionnaire() {

	Node node1 = new Node("guidq1", "guidqu1", TypeNode.Q, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node2 = new Node("guidq", "guidqu1", TypeNode.Q, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node3 = new Node("guidq3", "guidqu1", TypeNode.Q, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node4 = new Node("guidq4", "guidqu1", TypeNode.Q, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node5 = new Node("guidq5", "guidqu1", TypeNode.Q, "4", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node6 = new Node("guidq6", "guidqu2", TypeNode.Q, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node7 = new Node("guidq7", "guidqu2", TypeNode.Q, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node8 = new Node("guidq8", "guidqu2", TypeNode.Q, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node9 = new Node("guidq9", "guidqu2", TypeNode.Q, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node10 = new Node("guidq10", "guidqu2", TypeNode.Q, "4", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node11 = new Node("guidq11", "guidqu3", TypeNode.Q, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node12 = new Node("guidq12", "guidqu3", TypeNode.Q, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node13 = new Node("guidq13", "guidqu3", TypeNode.Q, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node14 = new Node("guidq14", "guidqu3", TypeNode.Q, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node15 = new Node("guidq15", "guidqu3", TypeNode.Q, "4", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node16 = new Node("guidq16", "guidqu", TypeNode.Q, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node17 = new Node("guidq17", "guidqu", TypeNode.Q, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node18 = new Node("guidq18", "guidqu", TypeNode.Q, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node19 = new Node("guidq19", "guidqu", TypeNode.CH, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node20 = new Node("guidq20", "guidqu", TypeNode.IN, "4", true, "num", true, true, true, true, "onload", "unload", "comment");

	node1.setElementMainText("lguidesp1", "Pregunta 1");
	node1.setElementMainText("lguideng1", "Question 1");

	node2.setElementMainText("lguidesp1", "Pregunta 2");
	node2.setElementMainText("lguideng1", "Question 2");

	node3.setElementMainText("lguidesp1", "Pregunta 3");
	node3.setElementMainText("lguideng1", "Question 3");

	node4.setElementMainText("lguidesp1", "Pregunta 4");
	node4.setElementMainText("lguideng1", "Question 4");

	node5.setElementMainText("lguidesp1", "Pregunta  5");
	node5.setElementMainText("lguideng1", "Question 5");

	node6.setElementMainText("lguidesp1", "Pregunta 6");
	node6.setElementMainText("lguideng1", "Question 6");

	node7.setElementMainText("lguidesp1", "Pregunta 7");
	node7.setElementMainText("lguideng1", "Question 7");

	node8.setElementMainText("lguidesp1", "Pregunta 8");
	node8.setElementMainText("lguideng1", "Question 8");

	node9.setElementMainText("lguidesp1", "Pregunta 9");
	node9.setElementMainText("lguideng1", "Question 9");

	node10.setElementMainText("lguidesp1", "Pregunta 10");
	node10.setElementMainText("lguideng1", "Question 10");

	node11.setElementMainText("lguidesp1", "Pregunta 11");
	node11.setElementMainText("lguideng1", "Question 11");

	node12.setElementMainText("lguidesp1", "Pregunta 12");
	node12.setElementMainText("lguideng1", "Question 12");

	node13.setElementMainText("lguidesp1", "Pregunta 13");
	node13.setElementMainText("lguideng1", "Question 13");

	node14.setElementMainText("lguidesp1", "Pregunta 14");
	node14.setElementMainText("lguideng1", "Question 14");

	node15.setElementMainText("lguidesp1", "Pregunta 15");
	node15.setElementMainText("lguideng1", "Question 15");

	node16.setElementMainText("lguidesp1", "Pregunta 16");
	node16.setElementMainText("lguideng1", "Question 16");

	node17.setElementMainText("lguidesp1", "Pregunta 17");
	node17.setElementMainText("lguideng1", "Question 17");

	node18.setElementMainText("lguidesp1", "Pregunta 18");
	node18.setElementMainText("lguideng1", "Question 18");

	node19.setElementMainText("lguidesp1", "Checkpoint 19");
	node19.setElementMainText("lguideng1", "checkpoint 19");

	node20.setElementMainText("lguidesp1", "informacion 6");
	node20.setElementMainText("lguideng1", "information 6");

	Question q1 = new Question(node1, "guidqu1", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q2 = new Question(node2, "guidqu1", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q3 = new Question(node3, "guidqu1", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q4 = new Question(node4, "guidqu1", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q5 = new Question(node5, "guidqu1", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q6 = new Question(node6, "guidqu2", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q7 = new Question(node7, "guidqu2", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q8 = new Question(node8, "guidqu2", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q9 = new Question(node9, "guidqu2", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q10 = new Question(node10, "guidqu2", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q11 = new Question(node11, "guidqu3", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q12 = new Question(node12, "guidqu3", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q13 = new Question(node13, "guidqu3", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q14 = new Question(node14, "guidqu3", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q15 = new Question(node15, "guidqu3", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q16 = new Question(node16, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q17 = new Question(node17, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q18 = new Question(node18, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");

	Checkpoint ch19 = new Checkpoint(node19, "guidqu", "if a > b", "continue", "on branch");
	// Checkpoint q19 = new Checkpoint(node19, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange",
	// "uniq1");
	Info in20 = new Info(node20, "guidqu", "info type");

	// Info in20 = new Info(node20, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");

	this.alQuestions.add(q1);
	this.alQuestions.add(q2);
	this.alQuestions.add(q3);
	this.alQuestions.add(q4);
	this.alQuestions.add(q5);
	this.alQuestions.add(q6);
	this.alQuestions.add(q7);
	this.alQuestions.add(q8);
	this.alQuestions.add(q9);
	this.alQuestions.add(q10);
	this.alQuestions.add(q11);
	this.alQuestions.add(q12);
	this.alQuestions.add(q13);
	this.alQuestions.add(q14);
	this.alQuestions.add(q15);
	this.alQuestions.add(q16);
	this.alQuestions.add(q17);
	this.alQuestions.add(q18);
	this.alQuestions.add(ch19);
	this.alQuestions.add(in20);
    }

    // / TODO: Get Elements for this Questionnaire
    // Puede ser cualquier elemento CH, IN, Q
    public void getFirstElement() {

    }

    public void getNextElement() {

    }

}
