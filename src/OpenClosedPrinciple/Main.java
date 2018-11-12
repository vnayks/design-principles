package OpenClosedPrinciple;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    public void drawAllShapes(List<Shape> shapes) {

        shapes.forEach(shape -> shape.draw());
    }
}
