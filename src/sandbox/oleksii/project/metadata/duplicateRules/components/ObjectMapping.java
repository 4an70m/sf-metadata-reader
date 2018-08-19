package sandbox.oleksii.project.metadata.duplicateRules.components;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class ObjectMapping {

    @Element(required = false)
    private String inputObject;

    @Element(required = false)
    private String outputObject;

    @ElementList(inline = true, entry = "mappingFields", required = false)
    private List<MappingField> mappingFields;

    @Attribute(name = "nil", required = false)
    private Boolean isNil;
}
