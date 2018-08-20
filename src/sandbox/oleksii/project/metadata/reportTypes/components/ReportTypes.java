package sandbox.oleksii.project.metadata.reportTypes.components;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 20.08.2018.
 */
public class ReportTypes extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".reportType";

    public ReportTypes(String rootPath) {
        super(rootPath + "/reportTypes");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ReportTypeMetadata(fileName));
            }
        }
    }

    @Override
    public List<ReportTypeMetadata> getMetadata() {
        return (List<ReportTypeMetadata>) super.getMetadata();
    }
}

