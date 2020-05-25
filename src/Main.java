
import java.util.ArrayList;

public class Main {
    public final static int FIELD_SIZE = 100;
    static ArrayList Figures = new ArrayList();
    static void createRandFig() {
        int t = (int) Math.random() * 4;
        switch (t) {
            case 0:
                Figures.add(new Square());
            case 1:
                Figures.add(new Triangle());
            case 2:
                Figures.add(new Circle());
            case 3:
                Figures.add(new Trapeze());
        }
    }
    public static void main(String[] args) {

        createRandFig();

    }
}
