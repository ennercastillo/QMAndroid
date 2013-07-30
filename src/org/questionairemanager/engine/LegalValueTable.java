package org.questionairemanager.engine;

import java.util.ArrayList;

/**
 * Class get the type of question group 
 * (checkpoints, radiobuttons, ...)
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
 * <date>Jul, 30 2013</date>
 *
 */
public class LegalValueTable {

	/// ATTRIBUTS
	private String sLegalValueTableGuid; // GUID
	private String sDatatype;	// DATA TYPE
	private ArrayList<LegalValueItem> alItems;

	/**
	 * @return the sLegalValueTableGuid
	 */
	public String getsLegalValueTableGuid() {
		return sLegalValueTableGuid;
	}

	/**
	 * @return the sDatatype
	 */
	public String getsDatatype() {
		return sDatatype;
	}

	/**
	 * @return the alItems
	 */
	public ArrayList<LegalValueItem> getAlItems() {
		return alItems;
	}
	
	/**
	 * Class constructor
	 */
	public LegalValueTable(){
		this.sLegalValueTableGuid = "";
		this.sDatatype = "";
		this.alItems = new ArrayList<LegalValueItem>();
	}
	
	
	
	/**
	 * Class constructor
	 * @param sLegalValueTableGuid, GUID 
	 * @param sDatatype, Data type for this Legal Value Table 
	 * @param lviList, Array list items of this table
	 */
	public LegalValueTable(String sLegalValueTableGuid, String sDatatype, ArrayList<LegalValueItem> lviList) {
		this.sLegalValueTableGuid = sLegalValueTableGuid;
		this.sDatatype = sDatatype;
		this.alItems = lviList;
	}



}
