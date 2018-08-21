package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class ListView {

    @Element
    public String fullName;

    @ElementList(inline = true, required = false, entry = "columns")
    public List<String> columns;

    @Element(required = false)
    private String filterScope;

    @ElementList(inline = true, required = false)
    private List<Filter> filters;

    @Element
    private String label;

    @Element(required = false)
    private String queue;

    @Element(required = false)
    private SharedTo sharedTo;

    @Element(required = false)
    private String language;

    @Element(required = false)
    private String booleanFilter;
}
