package patternComposite;

import patternComposite.fileSystem.FSComponent;
import patternComposite.fileSystem.File;
import patternComposite.fileSystem.Folder;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FSComponent folder1 = new Folder("folder1");
        folder1.add(new File("file11"));
        folder1.add(new File("file12"));
        folder1.add(new File("file13"));
        FSComponent folder2 = new Folder("folder2");
        folder2.add(new File("file21"));
        folder2.add(new File("file22"));
        folder2.add(new File("file23"));
        folder1.add(folder2);

        folder1.print();
        System.out.println();
        folder2.print();
        System.out.println();

        Iterator iterator = folder1.createIterator();
        System.out.println(folder1.getName());
        while (iterator.hasNext()) {
            System.out.println(((FSComponent) iterator.next()).getName());
        }
    }
}
