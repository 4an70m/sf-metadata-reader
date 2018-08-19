package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class ValueSetDefinition {

    @Element(name = "sorted")
    private Boolean isSorted;

    @ElementList(inline = true)
    private List<Value> value;

}
