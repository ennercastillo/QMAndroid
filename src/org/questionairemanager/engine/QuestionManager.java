
package org.questionnairemanager.engine.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

public class QuestionManager {

    private ArrayList<Node> alStudies;
    private Stack<String> stScreens;

    // additional data
    private ArrayList<Dictionary> alDictionary;
    private ArrayList<ScreenTemplate> alScreenTemplate;
    private ArrayList<LegalValueItem> alLegalValueItem;
    private ArrayList<LegalValueTable> alLegalValueTable;
    private ArrayList<Info> alInfos;
    private ArrayList<Checkpoint> alCheckpoints;
    private ArrayList<Question> alQuestions;

    /**
     * Constructor class QuestionManager
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 16, 2013</date>
     */
    public QuestionManager() {

	alStudies = new ArrayList<Node>();
	stScreens = new Stack<String>();

	// add data additional
	this.alDictionary = new ArrayList<Dictionary>();
	this.alScreenTemplate = new ArrayList<ScreenTemplate>();
	this.alLegalValueItem = new ArrayList<LegalValueItem>();
	this.alLegalValueTable = new ArrayList<LegalValueTable>();

	this.alInfos = new ArrayList<Info>();
	this.alCheckpoints = new ArrayList<Checkpoint>();
	this.alQuestions = new ArrayList<Question>();
    }

    /**
     * Create languages for this project
     * 
     * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email> <date>Aug 9, 2013</date>
     */
    public void SetDataLanguages() {

	HashMap<String, String> hmLanguages = null;

	hmLanguages.put("lsp", "spanish");
	hmLanguages.put("len", "english");
    }

