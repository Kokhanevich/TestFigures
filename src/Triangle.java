import java.util.Random;

public class Triangle implements Figure {
    private int side1;
    private int side2;

    public Triangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {

    }

    @Override
    public Colors getColor() {
        int col=  new Random().nextInt(Colors.values().length);
        return Colors.values()[col];
    }

    @Override
    public double getArea() {
        return 0.5*side1*side2;
    }
    public double getHypotenyze(){
        return Math.sqrt(side1*side1+side2*side2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + getArea() +
                ", hypotenyze=" + getHypotenyze() +
                ", color=" + getColor() +
                '}';
    }
}
