package patternBridge.figures;

import patternBridge.colors.IColor;

public class Rectangle extends Figure {
    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    public void showFigure() {
        System.out.println(this.color.getColor() + " rectangle");
    }
}
