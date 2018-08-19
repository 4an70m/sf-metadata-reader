package sandbox.oleksii.project.metadata.triggers;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class Triggers extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".trigger";

    public Triggers(String rootPath) {
        super(rootPath + "/triggers");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new TriggerMetadata(fileName));
            }
        }
    }

    @Override
    public List<TriggerMetadata> getMetadata() {
        return (List<TriggerMetadata>) super.getMetadata();
    }
}
