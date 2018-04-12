package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 05.01.2018.
 */
public class WebLinks {

    @Element
    private String fullName;

    @Element
    private Boolean availability;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String page;

    @Element
    private String displayType;

    @Element(required = false)
    private String encodingKey;

    @Element(required = false)
    private Boolean hasMenubar;

    @Element(required = false)
    private Boolean hasScrollbars;

    @Element(required = false)
    private Boolean hasToolbar;

    @Element(required = false)
    private Integer height;

    @Element(required = false)
    private Boolean isResizable;

    @Element
    private String linkType;

    @Element(required = false)
    private String masterLabel;

    @Element
    private String openType;

    @Element(required = false)
    private String position;

    @Element(name = "protected", required = false)
    private Boolean isProtected;

    @Element(required = false)
    private Boolean showsLocation;

    @Element(required = false)
    private Boolean showsStatus;

    @Element(required = false)
    private String url;

    @Element(required = false)
    private Integer width;

    @Element(required = false)
    private Boolean requireRowSelection;

    @Element(required = false)
    private String scontrol;

}