package sandbox.oleksii.project.metadata.classes;

import sandbox.oleksii.project.core.Folder;

import java.util.List;

/**
 * Created by User on 04.01.2018.
 */
public class Classes extends Folder {

    public static final String CLASS_EXTENSION = ".cls";
    public static final String CLASS_META_EXTENSION = "-meta.xml";

    public Classes(String rootPath) {
        super(rootPath + "/classes");
    }

    @Override
    public List<ClassesMetadata> getMetadata() {
        return (List<ClassesMetadata>) super.getMetadata();
    }

    @Override
    protected void readMetadata() {
        List<String> filePathes = this.getListOfFilePathes();
        for (String fileName : filePathes) {
            String extension = this.getExtension(fileName);
            if (CLASS_EXTENSION.equals(extension)) {
                this.metadata.add(new ClassesMetadata(fileName));
            }
        }
    }

}
