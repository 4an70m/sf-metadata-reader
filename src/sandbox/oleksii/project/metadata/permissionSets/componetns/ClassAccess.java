package sandbox.oleksii.project.metadata.permissionSets.componetns;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class ClassAccess {

    @Element
    private String apexClass;

    @Element(name = "enabled")
    private Boolean isEnabled;
}