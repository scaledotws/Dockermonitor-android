
package models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Mount {

    @SerializedName("Name")
    @Expose
    private String Name;
    @SerializedName("Source")
    @Expose
    private String Source;
    @SerializedName("Destination")
    @Expose
    private String Destination;
    @SerializedName("Driver")
    @Expose
    private String Driver;
    @SerializedName("Mode")
    @Expose
    private String Mode;
    @SerializedName("RW")
    @Expose
    private Boolean RW;
    @SerializedName("Propagation")
    @Expose
    private String Propagation;

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
     *     The Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * 
     * @param Source
     *     The Source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 
     * @return
     *     The Destination
     */
    public String getDestination() {
        return Destination;
    }

    /**
     * 
     * @param Destination
     *     The Destination
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
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
     *     The Mode
     */
    public String getMode() {
        return Mode;
    }

    /**
     * 
     * @param Mode
     *     The Mode
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * 
     * @return
     *     The RW
     */
    public Boolean getRW() {
        return RW;
    }

    /**
     * 
     * @param RW
     *     The RW
     */
    public void setRW(Boolean RW) {
        this.RW = RW;
    }

    /**
     * 
     * @return
     *     The Propagation
     */
    public String getPropagation() {
        return Propagation;
    }

    /**
     * 
     * @param Propagation
     *     The Propagation
     */
    public void setPropagation(String Propagation) {
        this.Propagation = Propagation;
    }

}
