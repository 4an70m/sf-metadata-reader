package sandbox.oleksii.project.metadata.quickActions;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 21.08.2018.
 */
public class QuickActions extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".quickAction";

    public QuickActions(String rootPath) {
        super(rootPath + "/quickActions");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new QuickActionMetadata(fileName));
            }
        }
    }

    @Override
    public List<QuickActionMetadata> getMetadata() {
        return (List<QuickActionMetadata>) super.getMetadata();
    }
}
