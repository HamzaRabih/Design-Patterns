import file.system.File;
import file.system.Folder;

public class Test {
    public static void main(String[] args) {

        Folder root = new Folder("root");
        root.addChild(new File("pom.xml"));
        root.addChild(new File(".git"));
        Folder src=(Folder) root.addChild(new Folder("src"));
        src.addChild(new File("README.md"));
        src.addChild(new Folder("Java"));
        src.addChild(new Folder("Test"));

        root.print();

    }
}
