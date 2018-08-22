package sandbox.oleksii.project.metadata.flowDefinitions;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by User on 23.08.2018.
 */
public class FlowDefinitions extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".flowDefinition";

    public FlowDefinitions(String rootPath) {
        super(rootPath + "/flowDefinitions");
    }

    @Override
    public List<FlowDefinitionMetadata> getMetadata() {
        return (List<FlowDefinitionMetadata>) super.getMetadata();
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new FlowDefinitionMetadata(fileName));
            }
        }
    }
}