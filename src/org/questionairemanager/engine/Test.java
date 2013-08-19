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
	ArrayList<Node> alStudies = new ArrayList<Node>();

	Node alQuestion = new Node();

	qm.SetListOfStudies(); // Almacena el listado de todos los nodos de DA

	// TODO: Verify list of studies
	alStudies = qm.GetListOfStudies(); // Devuelve el listado de todos los nodos

	Node nNodeStudy = new Node();

	for (Node node : alStudies) {
	    if (node.getsNodeguid().equalsIgnoreCase("GUIDSt")) {
		try {
		    // node.PrintNodeInformation();
		    ((Study) node).ShowInformation();
		    // node.ShowInformation();
		    nNodeStudy = (Study) node.clone();
		} catch (CloneNotSupportedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}

	// Get Elements by GUID
	ArrayList<Node> alNodeInfo2 = qm.GetElementsOfStudyByGuid(nNodeStudy);
	Node nFirstElement = new Node();

	if (!(alNodeInfo2 == null) && !alNodeInfo2.isEmpty()) {

	    System.out.println("INFORMACION DE LOS HIJOS DE GUIDST ");
	    for (Node oData : alNodeInfo2) {

		// Node nTemporal = new Node();
		System.out.println("-------- inicio hijo \n");
		oData.PrintNodeInformation();
		System.out.println("-------- fin hijo \n");

		// if (node.getsNodeguid().equalsIgnoreCase("guidq5")) || guidqu {
		if (oData.getsNodeguid().equalsIgnoreCase("guidqu")) {

		    try {
			// nFirstElementQuestion = (Node) ((Node) oData).clone();
			nFirstElement = (Node) oData.clone();

		    } catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		}
	    }

	    System.out.println(nFirstElement.getTnTypeNode());

	    // inicia los elementos de tipo question
	    qm.SetElementsQuestion();

	    if (nFirstElement != null) {

		switch (nFirstElement.getTnTypeNode()) {
		    case QU:
			((Questionnaire) nFirstElement).ShowInformation();
			break;
		    case QG:
			((QuestionnaireGroup) nFirstElement).ShowInformation();
			break;

		    default:
			System.out.println("Error!");
			break;
		}

	    } else System.out.println("ERROR is null!!!");

	    System.out.println("end first element questionnaire!!!!!!!-----");

	    ArrayList<Node> alQuestions = qm.GetElementsOfQuestionnaireOrQuestionnaireGroup(nFirstElement);

	    if (alQuestions == null) System.out.println("ITS NULL!!!");
	    else {

		for (Node node : alQuestions) {
		    switch (node.getTnTypeNode()) {
			case QG:
			    System.out.println("Is a Questionnaire Group!!!!");
			    node.PrintNodeInformation();
			    break;
			case CH:
			    System.out.println("it is a checkpoint!!!!");
			    node.PrintNodeInformation();
			    // TODO: ADD ELEMENT TYPE CHECKPOINT
			    break;
			case Q:
			    System.out.println("it is a question----");
			    node.PrintNodeInformation();
			    System.out.println("------- info question ------++++++++++++++++++++++");
			    System.out.println("end line");
			    ((Question) node).ShowInformation();
			    break;
			case IN:
			    System.out.println("it is an info----");
			    node.PrintNodeInformation();
			    // TODO: add element tipo info
			    break;
			default:
			    break;
		    }
		}

	    }

	}

	// Get the first node for the questionnaire
	// No se ha verificado si pertenece al tipo Q o QG
	alQuestion = qm.GetFirstChildQuestionnaire(nFirstElement);

	if (alQuestion == null) {
	    System.out.println("no hay informacion de un hijo ");
	} else {
	    alQuestion.PrintNodeInformation();
	    Node nTemp = new Node();

	    System.out.println("first!!!!! \n");
	    nTemp = qm.GetNextChildQuestionnaire(alQuestion);

	    if (nTemp != null) {
		nTemp.PrintNodeInformation();
		((Question) nTemp).ShowInformation();

	    } else System.out.println("its null first");

	    System.out.println("second!!!! \n");
	    nTemp = qm.GetNextChildQuestionnaire(nTemp);
	    if (nTemp != null) nTemp.PrintNodeInformation();
	    else System.out.println("its null second");

	    System.out.println("third!!!! \n");
	    nTemp = qm.GetNextChildQuestionnaire(nTemp);
	    if (nTemp != null) nTemp.PrintNodeInformation();
	    else System.out.println("its null third");

	    System.out.println("fourth!!!! \n");
	    nTemp = qm.GetNextChildQuestionnaire(nTemp);
	    if (nTemp != null) nTemp.PrintNodeInformation();
	    else System.out.println("its null fourth!");

	    System.out.println("fifth!!!! \n"); // TODO: RETURN NULL ELEMENT
	    nTemp = qm.GetNextChildQuestionnaire(nTemp);
	    if (nTemp != null) nTemp.PrintNodeInformation();
	    else System.out.println("its null fifth");
	}

	// } else System.out.println("No hay nodo");

	System.out.println("fin");
    }
}
