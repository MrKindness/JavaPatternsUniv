package patternBridge;

import patternBridge.colors.BlueColor;
import patternBridge.colors.GreenColor;
import patternBridge.colors.RedColor;
import patternBridge.figures.Circle;
import patternBridge.figures.Figure;
import patternBridge.figures.Rectangle;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(new BlueColor());
        circle.showFigure();
        circle.setColor(new RedColor());
        circle.showFigure();

        Figure rectangle = new Rectangle(new GreenColor());
        rectangle.showFigure();
        rectangle.setColor(new BlueColor());
        rectangle.showFigure();
    }
}