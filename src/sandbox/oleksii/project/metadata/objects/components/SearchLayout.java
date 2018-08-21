package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class SearchLayout {

    @ElementList(required = false, inline = true, entry = "customTabListAdditionalFields")
    private List<String> customTabListAdditionalFields;

    @ElementList(required = false, inline = true, entry = "lookupDialogsAdditionalFields")
    private List<String> lookupDialogsAdditionalFields;

    @ElementList(required = false, inline = true, entry = "lookupPhoneDialogsAdditionalFields")
    private List<String> lookupPhoneDialogsAdditionalFields;

    @ElementList(required = false, inline = true, entry = "searchFilterFields")
    private List<String> searchFilterFields;

    @ElementList(required = false, inline = true, entry = "searchResultsAdditionalFields")
    private List<String> searchResultsAdditionalFields;

    @ElementList(required = false, inline = true, entry = "excludedStandardButtons")
    private List<String> excludedStandardButtons;

    @ElementList(required = false, inline = true, entry = "listViewButtons")
    private List<String> listViewButtons;
}
