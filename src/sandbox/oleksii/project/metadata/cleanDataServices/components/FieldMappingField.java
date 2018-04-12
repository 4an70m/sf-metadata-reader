package sandbox.oleksii.project.metadata.cleanDataServices.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 08.01.2018.
 */
public class FieldMappingField {

    @Element
    private String dataServiceField;

    @Element
    private String dataServiceObjectName;

    @Element
    private Integer priority;
}
