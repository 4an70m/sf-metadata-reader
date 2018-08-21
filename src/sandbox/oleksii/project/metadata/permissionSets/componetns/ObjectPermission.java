package sandbox.oleksii.project.metadata.permissionSets.componetns;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class ObjectPermission {

    @Element
    private Boolean allowCreate;

    @Element
    private Boolean allowDelete;

    @Element
    private Boolean allowEdit;

    @Element
    private Boolean allowRead;

    @Element
    private Boolean modifyAllRecords;

    @Element
    private String object;

    @Element
    private Boolean viewAllRecords;
}
