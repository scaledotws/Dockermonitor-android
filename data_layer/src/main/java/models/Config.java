
package models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Config {

    @SerializedName("AttachStderr")
    @Expose
    private Boolean AttachStderr;
    @SerializedName("AttachStdin")
    @Expose
    private Boolean AttachStdin;
    @SerializedName("AttachStdout")
    @Expose
    private Boolean AttachStdout;
    @SerializedName("Cmd")
    @Expose
    private List<String> Cmd = new ArrayList<String>();
    @SerializedName("Domainname")
    @Expose
    private String Domainname;
    @SerializedName("Entrypoint")
    @Expose
    private Object Entrypoint;
    @SerializedName("Env")
    @Expose
    private List<String> Env = new ArrayList<String>();
    @SerializedName("ExposedPorts")
    @Expose
    private Object ExposedPorts;
    @SerializedName("Hostname")
    @Expose
    private String Hostname;
    @SerializedName("Image")
    @Expose
    private String Image;
    @SerializedName("Labels")
    @Expose
    private models.Labels Labels;
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;
    @SerializedName("NetworkDisabled")
    @Expose
    private Boolean NetworkDisabled;
    @SerializedName("OnBuild")
    @Expose
    private Object OnBuild;
    @SerializedName("OpenStdin")
    @Expose
    private Boolean OpenStdin;
    @SerializedName("StdinOnce")
    @Expose
    private Boolean StdinOnce;
    @SerializedName("Tty")
    @Expose
    private Boolean Tty;
    @SerializedName("User")
    @Expose
    private String User;
    @SerializedName("Volumes")
    @Expose
    private Object Volumes;
    @SerializedName("WorkingDir")
    @Expose
    private String WorkingDir;
    @SerializedName("StopSignal")
    @Expose
    private String StopSignal;

    /**
     * 
     * @return
     *     The AttachStderr
     */
    public Boolean getAttachStderr() {
        return AttachStderr;
    }

    /**
     * 
     * @param AttachStderr
     *     The AttachStderr
     */
    public void setAttachStderr(Boolean AttachStderr) {
        this.AttachStderr = AttachStderr;
    }

    /**
     * 
     * @return
     *     The AttachStdin
     */
    public Boolean getAttachStdin() {
        return AttachStdin;
    }

    /**
     * 
     * @param AttachStdin
     *     The AttachStdin
     */
    public void setAttachStdin(Boolean AttachStdin) {
        this.AttachStdin = AttachStdin;
    }

    /**
     * 
     * @return
     *     The AttachStdout
     */
    public Boolean getAttachStdout() {
        return AttachStdout;
    }

    /**
     * 
     * @param AttachStdout
     *     The AttachStdout
     */
    public void setAttachStdout(Boolean AttachStdout) {
        this.AttachStdout = AttachStdout;
    }

    /**
     * 
     * @return
     *     The Cmd
     */
    public List<String> getCmd() {
        return Cmd;
    }

    /**
     * 
     * @param Cmd
     *     The Cmd
     */
    public void setCmd(List<String> Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * 
     * @return
     *     The Domainname
     */
    public String getDomainname() {
        return Domainname;
    }

    /**
     * 
     * @param Domainname
     *     The Domainname
     */
    public void setDomainname(String Domainname) {
        this.Domainname = Domainname;
    }

    /**
     * 
     * @return
     *     The Entrypoint
     */
    public Object getEntrypoint() {
        return Entrypoint;
    }

    /**
     * 
     * @param Entrypoint
     *     The Entrypoint
     */
    public void setEntrypoint(Object Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * 
     * @return
     *     The Env
     */
    public List<String> getEnv() {
        return Env;
    }

    /**
     * 
     * @param Env
     *     The Env
     */
    public void setEnv(List<String> Env) {
        this.Env = Env;
    }

    /**
     * 
     * @return
     *     The ExposedPorts
     */
    public Object getExposedPorts() {
        return ExposedPorts;
    }

    /**
     * 
     * @param ExposedPorts
     *     The ExposedPorts
     */
    public void setExposedPorts(Object ExposedPorts) {
        this.ExposedPorts = ExposedPorts;
    }

    /**
     * 
     * @return
     *     The Hostname
     */
    public String getHostname() {
        return Hostname;
    }

    /**
     * 
     * @param Hostname
     *     The Hostname
     */
    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    /**
     * 
     * @return
     *     The Image
     */
    public String getImage() {
        return Image;
    }

    /**
     * 
     * @param Image
     *     The Image
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * 
     * @return
     *     The Labels
     */
    public models.Labels getLabels() {
        return Labels;
    }

    /**
     * 
     * @param Labels
     *     The Labels
     */
    public void setLabels(models.Labels Labels) {
        this.Labels = Labels;
    }

    /**
     * 
     * @return
     *     The MacAddress
     */
    public String getMacAddress() {
        return MacAddress;
    }

    /**
     * 
     * @param MacAddress
     *     The MacAddress
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * 
     * @return
     *     The NetworkDisabled
     */
    public Boolean getNetworkDisabled() {
        return NetworkDisabled;
    }

    /**
     * 
     * @param NetworkDisabled
     *     The NetworkDisabled
     */
    public void setNetworkDisabled(Boolean NetworkDisabled) {
        this.NetworkDisabled = NetworkDisabled;
    }

    /**
     * 
     * @return
     *     The OnBuild
     */
    public Object getOnBuild() {
        return OnBuild;
    }

    /**
     * 
     * @param OnBuild
     *     The OnBuild
     */
    public void setOnBuild(Object OnBuild) {
        this.OnBuild = OnBuild;
    }

    /**
     * 
     * @return
     *     The OpenStdin
     */
    public Boolean getOpenStdin() {
        return OpenStdin;
    }

    /**
     * 
     * @param OpenStdin
     *     The OpenStdin
     */
    public void setOpenStdin(Boolean OpenStdin) {
        this.OpenStdin = OpenStdin;
    }

    /**
     * 
     * @return
     *     The StdinOnce
     */
    public Boolean getStdinOnce() {
        return StdinOnce;
    }

    /**
     * 
     * @param StdinOnce
     *     The StdinOnce
     */
    public void setStdinOnce(Boolean StdinOnce) {
        this.StdinOnce = StdinOnce;
    }

    /**
     * 
     * @return
     *     The Tty
     */
    public Boolean getTty() {
        return Tty;
    }

    /**
     * 
     * @param Tty
     *     The Tty
     */
    public void setTty(Boolean Tty) {
        this.Tty = Tty;
    }

    /**
     * 
     * @return
     *     The User
     */
    public String getUser() {
        return User;
    }

    /**
     * 
     * @param User
     *     The User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 
     * @return
     *     The Volumes
     */
    public Object getVolumes() {
        return Volumes;
    }

    /**
     * 
     * @param Volumes
     *     The Volumes
     */
    public void setVolumes(Object Volumes) {
        this.Volumes = Volumes;
    }

    /**
     * 
     * @return
     *     The WorkingDir
     */
    public String getWorkingDir() {
        return WorkingDir;
    }

    /**
     * 
     * @param WorkingDir
     *     The WorkingDir
     */
    public void setWorkingDir(String WorkingDir) {
        this.WorkingDir = WorkingDir;
    }

    /**
     * 
     * @return
     *     The StopSignal
     */
    public String getStopSignal() {
        return StopSignal;
    }

    /**
     * 
     * @param StopSignal
     *     The StopSignal
     */
    public void setStopSignal(String StopSignal) {
        this.StopSignal = StopSignal;
    }

}
