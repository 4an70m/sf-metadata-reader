package sandbox.oleksii.project.metadata.flowDefinitions;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 23.08.2018.
 */
@Root(name="FlowDefinition")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class FlowDefinitionPojo extends XmlPojoEntity {

    @Element(required = false)
    private Integer activeVersionNumber;
}
