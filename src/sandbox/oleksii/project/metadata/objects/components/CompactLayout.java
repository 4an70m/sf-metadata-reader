package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class CompactLayout {

    @Element
    private String fullName;

    @ElementList(inline = true, entry = "fields")
    private List<String> fields;

    @Element
    private String label;
}
