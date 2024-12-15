package patternAdapter;
import patternAdapter.classB.IClassB;
import patternAdapter.classA.IClassA;

public class AdapterBToA implements IClassA {

    private final IClassB classB;

    public AdapterBToA(IClassB classB) {
        this.classB = classB;
    }

    @Override
    public void classAPrint() {
        this.classB.classBPrint();
    }
}
