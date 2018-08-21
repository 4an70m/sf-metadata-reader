package sandbox.oleksii.project.metadata.reportTypes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.reportTypes.components.Join;
import sandbox.oleksii.project.metadata.reportTypes.components.Section;

import java.util.List;

/**
 * Created by User on 20.08.2018.
 */
@Root(name="ReportType")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ReportTypePojo extends XmlPojoEntity {

    @Element
    private String baseObject;

    @Element
    private String category;

    @Element(name = "deployed")
    private Boolean isDeployed;

    @Element(required = true)
    private String description;

    @Element(required = false)
    private Join join;

    @Element
    private String label;

    @ElementList(inline = true, required = false, entry = "sections")
    private List<Section> sections;
}
