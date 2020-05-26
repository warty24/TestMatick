// fix color
// add interface Drawable
// edit/delete unused overloaded methods/constructors
// add GUI
// add trapeze generation with coordinates
// add methods to print figures to GUI
// generate figures with random rotation

import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int FIELD_SIZE = 100;
    private final static int MAX_FIGURES_QUANTITY = 40;

    private static List<Figure> Figures = new ArrayList<>();
    static void createRandFig() {
        int t = (int) (Math.random() * 4);
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
    static void createRandFig(int figSize) {
        int t = (int) (Math.random() * 4);
        switch (t) {
            case 0:
                CommandLineInterface.Figures.add(new Square(figSize));
                break;
            case 1:
                CommandLineInterface.Figures.add(new Triangle(figSize));
                break;
            case 2:
                CommandLineInterface.Figures.add(new Circle(figSize));
                break;
            case 3:
                CommandLineInterface.Figures.add(new Trapeze(figSize));
        }
    }
    private void generateFigures() {
        int temp =(int) (Math.random()*MAX_FIGURES_QUANTITY);
        for(int i = 0; i < temp; i++)
        {
            createRandFig();
        }
    }
    private void generateFigures(int figSize, int figQantity) {
        for(int i = 0; i < figQantity; i++)
        {
            createRandFig(figSize);
        }
    }
    public static void main(String[] args) {
       CommandLineInterface c = new CommandLineInterface();
/*
        int temp =(int) (Math.random()*MAX_FIGURES_QUANTITY);
        for(int i = 0; i < temp; i++)
        {
            createRandFig();
        }
        for(Figure fig:Figures){
            System.out.println(fig.getClass() +"\t square = " + (int)fig.square + " parrots^2 "+ "  \t" + fig.uniqueMethod()+"   \tcolor = " + fig.color.name);
        }
        System.out.println("\nCreated " + Figures.size() +" figures");
*/
    }
}
