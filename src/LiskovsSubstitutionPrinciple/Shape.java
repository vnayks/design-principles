package LiskovsSubstitutionPrinciple;

public class Shape {

    private ShapeType shapeType;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public void drawShape(Shape shape) {
        if (shape.shapeType == ShapeType.Circle) {
            ((Circle) shape).draw();
        }
        if (shape.shapeType == ShapeType.Square) {
            ((Square) shape).draw();
        }
    }
}
