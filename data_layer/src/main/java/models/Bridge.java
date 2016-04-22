
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Bridge {

    @SerializedName("NetworkID")
    @Expose
    private String NetworkID;
    @SerializedName("EndpointID")
    @Expose
    private String EndpointID;
    @SerializedName("Gateway")
    @Expose
    private String Gateway;
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Integer IPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String IPv6Gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String GlobalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Integer GlobalIPv6PrefixLen;
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
     * 
     * @return
     *     The NetworkID
     */
    public String getNetworkID() {
        return NetworkID;
    }

    /**
     * 
     * @param NetworkID
     *     The NetworkID
     */
    public void setNetworkID(String NetworkID) {
        this.NetworkID = NetworkID;
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

}
