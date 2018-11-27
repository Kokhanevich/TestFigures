import java.util.Random;

public class Trapeze implements Figure {
    private int upSide;
    private int downSide;
    private int sideSide;

    public Trapeze(int upSide, int downSide, int sideSide) {
        this.upSide = upSide;
        this.downSide = downSide;
        this.sideSide = sideSide;
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
        return 0.5*upSide*downSide*Math.sqrt(sideSide*sideSide-((downSide-upSide)*(downSide-upSide))/4);
    }

    public double getHeight(){
        return Math.sqrt(sideSide*sideSide-((downSide-upSide)*(downSide-upSide))/4);
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                ", area" + getArea() +
                ", height" + getHeight() +
                ", color" + getColor() +
                '}';
    }
}
