package patternComposite.fileSystem;

import java.util.Iterator;

public abstract class FSComponent {
    String name;

    public String getName() {
        return name;
    }

    public void remove(FSComponent component) {
        throw new UnsupportedOperationException();
    }

    public void add(FSComponent component) {
        throw new UnsupportedOperationException();
    }

    public String getData() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
