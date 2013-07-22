/**
 * 
 */
package org.questionairemanager.data;

/**
 * @author ennercastillo
 *
 */
public class LegalValueTableGuid {

    private String sLegalValueTableGuid;
    private String sDataType;
    
    /**
     * @return the sLegalValueTableGuid
     */
    public String getsLegalValueTableGuid() {
        return sLegalValueTableGuid;
    }
    /**
     * @param sLegalValueTableGuid the sLegalValueTableGuid to set
     */
    public void setsLegalValueTableGuid(String sLegalValueTableGuid) {
        this.sLegalValueTableGuid = sLegalValueTableGuid;
    }
    /**
     * @return the sDataType
     */
    public String getsDataType() {
        return sDataType;
    }
    /**
     * @param sDataType the sDataType to set
     */
    public void setsDataType(String sDataType) {
        this.sDataType = sDataType;
    }
    
    /**
     * @param sLegalValueTableGuid
     * @param sDataType
     */
    public LegalValueTableGuid(String sLegalValueTableGuid, String sDataType) {
        this.sLegalValueTableGuid = sLegalValueTableGuid;
        this.sDataType = sDataType;
    }
    
    public LegalValueTableGuid() {
        this.sLegalValueTableGuid = "";
        this.sDataType = "";
    }
    
}
