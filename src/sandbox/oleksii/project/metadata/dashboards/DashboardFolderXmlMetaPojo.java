package sandbox.oleksii.project.metadata.dashboards;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.dashboards.components.FolderShare;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DashboardFolderXmlMetaPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "folderShares", required = false)
    private List<FolderShare> folderShares;

    @Element
    private String name;

    @Override
    public String toString() {
        return "DashboardFolderXmlMetaPojo{" +
                "folderShares=" + folderShares +
                ", name='" + name + '\'' +
                '}';
    }
}
