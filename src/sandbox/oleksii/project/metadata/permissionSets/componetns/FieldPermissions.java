package sandbox.oleksii.project.metadata.permissionSets.componetns;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class FieldPermissions {

    @Element(name = "editable")
    private Boolean isEditable;

    @Element
    private String field;

    @Element(name = "readable")
    private Boolean isReadable;

}
