package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class DefaultShortcut {

    @Element
    private String action;

    @Element(name = "active")
    private Boolean isActive;

    @Element
    private String keyCommand;

}
