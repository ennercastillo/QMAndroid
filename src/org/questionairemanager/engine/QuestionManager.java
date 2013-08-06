
package org.questionairemanager.engine;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

import org.questionairemanager.data.ExpressionData;
import org.questionairemanager.data.ExpressionValueData;

public class QuestionManager {

    private ArrayList<Node> alStudies;
    private Stack<String> stScreens;

    public QuestionManager() {

	alStudies = new ArrayList<Node>();
	stScreens = new Stack<String>();
    }

    /**
     * Get all studies of data access
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 1, 2013</date>
     */
    public void SetListOfStudies() {

	// TODO: Get all studies of Data Access

	/*** INFO ADICIONAL ***/

	// Define date
	Date date = new Date();

	// TODO: Expression Value
	ExpressionValueData expVal1 = new ExpressionValueData("expval1", "val1");
	ExpressionValueData expVal2 = new ExpressionValueData("expval2", "val2");
	ExpressionValueData expVal3 = new ExpressionValueData("expval3", "val3");
	ExpressionValueData expVal4 = new ExpressionValueData("expval4", "val4");

	// TODO: Verificar como usan expression
	ExpressionData exp1 = new ExpressionData("exp1", "var1", "int", true);
	ExpressionData exp2 = new ExpressionData("exp2", "var2", "int", true);
	ExpressionData exp3 = new ExpressionData("exp3", "var3", "int", true);
	ExpressionData exp4 = new ExpressionData("exp4", "var4", "int", true);
	ExpressionData exp5 = new ExpressionData("exp5", "var5", "int", true);
	ExpressionData exp6 = new ExpressionData("exp6", "var6", "int", true);

	// TODO: Verificar si se incluye la clase en Legal Value
	LegalValueTable lvt1 = new LegalValueTable("lvt1", "dt1", null);
	LegalValueTable lvt2 = new LegalValueTable("lvt2", "dt2", null);
	LegalValueTable lvt3 = new LegalValueTable("lvt3", "dt3", null);
	LegalValueTable lvt4 = new LegalValueTable("lvt4", "dt4", null);
	LegalValueTable lvt5 = new LegalValueTable("lvt5", "dt5", null);
	LegalValueTable lvt6 = new LegalValueTable("lvt6", "dt6", null);

	// TODO: revisar si se agrega o no a Question la clase ScreenTemplate
	ScreenTemplate scrTemplate1 = new ScreenTemplate("stg1", "template name 1", "datatype1", "ref1", true);
	ScreenTemplate scrTemplate2 = new ScreenTemplate("stg2", "template name 2", "datatype2", "ref1", true);
	ScreenTemplate scrTemplate3 = new ScreenTemplate("stg3", "template name 3", "datatype3", "ref1", true);
	ScreenTemplate scrTemplate5 = new ScreenTemplate("stg5", "template name 5", "datatype5", "ref1", true);
	ScreenTemplate scrTemplate4 = new ScreenTemplate("stg4", "template name 4", "datatype4", "ref1", true);
	ScreenTemplate scrTemplate6 = new ScreenTemplate("stg6", "template name 6", "datatype6", "ref1", true);

	// / Question
	/*
	 * public Question(String sQuestionGuid, String sLegalValueTableGuid,
	 * String sVariableName, String sScreenTemplateGuid, String sArguments,
	 * Boolean bRequired, String sAbsMin, String sAbsMax, String
	 * sPromptUnder, String sPromptOver, String
	 * sCustomValidationExpressionGuid, String sOnChange, String sUnique)
	 */
	Question q1 = new Question("guidq1", "lvt1", "q1", "stg1", "arg1", true, "absmin1", "absmax1", "pu1", "po1", "custom1", "change1", "qu1");

	Question q2 = new Question("guidq2", "lvt2", "q2", "stg2", "arg2", true, "absmin2", "absmax2", "pu2", "po2", "custom2", "change2", "qu2");

	Question q3 = new Question("guidq3", "lvt3", "q2", "stg3", "arg3", true, "absmin3", "absmax3", "pu3", "po3", "custom3", "change3", "qu3");

	Question q4 = new Question("guidq4", "lvt4", "q2", "stg4", "arg4", true, "absmin4", "absmax4", "pu4", "po4", "custom4", "change4", "qu4");

	Question q5 = new Question("guidq5", "lvt5", "q2", "stg5", "arg5", true, "absmin5", "absmax5", "pu5", "po5", "custom5", "change5", "qu5");

	Question q6 = new Question("guidq6", "lvt6", "q2", "stg6", "arg6", true, "absmin6", "absmax6", "pu6", "po6", "custom6", "change6", "qu6");

	// Questions list
	ArrayList<Question> alQuestions = new ArrayList<Question>();

	alQuestions.add(q1);
	alQuestions.add(q2);
	alQuestions.add(q3);
	alQuestions.add(q4);
	alQuestions.add(q5);
	alQuestions.add(q6);

	// Questionnaire
	Questionnaire qQuestInfo;
	qQuestInfo = new Questionnaire("guidqu", "short name q", "new", false, false, "mult inst abs min", "mult inst abs max", "prompt under", "promptover",
		"a1", "confirm vars", true, "unique string", alQuestions);

	/*
	 * Questionnaire qQuestionnaire = new Questionnaire("guidQuestionnaire",
	 * "qshortname", "new", true, false, "multinstance", "absmax",
	 * "promptunder", "promptover", "search", "confirm", true, "unique");
	 */

	// ArrayList <Questionnaire>
	ArrayList<Questionnaire> alQuestionnaire = new ArrayList<Questionnaire>();
	alQuestionnaire.add(qQuestInfo);
	// alQuestionnaire.add(qQuestionnaire);

	// / Study
	Study sStudy = new Study("guidst", "study short name", "1.0", "1.0", date, date, "currentid", false, true, "schema", "logschema", "lvsschema",
		"analysisschema", "searchvars", "confirmvar", alQuestionnaire, null, "report id");

	/**
	 * private String sNodeguid; private String sParentGuid; private TypeNode tnTypeNode; private String sOrdinal; private Boolean bVisible; private String sNumber; private Boolean bHideNext; private Boolean bHideBack; private Boolean bConfirmNext; private Boolean bConfirmBack; private String sOnLoad; private String sOnUnload; private String sComment;
	 */

	Node n = new Node("guidst", null, "ST", "0", true, "num", true, true, true, true, "onload", "unload", "comment");

	this.alStudies.add(n);
	this.alStudies.add(new Node("guidst1", null, "ST", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));

	/**
	 * Get studies and return here
	 */

    }

