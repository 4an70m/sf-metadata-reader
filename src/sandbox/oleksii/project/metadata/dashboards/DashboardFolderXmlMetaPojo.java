package sandbox.oleksii.project.metadata.dashboards;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.dashboards.components.FolderShare;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
@Root(name = "DashboardFolder")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class DashboardFolderXmlMetaPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "folderShares", required = false)
    private List<FolderShare> folderShares;

    @Element
    private String name;
}