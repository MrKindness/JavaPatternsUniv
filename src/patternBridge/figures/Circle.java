package patternBridge.figures;

import patternBridge.colors.IColor;

public class Circle extends Figure {

    public Circle(IColor color) {
        super(color);
    }

    @Override
    public void showFigure() {
        System.out.println(this.color.getColor() + " circle");
    }
}
