package LiskovsSubstitutionPrinciple;

public class Circle extends  Shape {

    private Point point;
    private double radius;

    public Circle() {
        super(ShapeType.Circle);
    }

    public void draw(){
        System.out.println("drawing circle");
    }
}
