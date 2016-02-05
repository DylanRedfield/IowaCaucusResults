
package me.dylanredfield;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class StateResult {

    private me.dylanredfield.Candidate Candidate;
    private Double Result;
    private Double WinPercentage;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Candidate
     */
    public me.dylanredfield.Candidate getCandidate() {
        return Candidate;
    }

    /**
     * 
     * @param Candidate
     *     The Candidate
     */
    public void setCandidate(me.dylanredfield.Candidate Candidate) {
        this.Candidate = Candidate;
    }

    /**
     * 
     * @return
     *     The Result
     */
    public Double getResult() {
        return Result;
    }

    /**
     * 
     * @param Result
     *     The Result
     */
    public void setResult(Double Result) {
        this.Result = Result;
    }

    /**
     * 
     * @return
     *     The WinPercentage
     */
    public Double getWinPercentage() {
        return WinPercentage;
    }

    /**
     * 
     * @param WinPercentage
     *     The WinPercentage
     */
    public void setWinPercentage(Double WinPercentage) {
        this.WinPercentage = WinPercentage;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
