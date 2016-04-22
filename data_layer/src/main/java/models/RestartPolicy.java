
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RestartPolicy {

    @SerializedName("MaximumRetryCount")
    @Expose
    private Integer MaximumRetryCount;
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * 
     * @return
     *     The MaximumRetryCount
     */
    public Integer getMaximumRetryCount() {
        return MaximumRetryCount;
    }

    /**
     * 
     * @param MaximumRetryCount
     *     The MaximumRetryCount
     */
    public void setMaximumRetryCount(Integer MaximumRetryCount) {
        this.MaximumRetryCount = MaximumRetryCount;
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

}
