import java.util.Random;

public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
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
        return side*side;
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public String toString() {
        return "Square{" +"area="+getArea()+
                ", side=" + getSide() +
                ", color=" + getColor() +
                '}';
    }
}
