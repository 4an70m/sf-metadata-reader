package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class FolderShare {

    @Element
    public String accessLevel;

    @Element
    public String sharedTo;

    @Element
    public String sharedToType;

    @Override
    public String toString() {
        return "FolderShare{" +
                "accessLevel='" + accessLevel + '\'' +
                ", sharedTo='" + sharedTo + '\'' +
                ", sharedToType='" + sharedToType + '\'' +
                '}';
    }
}
