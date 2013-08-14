/**
 * 
 */

package org.questionnairemanager.engine.core;

import java.util.ArrayList;

/**
 * @author ennercastillo
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {

	QuestionManager qm = new QuestionManager();
	ArrayList<Study> alStudies = new ArrayList<Study>();

	Node alQuestion = new Node();

	qm.SetListOfStudies(); // Almacena el listado de todos los nodos de DA

	// TODO: Verify list of studies
	alStudies = qm.GetListOfStudies(); // Devuelve el listado de todos los nodos

	Node nNodeStudy = new Node();

	for (Study node : alStudies) {
	    if (node.getsNodeguid().equalsIgnoreCase("GUIDSt")) {
		try {
		    // node.PrintNodeInformation();

		    node.ShowInformation();
		    nNodeStudy = (Study) node.clone();
		} catch (CloneNotSupportedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}

	// Get Elements by GUID
	ArrayList<Object> alNodeInfo2 = qm.GetElementsOfStudyByGuid(nNodeStudy);
	Object nFirstElementQuestion = new Node();

	if (!(alNodeInfo2 == null) && !alNodeInfo2.isEmpty()) {

	    System.out.println("INFORMACION DE LOS HIJOS DE GUIDST ");
	    for (Object oData : alNodeInfo2) {

		// Node nTemporal = new Node();
		System.out.println("-------- inicio hijo \n");
		((Node) oData).PrintNodeInformation();
		System.out.println("-------- fin hijo \n");

		// if (node.getsNodeguid().equalsIgnoreCase("guidq5")) || guidqu {
		if (((Node) oData).getsNodeguid().equalsIgnoreCase("guidqu")) {

		    try {
			// nFirstElementQuestion = (Node) ((Node) oData).clone();
			nFirstElementquestion = oData.clone();

		    } catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	    }

	    nFirstElementQuestion.PrintNodeInformation();
	    // System.out.println("end first element questionnaire!!!!!!!-----");
	    // ArrayList<Node> alQuestions = new ArrayList<Node>();
	    // System.out.println();
	    //
	    // alQuestions = qm.GetElementsOfQuestionnaireOrQuestionnaireGroup(nFirstElementQuestion);
	    //
	    // for (Iterator<Node> questionnaire = alQuestions.iterator(); questionnaire.hasNext();) {
	    // Node node = (Node) questionnaire.next();
	    //
	    // if (node.gettnTypeNode().equals(TypeNode.QG)){
	    // System.out.println("it is a questionnaire group****");
	    // node.PrintNodeInformation();
	    // System.out.println("end line \n\n");
	    // }
	    //
	    // if (node.gettnTypeNode().equals(TypeNode.QU)){
	    // System.out.println("it is a questionnaire!!!!");
	    // node.PrintNodeInformation();
	    // System.out.println("\n");
	    // }
	    //
	    // if (node.gettnTypeNode().equals(TypeNode.Q)){
	    // System.out.println("it is a question----");
	    // node.PrintNodeInformation();
	    // System.out.println("\n");
	    // }
	    //
	}

	/*// Get the first node for the questionnaire
	// No se ha verificado si pertenece al tipo Q o QG
	alQuestion = qm.GetFirstChildQuestionnaire(nFirstElementQuestion);

	if (alQuestion == null) {
	System.out.println("no hay informacion de un hijo ");
	} else {
	alQuestion.PrintNodeInformation();
	Node nTemp = new Node();
	
	System.out.println("first!!!!! \n");		
	nTemp = qm.GetNextChildQuestionnaire(alQuestion);
	
	if (nTemp != null)
	    nTemp.PrintNodeInformation();
	else
	    System.out.println("its null first");
	
	System.out.println("second!!!! \n");
	nTemp = qm.GetNextChildQuestionnaire(nTemp);
	if (nTemp != null)
	    nTemp.PrintNodeInformation();
	else
	    System.out.println("its null second");
	
	System.out.println("third!!!! \n");
	nTemp = qm.GetNextChildQuestionnaire(nTemp);
	if (nTemp != null)
	    nTemp.PrintNodeInformation();
	else
	    System.out.println("its null third");
	
	
	System.out.println("fourth!!!! \n");
	nTemp = qm.GetNextChildQuestionnaire(nTemp);
	if (nTemp != null)
	    nTemp.PrintNodeInformation();
	else
	    System.out.println("its null fourth!");
	
	System.out.println("fifth!!!! \n"); //TODO: RETURN NULL ELEMENT
	nTemp = qm.GetNextChildQuestionnaire(nTemp);
	if (nTemp != null)
	    nTemp.PrintNodeInformation();
	else
	    System.out.println("its null fifth");
	}*/

	// Ac??? debe enviar el dato
	// Se debe validar de que tipo es (Q / QG)
	// Si es Q debe traer la primera pregunta
	// si es QG debe traer todos sus elementos

	// alQuestion = qm.GetElementsQuestionnaire("guidst");

	// } else System.out.println("No hay nodo");

	System.out.println("fin");
    }

}
