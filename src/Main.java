
import java.util.ArrayList;
import java.util.List;

public class Main {
    public final static int FIELD_SIZE = 100;
    //final static int FIGURES_QUANTITY = 10;
    final static int MAX_FIGURES_QUANTITY = 40;

    static List<Figure> Figures = new ArrayList<>();
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
        int temp =(int) (Math.random()*MAX_FIGURES_QUANTITY);
        for(int i = 0; i < temp; i++)
        {
            createRandFig();
        }
        for(Figure fig:Figures){
            System.out.println(fig +"  \t square = " + (int)fig.square + " \tcolor = " + fig.color.name);
        }
        System.out.println("\nCreated " + Figures.size() +" figures");

    }
}
