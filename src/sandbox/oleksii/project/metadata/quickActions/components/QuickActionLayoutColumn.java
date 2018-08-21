package sandbox.oleksii.project.metadata.quickActions.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
public class QuickActionLayoutColumn {

    @ElementList(inline = true, entry = "quickActionLayoutItems", required = false)
    List<QuickActionLayoutItem> quickActionLayoutItems;

}
