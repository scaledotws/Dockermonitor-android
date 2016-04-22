
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Networks {

    @SerializedName("bridge")
    @Expose
    private Bridge bridge;

    /**
     * 
     * @return
     *     The bridge
     */
    public Bridge getBridge() {
        return bridge;
    }

    /**
     * 
     * @param bridge
     *     The bridge
     */
    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }

}
