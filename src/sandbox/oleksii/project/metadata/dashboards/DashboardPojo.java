package sandbox.oleksii.project.metadata.dashboards;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.dashboards.components.*;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
@Root(name="Dashboard")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class DashboardPojo extends XmlPojoEntity {

    @Element
    private String backgroundEndColor;

    @Element
    private String backgroundFadeDirection;

    @Element
    private String backgroundStartColor;

    @Element
    private String dashboardType;

    @Element
    private String isGridLayout;

    @Element
    private LeftSection leftSection;

    @Element(required = false)
    private MiddleSection middleSection;

    @Element
    private RightSection rightSection;

    @Element
    private String runningUser;

    @Element
    private String textColor;

    @Element
    private String title;

    @Element
    private String titleColor;

    @Element
    private String titleSize;

    @Element(required = false)
    private String description;

    @ElementList(inline = true, entry = "dashboardFilters", required = false)
    private List<DashboardFilter> dashboardFilters;
}
