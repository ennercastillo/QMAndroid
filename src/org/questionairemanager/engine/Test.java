/**
 * 
 */

package org.questionairemanager.engine;

import java.util.ArrayList;

import org.questionairemanager.data.Node;

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

        qm.SetListOfStudies(); // Almacena el listado de todos los nodos de DA
        alNodes = qm.GetListOfStudies(); // Devuelve el listado de todos los nodos

        // Get Elements by GUID
        ArrayList<Node> alNodeInfo2 = qm.getNodesOfStudy("guidq4");

        
        if (!alNodeInfo2.isEmpty()) {
            
            System.out.println("hay info");
            
            for (Node node : alNodeInfo2) {
                node.PrintNodeInformation();
                System.out.println("node guid " + node.getsNodeguid());
                System.out.println("node type " + node.gettnTypeNode().ToString());
            }
        }
        else
            System.out.println("No hay nodo");
        
        System.out.println("fin");
    }

}
