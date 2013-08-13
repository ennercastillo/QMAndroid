
package org.questionairemanager.engine;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class QuestionManager {

    private ArrayList<Study> alStudies;
    private Stack<String> stScreens;

    // additional data
    private ArrayList<Dictionary> alDictionary;
    private ArrayList<ScreenTemplate> alScreenTemplate;
    private ArrayList<LegalValueItem> alLegalValueItem;
    private ArrayList<LegalValueTable> alLegalValueTable;

    public QuestionManager() {

	alStudies = new ArrayList<>();
	stScreens = new Stack<>();

	// add data additional
	this.alDictionary = new ArrayList<>();
	this.alScreenTemplate = new ArrayList<>();
	this.alLegalValueItem = new ArrayList<>();
	this.alLegalValueTable = new ArrayList<>();
    }

    /**
     * Create languages for this project
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 9, 2013</date>
     */
    public void SetDataLanguages() {

	ArrayList<Language> alLanguages = new ArrayList<Language>();

	alLanguages.add(new Language("lsp", "Spanish"));
	alLanguages.add(new Language("len", "English"));
    }

    public void SetDataDictionary() {

	alDictionary.add(new Dictionary("loginguid", "lsp", "Main Text", "Login"));
	alDictionary.add(new Dictionary("loginguid", "len", "Main Text", "Login"));
	alDictionary.add(new Dictionary("studyguid", "lsp", "Main Text", "Estudio"));
	alDictionary.add(new Dictionary("studyguid", "len", "Main Text", "Study"));
	alDictionary.add(new Dictionary("qgguid1", "lsp", "Main Text", "Grupo de Cuestionario 1"));
	alDictionary.add(new Dictionary("qgguid1", "len", "Main Text", "Questionnaire Group 1"));
	alDictionary.add(new Dictionary("qgguid2", "lsp", "Main Text", "Grupo de Cuestionario 2"));
	alDictionary.add(new Dictionary("qgguid2", "len", "Main Text", "Questionnaire Group 2"));
	alDictionary.add(new Dictionary("qgguid3", "lsp", "Main Text", "Grupo de Cuestionario 3"));
	alDictionary.add(new Dictionary("qgguid4", "len", "Main Text", "Questionnaire Group 3"));
	alDictionary.add(new Dictionary("quguid1", "lsp", "Main Text", "Cuestionario 1"));
	alDictionary.add(new Dictionary("quguid1", "len", "Main Text", "Questionnaire 1"));
	alDictionary.add(new Dictionary("quguid2", "lsp", "Main Text", "Cuestionario 2"));
	alDictionary.add(new Dictionary("quguid2", "len", "Main Text", "Questionnaire 2"));
	alDictionary.add(new Dictionary("quguid3", "lsp", "Main Text", "Cuestionario 3"));
	alDictionary.add(new Dictionary("quguid3", "len", "Main Text", "Questionnaire 3"));
	alDictionary.add(new Dictionary("qguid1", "lsp", "Main Text", "Texto pregunta 1"));
	alDictionary.add(new Dictionary("qguid1", "len", "Main Text", "Text question 1"));
	alDictionary.add(new Dictionary("qguid2", "lsp", "Main Text", "Texto pregunta 2"));
	alDictionary.add(new Dictionary("qguid2", "len", "Main Text", "Text question 2"));
	alDictionary.add(new Dictionary("qguid3", "lsp", "Main Text", "Texto pregunta 3"));
	alDictionary.add(new Dictionary("qguid3", "len", "Main Text", "Text question 3"));
	alDictionary.add(new Dictionary("qguid4", "lsp", "Main Text", "Texto pregunta 4"));
	alDictionary.add(new Dictionary("qguid4", "len", "Main Text", "Text question 4"));
	alDictionary.add(new Dictionary("qguid5", "lsp", "Main Text", "Texto pregunta 5"));
	alDictionary.add(new Dictionary("qguid5", "len", "Main Text", "Text question 5"));
	alDictionary.add(new Dictionary("qguid6", "lsp", "Main Text", "Texto pregunta 6"));
	alDictionary.add(new Dictionary("qguid6", "len", "Main Text", "Text question 6"));

	alDictionary.add(new Dictionary("iguid1", "lsp", "Main Text", "Pantalla de info 1"));
	alDictionary.add(new Dictionary("iguid1", "len", "Main Text", "Info Screen 1"));
	alDictionary.add(new Dictionary("iguid2", "lsp", "Main Text", "Pantalla de info 2"));
	alDictionary.add(new Dictionary("iguid2", "len", "Main Text", "Info Screen 2"));
	alDictionary.add(new Dictionary("iguid3", "lsp", "Main Text", "Pantalla de info 3"));
	alDictionary.add(new Dictionary("iguid3", "len", "Main Text", "Info Screen 3"));
	alDictionary.add(new Dictionary("iguid4", "lsp", "Main Text", "Pantalla de info 4"));
	alDictionary.add(new Dictionary("iguid4", "len", "Main Text", "Info Screen 4"));
	alDictionary.add(new Dictionary("iguid5", "lsp", "Main Text", "Pantalla de info 5"));
	alDictionary.add(new Dictionary("iguid5", "len", "Main Text", "Info Screen 5"));

	// TODO: Checkpoint
	// alDictionary.add(new Dictionary("checkpont", "lsp", "Main Text", "Texto pregunta 1"));
	// alDictionary.add(new Dictionary("qguid1", "len", "Main Text", "Text question 1"));
	// alDictionary.add(new Dictionary("qguid1", "lsp", "Main Text", "Texto pregunta 1"));
	// alDictionary.add(new Dictionary("qguid1", "len", "Main Text", "Text question 1"));
	// alDictionary.add(new Dictionary("qguid1", "lsp", "Main Text", "Texto pregunta 1"));
	// alDictionary.add(new Dictionary("qguid1", "len", "Main Text", "Text question 1"));

    }

    /**
     * Load the all elements for this screen template
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     */
    public void setScreenTemplates() {

	/*
	    
	     TEXTBOX, TEXTAREA, DROPDOWN, RADIOBUTTON, INTEGER, DECIMAL, DATETIME, DATE, TIME, CHECKBOX, GRID, NAME, GPSREADING, INFO, SECTIONEXITSCREEN;
	*/
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.INTEGER.getGuid(), ScreenTemplateTypes.INTEGER.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TEXTBOX.getGuid(), ScreenTemplateTypes.TEXTBOX.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TEXTAREA.getGuid(), ScreenTemplateTypes.TEXTAREA.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DROPDOWN.getGuid(), ScreenTemplateTypes.DROPDOWN.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.RADIOBUTTON.getGuid(), ScreenTemplateTypes.RADIOBUTTON.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DECIMAL.getGuid(), ScreenTemplateTypes.DECIMAL.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DATETIME.getGuid(), ScreenTemplateTypes.DATETIME.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DATE.getGuid(), ScreenTemplateTypes.DATE.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TIME.getGuid(), ScreenTemplateTypes.TIME.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.CHECKBOX.getGuid(), ScreenTemplateTypes.CHECKBOX.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.GRID.getGuid(), ScreenTemplateTypes.GRID.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.NAME.getGuid(), ScreenTemplateTypes.NAME.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.GPSREADING.getGuid(), ScreenTemplateTypes.GPSREADING.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.INFO.getGuid(), ScreenTemplateTypes.INFO.toString(), "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.SECTIONEXITSCREEN.getGuid(), ScreenTemplateTypes.SECTIONEXITSCREEN.toString(), "int",
		null, true));

    }

    /**
     * Return all the elements of screen template
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @return ArrayList all screen templates
     */
    public ArrayList<ScreenTemplate> getScreenTemplates() {

	return this.alScreenTemplate;
    }

    /**
     * Search guid in all elements of type screen template
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @param sGuidToSearch, guid to search
     * @return ScreenTemplate with the info for this guid
     */
    public ScreenTemplate searchScreenTemplate(String sGuidToSearch) {

	for (ScreenTemplate scrTemplate : alScreenTemplate) {
	    if (scrTemplate.getsScreenTemplateGuid().equals(sGuidToSearch)) return scrTemplate;
	}

	return null;

    }

    public void setLegalValueItem() {

	/**
	 * private String sLegalValueItemGuid; private String sLegalValueTableGuid; private String sValue; private String sOrdinal; private String sShortName; private String sTag; private Boolean bHidden; private String sReportLabel;
	 */

	// male or female
	this.alLegalValueItem.add(new LegalValueItem("guidvi1", "guidt1", "0", "0", "m", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi2", "guidt1", "0", "0", "f", null, false, null));

	// weekday
	this.alLegalValueItem.add(new LegalValueItem("guidvi3", "guidt2", "0", "0", "lu", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi4", "guidt2", "0", "0", "ma", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi5", "guidt2", "0", "0", "mi", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi6", "guidt2", "0", "0", "ju", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi7", "guidt2", "0", "0", "vi", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi8", "guidt2", "0", "0", "sa", null, false, null));

	// age range
	this.alLegalValueItem.add(new LegalValueItem("guidvi9", "guidt3", "0", "0", "et1", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi10", "guidt3", "0", "0", "et2", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi11", "guidt3", "0", "0", "et3", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi12", "guidt3", "0", "0", "et4", null, false, null));
	this.alLegalValueItem.add(new LegalValueItem("guidvi13", "guidt3", "0", "0", "et5", null, false, null));

    }

    /**
     * Get all elements from legal value items
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @return
     */
    public ArrayList<LegalValueItem> getLegalValueItem() {

	return this.alLegalValueItem;
    }

    /**
     * Search an element legal value item type
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @param sGuidToSearch
     * @return
     */
    public LegalValueItem searchLegalValueItem(String sGuidToSearch) {

	for (LegalValueItem legalValueItem : alLegalValueItem) {
	    if (legalValueItem.getsLegalValueItemGuid().equalsIgnoreCase(sGuidToSearch)) return legalValueItem;
	}

	return null;

    }

    /**
     * Set all data of legal value table
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     */
    public void setLegalValueTable() {

	this.alLegalValueTable.add(new LegalValueTable("guidt1", ScreenTemplateTypes.RADIOBUTTON.toString()));
	this.alLegalValueTable.add(new LegalValueTable("guidt2", ScreenTemplateTypes.RADIOBUTTON.toString()));
	this.alLegalValueTable.add(new LegalValueTable("guidt2", ScreenTemplateTypes.CHECKBOX.toString()));
    }

    /**
     * Return all data of legal value table
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @return
     */
    public ArrayList<LegalValueTable> getLegalValueTable() {

	return this.alLegalValueTable;
    }

    /**
     * Return an element of type legal value table
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>12/08/2013</date>
     * @return
     */
    public LegalValueTable searchLegalValueTable(String sGuidToSearch) {

	for (LegalValueTable legalValue : this.alLegalValueTable) {
	    if (legalValue.getsLegalValueTableGuid().equalsIgnoreCase(sGuidToSearch)) return legalValue;
	}

	return null;

    }

    /**
     * Get list of words of all elements of this project
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 07, 2013</date>
     * @return ArrayList<Dictionary>, all elements of this dictionary
     */
    public ArrayList<Dictionary> getDataDictionary() {

	return this.alDictionary;
    }

    /**
     * Search element in dictionary
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 7, 2013</date>
     * @param sGuidDictionarySearch, Guid dictionary
     * @param sGuidLanguageSearch, guid language
     * @param sPropertyName, property name to search
     */
    public String SearchElementDictionary(String sGuidDictionarySearch, String sGuidLanguageSearch, String sPropertyNameSearch) {

	String sGuidDictionary;
	String sGuidLanguageId;
	String sText;

	for (Dictionary infoDictionary : this.alDictionary) {

	    sGuidDictionary = infoDictionary.getsGuid();
	    sGuidLanguageId = infoDictionary.getsLanguageId();

	    sText = infoDictionary.getDataText(sGuidDictionary, sGuidLanguageId);

	    // Compare with null, is null fail in search.
	    // Is not null, return value
	    if (sText != null) return sText;

	}

	return null;

    }

    /**
     * Get all studies of data access
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 1, 2013</date>
     */
    public void SetListOfStudies() {

	/*** INFO ADICIONAL ***/

	// Define date
	Date date = new Date();

	// TODO: Expression Value
	// ExpressionValueData expVal1 = new ExpressionValueData("expval1", "val1");
	// ExpressionValueData expVal2 = new ExpressionValueData("expval2", "val2");
	// ExpressionValueData expVal3 = new ExpressionValueData("expval3", "val3");
	// ExpressionValueData expVal4 = new ExpressionValueData("expval4", "val4");
	//
	// // TODO: Verificar como usan expression
	// ExpressionData exp1 = new ExpressionData("exp1", "var1", "int", true);
	// ExpressionData exp2 = new ExpressionData("exp2", "var2", "int", true);
	// ExpressionData exp3 = new ExpressionData("exp3", "var3", "int", true);
	// ExpressionData exp4 = new ExpressionData("exp4", "var4", "int", true);
	// ExpressionData exp5 = new ExpressionData("exp5", "var5", "int", true);
	// ExpressionData exp6 = new ExpressionData("exp6", "var6", "int", true);

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

	/*
	 * Questionnaire qQuestionnaire = new Questionnaire("guidQuestionnaire",
	 * "qshortname", "new", true, false, "multinstance", "absmax",
	 * "promptunder", "promptover", "search", "confirm", true, "unique");
	 */

	// ArrayList <Questionnaire>
	// ArrayList<Questionnaire> alQuestionnaire = new ArrayList<Questionnaire>();
	// alQuestionnaire.add(qQuestInfo);
	// alQuestionnaire.add(qQuestionnaire);

	Node node1 = new Node("guidst", null, "ST", "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node2 = new Node("guidst1", null, "ST", "1", true, "num", true, true, true, true, "onload", "unload", "comment");

	// / Study
	Study sStudy1 = new Study(node1, "study short name", "1.0", "1.0", date, date, "currentid", false, true, "schema", "logschema", "lvsschema",
		"analysisschema", "searchvars", "confirmvar", null, "report id");

	Study sStudy2 = new Study(node2, "study 2 sn", "1.0", "1.0", date, date, "currentid", false, true, "schema", "logschema", "lvsschema",
		"analysis schema", "searchvars", "confirm var", null, "reportid2");

	this.alStudies.add(sStudy1);
	this.alStudies.add(sStudy2);

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
    public ArrayList<Study> GetListOfStudies() {

	// for (Iterator<Study> iNode = alStudies.iterator(); iNode.hasNext();) {
	// Node nNodeInfo = (Node) iNode.next();
	//
	// // nNodeInfo.PrintNodeInformation();
	// // System.out.println("\n");
	//
	// }

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

	    // TODO: Add elements of type questionnaire

	    // TODO: verify, is string ?
	    // PUSH element to Stack
	    stScreens.push(sGuidStudy);

	    System.out.println("STACK!!!!!! _________ " + stScreens.size() + " ---- \n " + stScreens);

	    /******** INFO NODES BEGIN ******/
	    ArrayList<Node> alNode2 = new ArrayList<>();
	    alNode2.add(new Node("guidqu", "guidst", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq1", "guidsta", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq2", "guidqu", "QG", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq3", "guidqu", "QG", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq4", "guidst", "QG", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq5", "guidst", "QG", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));

	    alNode2.add(new Node("guidq6", "guidq5", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq7", "guidq5", "QU", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq8", "guidq5", "QG", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq9", "guidq5", "QG", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq10", "guidst1", "QG", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
	    alNode2.add(new Node("guidq11", "guidst1", "QG", "5", true, "num", true, true, true, true, "onload", "unload", "comment"));

	    /***
	     * ELEMENTS QUESTIONNAIRE WITH DATA
	     */
	    // Questionnaire
	    ArrayList<Questionnaire> alQuestionnaires = new ArrayList<>();

	    Questionnaire qQuest1;
	    qQuest1 = new Questionnaire(alNode2.get(0), "guidqu2", "short name q2", "new", false, false, "mult inst abs min", "mult inst abs max",
		    "prompt under", "promptover", "a1", "confirm vars", true, "unique string");

	    Questionnaire qQuest2;
	    qQuest2 = new Questionnaire(alNode2.get(1), "guidqu3", "short name q3", "new", false, false, "mult inst abs min", "mult inst abs max",
		    "prompt under", "promptover", "a1", "confirm vars", true, "unique string");
	    Questionnaire qQuest3;
	    qQuest3 = new Questionnaire(alNode2.get(6), "guidqu4", "short name q4", "new", false, false, "mult inst abs min", "mult inst abs max",
		    "prompt under", "promptover", "a1", "confirm vars", true, "unique string");
	    Questionnaire qQuest4;
	    qQuest4 = new Questionnaire(alNode2.get(7), "guidqu5", "short name q5", "new", false, false, "mult inst abs min", "mult inst abs max",
		    "prompt under", "promptover", "a1", "confirm vars", true, "unique string");

	    alQuestionnaires.add(qQuest1);
	    alQuestionnaires.add(qQuest2);
	    alQuestionnaires.add(qQuest3);
	    alQuestionnaires.add(qQuest4);

	    // TODO: Change data in this code!!!
	    ArrayList<Node> alInfoData = new ArrayList<Node>();	// Elements with sguid equals to inserted
	    // ArrayList<Node> nQuestionnaire = new ArrayList<Node>(); // Element questionnaire

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

		return alInfoData;	// IS EMPTY

	    } else {

		// Get size
		int iPositionArray = 0;
		iPositionArray = alInfoData.size();

		if (iPositionArray == 1) {

		    // TODO: Verify type (Q || QG), when is a one element of questionnaire type
		    // nQuestionnaire = this.GetFirstChild(alInfoData.get(iPositionArray - 1));

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

    /**
     * Verify type of node
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 6, 2013</date>
     * @param nElementToVerify, Node to verify
     * @return Node, if questionnaire is true return first child, else if questionnaire group is true return all your elements
     */
    public ArrayList<Node> GetElementsOfQuestionnaireOrQuestionnaireGroup(Node nElementToVerify) {

	ArrayList<Node> alNodes = new ArrayList<Node>();

	if (nElementToVerify == null) return null;
	else {

	    /**
	     * Type equals to Questionnaire, Get the first son
	     */
	    if (nElementToVerify.gettnTypeNode().equals(TypeNode.QU)) {
		System.out.println(" is a questionnaire !");
		alNodes.add(this.GetFirstChildQuestionnaire(nElementToVerify));

	    } else {
		/**
		 * Type equals to QuestionnaireGroup, get the elements return all elements of questionnaire group
		 */
		if (nElementToVerify.gettnTypeNode().equals(TypeNode.QG)) {
		    System.out.println("is a questionnairegroup!");
		    alNodes = GetElementsOfStudyByGuid(nElementToVerify);
		}
	    }

	}
	return alNodes;
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

	// TODO: Verify type of elemenent
	// Is Question ? info ? or checkpoint?

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
     * Verify type of basic element of questionnaire. (Q = question, IN = info, CH = checkpoint)
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 1, 2013</date>
     * @param nElementRoot, Element node, search title or execute operation
     */
    /* public void GetTextOfElement(Node nElementRoot) {

    Object oData = new Object();
    // Is a screen question
    if (nElementRoot.gettnTypeNode().equals(TypeNode.Q)) {

        oData = SearchElementsOfQuestion(nElementRoot);

    }

    // Is a screen checkpoint
    if (nElementRoot.gettnTypeNode().equals(TypeNode.CH)) {
        oData = SearchElementsOfInfo(nElementRoot);
    }

    // Is a screen info
    if (nElementRoot.gettnTypeNode().equals(TypeNode.IN)) {
        oData = SearchElementsOfCH(nElementRoot);
        // Insert element Questionnaire Group
    }

     }*/

}
