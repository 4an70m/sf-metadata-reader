package sandbox.oleksii.project.metadata.dashboards.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Text;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class Component {

    @Element
    private Boolean autoselectColumnsFromReport;

    @Element(required = false)
    private String chartAxisRange;

    @ElementList(inline = true, required = false, entry = "chartSummary")
    private List<ChartSummary> chartSummaries;

    @Element
    private String componentType;

    @ElementList(inline = true, entry = "dashboardTableColumn", required = false)
    private List<DashboardTableColumn> dashboardTableColumns;

    @ElementList(entry = "dashboardFilterColumns", required = false, name = "dashboardFilterColumns", inline = true)
    private List<DashboardFilterColumn> dashboardFilterColumns;

    @Element(required = false)
    private String displayUnits;

    @Element(required = false)
    private String drillDownUrl;

    @Element(required = false, name = "drillEnabled")
    private Boolean isDrillEnabled;

    @Element(required = false, name = "drillToDetailEnabled")
    private Boolean isDrillToDetailEnabled;

    @Element(required = false)
    private Boolean enableHover;

    @Element(required = false)
    private Boolean expandOthers;

    @Element(required = false)
    private String legendPosition;

    @ElementList(inline = true, required = false, name = "groupingColumn", entry = "groupingColumn")
    private List<String> groupingColumns;

    @Element(required = false)
    private String footer;

    @Element(required = false)
    private String header;

    @Element(required = false)
    private Integer maxValuesDisplayed;

    @Element(required = false)
    private String metricLabel;

    @Element(required = false)
    private Double gaugeMax;

    @Element(required = false)
    private Double gaugeMin;

    @Element(required = false)
    private Double indicatorBreakpoint1;

    @Element(required = false)
    private Double indicatorBreakpoint2;

    @Element(required = false)
    private String indicatorHighColor;

    @Element(required = false)
    private String indicatorLowColor;

    @Element(required = false)
    private String indicatorMiddleColor;

    @Element(required = false)
    private String report;

    @Element(required = false)
    private Boolean showTotal;

    @Element(required = false)
    private Boolean showPicturesOnTables;

    @Element(required = false)
    private Boolean showPicturesOnCharts;

    @Element(required = false)
    private Boolean showPercentage;

    @Element(required = false)
    private Boolean showValues;

    @Element(required = false)
    private String sortBy;

    @Element(required = false)
    private String title;

    @Element(required = false)
    private Boolean useReportChart;
}
