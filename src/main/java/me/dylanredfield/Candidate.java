
package me.dylanredfield;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Candidate {

    private Integer CandidateId;
    private String FirstName;
    private String LastName;
    private String Color;
    private String PhotoCDNUrl;
    private String DisplayName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The CandidateId
     */
    public Integer getCandidateId() {
        return CandidateId;
    }

    /**
     * 
     * @param CandidateId
     *     The CandidateId
     */
    public void setCandidateId(Integer CandidateId) {
        this.CandidateId = CandidateId;
    }

    /**
     * 
     * @return
     *     The FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * 
     * @param FirstName
     *     The FirstName
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * 
     * @return
     *     The LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * 
     * @param LastName
     *     The LastName
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * 
     * @return
     *     The Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * 
     * @param Color
     *     The Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * 
     * @return
     *     The PhotoCDNUrl
     */
    public String getPhotoCDNUrl() {
        return PhotoCDNUrl;
    }

    /**
     * 
     * @param PhotoCDNUrl
     *     The PhotoCDNUrl
     */
    public void setPhotoCDNUrl(String PhotoCDNUrl) {
        this.PhotoCDNUrl = PhotoCDNUrl;
    }

    /**
     * 
     * @return
     *     The DisplayName
     */
    public String getDisplayName() {
        return DisplayName;
    }

    /**
     * 
     * @param DisplayName
     *     The DisplayName
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
