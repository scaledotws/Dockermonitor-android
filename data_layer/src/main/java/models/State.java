
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class State {

    @SerializedName("Error")
    @Expose
    private String Error;
    @SerializedName("ExitCode")
    @Expose
    private Integer ExitCode;
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;
    @SerializedName("OOMKilled")
    @Expose
    private Boolean OOMKilled;
    @SerializedName("Dead")
    @Expose
    private Boolean Dead;
    @SerializedName("Paused")
    @Expose
    private Boolean Paused;
    @SerializedName("Pid")
    @Expose
    private Integer Pid;
    @SerializedName("Restarting")
    @Expose
    private Boolean Restarting;
    @SerializedName("Running")
    @Expose
    private Boolean Running;
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 
     * @return
     *     The Error
     */
    public String getError() {
        return Error;
    }

    /**
     * 
     * @param Error
     *     The Error
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    /**
     * 
     * @return
     *     The ExitCode
     */
    public Integer getExitCode() {
        return ExitCode;
    }

    /**
     * 
     * @param ExitCode
     *     The ExitCode
     */
    public void setExitCode(Integer ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * 
     * @return
     *     The FinishedAt
     */
    public String getFinishedAt() {
        return FinishedAt;
    }

    /**
     * 
     * @param FinishedAt
     *     The FinishedAt
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * 
     * @return
     *     The OOMKilled
     */
    public Boolean getOOMKilled() {
        return OOMKilled;
    }

    /**
     * 
     * @param OOMKilled
     *     The OOMKilled
     */
    public void setOOMKilled(Boolean OOMKilled) {
        this.OOMKilled = OOMKilled;
    }

    /**
     * 
     * @return
     *     The Dead
     */
    public Boolean getDead() {
        return Dead;
    }

    /**
     * 
     * @param Dead
     *     The Dead
     */
    public void setDead(Boolean Dead) {
        this.Dead = Dead;
    }

    /**
     * 
     * @return
     *     The Paused
     */
    public Boolean getPaused() {
        return Paused;
    }

    /**
     * 
     * @param Paused
     *     The Paused
     */
    public void setPaused(Boolean Paused) {
        this.Paused = Paused;
    }

    /**
     * 
     * @return
     *     The Pid
     */
    public Integer getPid() {
        return Pid;
    }

    /**
     * 
     * @param Pid
     *     The Pid
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 
     * @return
     *     The Restarting
     */
    public Boolean getRestarting() {
        return Restarting;
    }

    /**
     * 
     * @param Restarting
     *     The Restarting
     */
    public void setRestarting(Boolean Restarting) {
        this.Restarting = Restarting;
    }

    /**
     * 
     * @return
     *     The Running
     */
    public Boolean getRunning() {
        return Running;
    }

    /**
     * 
     * @param Running
     *     The Running
     */
    public void setRunning(Boolean Running) {
        this.Running = Running;
    }

    /**
     * 
     * @return
     *     The StartedAt
     */
    public String getStartedAt() {
        return StartedAt;
    }

    /**
     * 
     * @param StartedAt
     *     The StartedAt
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * 
     * @return
     *     The Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * 
     * @param Status
     *     The Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

}
