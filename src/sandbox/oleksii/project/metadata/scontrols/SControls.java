package sandbox.oleksii.project.metadata.scontrols;

import sandbox.oleksii.project.core.folders.MetadataFolder;

import java.util.List;

/**
 * Created by 4an70m on 19.08.2018.
 */
public class SControls extends MetadataFolder {

    public static final String CLASS_EXTENSION = ".scf";

    public SControls(String path) {
        super(path + "/scontrols");
    }

    @Override
    protected void readMetadata() {
        List<String> filePaths = this.getListOfFilePaths();
        for (String fileName : filePaths) {
            if (CLASS_EXTENSION.equals(this.getExtension(fileName))) {
                this.metadata.add(new SControlMetadata(fileName));
            }
        }
    }

    @Override
    public List<SControlMetadata> getMetadata() {return (List<SControlMetadata>) super.getMetadata();}
}