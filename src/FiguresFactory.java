import java.util.Random;

public class FiguresFactory {
    public static Figure [] generateFigure(){
        int radnumber = 1+(int)(Math.random()*6);
        Figure [] array= new Figure[radnumber];
        Figure figure;
        figure = null;
        for (int i=0; i<radnumber; i++){
            int randomnumber=0+(int)(Math.random()*3);
            switch (randomnumber){
                case 0:
                    figure= new Circle(1+(double)(Math.random()*50));
                    break;
                case 1:
                    figure= new Square(1+(double)(Math.random()*50));
                    break;
                case 2:
                    figure= new Triangle(1+(int) (Math.random()*50),1+(int) (Math.random()*50));
                    break;
                case 3:
                    figure= new Trapeze(1+(int) (Math.random()*5),6+(int) (Math.random()*50),1+(int) (Math.random()*50));
            }
            array[i]=figure;
        }
        return array;

    }
}
