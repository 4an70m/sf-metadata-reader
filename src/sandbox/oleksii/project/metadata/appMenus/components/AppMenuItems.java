package sandbox.oleksii.project.metadata.appMenus.components;

import org.simpleframework.xml.Element;

/**
 * Created by User on 06.01.2018.
 */
public class AppMenuItems {

    @Element
    String name;

    @Element
    String type;

    @Override
    public String toString() {
        return "AppMenuItems{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
