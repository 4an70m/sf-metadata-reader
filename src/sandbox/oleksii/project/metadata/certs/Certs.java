package sandbox.oleksii.project.metadata.certs;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
public class Certs extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".crt";

    public Certs(String rootPath) {
        super(rootPath + "/certs");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new CertMetadata(fileName));
            }
        }
    }

    @Override
    public List<CertMetadata> getMetadata() {
        return (List<CertMetadata>) super.getMetadata();
    }
}
