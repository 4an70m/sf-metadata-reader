package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DashboardFilterOption {

    @Element
    private String operator;

    @Element(required = false)
    private String values;
}
