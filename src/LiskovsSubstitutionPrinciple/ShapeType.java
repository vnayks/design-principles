package LiskovsSubstitutionPrinciple;

public enum ShapeType {

    Square("Square"),
    Circle("Circle");

    private String shapeType;

    ShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeType(){
        return this.shapeType;
    }
}
