package org.questionairemanager.data;

import java.util.Stack;

public class TransitionData {
	
	private Stack stckDataTransition;

	/**
	 * Class constructor of Transition
	 */
	public TransitionData() {
	}
	

	public void Add (Object oDataToPush){
		
		stckDataTransition.push(oDataToPush);
		
	}
	

}
