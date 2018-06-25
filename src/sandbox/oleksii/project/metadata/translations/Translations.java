package sandbox.oleksii.project.metadata.translations;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Translations extends Folder {

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
                this.metadata.add(new TranslationsMetadata(fileName));
            }
        }
    }

    @Override
    public List<TranslationsMetadata> getMetadata() {
        return (List<TranslationsMetadata>) super.getMetadata();
    }
}
