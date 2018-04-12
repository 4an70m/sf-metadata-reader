package sandbox.oleksii.project.metadata.objects.components;

import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by User on 06.01.2018.
 */
public class ArticleTypeChannelDisplay {

    @ElementList(inline = true, entry = "articleTypeTemplates")
    private List<ArticleTypeTemplates> articleTypeTemplates;

}
