package patternComposite.fileSystem;

import java.util.Collections;
import java.util.Iterator;

public class File extends FSComponent {
    String data;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("file: " + name);
    }

    @Override
    public String getData() {
        return data;
    }

    @Override
    public Iterator<FSComponent> createIterator() {
        return Collections.emptyIterator();
    }
}
