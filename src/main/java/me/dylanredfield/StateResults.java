
package me.dylanredfield;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class StateResults {

    private List<StateResult> StateResults = new ArrayList<StateResult>();
    private Integer PrecinctsReporting;
    private Integer TotalPrecincts;
    private String PublicMessage;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The StateResults
     */
    public List<StateResult> getStateResults() {
        return StateResults;
    }

    /**
     * @param StateResults The StateResults
     */
    public void setStateResults(List<StateResult> StateResults) {
        this.StateResults = StateResults;
    }

    /**
     * @return The PrecinctsReporting
     */
    public Integer getPrecinctsReporting() {
        return PrecinctsReporting;
    }

    /**
     * @param PrecinctsReporting The PrecinctsReporting
     */
    public void setPrecinctsReporting(Integer PrecinctsReporting) {
        this.PrecinctsReporting = PrecinctsReporting;
    }

    /**
     * @return The TotalPrecincts
     */
    public Integer getTotalPrecincts() {
        return TotalPrecincts;
    }

    /**
     * @param TotalPrecincts The TotalPrecincts
     */
    public void setTotalPrecincts(Integer TotalPrecincts) {
        this.TotalPrecincts = TotalPrecincts;
    }

    /**
     * @return The PublicMessage
     */
    public String getPublicMessage() {
        return PublicMessage;
    }

    /**
     * @param PublicMessage The PublicMessage
     */
    public void setPublicMessage(String PublicMessage) {
        this.PublicMessage = PublicMessage;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public List<StateResult> sortByWinner() {
        List<StateResult> sortedList = new ArrayList<StateResult>();
        for (int i = 0; i < StateResults.size(); i++) {
            double high = StateResults.get(i).getResult();
            int highIndex = i;

            for (int j = i; j < StateResults.size(); j++) {
                if (StateResults.get(j).getResult() > high) {
                    high = StateResults.get(j).getResult();
                    highIndex = j;
                }
            }
            sortedList.add(StateResults.get(highIndex));
        }

        StateResults = sortedList;

        return StateResults;
    }

    @Override
    public String toString() {
        String value = "";
        for (int i = 0; i < getStateResults().size(); i++) {
            value += "" + (i + 1) + ". " + getStateResults().get(i).getCandidate().getDisplayName();
            value += " Win Percent: " + new DecimalFormat("#.###")
                    .format(getStateResults().get(i).getWinPercentage() * 100) + "%\n";
        }

        value += "\nHilary is in the lead by " + new DecimalFormat("#.###")
                .format(100 * (getStateResults().get(0).getWinPercentage() - getStateResults()
                        .get(1).getWinPercentage())) + "%\n";

        return value;
    }

}
