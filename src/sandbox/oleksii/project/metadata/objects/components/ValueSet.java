package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class ValueSet {

    @Element(required = false)
    private String valueSetName;

    @Element(required = false)
    private ValueSetDefinition valueSetDefinition;

    @Element(required = false)
    private String controllingField;

    @Element(required = false, name = "restricted")
    private Boolean isRestricted;

    @ElementList(required = false, inline = true)
    private List<ValueSettings> valueSettings;
}
