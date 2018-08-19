package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DashboardFilter {

    @ElementList(inline = true, entry = "dashboardFilterOptions", required = false)
    private List<DashboardFilterOption> dashboardFilterOptions;

    @Element
    private String name;
}
