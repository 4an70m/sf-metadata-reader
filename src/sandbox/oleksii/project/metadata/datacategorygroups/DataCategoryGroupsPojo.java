package sandbox.oleksii.project.metadata.datacategorygroups;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.datacategorygroups.components.DataCategory;

import java.util.ArrayList;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="DataCategoryGroup")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class DataCategoryGroupsPojo extends XmlPojoEntity {

    @Element
    private Boolean active;

    @Element
    private DataCategory dataCategory;

    @Element
    private String description;

    @Element
    private String label;

    @ElementList(entry = "object")
    private ArrayList<String> objectUsage;

    @Override
    public String toString() {
        return "DataCategoryGroupsPojo{" +
                "active=" + active +
                ", dataCategory=" + dataCategory +
                ", description='" + description + '\'' +
                ", label='" + label + '\'' +
                ", objectUsage=" + objectUsage +
                '}';
    }
}