package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class LookupFilter {

    @Element
    private Boolean active;

    @ElementList(inline = true, entry = "filterItems")
    private List<FilterItem> filterItems;

    @Element
    private String infoMessage;

    @Element
    private Boolean isOptional;



}
