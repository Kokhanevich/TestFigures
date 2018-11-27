public class Main {
    public static void main(String[] args) {
        Figure[]arr= FiguresFactory.generateFigure();
        for (Figure v : arr)
            System.out.println(v);
    }
}
