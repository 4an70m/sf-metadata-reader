package sandbox.oleksii.project.metadata.labels;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.labels.components.Label;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomLabels")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class LabelsPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "labels")
    private List<Label> labels;
}