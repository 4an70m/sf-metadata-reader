package sandbox.oleksii.project.metadata.groups;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="Group")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class GroupPojo extends XmlPojoEntity {

    @Element
    private Boolean doesIncludeBosses;

    @Element
    private String name;

    @Override
    public String toString() {
        return "GroupsPojo{" +
                "doesIncludeBosses=" + doesIncludeBosses +
                ", name='" + name + '\'' +
                '}';
    }
}
