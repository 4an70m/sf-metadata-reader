package sandbox.oleksii.project.metadata.cleanDataServices.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class FieldMapping {

    @Element(name = "SObjectType")
    private String sObjectType;

    @Element
    private String developerName;

    @ElementList(inline = true, entry = "fieldMappingRows")
    private List<FieldMappingRow> fieldMappingRows;

    @Element
    private String masterLabel;

}
