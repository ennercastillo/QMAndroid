/**
 * TODO: Que informaci—n toma Legal Value
 */
package org.questionairemanager.data;

/**
 * @author ennercastillo
 *
 */
public class LegalValueTableGuidData {

    private String sLegalValueTableGuid;
    private String sDataType;
    
    /**
     * @return the sLegalValueTableGuid
     */
    public String getsLegalValueTableGuid() {
        return sLegalValueTableGuid;
    }
    /**
     * @return the sDataType
     */
    public String getsDataType() {
        return sDataType;
    }
    
    /**
     * @param sLegalValueTableGuid
     * @param sDataType
     */
    public LegalValueTableGuidData(String sLegalValueTableGuid, String sDataType) {
        this.sLegalValueTableGuid = sLegalValueTableGuid;
        this.sDataType = sDataType;
    }
    
    public LegalValueTableGuidData() {
        this.sLegalValueTableGuid = "";
        this.sDataType = "";
    }
    
}
