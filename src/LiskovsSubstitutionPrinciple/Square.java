package LiskovsSubstitutionPrinciple;

public class Square extends Shape {

    private Point point;
    private int length;

    public Square() {
        super(ShapeType.Square);
    }

    public void draw(){
        System.out.println("drawing a square");
    }

}
