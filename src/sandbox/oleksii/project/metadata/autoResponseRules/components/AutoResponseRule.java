package sandbox.oleksii.project.metadata.autoResponseRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 07.01.2018.
 */
public class AutoResponseRule {

    @Element
    private String fullName ;

    @Element
    private Boolean active;

    @Override
    public String toString() {
        return "AutoResponseRule{" +
                "fullName='" + fullName + '\'' +
                ", active=" + active +
                '}';
    }
}
