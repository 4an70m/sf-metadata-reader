package sandbox.oleksii.project.metadata.objectTranslations;

import sandbox.oleksii.project.core.folders.MetadataFolder;
import sandbox.oleksii.project.metadata.objectTranslations.ObjectTranslationMetadata;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class ObjectTranslations extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".objectTranslation";

    public ObjectTranslations(String rootPath) {
        super(rootPath + "/objectTranslations");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ObjectTranslationMetadata(fileName));
            }
        }
    }

    @Override
    public List<ObjectTranslationMetadata> getMetadata() {
        return (List<ObjectTranslationMetadata>) super.getMetadata();
    }
}
