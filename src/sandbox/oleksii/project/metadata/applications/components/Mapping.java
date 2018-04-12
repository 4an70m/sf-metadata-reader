package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class Mapping {

    @Element(required = false)
    private String fieldName;

    @Element
    private String tab;

}
