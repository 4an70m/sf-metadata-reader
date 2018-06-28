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

    @Element(required = false)
    private Boolean caseSensitive;

    @Element(required = false)
    private Boolean externalId;

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

    @Element(required = false)
    private Boolean reparentableMasterDetail;

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

    @Element(required = false)
    private Boolean required;

    @Element(required = false)
    private Boolean restrictedAdminField;

    @Element(required = false)
    private String trackFeedHistory;

    @Element(required = false)
    private Boolean trackHistory;

    @Element(required = false)
    private Boolean trackTrending;

    @Element(required = false)
    private String type;

    @Element(required = false)
    private Boolean unique;

    @Element(required = false)
    private ValueSet valueSet;

    @Element(required = false)
    private String inlineHelpText;

    @Element(required = false)
    private Integer visibleLines;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private Boolean defaultValue;

    @Element(required = false)
    private Boolean displayLocationInDecimal;

    @Element(required = false)
    private String deleteConstraint;

    @Element(required = false)
    private Boolean writeRequiresMasterRead;

    @Element(required = false)
    private Boolean deprecated;

    @Element(required = false)
    private String maskChar;

    @Element(required = false)
    private String maskType;

    @Element(required = false)
    private String displayFormat;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public Boolean getExternalId() {
        return externalId;
    }

    public void setExternalId(Boolean externalId) {
        this.externalId = externalId;
    }

    public String getFieldManageability() {
        return fieldManageability;
    }

    public void setFieldManageability(String fieldManageability) {
        this.fieldManageability = fieldManageability;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Boolean getFormulaTreatBlanksAs() {
        return formulaTreatBlanksAs;
    }

    public void setFormulaTreatBlanksAs(Boolean formulaTreatBlanksAs) {
        this.formulaTreatBlanksAs = formulaTreatBlanksAs;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LookupFilter getLookupFilter() {
        return lookupFilter;
    }

    public void setLookupFilter(LookupFilter lookupFilter) {
        this.lookupFilter = lookupFilter;
    }

    public String getReferenceTo() {
        return referenceTo;
    }

    public void setReferenceTo(String referenceTo) {
        this.referenceTo = referenceTo;
    }

    public String getRelationshipLabel() {
        return relationshipLabel;
    }

    public void setRelationshipLabel(String relationshipLabel) {
        this.relationshipLabel = relationshipLabel;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public String getRelationshipOrder() {
        return relationshipOrder;
    }

    public void setRelationshipOrder(String relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }

    public Boolean getReparentableMasterDetail() {
        return reparentableMasterDetail;
    }

    public void setReparentableMasterDetail(Boolean reparentableMasterDetail) {
        this.reparentableMasterDetail = reparentableMasterDetail;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public List<SummaryFilterItems> getSummaryFilterItems() {
        return summaryFilterItems;
    }

    public void setSummaryFilterItems(List<SummaryFilterItems> summaryFilterItems) {
        this.summaryFilterItems = summaryFilterItems;
    }

    public String getSummarizedField() {
        return summarizedField;
    }

    public void setSummarizedField(String summarizedField) {
        this.summarizedField = summarizedField;
    }

    public String getSummaryForeignKey() {
        return summaryForeignKey;
    }

    public void setSummaryForeignKey(String summaryForeignKey) {
        this.summaryForeignKey = summaryForeignKey;
    }

    public String getSummaryOperation() {
        return summaryOperation;
    }

    public void setSummaryOperation(String summaryOperation) {
        this.summaryOperation = summaryOperation;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getTrackFeedHistory() {
        return trackFeedHistory;
    }

    public void setTrackFeedHistory(String trackFeedHistory) {
        this.trackFeedHistory = trackFeedHistory;
    }

    public Boolean getTrackHistory() {
        return trackHistory;
    }

    public void setTrackHistory(Boolean trackHistory) {
        this.trackHistory = trackHistory;
    }

    public Boolean getTrackTrending() {
        return trackTrending;
    }

    public void setTrackTrending(Boolean trackTrending) {
        this.trackTrending = trackTrending;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public ValueSet getValueSet() {
        return valueSet;
    }

    public void setValueSet(ValueSet valueSet) {
        this.valueSet = valueSet;
    }

    public String getInlineHelpText() {
        return inlineHelpText;
    }

    public void setInlineHelpText(String inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }

    public Integer getVisibleLines() {
        return visibleLines;
    }

    public void setVisibleLines(Integer visibleLines) {
        this.visibleLines = visibleLines;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getDisplayLocationInDecimal() {
        return displayLocationInDecimal;
    }

    public void setDisplayLocationInDecimal(Boolean displayLocationInDecimal) {
        this.displayLocationInDecimal = displayLocationInDecimal;
    }

    public String getDeleteConstraint() {
        return deleteConstraint;
    }

    public void setDeleteConstraint(String deleteConstraint) {
        this.deleteConstraint = deleteConstraint;
    }

    public Boolean getWriteRequiresMasterRead() {
        return writeRequiresMasterRead;
    }

    public void setWriteRequiresMasterRead(Boolean writeRequiresMasterRead) {
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getMaskChar() {
        return maskChar;
    }

    public void setMaskChar(String maskChar) {
        this.maskChar = maskChar;
    }

    public String getMaskType() {
        return maskType;
    }

    public void setMaskType(String maskType) {
        this.maskType = maskType;
    }

    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "fullName='" + fullName + '\'' +
                ", caseSensitive=" + caseSensitive +
                ", externalId=" + externalId +
                ", fieldManageability='" + fieldManageability + '\'' +
                ", formula='" + formula + '\'' +
                ", formulaTreatBlanksAs=" + formulaTreatBlanksAs +
                ", label='" + label + '\'' +
                ", lookupFilter=" + lookupFilter +
                ", referenceTo='" + referenceTo + '\'' +
                ", relationshipLabel='" + relationshipLabel + '\'' +
                ", relationshipName='" + relationshipName + '\'' +
                ", relationshipOrder='" + relationshipOrder + '\'' +
                ", reparentableMasterDetail=" + reparentableMasterDetail +
                ", precision=" + precision +
                ", scale=" + scale +
                ", summaryFilterItems=" + summaryFilterItems +
                ", summarizedField='" + summarizedField + '\'' +
                ", summaryForeignKey='" + summaryForeignKey + '\'' +
                ", summaryOperation='" + summaryOperation + '\'' +
                ", length=" + length +
                ", required=" + required +
                ", trackFeedHistory='" + trackFeedHistory + '\'' +
                ", trackHistory=" + trackHistory +
                ", trackTrending=" + trackTrending +
                ", type='" + type + '\'' +
                ", unique=" + unique +
                ", valueSet=" + valueSet +
                ", inlineHelpText='" + inlineHelpText + '\'' +
                ", visibleLines=" + visibleLines +
                ", description='" + description + '\'' +
                ", defaultValue=" + defaultValue +
                ", displayLocationInDecimal=" + displayLocationInDecimal +
                ", deleteConstraint='" + deleteConstraint + '\'' +
                ", writeRequiresMasterRead=" + writeRequiresMasterRead +
                ", deprecated=" + deprecated +
                ", maskChar='" + maskChar + '\'' +
                ", maskType='" + maskType + '\'' +
                ", displayFormat='" + displayFormat + '\'' +
                '}';
    }
}
