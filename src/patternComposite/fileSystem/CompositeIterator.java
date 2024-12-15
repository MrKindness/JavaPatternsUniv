package patternComposite.fileSystem;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<FSComponent> {
    Stack<Iterator<FSComponent>> iterators = new Stack<>();

    public CompositeIterator(Iterator<FSComponent> iterator) {
        iterators.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (iterators.isEmpty())
            return false;

        if (iterators.peek().hasNext())
            return true;
        else {
            iterators.pop();
            return hasNext();
        }
    }

    @Override
    public FSComponent next() {
        if (hasNext()) {
            Iterator<FSComponent> temp = iterators.peek();
            FSComponent component = temp.next();
            iterators.push(component.createIterator());
            return component;
        } else
            return null;
    }
}
