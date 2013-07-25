package org.questionairemanager.data;

public enum TypeNode {

	ST, QG, QU, GR, CH, IN, Q, EX;
	
	public String toString(){
		switch (this){
		
		
		case ST:
			return "Study";
		
		case QG:
			return "Questionnaire Group";
			
		case QU:
			return "Questionnaire";
			
		case GR:
			return "Group";
			
		case CH:
			return "Checkpoint";
			
		case IN:
			return "Information";
			
		case Q:
			return "Question";
			
		case EX:
			return "Expression";
		
		default:
			return "unspecified";
		
		}
	}
	
}


