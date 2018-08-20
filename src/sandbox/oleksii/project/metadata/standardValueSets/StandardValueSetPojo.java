package sandbox.oleksii.project.metadata.standardValueSets;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.standardValueSets.components.StandardValue;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="StandardValueSet")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class StandardValueSetPojo extends XmlPojoEntity {

    @Element(required = false, name = "sorted")
    private Boolean isSorted;

    @ElementList(inline = true, required = false, entry = "standardValue")
    private List<StandardValue> standardValue;
}