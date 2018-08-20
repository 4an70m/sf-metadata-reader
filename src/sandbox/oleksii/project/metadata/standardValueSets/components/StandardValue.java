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

    @Element(required = false, name = "cssExposed")
    private Boolean isCssExposed;

    @Element(required = false, name = "closed")
    private Boolean isClosed;

    @Element(required = false, name = "converted")
    private Boolean isConverted;

    @Element(required = false)
    private String forecastCategory;

    @Element(required = false)
    private Integer probability;

    @Element(required = false, name = "won")
    private Boolean isWon;

    @Element(required = false, name = "highPriority")
    private Boolean isHighPriority;

    @Element(required = false, name = "reviewed")
    private Boolean isReviewed;

    @Element(required = false)
    private String reverseRole;
}