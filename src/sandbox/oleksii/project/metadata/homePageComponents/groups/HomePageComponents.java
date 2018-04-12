package sandbox.oleksii.project.metadata.homePageComponents.groups;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class HomePageComponents extends Folder {

    public static final String CLASS_EXTENSION = ".homePageComponent";

    public HomePageComponents(String rootPath) {
        super(rootPath + "/homePageComponents");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new HomePageComponentsMetadata(fileName));
            }
        }
    }

    @Override
    public List<HomePageComponentsMetadata> getMetadata() {
        return (List<HomePageComponentsMetadata>) super.getMetadata();
    }
}
