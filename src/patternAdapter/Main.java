package patternAdapter;

import patternAdapter.classA.ClassA;
import patternAdapter.classA.IClassA;
import patternAdapter.classB.ClassB;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IClassA> aList = List.of(
                new ClassA(),
                new AdapterBToA(new ClassB())
        );

        for (IClassA a : aList) {
            a.classAPrint();
        }
    }
}