import java.util.Random;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
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
         return  Math.PI*this.radius*this.radius;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + getArea() +
                ", radius=" + getRadius() +
                ", color=" + getColor() +
                '}';
    }
}

