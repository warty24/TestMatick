import javafx.geometry.Point2D;
public class Trapeze extends Figure {
    int side1, side2, height;
    Point2D a,b,c,d;
    public Trapeze(){



        color = new Color(randColor());
        square = (side1 + side2)*height/2;
    }
}
