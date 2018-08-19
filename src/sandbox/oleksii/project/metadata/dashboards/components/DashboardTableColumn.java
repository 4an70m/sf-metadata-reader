package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class DashboardTableColumn {

    @Element(required = false)
    private Boolean calculatePercent;

    @Element
    private String column;

    @Element(required = false)
    private Integer decimalPlaces;

    @Element(required = false)
    private String sortBy;

    @Element(required = false)
    private Boolean showTotal;

    @Element(required = false)
    private String aggregateType;
}