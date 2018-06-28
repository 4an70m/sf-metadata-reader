package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class ListPlacement {

    @Element
    private String location;

    @Element(required = false)
    private String units;

    @Element(required = false)
    private String width;
}
