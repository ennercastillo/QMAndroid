/**
 * 
 */
package org.questionairemanager.engine;

import java.util.ArrayList;

import org.questionairemanager.data.Node;

/**
 * @author ennercastillo
 *
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
        ArrayList<Node> alNodes = null;
        
        qm.SetListOfStudies(); // Almacena el listado de todos los nodos de DA
        alNodes = qm.GetListOfStudies(); // Devuelve el listado de todos los nodos
        
        ArrayList<Node> alNodeInfo2 = qm.GetElementsOfStudyByGuid("guidq4");
        
        if (!alNodeInfo2.isEmpty()) {
        	System.out.println("hay info");
        for (Node node : alNodeInfo2) {
			node.PrintNodeInformation();
		}
        }
        else
        	System.out.println("NO hay nodo");
        System.out.println("fin");
    }

}
