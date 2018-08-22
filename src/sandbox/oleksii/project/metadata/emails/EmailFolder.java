package sandbox.oleksii.project.metadata.emails;

import sandbox.oleksii.project.core.folders.FolderWithMeta;

import java.io.File;
import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
public class EmailFolder extends FolderWithMeta {

    public static final String CLASS_EXTENSION = ".email";

    public EmailFolder(String path) {
        super(path);
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new EmailMetadata(fileName));
            }
        }
    }

    @Override
    protected EmailFolderXmlMeta readRelatedMetaFile() {
        return new EmailFolderXmlMeta(this.getPath() + EmailFolderXmlMeta.META_XML_EXTENSION);
    }
}
