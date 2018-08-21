package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class ValueSetting {

    @ElementList(inline = true, entry = "controllingFieldValue")
    private List<String> controllingFieldValue;

    @Element
    private String valueName;
}
