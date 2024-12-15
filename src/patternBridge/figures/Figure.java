package patternBridge.figures;

import patternBridge.colors.IColor;

public abstract class Figure {
    public IColor color;

    public Figure(IColor color) {
        this.color = color;
    }

    public abstract void showFigure();

    public IColor getColor() {
        return color;
    }

    public void setColor(IColor color) {
        this.color = color;
    }
}
