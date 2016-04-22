
package models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Container {

    @SerializedName("Id")
    @Expose
    private String Id;
    @SerializedName("Names")
    @Expose
    private List<String> Names = new ArrayList<String>();
    @SerializedName("Image")
    @Expose
    private String Image;
    @SerializedName("ImageID")
    @Expose
    private String ImageID;
    @SerializedName("Command")
    @Expose
    private String Command;
    @SerializedName("Created")
    @Expose
    private Integer Created;
    @SerializedName("Status")
    @Expose
    private String Status;
    @SerializedName("Ports")
    @Expose
    private List<Port> Ports = new ArrayList<Port>();
    @SerializedName("Labels")
    @Expose
    private models.Labels Labels;
    @SerializedName("SizeRw")
    @Expose
    private Integer SizeRw;
    @SerializedName("SizeRootFs")
    @Expose
    private Integer SizeRootFs;
    @SerializedName("NetworkSettings")
    @Expose
    private models.NetworkSettings NetworkSettings;

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
     *     The Names
     */
    public List<String> getNames() {
        return Names;
    }

    /**
     * 
     * @param Names
     *     The Names
     */
    public void setNames(List<String> Names) {
        this.Names = Names;
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
     *     The ImageID
     */
    public String getImageID() {
        return ImageID;
    }

    /**
     * 
     * @param ImageID
     *     The ImageID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * 
     * @return
     *     The Command
     */
    public String getCommand() {
        return Command;
    }

    /**
     * 
     * @param Command
     *     The Command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * 
     * @return
     *     The Created
     */
    public Integer getCreated() {
        return Created;
    }

    /**
     * 
     * @param Created
     *     The Created
     */
    public void setCreated(Integer Created) {
        this.Created = Created;
    }

    /**
     * 
     * @return
     *     The Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * 
     * @param Status
     *     The Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 
     * @return
     *     The Ports
     */
    public List<Port> getPorts() {
        return Ports;
    }

    /**
     * 
     * @param Ports
     *     The Ports
     */
    public void setPorts(List<Port> Ports) {
        this.Ports = Ports;
    }

    /**
     * 
     * @return
     *     The Labels
     */
    public models.Labels getLabels() {
        return Labels;
    }

    /**
     * 
     * @param Labels
     *     The Labels
     */
    public void setLabels(models.Labels Labels) {
        this.Labels = Labels;
    }

    /**
     * 
     * @return
     *     The SizeRw
     */
    public Integer getSizeRw() {
        return SizeRw;
    }

    /**
     * 
     * @param SizeRw
     *     The SizeRw
     */
    public void setSizeRw(Integer SizeRw) {
        this.SizeRw = SizeRw;
    }

    /**
     * 
     * @return
     *     The SizeRootFs
     */
    public Integer getSizeRootFs() {
        return SizeRootFs;
    }

    /**
     * 
     * @param SizeRootFs
     *     The SizeRootFs
     */
    public void setSizeRootFs(Integer SizeRootFs) {
        this.SizeRootFs = SizeRootFs;
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

    @Override
    public String toString() {
        return "Container{" +
                "Id='" + Id + '\'' +
                ", Names=" + Names +
                ", Image='" + Image + '\'' +
                ", ImageID='" + ImageID + '\'' +
                ", Command='" + Command + '\'' +
                ", Created=" + Created +
                ", Status='" + Status + '\'' +
                ", Ports=" + Ports +
                ", Labels=" + Labels +
                ", SizeRw=" + SizeRw +
                ", SizeRootFs=" + SizeRootFs +
                ", NetworkSettings=" + NetworkSettings +
                '}';
    }
}
