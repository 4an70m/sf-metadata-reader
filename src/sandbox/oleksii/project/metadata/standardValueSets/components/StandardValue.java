package sandbox.oleksii.project.metadata.standardValueSets.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class StandardValue {

    @Element
    private String fullName;

    @Element(name = "default")
    private Boolean isDefault;

    @Element
    private String label;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private Boolean cssExposed;

    @Element(required = false)
    private Boolean closed;

    @Element(required = false)
    private Boolean converted;

    @Element(required = false)
    private String forecastCategory;

    @Element(required = false)
    private Integer probability;

    @Element(required = false)
    private Boolean won;

    @Element(required = false)
    private Boolean highPriority;

    @Element(required = false)
    private Boolean reviewed;

    @Element(required = false)
    private String reverseRole;

    @Override
    public String toString() {
        return "StandardValue{" +
                "fullName='" + fullName + '\'' +
                ", isDefault=" + isDefault +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", cssExposed=" + cssExposed +
                ", closed=" + closed +
                ", converted=" + converted +
                ", forecastCategory='" + forecastCategory + '\'' +
                ", probability=" + probability +
                ", won=" + won +
                ", highPriority=" + highPriority +
                ", reviewed=" + reviewed +
                ", reverseRole='" + reverseRole + '\'' +
                '}';
    }
}
