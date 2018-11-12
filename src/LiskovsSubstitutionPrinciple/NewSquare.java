package LiskovsSubstitutionPrinciple;

public class NewSquare extends Rectangle {

    private int length;
    private int height;
    private Point point;

    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.height = length;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.length = height;
    }
}
