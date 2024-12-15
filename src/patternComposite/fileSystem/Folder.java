package patternComposite.fileSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Folder extends FSComponent {
    ArrayList<FSComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void remove(FSComponent component) {
        components.remove(component);
    }

    @Override
    public void add(FSComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("folder: " + name);
        for (FSComponent component : components) {
            component.print();
        }
    }

    @Override
    public Iterator<FSComponent> createIterator() {
        return new CompositeIterator(components.iterator());
    }
}
