/**
 * 
 */

package org.questionairemanager.data;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Enner Escobedo C.
 */
public class Test {

    /**
     * Ejecuci—n de la funci—n principal
     * 
     * @param args
     */
    public static void main(String[] args) {

        
    	
    	// Node with information
    	ArrayList<Node> nodes = new ArrayList<Node>();
    	
    	//Tipos de Nodos
    	// ST Study, QG QuestionnaireGroup, QU, Questionnaire
    	// GR Group, CH checkpoint, IN Information, Q Question, Ex

    	
    	//Debe verificar que no exista el nodo ingresado
    	/*
    	 * public Node(String sNodeguid, String sParentGuid, String sTypeNode,
                String sOrdinal, Boolean bVisible, String sNumber,
                Boolean bHideNext, Boolean bHideBack, Boolean bConfirmNext,
                Boolean bConfirmBack, String sOnLoad, String sOnUnload,
                String sComment) 
    	*/
    	nodes.add(new Node("guidst", null, "ST", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidqu", "guidst", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidq1", "guidqu", "Q", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidq2", "guidqu", "Q", "1", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidq3", "guidqu", "Q", "2", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidq4", "guidqu", "Q", "3", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("guidq5", "guidqu", "Q", "4", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	
    	// Se debe generar un camino a seguir, 
    	// Listado de pantallas a crear
    	
    	/// A PARTIR DE ACç SE INICIA A TRABAJAR CON LA INFORMACION EN ENGINE
    	
    	
    	
        
        // Define date
        Date date = new Date();
        
        // TODO: Expression Value
        ExpressionValueData expVal1 = new ExpressionValueData ("expval1", "val1");
        ExpressionValueData expVal2 = new ExpressionValueData ("expval2", "val2");
        ExpressionValueData expVal3 = new ExpressionValueData ("expval3", "val3");
        ExpressionValueData expVal4 = new ExpressionValueData ("expval4", "val4");
        
        
        //TODO: Verificar como usan expression
        ExpressionData exp1 = new ExpressionData( "exp1", "var1", "int", true);
        ExpressionData exp2 = new ExpressionData( "exp2", "var2", "int", true);
        ExpressionData exp3 = new ExpressionData( "exp3", "var3", "int", true);
        ExpressionData exp4 = new ExpressionData( "exp4", "var4", "int", true);
        ExpressionData exp5 = new ExpressionData( "exp5", "var5", "int", true);
        ExpressionData exp6 = new ExpressionData( "exp6", "var6", "int", true);

        //TODO: Verificar si se incluye la clase en Legal Value
        LegalValueTableGuidData lvt1 = new LegalValueTableGuidData ("lvt1", "dt1");
        LegalValueTableGuidData lvt2 = new LegalValueTableGuidData ("lvt2", "dt2");
        LegalValueTableGuidData lvt3 = new LegalValueTableGuidData ("lvt3", "dt3");
        LegalValueTableGuidData lvt4 = new LegalValueTableGuidData ("lvt4", "dt4");
        LegalValueTableGuidData lvt5 = new LegalValueTableGuidData ("lvt5", "dt5");
        LegalValueTableGuidData lvt6 = new LegalValueTableGuidData ("lvt6", "dt6");
        
        //TODO: revisar si se agrega o no a Question la clase ScreenTemplate
        ScreenTemplateData scrTemplate1 = new ScreenTemplateData ("stg1", "template name 1", "datatype1", "ref1", true);
        ScreenTemplateData scrTemplate2 = new ScreenTemplateData ("stg2", "template name 2", "datatype2", "ref1", true);
        ScreenTemplateData scrTemplate3 = new ScreenTemplateData ("stg3", "template name 3", "datatype3", "ref1", true);
        ScreenTemplateData scrTemplate4 = new ScreenTemplateData ("stg4", "template name 4", "datatype4", "ref1", true);
        ScreenTemplateData scrTemplate5 = new ScreenTemplateData ("stg5", "template name 5", "datatype5", "ref1", true);
        ScreenTemplateData scrTemplate6 = new ScreenTemplateData ("stg6", "template name 6", "datatype6", "ref1", true);
        
        // / Question
        /*
         * public Question(String sQuestionGuid, String sLegalValueTableGuid, String sVariableName,
            String sScreenTemplateGuid, String sArguments, Boolean bRequired, String sAbsMin,
            String sAbsMax, String sPromptUnder, String sPromptOver,
            String sCustomValidationExpressionGuid, String sOnChange, String sUnique)
            */
        QuestionData q1 = new QuestionData ("guidq1", "lvt1", "q1", "stg1", "arg1", true, "absmin1", "absmax1", "pu1", "po1", "custom1", "change1", "qu1");
        QuestionData q2 = new QuestionData ("guidq2", "lvt2", "q2", "stg2", "arg2", true, "absmin2", "absmax2", "pu2", "po2", "custom2", "change2", "qu2");
        QuestionData q3 = new QuestionData ("guidq3", "lvt3", "q2", "stg3", "arg3", true, "absmin3", "absmax3", "pu3", "po3", "custom3", "change3", "qu3");
        QuestionData q4 = new QuestionData ("guidq4", "lvt4", "q2", "stg4", "arg4", true, "absmin4", "absmax4", "pu4", "po4", "custom4", "change4", "qu4");
        QuestionData q5 = new QuestionData ("guidq5", "lvt5", "q2", "stg5", "arg5", true, "absmin5", "absmax5", "pu5", "po5", "custom5", "change5", "qu5");
        QuestionData q6 = new QuestionData ("guidq6", "lvt6", "q2", "stg6", "arg6", true, "absmin6", "absmax6", "pu6", "po6", "custom6", "change6", "qu6");
        
        // Questions list
        ArrayList <QuestionData> alQuestions = new ArrayList<QuestionData> ();
        
        alQuestions.add(q1);
        alQuestions.add(q2);
        alQuestions.add(q3);
        alQuestions.add(q4);
        alQuestions.add(q5);
        alQuestions.add(q6);
        
        // Questionnaire
        QuestionnaireData qQuestInfo;
        qQuestInfo = new QuestionnaireData("guidqu", "short name q", "new",
                false, false, "mult inst abs min",
                "mult inst abs max", "prompt under",
                "promptover", "a1", "confirm vars", true, "unique string", alQuestions);

        /*
        Questionnaire qQuestionnaire = new Questionnaire("guidQuestionnaire", "qshortname", "new",
                true, false, "multinstance", "absmax", "promptunder", "promptover", "search",
                "confirm", true, "unique"); */
        
        // ArrayList <Questionnaire>
        ArrayList<QuestionnaireData> alQuestionnaire = new ArrayList<QuestionnaireData>();
        alQuestionnaire.add(qQuestInfo);
        // alQuestionnaire.add(qQuestionnaire);

        // / Study
        StudyData sStudy = new StudyData("guidst", "study short name", "1.0", "1.0",
                date, date, "currentid",
                false, true, "schema", "logschema",
                "lvsschema", "analysisschema", "searchvars",
                "confirmvar", alQuestionnaire);

        
        
    }
}
