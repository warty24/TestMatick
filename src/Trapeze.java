import javafx.geometry.Point2D;
class Trapeze extends Figure {
    private int side, side1, side2;
    private int height;
    Point2D a,b,c,d;
    Trapeze(){
        side1 = (int) (Math.random()*Main.FIELD_SIZE/10)+1;
        int side2 = (int) (Math.random() * Main.FIELD_SIZE / 10) + 1;
        height = (int) (Math.random()*Main.FIELD_SIZE/10)+1;

        color = new Color(randColor());
        square = (side1 + side2)*height/2;
    }
    Trapeze(int figSize){
        side = (int) (Math.random()*figSize -2)+2;
        height = side;                    //
        side2 = side + ((height - 1)/2 ); // fix later
        color = new Color(randColor());
        square = (side + side2)*height/2;
    }
    String uniqueMethod(){
        return "Height = " + height + " parrots";
    }
    void printFigure() {
        System.out.println(side);

        for(int i = 0; i < side; i++){
            for(int j = side - i; j > 0 ; j--){
                System.out.print(' ');
            }
            for(int j = 0; j < side; j++){
                System.out.print('*');
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
