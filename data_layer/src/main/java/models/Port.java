
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Port {

    @SerializedName("PrivatePort")
    @Expose
    private Integer PrivatePort;
    @SerializedName("PublicPort")
    @Expose
    private Integer PublicPort;
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * 
     * @return
     *     The PrivatePort
     */
    public Integer getPrivatePort() {
        return PrivatePort;
    }

    /**
     * 
     * @param PrivatePort
     *     The PrivatePort
     */
    public void setPrivatePort(Integer PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * 
     * @return
     *     The PublicPort
     */
    public Integer getPublicPort() {
        return PublicPort;
    }

    /**
     * 
     * @param PublicPort
     *     The PublicPort
     */
    public void setPublicPort(Integer PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * 
     * @return
     *     The Type
     */
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

}
