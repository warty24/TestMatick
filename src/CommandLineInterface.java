import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineInterface {
    Scanner scan = new Scanner(System.in);
    int figSize, figQantity, temp, selectedFig, val1, val2;
    static List<Figure> Figures = new ArrayList<>();

    CommandLineInterface() {
        System.out.println("Enter figures figure maximal size(mor than 2),!!! very large figures may display incorrect!!!");
        do {
            figSize = scan.nextInt();
            if(figSize < 2){
                System.out.println("invalid input, try again");
            }
        }
        while (figSize < 2);
        System.out.println("Enter figures maximal quantity");
        figQantity = scan.nextInt();

        /// figures creation

        temp =(int) (Math.random()*figQantity);
        for(int i = 0; i < temp; i++)
        {
            Main.createRandFig(figSize);
        }
        for(Figure fig:Figures){
            System.out.println(Figures.indexOf(fig) +". "+ fig.getClass() +"\t square = " + (int)fig.square + " parrots^2 "+ "  \t" + fig.uniqueMethod() );//"   \tcolor = " + fig.color.name);
        }
        temp = -1;
        selectedFig = 0;
        while (temp != 0)
        {
            System.out.println("\nselected figure is "+ selectedFig);
            System.out.println("Choose action\n");
            System.out.println("1. Print all figures list");
            System.out.println("2. Print few figures list"); //!finished
            System.out.println("3. Select the figure");
            System.out.println("4. Print selected figure");
            System.out.println();
            System.out.println("0. exit");

            temp = scan.nextInt();
            switch (temp)
            {
                default:
                    temp = -1;
                case 1:
                    for(Figure fig:Figures){
                    System.out.println(Figures.indexOf(fig) +". "+ fig.getClass() +"\t square = " + (int)fig.square + " parrots^2 "+ "  \t" + fig.uniqueMethod() );//"   \tcolor = " + fig.color.name);
                        break;
                }
                case 2:
                    System.out.println("Enter start index");
                    val1 = scan.nextInt();
                    System.out.println("Enter last index");
                    val2 = scan.nextInt();
                    for(Figure fig:Figures){
                        if(Figures.indexOf(fig) >= val1 & Figures.indexOf(fig) <= val2) {
                            System.out.println(Figures.indexOf(fig) + ". " + fig.getClass() + "\t square = " + (int) fig.square + " parrots^2 " + "  \t" + fig.uniqueMethod());//"   \tcolor = " + fig.color.name);
                        }
                        }
                    break;
                case 3:
                    System.out.println("Enter the index");
                    selectedFig = scan.nextInt();
                    break;
                case 4:
                    Figures.get(selectedFig).printFigure();
            }
        }
        System.out.println("\nCreated " + Figures.size() +" figures");

    }
}
