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
    	nodes.add(new Node("a", null, (TypeNode)"QU".toString(), "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("b", "a", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("c", "a", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("d", "b", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("e", "c", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("f", "e", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	nodes.add(new Node("g", "f", "QU", "0", true, "num", true, true, true, true, "onload", "unload", "comment"));
    	
    	// Se debe generar un camino a seguir, 
    	// Listado de pantallas a crear
    	
        
        // Define date
        Date date = new Date();
        
        // TODO: Expression Value
        ExpressionValue expVal1 = new ExpressionValue ("expval1", "val1");
        ExpressionValue expVal2 = new ExpressionValue ("expval2", "val2");
        ExpressionValue expVal3 = new ExpressionValue ("expval3", "val3");
        ExpressionValue expVal4 = new ExpressionValue ("expval4", "val4");
        
        
        //TODO: Verificar como usan expression
        Expression exp1 = new Expression( "exp1", "var1", "int", true);
        Expression exp2 = new Expression( "exp2", "var2", "int", true);
        Expression exp3 = new Expression( "exp3", "var3", "int", true);
        Expression exp4 = new Expression( "exp4", "var4", "int", true);
        Expression exp5 = new Expression( "exp5", "var5", "int", true);
        Expression exp6 = new Expression( "exp6", "var6", "int", true);

        //TODO: Verificar si se incluye la clase en Legal Value
        LegalValueTableGuid lvt1 = new LegalValueTableGuid ("lvt1", "dt1");
        LegalValueTableGuid lvt2 = new LegalValueTableGuid ("lvt2", "dt2");
        LegalValueTableGuid lvt3 = new LegalValueTableGuid ("lvt3", "dt3");
        LegalValueTableGuid lvt4 = new LegalValueTableGuid ("lvt4", "dt4");
        LegalValueTableGuid lvt5 = new LegalValueTableGuid ("lvt5", "dt5");
        LegalValueTableGuid lvt6 = new LegalValueTableGuid ("lvt6", "dt6");
        
        //TODO: revisar si se agrega o no a Question la clase ScreenTemplate
        ScreenTemplate scrTemplate1 = new ScreenTemplate ("stg1", "template name 1", "datatype1", "ref1", true);
        ScreenTemplate scrTemplate2 = new ScreenTemplate ("stg2", "template name 2", "datatype2", "ref1", true);
        ScreenTemplate scrTemplate3 = new ScreenTemplate ("stg3", "template name 3", "datatype3", "ref1", true);
        ScreenTemplate scrTemplate4 = new ScreenTemplate ("stg4", "template name 4", "datatype4", "ref1", true);
        ScreenTemplate scrTemplate5 = new ScreenTemplate ("stg5", "template name 5", "datatype5", "ref1", true);
        ScreenTemplate scrTemplate6 = new ScreenTemplate ("stg6", "template name 6", "datatype6", "ref1", true);
        
        // / Question
        Question q1 = new Question ("q1", "lvt1", "q1", "stg1", "arg1", true, "absmin1", "absmax1", "pu1", "po1", "custom1", "change1", "qu1");
        Question q2 = new Question ("q2", "lvt2", "q2", "stg2", "arg2", true, "absmin2", "absmax2", "pu2", "po2", "custom2", "change2", "qu2");
        Question q3 = new Question ("q3", "lvt3", "q2", "stg3", "arg3", true, "absmin3", "absmax3", "pu3", "po3", "custom3", "change3", "qu3");
        Question q4 = new Question ("q4", "lvt4", "q2", "stg4", "arg4", true, "absmin4", "absmax4", "pu4", "po4", "custom4", "change4", "qu4");
        Question q5 = new Question ("q5", "lvt5", "q2", "stg5", "arg5", true, "absmin5", "absmax5", "pu5", "po5", "custom5", "change5", "qu5");
        Question q6 = new Question ("q6", "lvt6", "q2", "stg6", "arg6", true, "absmin6", "absmax6", "pu6", "po6", "custom6", "change6", "qu6");
        
        // Questions list
        ArrayList <Question> alQuestions = new ArrayList<Question> ();
        
        alQuestions.add(q1);
        alQuestions.add(q2);
        alQuestions.add(q3);
        alQuestions.add(q4);
        alQuestions.add(q5);
        alQuestions.add(q6);
        
        // Questionnaire
        Questionnaire qQuestInfo;
        qQuestInfo = new Questionnaire("qguid", "short name q", "new",
                false, false, "mult inst abs min",
                "mult inst abs max", "prompt under",
                "promptover", "a1", "confirm vars", true, "unique string", alQuestions);

        /*
        Questionnaire qQuestionnaire = new Questionnaire("guidQuestionnaire", "qshortname", "new",
                true, false, "multinstance", "absmax", "promptunder", "promptover", "search",
                "confirm", true, "unique"); */
        
        // ArrayList <Questionnaire>
        ArrayList<Questionnaire> alQuestionnaire = new ArrayList<Questionnaire>();
        alQuestionnaire.add(qQuestInfo);
        // alQuestionnaire.add(qQuestionnaire);

        // / Study
        Study sStudy = new Study("abc", "study short name", "1.0", "1.0",
                date, date, "currentid",
                false, true, "schema", "logschema",
                "lvsschema", "analysisschema", "searchvars",
                "confirmvar", alQuestionnaire);

        
        
    }
}
