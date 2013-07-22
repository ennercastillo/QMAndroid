/**
 * 
 */
package org.questionairemanager.core;

import java.util.ArrayList;

/**
 * Is a testing class
 * @author Enner Escobedo <email>enner.castillo@centrikal.com</email>
 * <date>Jul, 22 2013</date>
 *
 *
 */
public class Testing {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // ArrayList Transition
        ArrayList<Transition> alTransition = new ArrayList<Transition>();
        
        // Transition (id, scrinitial, scrnext, condition)
        alTransition.add(new Transition(1, 1, 2, null));        
        alTransition.add(new Transition(2, 2, 3, null));
        alTransition.add(new Transition(3, 3, 4, "text"));
        
        // ArrayList Screen
        ArrayList<Screen> alScreens = new ArrayList<Screen>();
        
        alScreens.add(new Screen(1, 1, alTransition));
        alScreens.add(new Screen(2, 2, alTransition));
        alScreens.add(new Screen(3, 3, alTransition));
        
        

    }

}
