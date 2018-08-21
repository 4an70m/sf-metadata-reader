package sandbox.oleksii.project.metadata.objectTranslations.component;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
public class Field {

    @Element(required = false)
    private String help;

    @Element(required = false)
    private String label;

    @ElementList(inline = true, entry = "lookupFilter", required = false)
    private List<LookupFilter> lookupFilter;

    @Element
    private String name;

    @Element(required = false)
    private String relationshipLabel;

    @ElementList(inline = true, entry = "picklistValues", required = false)
    private List<PicklistValue> picklistValues;
}