    /**
     * Return all studies for this QM
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Jul, 29 2013</date>
     * @return ArrayList<Node>, List of Studies
     */
    public ArrayList<Node> GetListOfStudies() {

	for (Iterator<Node> iNode = alStudies.iterator(); iNode.hasNext();) {
	    Node nNodeInfo = (Node) iNode.next();

	    nNodeInfo.PrintNodeInformation();
	    System.out.println("\n");

	}

	// TODO: Return all studies of Data Access
	return this.alStudies;
    }

    /**
     * Return all elements with parent guid equals to insert guide
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 01, 2013</date>
     * @param sInfoNode, Guid to search
     * @return ArrayList Node type with information of elements of this type
     */
    public ArrayList<Node> GetElementsOfStudyByGuid(Node nStudy) {

	if (nStudy != null) {

	    String sGuidStudy = nStudy.getsNodeguid().toString();

	    // TODO: verify, is string ?
	    // PUSH element to Stack
	    stScreens.push(sGuidStudy);

	    /******** INFO NODES BEGIN ******/
	    ArrayList<Node> alNode2 = new ArrayList<Node>();
	    alNode2.add(new Node("guidqu", "guidst", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq1", "guidsta", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq2", "guidqu", "QG", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq3", "guidqu", "QG", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq4", "guidst", "QG", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq5", "guidst", "QG", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));

	    ArrayList<Node> alInfoData = new ArrayList<Node>();	// Elements with sguid equals to inserted
	    ArrayList<Node> nQuestionnaire = new ArrayList<Node>(); // Element questionnaire

	    // Get the elements with the guid parent equals to guidstudy inserted
	    for (Iterator<Node> iNode = alNode2.iterator(); iNode.hasNext();) {
		Node nNodeInfo = (Node) iNode.next();

		if (nNodeInfo.getsParentGuid().equalsIgnoreCase(sGuidStudy)) alInfoData.add(nNodeInfo);

	    }

	    /******** END INFO NODES *********/

	    // Get length of this array list

	    // Verify data return DA
	    if (alInfoData == null || alInfoData.isEmpty()) {

		System.out.println("is null");

		return alInfoData;

	    } else {

		// Get size
		int iPositionArray = 0;
		iPositionArray = alInfoData.size();

		if (iPositionArray == 1) {

		    // TODO: Verify type (Q || QG), when is a one element of questionnaire type
		    //nQuestionnaire = this.GetFirstChild(alInfoData.get(iPositionArray - 1));

		    // Get the first data

		    System.out.println(alInfoData.get(iPositionArray - 1).getsNodeguid());

		    System.out.println("tiene solo un dato");
		    // Get elements of this Study

		} else {

		    System.out.println("cuantos elementos tiene ? " + iPositionArray);
		    // Get all elements of this study
		    // TODO: Get element type node (DA)

		    // TODO: Send all elements to Expresions to Evaluate

		}
	    }

	    // Return with all elements equals to guid of study
	    return alInfoData;

	}
	return null;
    }

    
    
    public Node VerifyElement(Node nElementToVerify){
	
	
	
	if (nElementToVerify == null)
	    return null;
	else {
	
	    Node nNodeVerified = new Node();
	    
	    
	    switch (nElementToVerify.gettnTypeNode().ToString()){
		
		case TypeNode.QG:
		    break;
		    
	    }
	    
	    
	    return nNodeVerified;
	}
    }
    
    
    /**
     * Return the first element of this Questionnaire
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 5, 2013</date>
     * @param sElementSearch, GUID to search
     * @return Node with information for first element
     */
    public Node GetFirstChildQuestionnaire(Node nQuestionnaire) {

	String sElementSearch = nQuestionnaire.getsNodeguid();

	System.out.println("elemento a buscar " + sElementSearch);
	Node nFirstElement = new Node();

	ArrayList<Node> alQuestions = new ArrayList<Node>();

	alQuestions.add(new Node("guidq1", "guidqu1", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu1", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu1", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu1", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu1", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu2", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu2", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu2", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu2", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu2", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu3", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu3", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu3", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu3", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu3", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu", "CH", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu", "IN", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));

	// Get elements
	for (Node node : alQuestions) {

	    if (node.getsParentGuid() != null) {
		if (node.getsParentGuid().equals(sElementSearch) && (node.getsOrdinal().equalsIgnoreCase("0"))) {

		    nFirstElement = node;

		}
	    } else return null;
	}

	// Return value of node
	return (nFirstElement.getsNodeguid().isEmpty()) ? null : nFirstElement;
    }

    /**
     * Return all elements for this Element (Questionnaire)
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 1, 2013</date>
     * @param sElementSearch, guid to search
     * @return ArrayList with information for this guid
     */
    public Node GetNextChildQuestionnaire(Node nSearchNext) {

	// Get guid of this node
	String sElementSearch = nSearchNext.getsParentGuid();
	
	System.out.println("node guid " + sElementSearch);
	
	ArrayList<Node> alQuestions = new ArrayList<Node>();
	Node nNextElement = new Node();

	alQuestions.add(new Node("guidq1", "guidqu1", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu1", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu1", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu1", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu1", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu2", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu2", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu2", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu2", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu2", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu3", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu3", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu3", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu3", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu3", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq1", "guidqu", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq2", "guidqu", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq3", "guidqu", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq4", "guidqu", "CH", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	alQuestions.add(new Node("guidq5", "guidqu", "IN", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));

	
	Integer iNextElement = Integer.parseInt(nSearchNext.getsOrdinal().toString());
	iNextElement++;
	
	for (Node node : alQuestions) {

	    if (node.getsParentGuid() != null) {
		if (node.getsParentGuid().equals(sElementSearch) && (node.getsOrdinal().equalsIgnoreCase(iNextElement.toString()))) {

		    nNextElement = node;

		}
	    } else return null;
	}

	// Return value of node
	return (nNextElement.getsNodeguid().isEmpty()) ? null : nNextElement;

    }

    /**
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 1, 2013</date>
     * @param pNodeToVerify
     */
    public void ValueVerifyType(Node pNodeToVerify) {

	if (pNodeToVerify.gettnTypeNode().equals(TypeNode.QU)) {
	    // insert elements to class study
	    Questionnaire qQuestionnaire = new Questionnaire();
	    // TODO: Get info for Questionnaire

	}

	if (pNodeToVerify.gettnTypeNode().equals(TypeNode.ST)) {
	    // Get elements of Study

	    Date date = new Date();
	    ArrayList<Questionnaire> alQuData = null;
	    ArrayList<Report> alReports = null;

	    Study sStudy = new Study("guidst", "study shortname", "1.0", "1.0", date, date, "currentid", false, true, "schema", "logschema", "lvsschema",
		    "analysisschema", "searchvars", "confirmvar", alQuData, alReports, "report site god");

	}

	if (pNodeToVerify.gettnTypeNode().equals(TypeNode.QG)) {
	    // Insert element Questionnaire Group
	}

	if (pNodeToVerify.gettnTypeNode().equals(TypeNode.EX)) {
	    // Insert element Study
	}

	if (pNodeToVerify.gettnTypeNode().equals(TypeNode.IN)) {
	    // Insert element Questionnaire Group
	}

    }

}
