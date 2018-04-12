package sandbox.oleksii.project.metadata.labels.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class Label {

    @Element
    private String fullName;

    @Element
    private String language;

    @Element(name = "protected")
    private Boolean isProtected;

    @Element
    private String shortDescription;

    @Element
    private String value;

    @Override
    public String toString() {
        return "Label{" +
                "fullName='" + fullName + '\'' +
                ", language='" + language + '\'' +
                ", isProtected=" + isProtected +
                ", shortDescription='" + shortDescription + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
