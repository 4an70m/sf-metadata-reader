package sandbox.oleksii.project.metadata.appMenus;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.appMenus.components.AppMenuItems;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="AppMenu")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class AppMenuPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "appMenuItems")
    private List<AppMenuItems> appMenuItems;
}
