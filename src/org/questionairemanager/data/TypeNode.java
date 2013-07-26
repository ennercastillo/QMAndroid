package org.questionairemanager.data;

public enum TypeNode {

	ST, QG, QU, GR, CH, IN, Q, EX;
	
	public String ToString(){
		switch (this){
		
		
		case ST:
			return "st";
		
		case QG:
			return "qg";
			
		case QU:
			return "qu";
			
		case GR:
			return "gr";
			
		case CH:
			return "ch";
			
		case IN:
			return "in";
			
		case Q:
			return "q";
			
		case EX:
			return "ex";
		
		default:
			return "unspecified";
		
		}
	}
	
}


