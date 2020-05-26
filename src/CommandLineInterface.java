import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineInterface {
    Scanner scan = new Scanner(System.in);
    int figSize, figQantity;
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

        int temp =(int) (Math.random()*figQantity);
        for(int i = 0; i < temp; i++)
        {
            Main.createRandFig(figSize);
        }
        for(Figure fig:Figures){
            System.out.println(Figures.indexOf(fig) +". "+ fig.getClass() +"\t square = " + (int)fig.square + " parrots^2 "+ "  \t" + fig.uniqueMethod() );//"   \tcolor = " + fig.color.name);
        }
        System.out.println("\nCreated " + Figures.size() +" figures");

    }
}
