package sandbox.oleksii.project.metadata.permissionSets.componetns;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class RecordTypeVisibility {

    @Element
    private String recordType;

    @Element(name = "visible")
    private Boolean isVisible;

}
