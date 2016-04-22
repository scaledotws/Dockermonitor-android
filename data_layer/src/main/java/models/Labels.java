
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Labels {

    @SerializedName("com.example.vendor")
    @Expose
    private String comExampleVendor;
    @SerializedName("com.example.license")
    @Expose
    private String comExampleLicense;
    @SerializedName("com.example.version")
    @Expose
    private String comExampleVersion;

    /**
     * 
     * @return
     *     The comExampleVendor
     */
    public String getComExampleVendor() {
        return comExampleVendor;
    }

    /**
     * 
     * @param comExampleVendor
     *     The com.example.vendor
     */
    public void setComExampleVendor(String comExampleVendor) {
        this.comExampleVendor = comExampleVendor;
    }

    /**
     * 
     * @return
     *     The comExampleLicense
     */
    public String getComExampleLicense() {
        return comExampleLicense;
    }

    /**
     * 
     * @param comExampleLicense
     *     The com.example.license
     */
    public void setComExampleLicense(String comExampleLicense) {
        this.comExampleLicense = comExampleLicense;
    }

    /**
     * 
     * @return
     *     The comExampleVersion
     */
    public String getComExampleVersion() {
        return comExampleVersion;
    }

    /**
     * 
     * @param comExampleVersion
     *     The com.example.version
     */
    public void setComExampleVersion(String comExampleVersion) {
        this.comExampleVersion = comExampleVersion;
    }

}
