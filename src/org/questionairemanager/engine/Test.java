/**
 * 
 */

package org.questionairemanager.engine;

import java.util.ArrayList;

/**
 * @author ennercastillo
 */
public class Test {

    /**
     * 
     */
    public Test() {

	// TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

	QuestionManager qm = new QuestionManager();
	ArrayList<Node> alNodes = new ArrayList<Node>();
	ArrayList<Node> alQuestion = new ArrayList<Node>();

	qm.SetListOfStudies(); // Almacena el listado de todos los nodos de DA
	alNodes = qm.GetListOfStudies(); // Devuelve el listado de todos los nodos

	Node nNodeStudy = new Node();

	for (Node node : alNodes) {
	    if (node.getsNodeguid().equalsIgnoreCase("GUIDSt")) {
		try {
		    node.PrintNodeInformation();
		    nNodeStudy = (Node) node.clone();
		} catch (CloneNotSupportedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}

	// Get Elements by GUID
	ArrayList<Node> alNodeInfo2 = qm.GetElementsOfStudyByGuid("guidst");

	if (!(alNodeInfo2 == null) && !alNodeInfo2.isEmpty()) {

	    for (Node node : alNodeInfo2) {
		node.PrintNodeInformation();

		System.out.println("hola mundo!!!!");
		System.out.println("\n");

	    }

	    System.out.println("inicio!!!! \n");
	    nNodeStudy.PrintNodeInformation();

	    System.out.println("INICIO INFORMACION ------");

	    // Ac‡ debe enviar el dato
	    // Se debe validar de que tipo es (Q / QG)
	    // Si es Q debe traer la primera pregunta
	    // si es QG debe traer todos sus elementos

	    alQuestion = qm.GetElementsQuestionnaire("guidst");

	} else System.out.println("No hay nodo");

	System.out.println("fin");
    }

}
