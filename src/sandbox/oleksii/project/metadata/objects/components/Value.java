package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class Value {

    @Element
    private String fullName;

    @Element(required = false)
    private String color;

    @Element(name = "default")
    private Boolean isDefault;

    @Element(required = false)
    private String label;

    @Element(required = false)
    private Boolean isActive;

}
