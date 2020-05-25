import javafx.geometry.Point2D;
public class Trapeze extends Figure {
    int side1, side2, height;
    Point2D a,b,c,d;
    public Trapeze(){
        side1 = (int) (Math.random()*Main.FIELD_SIZE/10)+1;
        side2 = (int) (Math.random()*Main.FIELD_SIZE/10)+1;
        height = (int) (Math.random()*Main.FIELD_SIZE/10)+1;

        color = new Color(randColor());
        square = (side1 + side2)*height/2;
    }
}
