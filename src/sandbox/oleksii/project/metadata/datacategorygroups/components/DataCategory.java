package sandbox.oleksii.project.metadata.datacategorygroups.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 08.01.2018.
 */
public class DataCategory {

    @ElementList(inline = true, required = false, entry = "dataCategory")
    private List<DataCategory> dataCategory;

    @Element
    private String label;

    @Element
    private String name;

}
