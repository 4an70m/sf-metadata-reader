package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;


/**
 * Created by User on 05.01.2018.
 */
public class Fields {

    @Element
    private String fullName;

    @Element(required = false, name = "caseSensitive")
    private Boolean isCaseSensitive;

    @Element(required = false, name = "externalId")
    private Boolean isExternalId;

    @Element(required = false)
    private String fieldManageability;

    @Element(required = false)
    private String formula;

    @Element(required = false)
    private Boolean formulaTreatBlanksAs;

    @Element(required = false)
    private String label;

    @Element(required = false)
    private LookupFilter lookupFilter;

    @Element(required = false)
    private String referenceTo;

    @Element(required = false)
    private String relationshipLabel;

    @Element(required = false)
    private String relationshipName;

    @Element(required = false)
    private String relationshipOrder;

    @Element(required = false, name = "reparentableMasterDetail")
    private Boolean isReparentableMasterDetail;

    @Element(required = false)
    private Integer precision;

    @Element(required = false)
    private Integer scale;

    @ElementList(required = false, inline = true)
    private List<SummaryFilterItems> summaryFilterItems;

    @Element(required = false)
    private String summarizedField;

    @Element(required = false)
    private String summaryForeignKey;

    @Element(required = false)
    private String summaryOperation;

    @Element(required = false)
    private Integer length;

    @Element(required = false, name = "required")
    private Boolean isRequired;

    @Element(required = false, name = "restrictedAdminField")
    private Boolean isRestrictedAdminField;

    @Element(required = false)
    private String trackFeedHistory;

    @Element(required = false)
    private Boolean trackHistory;

    @Element(required = false)
    private Boolean trackTrending;

    @Element(required = false)
    private String type;

    @Element(required = false, name = "unique")
    private Boolean isUnique;

    @Element(required = false)
    private ValueSet valueSet;

    @Element(required = false)
    private String inlineHelpText;

    @Element(required = false)
    private Integer visibleLines;

    @Element(required = false)
    private String description;

    @Element(required = false, name = "defaultValue")
    private Boolean isDefaultValue;

    @Element(required = false)
    private Boolean displayLocationInDecimal;

    @Element(required = false)
    private String deleteConstraint;

    @Element(required = false)
    private Boolean writeRequiresMasterRead;

    @Element(required = false, name = "deprecated")
    private Boolean isDeprecated;

    @Element(required = false)
    private String maskChar;

    @Element(required = false)
    private String maskType;

    @Element(required = false)
    private String displayFormat;
}