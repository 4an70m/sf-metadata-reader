package sandbox.oleksii.project.metadata.translations;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Translations extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".translation";

    public Translations(String rootPath) {
        super(rootPath + "/translations");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new TranslationMetadata(fileName));
            }
        }
    }

    @Override
    public List<TranslationMetadata> getMetadata() {
        return (List<TranslationMetadata>) super.getMetadata();
    }
}
