import javafx.geometry.Point2D;

public class Triangle extends Figure {
    Point2D a,b,c;
    double height;
    public Triangle(){
        a = new Point2D(getRandAxis(), getRandAxis());
        b = new Point2D(getRandAxis(), getRandAxis());
        c = new Point2D(getRandAxis(), getRandAxis());
        height = a.midpoint(b).distance(c);
        color = new Color(randColor());
        square = (a.distance(b) * height)/2;
    }
    double getHeight() {
        return height;
    }

}
