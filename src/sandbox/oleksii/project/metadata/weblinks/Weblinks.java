package sandbox.oleksii.project.metadata.weblinks;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Weblinks extends Folder {

    public static final String CLASS_EXTENSION = ".weblink";

    public Weblinks(String rootPath) {
        super(rootPath + "/weblinks");
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new WeblinksMetadata(fileName));
            }
        }
    }

    @Override
    public List<WeblinksMetadata> getMetadata() {
        return (List<WeblinksMetadata>) super.getMetadata();
    }
}
