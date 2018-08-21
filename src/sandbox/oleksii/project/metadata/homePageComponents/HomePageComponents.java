package sandbox.oleksii.project.metadata.homePageComponents;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class HomePageComponents extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".homePageComponent";

    public HomePageComponents(String rootPath) {
        super(rootPath + "/homePageComponents");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new HomePageComponentMetadata(fileName));
            }
        }
    }

    @Override
    public List<HomePageComponentMetadata> getMetadata() {
        return (List<HomePageComponentMetadata>) super.getMetadata();
    }
}
