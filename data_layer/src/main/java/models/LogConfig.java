
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class LogConfig {

    @SerializedName("Config")
    @Expose
    private Object Config;
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * 
     * @return
     *     The Config
     */
    public Object getConfig() {
        return Config;
    }

    /**
     * 
     * @param Config
     *     The Config
     */
    public void setConfig(Object Config) {
        this.Config = Config;
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
