package org.questionairemanager.core;

import java.util.ArrayList;

public class Screen {

	private int iScreenId;
	private int iQuestionId;
	private ArrayList<Transition> alTransition;
	private ArrayList<Screen> alScreen;

	/**
	 * @return the iScreenId
	 */
	public int getiScreenId() {
		return iScreenId;
	}


	/**
	 * @param iScreenId the iScreenId to set
	 */
	public void setiScreenId(int iScreenId) {
		this.iScreenId = iScreenId;
	}


	/**
	 * @return the iQuestionId
	 */
	public int getiQuestionId() {
		return iQuestionId;
	}


	/**
	 * @param iQuestionId the iQuestionId to set
	 */
	public void setiQuestionId(int iQuestionId) {
		this.iQuestionId = iQuestionId;
	}


	/**
	 * @return the alTransition
	 */
	public ArrayList<Transition> getAlTransition() {
		return alTransition;
	}


	/**
	 * @param alTransition the alTransition to set
	 */
	public void setAlTransition(ArrayList<Transition> alTransition) {
		this.alTransition = alTransition;
	}


	public ArrayList<Screen> GetAll (){
		if (alScreen.isEmpty())
			return null;
		else
			return alScreen;
	}

	
	public void GenerateData (){
		if (alScreen == null){
			
		}
	}
	
	/**
	 * @param iScreenId
	 * @param iQuestionId
	 * @param alTransition
	 */
	public Screen(int iScreenId, int iQuestionId,
			ArrayList<Transition> alTransition) {
		super();
		this.iScreenId = iScreenId;
		this.iQuestionId = iQuestionId;
		this.alTransition = alTransition;
	}
	
}
