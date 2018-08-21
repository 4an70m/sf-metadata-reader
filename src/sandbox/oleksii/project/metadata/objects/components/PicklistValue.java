package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class PicklistValue {

    @Element
    private String picklist;

    @ElementList(inline = true, entry = "values")
    private List<Value> values;
}
