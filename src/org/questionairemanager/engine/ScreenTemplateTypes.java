/**
 * 
 */
package org.questionairemanager.engine;

/**
 * @author Enner Escobedo C. <email>enner.castillo@centrikal.com</email>
 *         <date>Jul, 30 2013 </date>
 * 
 *         Constants of type Screen Template
 */
public enum ScreenTemplateTypes {

	TEXTBOX, TEXTAREA, DROPDOWN, RADIOBUTTON, INTEGER, DECIMAL, DATETIME, DATE, TIME, CHECKBOX, GRID, NAME, GPSREADING, INFO, SECTIONEXITSCREEN;

	public String ToString() {

		switch (this) {

		case TEXTBOX:
			return "guidtb"; // nvarchar (50)
		case TEXTAREA:
			return "guidta"; // nvarchar(255)
		case DROPDOWN:
			return "guiddd"; // integer
		case RADIOBUTTON:
			return "guidrb"; // integer
		case INTEGER:
			return "guidin"; // integer
		case DECIMAL:
			return "guidde"; // numeric
		case DATETIME:
			return "guiddt"; // datetime
		case DATE:
			return "guiddt"; // datetime
		case TIME:
			return "guiddt"; // datetime
		case CHECKBOX:
			return "guidcb"; // bit
		case GRID:
			return "guidgr"; // null
		case NAME:
			return "buidna"; // nvarchar (50)
		case GPSREADING:
			return "guidgp"; // null
		case INFO:
			return "guidif"; // null
		case SECTIONEXITSCREEN:
			return "guidse"; // null
		default:
			return "unspecified"; // ERROR

		}

	}
}