
package models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContainerTop {

    @SerializedName("Titles")
    @Expose
    private List<String> Titles = new ArrayList<String>();
    @SerializedName("Processes")
    @Expose
    private List<List<String>> Processes = new ArrayList<List<String>>();

    /**
     *
     * @return
     * The Titles
     */
    public List<String> getTitles() {
        return Titles;
    }

    /**
     *
     * @param Titles
     * The Titles
     */
    public void setTitles(List<String> Titles) {
        this.Titles = Titles;
    }

    /**
     *
     * @return
     * The Processes
     */
    public List<List<String>> getProcesses() {
        return Processes;
    }

    /**
     *
     * @param Processes
     * The Processes
     */
    public void setProcesses(List<List<String>> Processes) {
        this.Processes = Processes;
    }

}