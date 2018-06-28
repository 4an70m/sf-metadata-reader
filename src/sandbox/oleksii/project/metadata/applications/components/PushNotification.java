package sandbox.oleksii.project.metadata.applications.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
public class PushNotification {

    @ElementList(inline = true, entry = "fieldNames")
    private List<String> fieldNames;

    @Element
    private String objectName;
}
