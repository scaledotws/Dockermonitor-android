
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class NetworkSettings {

    @SerializedName("Bridge")
    @Expose
    private String Bridge;
    @SerializedName("SandboxID")
    @Expose
    private String SandboxID;
    @SerializedName("HairpinMode")
    @Expose
    private Boolean HairpinMode;
    @SerializedName("LinkLocalIPv6Address")
    @Expose
    private String LinkLocalIPv6Address;
    @SerializedName("LinkLocalIPv6PrefixLen")
    @Expose
    private Integer LinkLocalIPv6PrefixLen;
    @SerializedName("Ports")
    @Expose
    private Object Ports;
    @SerializedName("SandboxKey")
    @Expose
    private String SandboxKey;
    @SerializedName("SecondaryIPAddresses")
    @Expose
    private Object SecondaryIPAddresses;
    @SerializedName("SecondaryIPv6Addresses")
    @Expose
    private Object SecondaryIPv6Addresses;
    @SerializedName("EndpointID")
    @Expose
    private String EndpointID;
    @SerializedName("Gateway")
    @Expose
    private String Gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String GlobalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Integer GlobalIPv6PrefixLen;
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Integer IPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String IPv6Gateway;
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;
    @SerializedName("Networks")
    @Expose
    private models.Networks Networks;

    /**
     * 
     * @return
     *     The Bridge
     */
    public String getBridge() {
        return Bridge;
    }

    /**
     * 
     * @param Bridge
     *     The Bridge
     */
    public void setBridge(String Bridge) {
        this.Bridge = Bridge;
    }

    /**
     * 
     * @return
     *     The SandboxID
     */
    public String getSandboxID() {
        return SandboxID;
    }

    /**
     * 
     * @param SandboxID
     *     The SandboxID
     */
    public void setSandboxID(String SandboxID) {
        this.SandboxID = SandboxID;
    }

    /**
     * 
     * @return
     *     The HairpinMode
     */
    public Boolean getHairpinMode() {
        return HairpinMode;
    }

    /**
     * 
     * @param HairpinMode
     *     The HairpinMode
     */
    public void setHairpinMode(Boolean HairpinMode) {
        this.HairpinMode = HairpinMode;
    }

    /**
     * 
     * @return
     *     The LinkLocalIPv6Address
     */
    public String getLinkLocalIPv6Address() {
        return LinkLocalIPv6Address;
    }

    /**
     * 
     * @param LinkLocalIPv6Address
     *     The LinkLocalIPv6Address
     */
    public void setLinkLocalIPv6Address(String LinkLocalIPv6Address) {
        this.LinkLocalIPv6Address = LinkLocalIPv6Address;
    }

    /**
     * 
     * @return
     *     The LinkLocalIPv6PrefixLen
     */
    public Integer getLinkLocalIPv6PrefixLen() {
        return LinkLocalIPv6PrefixLen;
    }

    /**
     * 
     * @param LinkLocalIPv6PrefixLen
     *     The LinkLocalIPv6PrefixLen
     */
    public void setLinkLocalIPv6PrefixLen(Integer LinkLocalIPv6PrefixLen) {
        this.LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen;
    }

    /**
     * 
     * @return
     *     The Ports
     */
    public Object getPorts() {
        return Ports;
    }

    /**
     * 
     * @param Ports
     *     The Ports
     */
    public void setPorts(Object Ports) {
        this.Ports = Ports;
    }

    /**
     * 
     * @return
     *     The SandboxKey
     */
    public String getSandboxKey() {
        return SandboxKey;
    }

    /**
     * 
     * @param SandboxKey
     *     The SandboxKey
     */
    public void setSandboxKey(String SandboxKey) {
        this.SandboxKey = SandboxKey;
    }

    /**
     * 
     * @return
     *     The SecondaryIPAddresses
     */
    public Object getSecondaryIPAddresses() {
        return SecondaryIPAddresses;
    }

    /**
     * 
     * @param SecondaryIPAddresses
     *     The SecondaryIPAddresses
     */
    public void setSecondaryIPAddresses(Object SecondaryIPAddresses) {
        this.SecondaryIPAddresses = SecondaryIPAddresses;
    }

    /**
     * 
     * @return
     *     The SecondaryIPv6Addresses
     */
    public Object getSecondaryIPv6Addresses() {
        return SecondaryIPv6Addresses;
    }

    /**
     * 
     * @param SecondaryIPv6Addresses
     *     The SecondaryIPv6Addresses
     */
    public void setSecondaryIPv6Addresses(Object SecondaryIPv6Addresses) {
        this.SecondaryIPv6Addresses = SecondaryIPv6Addresses;
    }

    /**
     * 
     * @return
     *     The EndpointID
     */
    public String getEndpointID() {
        return EndpointID;
    }

    /**
     * 
     * @param EndpointID
     *     The EndpointID
     */
    public void setEndpointID(String EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * 
     * @return
     *     The Gateway
     */
    public String getGateway() {
        return Gateway;
    }

    /**
     * 
     * @param Gateway
     *     The Gateway
     */
    public void setGateway(String Gateway) {
        this.Gateway = Gateway;
    }

    /**
     * 
     * @return
     *     The GlobalIPv6Address
     */
    public String getGlobalIPv6Address() {
        return GlobalIPv6Address;
    }

    /**
     * 
     * @param GlobalIPv6Address
     *     The GlobalIPv6Address
     */
    public void setGlobalIPv6Address(String GlobalIPv6Address) {
        this.GlobalIPv6Address = GlobalIPv6Address;
    }

    /**
     * 
     * @return
     *     The GlobalIPv6PrefixLen
     */
    public Integer getGlobalIPv6PrefixLen() {
        return GlobalIPv6PrefixLen;
    }

    /**
     * 
     * @param GlobalIPv6PrefixLen
     *     The GlobalIPv6PrefixLen
     */
    public void setGlobalIPv6PrefixLen(Integer GlobalIPv6PrefixLen) {
        this.GlobalIPv6PrefixLen = GlobalIPv6PrefixLen;
    }

    /**
     * 
     * @return
     *     The IPAddress
     */
    public String getIPAddress() {
        return IPAddress;
    }

    /**
     * 
     * @param IPAddress
     *     The IPAddress
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    /**
     * 
     * @return
     *     The IPPrefixLen
     */
    public Integer getIPPrefixLen() {
        return IPPrefixLen;
    }

    /**
     * 
     * @param IPPrefixLen
     *     The IPPrefixLen
     */
    public void setIPPrefixLen(Integer IPPrefixLen) {
        this.IPPrefixLen = IPPrefixLen;
    }

    /**
     * 
     * @return
     *     The IPv6Gateway
     */
    public String getIPv6Gateway() {
        return IPv6Gateway;
    }

    /**
     * 
     * @param IPv6Gateway
     *     The IPv6Gateway
     */
    public void setIPv6Gateway(String IPv6Gateway) {
        this.IPv6Gateway = IPv6Gateway;
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
     *     The Networks
     */
    public models.Networks getNetworks() {
        return Networks;
    }

    /**
     * 
     * @param Networks
     *     The Networks
     */
    public void setNetworks(models.Networks Networks) {
        this.Networks = Networks;
    }

}
