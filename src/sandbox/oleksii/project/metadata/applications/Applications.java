package sandbox.oleksii.project.metadata.applications;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Applications extends Folder {

    public static final String CLASS_EXTENSION = ".app";

    public Applications(String rootPath) {
        super(rootPath + "/applications");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ApplicationsMetadata(fileName));
            }
        }
    }

    @Override
    public List<ApplicationsMetadata> getMetadata() {
        return (List<ApplicationsMetadata>) super.getMetadata();
    }
}