    public void SetDataDictionary() {

	alDictionary.add(new Dictionary("loginguid", "lsp", "Main Text", "Login"));
	alDictionary.add(new Dictionary("loginguid", " ", "Main Text", "Login"));
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
	    answers
	     TEXTBOX, TEXTAREA, DROPDOWN, RADIOBUTTON, INTEGER, DECIMAL, DATETIME, DATE, TIME, CHECKBOX, GRID, NAME, GPSREADING, INFO, SECTIONEXITSCREEN;
	*/
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.INTEGER.getGuid(), ScreenTemplateTypes.INTEGER, "int", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TEXTBOX.getGuid(), ScreenTemplateTypes.TEXTBOX, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TEXTAREA.getGuid(), ScreenTemplateTypes.TEXTAREA, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DROPDOWN.getGuid(), ScreenTemplateTypes.DROPDOWN, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.RADIOBUTTON.getGuid(), ScreenTemplateTypes.RADIOBUTTON, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DECIMAL.getGuid(), ScreenTemplateTypes.DECIMAL, "float", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DATETIME.getGuid(), ScreenTemplateTypes.DATETIME, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.DATE.getGuid(), ScreenTemplateTypes.DATE, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.TIME.getGuid(), ScreenTemplateTypes.TIME, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.CHECKBOX.getGuid(), ScreenTemplateTypes.CHECKBOX, "text", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.GRID.getGuid(), ScreenTemplateTypes.GRID, "stringnull", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.GPSREADING.getGuid(), ScreenTemplateTypes.GPSREADING, "float", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.INFO.getGuid(), ScreenTemplateTypes.INFO, "stringnull", null, true));
	this.alScreenTemplate.add(new ScreenTemplate(ScreenTemplateTypes.SECTIONEXITSCREEN.getGuid(), ScreenTemplateTypes.SECTIONEXITSCREEN, "stringnull",
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

	// TODO: Create elements type node HERE

	Node nodeq1 = new Node("guidq1", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");
	Node nodeq2 = new Node("guidq2", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");
	Node nodeq3 = new Node("guidq3", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");
	Node nodeq4 = new Node("guidq4", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");
	Node nodeq5 = new Node("guidq5", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");
	Node nodeq6 = new Node("guidq6", "guidq", TypeNode.Q, "0", true, "1", false, false, false, false, "onload", "un load", "comment 1");

	Question q1 = new Question(nodeq1, "guidq1", "lvt1", "q1", "stg1", "arg1", true, "absmin1", "absmax1", "pu1", "po1", "custom1", "change1", "qu1");
	Question q2 = new Question(nodeq2, "guidq2", "lvt2", "q2", "stg2", "arg2", true, "absmin2", "absmax2", "pu2", "po2", "custom2", "change2", "qu2");
	Question q3 = new Question(nodeq3, "guidq3", "lvt3", "q2", "stg3", "arg3", true, "absmin3", "absmax3", "pu3", "po3", "custom3", "change3", "qu3");
	Question q4 = new Question(nodeq4, "guidq4", "lvt4", "q2", "stg4", "arg4", true, "absmin4", "absmax4", "pu4", "po4", "custom4", "change4", "qu4");
	Question q5 = new Question(nodeq5, "guidq5", "lvt5", "q2", "stg5", "arg5", true, "absmin5", "absmax5", "pu5", "po5", "custom5", "change5", "qu5");
	Question q6 = new Question(nodeq6, "guidq6", "lvt6", "q2", "stg6", "arg6", true, "absmin6", "absmax6", "pu6", "po6", "custom6", "change6", "qu6");

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

	Node node1 = new Node("guidst", null, TypeNode.ST, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	Node node2 = new Node("guidst1", null, TypeNode.ST, "1", true, "num", true, true, true, true, "onload", "unload", "comment");

	node1.setElementMainText("lguidesp1", "Estudio 1");
	node1.setElementMainText("lguideng1", "Study 1");

	node1.getElementMainText("lguidesp1");

	node2.setElementMainText("lguidesp2", "Estudio 2");
	node2.setElementMainText("lguideng2", "Study 2");

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
    public ArrayList<Node> GetListOfStudies() {

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

	    Node n1 = new Node("guidqu", "guidst", TypeNode.QU, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n2 = new Node("guidq1", "guidsta", TypeNode.QU, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n3 = new Node("guidq2", "guidqu", TypeNode.QG, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n4 = new Node("guidq3", "guidqu", TypeNode.QG, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n5 = new Node("guidq4", "guidst", TypeNode.QG, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n6 = new Node("guidq5", "guidst", TypeNode.QG, "4", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n7 = new Node("guidq6", "guidq5", TypeNode.QU, "0", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n8 = new Node("guidq7", "guidq5", TypeNode.QU, "1", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n9 = new Node("guidq8", "guidq5", TypeNode.QG, "2", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n10 = new Node("guidq9", "guidq5", TypeNode.QG, "3", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n11 = new Node("guidq10", "guidst1", TypeNode.QG, "4", true, "num", true, true, true, true, "onload", "unload", "comment");
	    Node n12 = new Node("guidq11", "guidst1", TypeNode.QG, "5", true, "num", true, true, true, true, "onload", "unload", "comment");

	    n1.setElementMainText("lguidesp1", "Cuestionario 1");
	    n1.setElementMainText("lguideng1", "Questionnaire 1");

	    n2.setElementMainText("lguidesp1", "Cuestionario 2");
	    n2.setElementMainText("lguideng1", "Questionnaire 2");
	    n3.setElementMainText("lguidesp1", "Cuestionario grupo 1");
	    n3.setElementMainText("lguideng1", "Questionnaire group 1");
	    n4.setElementMainText("lguidesp1", "Cuestionario grupo 2");
	    n4.setElementMainText("lguideng1", "Questionnaire group 2");
	    n5.setElementMainText("lguidesp1", "Cuestionario grupo 3");
	    n5.setElementMainText("lguideng1", "Questionnaire group 3");
	    n6.setElementMainText("lguidesp1", "Cuestionario grupo 4");
	    n6.setElementMainText("lguideng1", "Questionnaire group 4");
	    n7.setElementMainText("lguidesp1", "Cuestionario 3");
	    n7.setElementMainText("lguideng1", "Questionnaire 3");
	    n8.setElementMainText("lguidesp1", "Cuestionario 4");
	    n8.setElementMainText("lguideng1", "Questionnaire 4");
	    n9.setElementMainText("lguidesp1", "Cuestionario grupo 5");
	    n9.setElementMainText("lguideng1", "Questionnaire group 5");
	    n10.setElementMainText("lguidesp1", "Cuestionario grupo 6");
	    n10.setElementMainText("lguideng1", "Questionnaire group 6");
	    n11.setElementMainText("lguidesp1", "Cuestionario grupo 7");
	    n11.setElementMainText("lguideng1", "Questionnaire group 7");
	    n12.setElementMainText("lguidesp1", "Cuestionario grupo 8");
	    n12.setElementMainText("lguideng1", "Questionnaire group 8");

	    /******** INFO NODES BEGIN ******/
	    ArrayList<Node> alNode2 = new ArrayList<Node>();
	    alNode2.add(n1);
	    alNode2.add(n2);
	    alNode2.add(n3);
	    alNode2.add(n4);
	    alNode2.add(n5);
	    alNode2.add(n6);
	    alNode2.add(n7);
	    alNode2.add(n8);
	    alNode2.add(n9);
	    alNode2.add(n10);
	    alNode2.add(n11);
	    alNode2.add(n12);

	    ArrayList<Node> alAllData = new ArrayList<Node>();

	    /***
	     * ELEMENTS QUESTIONNAIRE WITH DATA
	     */
	    // Questionnaire
	    // ArrayList<Questionnaire> alQuestionnaires = new ArrayList<Questionnaire>();

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

	    // Array type Object with Questionnaires
	    alAllData.add(qQuest1);
	    alAllData.add(qQuest2);
	    alAllData.add(qQuest3);
	    alAllData.add(qQuest4);

	    QuestionnaireGroup qg1 = new QuestionnaireGroup(alNode2.get(2), "guidq2", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);

	    QuestionnaireGroup qg2 = new QuestionnaireGroup(alNode2.get(3), "guidq3", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);
	    QuestionnaireGroup qg3 = new QuestionnaireGroup(alNode2.get(4), "guidq4", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);
	    QuestionnaireGroup qg4 = new QuestionnaireGroup(alNode2.get(5), "guidq5", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);
	    QuestionnaireGroup qg5 = new QuestionnaireGroup(alNode2.get(8), "guidq8", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);

	    QuestionnaireGroup qg6 = new QuestionnaireGroup(alNode2.get(9), "guidq9", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);
	    QuestionnaireGroup qg7 = new QuestionnaireGroup(alNode2.get(10), "guidq10", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);
	    QuestionnaireGroup qg8 = new QuestionnaireGroup(alNode2.get(11), "guidq11", true, true, "is complete", true, "3", "98", "19", "34", "SEARCH",
		    "confirm ", true);

	    alAllData.add(qg1);
	    alAllData.add(qg2);
	    alAllData.add(qg3);
	    alAllData.add(qg4);
	    alAllData.add(qg5);
	    alAllData.add(qg6);
	    alAllData.add(qg7);
	    alAllData.add(qg8);

	    // TODO: Change data in this code!!!
	    ArrayList<Node> alInfoReturn = new ArrayList<Node>();	// Elements with sguid equals to inserted
	    // ArrayList<Node> nQuestionnaire = new ArrayList<Node>(); // Element questionnaire

	    // Get the elements with the guid parent equals to guidstudy inserted
	    for (Iterator<Node> iNode = alAllData.iterator(); iNode.hasNext();) {
		Node nNodeInfo = iNode.next();

		if (nNodeInfo.getsParentGuid().equalsIgnoreCase(sGuidStudy)) alInfoReturn.add(nNodeInfo);

	    }

	    /******** END INFO NODES *********/

	    // Get length of this array list

	    // Verify data return DA
	    if (alInfoReturn == null || alInfoReturn.isEmpty()) {

		System.out.println("is null");

		return alInfoReturn;	// IS EMPTY

	    } else {

		// Get size
		int iPositionArray = 0;
		iPositionArray = alInfoReturn.size();

		if (iPositionArray == 1) {

		    // TODO: Verify type (Q || QG), when is a one element of questionnaire type
		    // nQuestionnaire = this.GetFirstChild(alInfoData.get(iPositionArray - 1));

		    // Get the first data

		    System.out.println(((Node) alInfoReturn.get(iPositionArray - 1)).getsNodeguid());

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
	    return alInfoReturn;

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
    public ArrayList<Node> GetElementsOfQuestionnaireOrQuestionnaireGroup(Node nElementToSearch) {

	ArrayList<Node> alNodes = new ArrayList<Node>();

	if (nElementToSearch == null) return null;
	else {

	    /**
	     * Type equals to Questionnaire, Get the first son
	     */

	    switch (nElementToSearch.getTnTypeNode()) {
		case QU:
		    System.out.println(" is a questionnaire !");
		    alNodes.add(this.GetFirstChildQuestionnaire(nElementToSearch));
		    break;
		case QG:
		    System.out.println("is a questionnairegroup!");
		    alNodes = GetElementsOfStudyByGuid(nElementToSearch);
		    break;
		default:
		    System.out.println("ERROR EN EL TIPO !!!!");
		    break;
	    }

	}

	return alNodes;
    }

    public void SetElementsQuestion() {

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
	Question q19 = new Question(node19, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");
	Question q20 = new Question(node20, "guidqu", "guidlvt1", "q1", "guidscrt1", "args1", true, "20", "80", "30", "70", "guidvalexp1", "onchange", "uniq1");

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
	this.alQuestions.add(q19);
	this.alQuestions.add(q20);
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

	// Get elements
	for (Node node : this.alQuestions) {

	    System.out.println("entro al for ");

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

	// ArrayList<Node> alQuestions = new ArrayList<Node>();
	Node nNextElement = new Node();

	Integer iNextElement = Integer.parseInt(nSearchNext.getsOrdinal().toString());
	iNextElement++;

	for (Node node : this.alQuestions) {

	    if (node.getsParentGuid() != null) {
		if (node.getsParentGuid().equals(sElementSearch) && (node.getsOrdinal().equalsIgnoreCase(iNextElement.toString()))) {

		    nNextElement = node;

		}
	    } else return null;
	}

	// Return value of node
	return (nNextElement.getsNodeguid().isEmpty()) ? null : nNextElement;

    }

    public void setCheckpoint() {

	Node n1 = new Node("guidch1", "guidqu", TypeNode.CH, "0", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n2 = new Node("guidch2", "guidqu", TypeNode.CH, "1", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n3 = new Node("guidch3", "guidqu", TypeNode.CH, "2", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n4 = new Node("guidch4", "guidqu", TypeNode.CH, "3", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n5 = new Node("guidch5", "guidqu", TypeNode.CH, "4", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");

	Checkpoint ch1 = new Checkpoint(n1, "guidch1", "if a > b", "hola", "onbranch");
	Checkpoint ch2 = new Checkpoint(n2, "guidch2", "if b < c", "hola", "onbranch");
	Checkpoint ch3 = new Checkpoint(n3, "guidch3", "a < c", "hola", "onbranch");
	Checkpoint ch4 = new Checkpoint(n4, "guidch4", "j = 10", "hola", "onbranch");
	Checkpoint ch5 = new Checkpoint(n5, "guidch5", "a = 1", "hoal", "onbranch");

	this.alCheckpoints.add(ch1);
	this.alCheckpoints.add(ch2);
	this.alCheckpoints.add(ch3);
	this.alCheckpoints.add(ch4);
	this.alCheckpoints.add(ch5);
    }

    public void setInfo() {

	Node n1 = new Node("guidch1", "guidqu", TypeNode.CH, "0", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n2 = new Node("guidch2", "guidqu", TypeNode.CH, "1", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n3 = new Node("guidch3", "guidqu", TypeNode.CH, "2", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n4 = new Node("guidch4", "guidqu", TypeNode.CH, "3", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");
	Node n5 = new Node("guidch5", "guidqu", TypeNode.CH, "4", true, "0", true, true, true, true, "onload 1", "onload1", "comment1");

	n1.setElementMainText("lguidesp1", "Informacion 1");
	n1.setElementMainText("lguidesp1", "Information 1");
	n2.setElementMainText("lguidesp1", "Informacion 2");
	n2.setElementMainText("lguidesp1", "Information 2");
	n3.setElementMainText("lguidesp1", "Informacion 3");
	n3.setElementMainText("lguidesp1", "Information 3");
	n4.setElementMainText("lguidesp1", "Informacion 4");
	n4.setElementMainText("lguidesp1", "Information 4");
	n5.setElementMainText("lguidesp1", "Informacion 5");
	n5.setElementMainText("lguidesp1", "Information 5");

	Info i1 = new Info(n1, "guidi1", "info1");
	Info i2 = new Info(n2, "guidi2", "info2");
	Info i3 = new Info(n3, "guidi3", "info3");
	Info i4 = new Info(n4, "guidi4", "info4");
	Info i5 = new Info(n5, "guidi5", "info5");

	this.alInfos.add(i1);
	this.alInfos.add(i2);
	this.alInfos.add(i3);
	this.alInfos.add(i4);
	this.alInfos.add(i5);

    }

    public ArrayList<Node> getCheckpoint(String sGuid) {

	ArrayList<Node> alCheckpointReturn = new ArrayList<Node>();

	for (Node node : this.alCheckpoints) {
	    if (node.getsNodeguid().equalsIgnoreCase(sGuid)) alCheckpointReturn.add(node);
	}

	return alCheckpointReturn;

    }

    public ArrayList<Node> getInfo(String sGuid) {

	ArrayList<Node> alInfoReturn = new ArrayList<Node>();

	for (Node node : this.alInfos) {
	    if (node.getsNodeguid().equalsIgnoreCase(sGuid)) alInfoReturn.add(node);
	}

	return alInfoReturn;
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
