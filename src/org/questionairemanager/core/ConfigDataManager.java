package org.questionairemanager.engine.data;

import android.content.Context;

public class ConfigDataManager {
	public static final String TBL_ST_STORE = "Site";
	public static final String FLD_ST_ID = "siteID";
	public static final String FLD_ST_NAME = "name";
	public static final String FLD_ST_CODE = "code";
	
	public static final String FLD_VALUE ="value";
	public static final String FLD_DATE = "date";
	public static final String FLD_USER = "user";
	public static final String FLD_DEVICE = "device";
	
	private Context context;
	private String dbName;
	private ObjectStoreHelper conn;
}
