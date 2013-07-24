package org.questionairemanager.data;

import java.util.Stack;

public class Transition {
	
	private Stack stckDataTransition;

	/**
	 * Class constructor of Transition
	 */
	public Transition() {
	}
	

	public void Add (Object oDataToPush){
		
		stckDataTransition.push(oDataToPush);
		
	}
	

}
