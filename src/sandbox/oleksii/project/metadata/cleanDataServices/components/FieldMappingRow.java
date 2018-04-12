package sandbox.oleksii.project.metadata.cleanDataServices.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class FieldMappingRow {

    @Element(name = "SObjectType")
    private String sObjectType;

    @ElementList(inline = true, entry = "fieldMappingFields")
    private List<FieldMappingField> fieldMappingFields;

    @Element
    private String fieldName;

    @Element
    private String mappingOperation;
}
