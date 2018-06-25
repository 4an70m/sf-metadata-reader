package sandbox.oleksii.project.metadata.standardValueSetTranslations;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class StandardValueSetTranslations extends Folder {

    public static final String CLASS_EXTENSION = ".standardValueSetTranslation";

    public StandardValueSetTranslations(String rootPath) {
        super(rootPath + "/standardValueSetTranslations");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new StandardValueSetTranslationsMetadata(fileName));
            }
        }
    }

    @Override
    public List<StandardValueSetTranslationsMetadata> getMetadata() {
        return (List<StandardValueSetTranslationsMetadata>) super.getMetadata();
    }
}
