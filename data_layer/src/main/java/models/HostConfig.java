
package models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HostConfig {

    @SerializedName("Binds")
    @Expose
    private Object Binds;
    @SerializedName("BlkioWeight")
    @Expose
    private Integer BlkioWeight;
    @SerializedName("BlkioWeightDevice")
    @Expose
    private List<models.BlkioWeightDevice> BlkioWeightDevice = new ArrayList<models.BlkioWeightDevice>();
    @SerializedName("BlkioDeviceReadBps")
    @Expose
    private List<BlkioDeviceReadBp> BlkioDeviceReadBps = new ArrayList<BlkioDeviceReadBp>();
    @SerializedName("BlkioDeviceWriteBps")
    @Expose
    private List<BlkioDeviceWriteBp> BlkioDeviceWriteBps = new ArrayList<BlkioDeviceWriteBp>();
    @SerializedName("BlkioDeviceReadIOps")
    @Expose
    private List<BlkioDeviceReadIOp> BlkioDeviceReadIOps = new ArrayList<BlkioDeviceReadIOp>();
    @SerializedName("BlkioDeviceWriteIOps")
    @Expose
    private List<BlkioDeviceWriteIOp> BlkioDeviceWriteIOps = new ArrayList<BlkioDeviceWriteIOp>();
    @SerializedName("CapAdd")
    @Expose
    private Object CapAdd;
    @SerializedName("CapDrop")
    @Expose
    private Object CapDrop;
    @SerializedName("ContainerIDFile")
    @Expose
    private String ContainerIDFile;
    @SerializedName("CpusetCpus")
    @Expose
    private String CpusetCpus;
    @SerializedName("CpusetMems")
    @Expose
    private String CpusetMems;
    @SerializedName("CpuShares")
    @Expose
    private Integer CpuShares;
    @SerializedName("CpuPeriod")
    @Expose
    private Integer CpuPeriod;
    @SerializedName("Devices")
    @Expose
    private List<Object> Devices = new ArrayList<Object>();
    @SerializedName("Dns")
    @Expose
    private Object Dns;
    @SerializedName("DnsOptions")
    @Expose
    private Object DnsOptions;
    @SerializedName("DnsSearch")
    @Expose
    private Object DnsSearch;
    @SerializedName("ExtraHosts")
    @Expose
    private Object ExtraHosts;
    @SerializedName("IpcMode")
    @Expose
    private String IpcMode;
    @SerializedName("Links")
    @Expose
    private Object Links;
    @SerializedName("LxcConf")
    @Expose
    private List<Object> LxcConf = new ArrayList<Object>();
    @SerializedName("Memory")
    @Expose
    private Integer Memory;
    @SerializedName("MemorySwap")
    @Expose
    private Integer MemorySwap;
    @SerializedName("MemoryReservation")
    @Expose
    private Integer MemoryReservation;
    @SerializedName("KernelMemory")
    @Expose
    private Integer KernelMemory;
    @SerializedName("OomKillDisable")
    @Expose
    private Boolean OomKillDisable;
    @SerializedName("OomScoreAdj")
    @Expose
    private Integer OomScoreAdj;
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;
    @SerializedName("PortBindings")
    @Expose
    private models.PortBindings PortBindings;
    @SerializedName("Privileged")
    @Expose
    private Boolean Privileged;
    @SerializedName("ReadonlyRootfs")
    @Expose
    private Boolean ReadonlyRootfs;
    @SerializedName("PublishAllPorts")
    @Expose
    private Boolean PublishAllPorts;
    @SerializedName("RestartPolicy")
    @Expose
    private models.RestartPolicy RestartPolicy;
    @SerializedName("LogConfig")
    @Expose
    private models.LogConfig LogConfig;
    @SerializedName("SecurityOpt")
    @Expose
    private Object SecurityOpt;
    @SerializedName("VolumesFrom")
    @Expose
    private Object VolumesFrom;
    @SerializedName("Ulimits")
    @Expose
    private List<Ulimit> Ulimits = new ArrayList<Ulimit>();
    @SerializedName("VolumeDriver")
    @Expose
    private String VolumeDriver;
    @SerializedName("ShmSize")
    @Expose
    private Integer ShmSize;

    /**
     * 
     * @return
     *     The Binds
     */
    public Object getBinds() {
        return Binds;
    }

    /**
     * 
     * @param Binds
     *     The Binds
     */
    public void setBinds(Object Binds) {
        this.Binds = Binds;
    }

    /**
     * 
     * @return
     *     The BlkioWeight
     */
    public Integer getBlkioWeight() {
        return BlkioWeight;
    }

    /**
     * 
     * @param BlkioWeight
     *     The BlkioWeight
     */
    public void setBlkioWeight(Integer BlkioWeight) {
        this.BlkioWeight = BlkioWeight;
    }

    /**
     * 
     * @return
     *     The BlkioWeightDevice
     */
    public List<models.BlkioWeightDevice> getBlkioWeightDevice() {
        return BlkioWeightDevice;
    }

    /**
     * 
     * @param BlkioWeightDevice
     *     The BlkioWeightDevice
     */
    public void setBlkioWeightDevice(List<models.BlkioWeightDevice> BlkioWeightDevice) {
        this.BlkioWeightDevice = BlkioWeightDevice;
    }

    /**
     * 
     * @return
     *     The BlkioDeviceReadBps
     */
    public List<BlkioDeviceReadBp> getBlkioDeviceReadBps() {
        return BlkioDeviceReadBps;
    }

    /**
     * 
     * @param BlkioDeviceReadBps
     *     The BlkioDeviceReadBps
     */
    public void setBlkioDeviceReadBps(List<BlkioDeviceReadBp> BlkioDeviceReadBps) {
        this.BlkioDeviceReadBps = BlkioDeviceReadBps;
    }

    /**
     * 
     * @return
     *     The BlkioDeviceWriteBps
     */
    public List<BlkioDeviceWriteBp> getBlkioDeviceWriteBps() {
        return BlkioDeviceWriteBps;
    }

    /**
     * 
     * @param BlkioDeviceWriteBps
     *     The BlkioDeviceWriteBps
     */
    public void setBlkioDeviceWriteBps(List<BlkioDeviceWriteBp> BlkioDeviceWriteBps) {
        this.BlkioDeviceWriteBps = BlkioDeviceWriteBps;
    }

    /**
     * 
     * @return
     *     The BlkioDeviceReadIOps
     */
    public List<BlkioDeviceReadIOp> getBlkioDeviceReadIOps() {
        return BlkioDeviceReadIOps;
    }

    /**
     * 
     * @param BlkioDeviceReadIOps
     *     The BlkioDeviceReadIOps
     */
    public void setBlkioDeviceReadIOps(List<BlkioDeviceReadIOp> BlkioDeviceReadIOps) {
        this.BlkioDeviceReadIOps = BlkioDeviceReadIOps;
    }

    /**
     * 
     * @return
     *     The BlkioDeviceWriteIOps
     */
    public List<BlkioDeviceWriteIOp> getBlkioDeviceWriteIOps() {
        return BlkioDeviceWriteIOps;
    }

    /**
     * 
     * @param BlkioDeviceWriteIOps
     *     The BlkioDeviceWriteIOps
     */
    public void setBlkioDeviceWriteIOps(List<BlkioDeviceWriteIOp> BlkioDeviceWriteIOps) {
        this.BlkioDeviceWriteIOps = BlkioDeviceWriteIOps;
    }

    /**
     * 
     * @return
     *     The CapAdd
     */
    public Object getCapAdd() {
        return CapAdd;
    }

    /**
     * 
     * @param CapAdd
     *     The CapAdd
     */
    public void setCapAdd(Object CapAdd) {
        this.CapAdd = CapAdd;
    }

    /**
     * 
     * @return
     *     The CapDrop
     */
    public Object getCapDrop() {
        return CapDrop;
    }

    /**
     * 
     * @param CapDrop
     *     The CapDrop
     */
    public void setCapDrop(Object CapDrop) {
        this.CapDrop = CapDrop;
    }

    /**
     * 
     * @return
     *     The ContainerIDFile
     */
    public String getContainerIDFile() {
        return ContainerIDFile;
    }

    /**
     * 
     * @param ContainerIDFile
     *     The ContainerIDFile
     */
    public void setContainerIDFile(String ContainerIDFile) {
        this.ContainerIDFile = ContainerIDFile;
    }

    /**
     * 
     * @return
     *     The CpusetCpus
     */
    public String getCpusetCpus() {
        return CpusetCpus;
    }

    /**
     * 
     * @param CpusetCpus
     *     The CpusetCpus
     */
    public void setCpusetCpus(String CpusetCpus) {
        this.CpusetCpus = CpusetCpus;
    }

    /**
     * 
     * @return
     *     The CpusetMems
     */
    public String getCpusetMems() {
        return CpusetMems;
    }

    /**
     * 
     * @param CpusetMems
     *     The CpusetMems
     */
    public void setCpusetMems(String CpusetMems) {
        this.CpusetMems = CpusetMems;
    }

    /**
     * 
     * @return
     *     The CpuShares
     */
    public Integer getCpuShares() {
        return CpuShares;
    }

    /**
     * 
     * @param CpuShares
     *     The CpuShares
     */
    public void setCpuShares(Integer CpuShares) {
        this.CpuShares = CpuShares;
    }

    /**
     * 
     * @return
     *     The CpuPeriod
     */
    public Integer getCpuPeriod() {
        return CpuPeriod;
    }

    /**
     * 
     * @param CpuPeriod
     *     The CpuPeriod
     */
    public void setCpuPeriod(Integer CpuPeriod) {
        this.CpuPeriod = CpuPeriod;
    }

    /**
     * 
     * @return
     *     The Devices
     */
    public List<Object> getDevices() {
        return Devices;
    }

    /**
     * 
     * @param Devices
     *     The Devices
     */
    public void setDevices(List<Object> Devices) {
        this.Devices = Devices;
    }

    /**
     * 
     * @return
     *     The Dns
     */
    public Object getDns() {
        return Dns;
    }

    /**
     * 
     * @param Dns
     *     The Dns
     */
    public void setDns(Object Dns) {
        this.Dns = Dns;
    }

    /**
     * 
     * @return
     *     The DnsOptions
     */
    public Object getDnsOptions() {
        return DnsOptions;
    }

    /**
     * 
     * @param DnsOptions
     *     The DnsOptions
     */
    public void setDnsOptions(Object DnsOptions) {
        this.DnsOptions = DnsOptions;
    }

    /**
     * 
     * @return
     *     The DnsSearch
     */
    public Object getDnsSearch() {
        return DnsSearch;
    }

    /**
     * 
     * @param DnsSearch
     *     The DnsSearch
     */
    public void setDnsSearch(Object DnsSearch) {
        this.DnsSearch = DnsSearch;
    }

    /**
     * 
     * @return
     *     The ExtraHosts
     */
    public Object getExtraHosts() {
        return ExtraHosts;
    }

    /**
     * 
     * @param ExtraHosts
     *     The ExtraHosts
     */
    public void setExtraHosts(Object ExtraHosts) {
        this.ExtraHosts = ExtraHosts;
    }

    /**
     * 
     * @return
     *     The IpcMode
     */
    public String getIpcMode() {
        return IpcMode;
    }

    /**
     * 
     * @param IpcMode
     *     The IpcMode
     */
    public void setIpcMode(String IpcMode) {
        this.IpcMode = IpcMode;
    }

    /**
     * 
     * @return
     *     The Links
     */
    public Object getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    public void setLinks(Object Links) {
        this.Links = Links;
    }

    /**
     * 
     * @return
     *     The LxcConf
     */
    public List<Object> getLxcConf() {
        return LxcConf;
    }

    /**
     * 
     * @param LxcConf
     *     The LxcConf
     */
    public void setLxcConf(List<Object> LxcConf) {
        this.LxcConf = LxcConf;
    }

    /**
     * 
     * @return
     *     The Memory
     */
    public Integer getMemory() {
        return Memory;
    }

    /**
     * 
     * @param Memory
     *     The Memory
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 
     * @return
     *     The MemorySwap
     */
    public Integer getMemorySwap() {
        return MemorySwap;
    }

    /**
     * 
     * @param MemorySwap
     *     The MemorySwap
     */
    public void setMemorySwap(Integer MemorySwap) {
        this.MemorySwap = MemorySwap;
    }

    /**
     * 
     * @return
     *     The MemoryReservation
     */
    public Integer getMemoryReservation() {
        return MemoryReservation;
    }

    /**
     * 
     * @param MemoryReservation
     *     The MemoryReservation
     */
    public void setMemoryReservation(Integer MemoryReservation) {
        this.MemoryReservation = MemoryReservation;
    }

    /**
     * 
     * @return
     *     The KernelMemory
     */
    public Integer getKernelMemory() {
        return KernelMemory;
    }

    /**
     * 
     * @param KernelMemory
     *     The KernelMemory
     */
    public void setKernelMemory(Integer KernelMemory) {
        this.KernelMemory = KernelMemory;
    }

    /**
     * 
     * @return
     *     The OomKillDisable
     */
    public Boolean getOomKillDisable() {
        return OomKillDisable;
    }

    /**
     * 
     * @param OomKillDisable
     *     The OomKillDisable
     */
    public void setOomKillDisable(Boolean OomKillDisable) {
        this.OomKillDisable = OomKillDisable;
    }

    /**
     * 
     * @return
     *     The OomScoreAdj
     */
    public Integer getOomScoreAdj() {
        return OomScoreAdj;
    }

    /**
     * 
     * @param OomScoreAdj
     *     The OomScoreAdj
     */
    public void setOomScoreAdj(Integer OomScoreAdj) {
        this.OomScoreAdj = OomScoreAdj;
    }

    /**
     * 
     * @return
     *     The NetworkMode
     */
    public String getNetworkMode() {
        return NetworkMode;
    }

    /**
     * 
     * @param NetworkMode
     *     The NetworkMode
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * 
     * @return
     *     The PortBindings
     */
    public models.PortBindings getPortBindings() {
        return PortBindings;
    }

    /**
     * 
     * @param PortBindings
     *     The PortBindings
     */
    public void setPortBindings(models.PortBindings PortBindings) {
        this.PortBindings = PortBindings;
    }

    /**
     * 
     * @return
     *     The Privileged
     */
    public Boolean getPrivileged() {
        return Privileged;
    }

    /**
     * 
     * @param Privileged
     *     The Privileged
     */
    public void setPrivileged(Boolean Privileged) {
        this.Privileged = Privileged;
    }

    /**
     * 
     * @return
     *     The ReadonlyRootfs
     */
    public Boolean getReadonlyRootfs() {
        return ReadonlyRootfs;
    }

    /**
     * 
     * @param ReadonlyRootfs
     *     The ReadonlyRootfs
     */
    public void setReadonlyRootfs(Boolean ReadonlyRootfs) {
        this.ReadonlyRootfs = ReadonlyRootfs;
    }

    /**
     * 
     * @return
     *     The PublishAllPorts
     */
    public Boolean getPublishAllPorts() {
        return PublishAllPorts;
    }

    /**
     * 
     * @param PublishAllPorts
     *     The PublishAllPorts
     */
    public void setPublishAllPorts(Boolean PublishAllPorts) {
        this.PublishAllPorts = PublishAllPorts;
    }

    /**
     * 
     * @return
     *     The RestartPolicy
     */
    public models.RestartPolicy getRestartPolicy() {
        return RestartPolicy;
    }

    /**
     * 
     * @param RestartPolicy
     *     The RestartPolicy
     */
    public void setRestartPolicy(models.RestartPolicy RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * 
     * @return
     *     The LogConfig
     */
    public models.LogConfig getLogConfig() {
        return LogConfig;
    }

    /**
     * 
     * @param LogConfig
     *     The LogConfig
     */
    public void setLogConfig(models.LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * 
     * @return
     *     The SecurityOpt
     */
    public Object getSecurityOpt() {
        return SecurityOpt;
    }

    /**
     * 
     * @param SecurityOpt
     *     The SecurityOpt
     */
    public void setSecurityOpt(Object SecurityOpt) {
        this.SecurityOpt = SecurityOpt;
    }

    /**
     * 
     * @return
     *     The VolumesFrom
     */
    public Object getVolumesFrom() {
        return VolumesFrom;
    }

    /**
     * 
     * @param VolumesFrom
     *     The VolumesFrom
     */
    public void setVolumesFrom(Object VolumesFrom) {
        this.VolumesFrom = VolumesFrom;
    }

    /**
     * 
     * @return
     *     The Ulimits
     */
    public List<Ulimit> getUlimits() {
        return Ulimits;
    }

    /**
     * 
     * @param Ulimits
     *     The Ulimits
     */
    public void setUlimits(List<Ulimit> Ulimits) {
        this.Ulimits = Ulimits;
    }

    /**
     * 
     * @return
     *     The VolumeDriver
     */
    public String getVolumeDriver() {
        return VolumeDriver;
    }

    /**
     * 
     * @param VolumeDriver
     *     The VolumeDriver
     */
    public void setVolumeDriver(String VolumeDriver) {
        this.VolumeDriver = VolumeDriver;
    }

    /**
     * 
     * @return
     *     The ShmSize
     */
    public Integer getShmSize() {
        return ShmSize;
    }

    /**
     * 
     * @param ShmSize
     *     The ShmSize
     */
    public void setShmSize(Integer ShmSize) {
        this.ShmSize = ShmSize;
    }

}
