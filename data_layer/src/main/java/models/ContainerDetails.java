
package models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ContainerDetails {

    @SerializedName("AppArmorProfile")
    @Expose
    private String AppArmorProfile;
    @SerializedName("Args")
    @Expose
    private List<String> Args = new ArrayList<String>();
    @SerializedName("Config")
    @Expose
    private models.Config Config;
    @SerializedName("Created")
    @Expose
    private String Created;
    @SerializedName("Driver")
    @Expose
    private String Driver;
    @SerializedName("ExecDriver")
    @Expose
    private String ExecDriver;
    @SerializedName("ExecIDs")
    @Expose
    private Object ExecIDs;
    @SerializedName("HostConfig")
    @Expose
    private models.HostConfig HostConfig;
    @SerializedName("HostnamePath")
    @Expose
    private String HostnamePath;
    @SerializedName("HostsPath")
    @Expose
    private String HostsPath;
    @SerializedName("LogPath")
    @Expose
    private String LogPath;
    @SerializedName("Id")
    @Expose
    private String Id;
    @SerializedName("Image")
    @Expose
    private String Image;
    @SerializedName("MountLabel")
    @Expose
    private String MountLabel;
    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("NetworkSettings")
    @Expose
    private models.NetworkSettings NetworkSettings;
    @SerializedName("Path")
    @Expose
    private String Path;
    @SerializedName("ProcessLabel")
    @Expose
    private String ProcessLabel;
    @SerializedName("ResolvConfPath")
    @Expose
    private String ResolvConfPath;
    @SerializedName("RestartCount")
    @Expose
    private Integer RestartCount;
    @SerializedName("State")
    @Expose
    private models.State State;
    @SerializedName("Mounts")
    @Expose
    private List<Mount> Mounts = new ArrayList<Mount>();

    /**
     * 
     * @return
     *     The AppArmorProfile
     */
    public String getAppArmorProfile() {
        return AppArmorProfile;
    }

    /**
     * 
     * @param AppArmorProfile
     *     The AppArmorProfile
     */
    public void setAppArmorProfile(String AppArmorProfile) {
        this.AppArmorProfile = AppArmorProfile;
    }

    /**
     * 
     * @return
     *     The Args
     */
    public List<String> getArgs() {
        return Args;
    }

    /**
     * 
     * @param Args
     *     The Args
     */
    public void setArgs(List<String> Args) {
        this.Args = Args;
    }

    /**
     * 
     * @return
     *     The Config
     */
    public models.Config getConfig() {
        return Config;
    }

    /**
     * 
     * @param Config
     *     The Config
     */
    public void setConfig(models.Config Config) {
        this.Config = Config;
    }

    /**
     * 
     * @return
     *     The Created
     */
    public String getCreated() {
        return Created;
    }

    /**
     * 
     * @param Created
     *     The Created
     */
    public void setCreated(String Created) {
        this.Created = Created;
    }

    /**
     * 
     * @return
     *     The Driver
     */
    public String getDriver() {
        return Driver;
    }

    /**
     * 
     * @param Driver
     *     The Driver
     */
    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    /**
     * 
     * @return
     *     The ExecDriver
     */
    public String getExecDriver() {
        return ExecDriver;
    }

    /**
     * 
     * @param ExecDriver
     *     The ExecDriver
     */
    public void setExecDriver(String ExecDriver) {
        this.ExecDriver = ExecDriver;
    }

    /**
     * 
     * @return
     *     The ExecIDs
     */
    public Object getExecIDs() {
        return ExecIDs;
    }

    /**
     * 
     * @param ExecIDs
     *     The ExecIDs
     */
    public void setExecIDs(Object ExecIDs) {
        this.ExecIDs = ExecIDs;
    }

    /**
     * 
     * @return
     *     The HostConfig
     */
    public models.HostConfig getHostConfig() {
        return HostConfig;
    }

    /**
     * 
     * @param HostConfig
     *     The HostConfig
     */
    public void setHostConfig(models.HostConfig HostConfig) {
        this.HostConfig = HostConfig;
    }

    /**
     * 
     * @return
     *     The HostnamePath
     */
    public String getHostnamePath() {
        return HostnamePath;
    }

    /**
     * 
     * @param HostnamePath
     *     The HostnamePath
     */
    public void setHostnamePath(String HostnamePath) {
        this.HostnamePath = HostnamePath;
    }

    /**
     * 
     * @return
     *     The HostsPath
     */
    public String getHostsPath() {
        return HostsPath;
    }

    /**
     * 
     * @param HostsPath
     *     The HostsPath
     */
    public void setHostsPath(String HostsPath) {
        this.HostsPath = HostsPath;
    }

    /**
     * 
     * @return
     *     The LogPath
     */
    public String getLogPath() {
        return LogPath;
    }

    /**
     * 
     * @param LogPath
     *     The LogPath
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The Id
     */
    public void setId(String Id) {
        this.Id = Id;
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
     *     The MountLabel
     */
    public String getMountLabel() {
        return MountLabel;
    }

    /**
     * 
     * @param MountLabel
     *     The MountLabel
     */
    public void setMountLabel(String MountLabel) {
        this.MountLabel = MountLabel;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return
     *     The NetworkSettings
     */
    public models.NetworkSettings getNetworkSettings() {
        return NetworkSettings;
    }

    /**
     * 
     * @param NetworkSettings
     *     The NetworkSettings
     */
    public void setNetworkSettings(models.NetworkSettings NetworkSettings) {
        this.NetworkSettings = NetworkSettings;
    }

    /**
     * 
     * @return
     *     The Path
     */
    public String getPath() {
        return Path;
    }

    /**
     * 
     * @param Path
     *     The Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 
     * @return
     *     The ProcessLabel
     */
    public String getProcessLabel() {
        return ProcessLabel;
    }

    /**
     * 
     * @param ProcessLabel
     *     The ProcessLabel
     */
    public void setProcessLabel(String ProcessLabel) {
        this.ProcessLabel = ProcessLabel;
    }

    /**
     * 
     * @return
     *     The ResolvConfPath
     */
    public String getResolvConfPath() {
        return ResolvConfPath;
    }

    /**
     * 
     * @param ResolvConfPath
     *     The ResolvConfPath
     */
    public void setResolvConfPath(String ResolvConfPath) {
        this.ResolvConfPath = ResolvConfPath;
    }

    /**
     * 
     * @return
     *     The RestartCount
     */
    public Integer getRestartCount() {
        return RestartCount;
    }

    /**
     * 
     * @param RestartCount
     *     The RestartCount
     */
    public void setRestartCount(Integer RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * 
     * @return
     *     The State
     */
    public models.State getState() {
        return State;
    }

    /**
     * 
     * @param State
     *     The State
     */
    public void setState(models.State State) {
        this.State = State;
    }

    /**
     * 
     * @return
     *     The Mounts
     */
    public List<Mount> getMounts() {
        return Mounts;
    }

    /**
     * 
     * @param Mounts
     *     The Mounts
     */
    public void setMounts(List<Mount> Mounts) {
        this.Mounts = Mounts;
    }

}
