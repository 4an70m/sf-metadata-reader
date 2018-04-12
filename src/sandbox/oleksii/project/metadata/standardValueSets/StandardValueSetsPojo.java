package sandbox.oleksii.project.metadata.standardValueSets;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.standardValueSets.components.StandardValue;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="StandardValueSet")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class StandardValueSetsPojo extends XmlPojoEntity {

    @Element(required = false)
    private Boolean sorted;

    @ElementList(inline = true, required = false, entry = "standardValue")
    private List<StandardValue> standardValue;

    @Override
    public String toString() {
        return "StandardValueSetsPojo{" +
                "sorted=" + sorted +
                ", standardValue=" + standardValue +
                '}';
    }
}
