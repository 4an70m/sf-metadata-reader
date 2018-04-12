package sandbox.oleksii.project.metadata.sharingRules.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 08.01.2018.
 */
public class SharedFrom {

    @Element(required = false)
    private String group;

    @Element(required = false)
    private String role;

    @Element(required = false)
    private String roleAndSubordinates;

    @Element(required = false)
    private String roleAndSubordinatesInternal;

}
