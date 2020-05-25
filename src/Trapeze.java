import javafx.geometry.Point2D;
class Trapeze extends Figure {
    private int side1;
    private int height;
    Point2D a,b,c,d;
    Trapeze(){
        side1 = (int) (Math.random()*Main.FIELD_SIZE/10)+1;
        int side2 = (int) (Math.random() * Main.FIELD_SIZE / 10) + 1;
        height = (int) (Math.random()*Main.FIELD_SIZE/10)+1;

        color = new Color(randColor());
        square = (side1 + side2)*height/2;
    }
    String uniqueMethod(){
        return "Height = " + height + " parrots";
    }
}
