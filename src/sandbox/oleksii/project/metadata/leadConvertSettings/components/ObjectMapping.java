package sandbox.oleksii.project.metadata.leadConvertSettings.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class ObjectMapping {

    @Element
    private String inputObject;

    @ElementList(inline = true, entry = "mappingFields", required = false)
    private List<MappingField> mappingFields;

    @Element
    private String outputObject;
}
