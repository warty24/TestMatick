import javafx.geometry.Point2D;

public class Square extends Figure {
    /*
     *
     * With Rotation
     *
     *
    Point2D a,b,c,d;
    double length;
    boolean isPointValid1(Point2D a, Point2D b){
        if (a.getX() + b.getX() < Main.FIELD_SIZE & a.getX()+b.getX()> - Main.FIELD_SIZE)
            if (a.getY() - b.getY() < Main.FIELD_SIZE & a.getY() - b.getY() > - Main.FIELD_SIZE)
                return true;
            else return false;
            else return false;
    }
    boolean isPointValid2(Point2D a, Point2D b){
        if (a.getX() - b.getX() < Main.FIELD_SIZE & a.getX() - b.getX()> - Main.FIELD_SIZE)
            if (a.getY() + b.getY() < Main.FIELD_SIZE & a.getY() + b.getY() > - Main.FIELD_SIZE)
                return true;
            else return false;
        else return false;
    }
    public Square() {
        Point2D a = new Point2D(getRandAxis(), getRandAxis());
        Point2D b = new Point2D(getRandAxis(), getRandAxis());
        length = a.distance(b);
        if (isPointValid1(a,b))
        {
            Point2D c = new Point2D(a.getX() + b.getX(),a.getY() - b.getY());
        }
        else
            if (isPointValid2(a,b))
            {
                Point2D c = new Point2D(a.getX() - b.getX(),a.getY() + b.getY());
            }

        Point2D d = new Point2D(getRandAxis(), getRandAxis());
    }
     *
     *
     */
    private Point2D a;
    private Point2D c;
    private Point2D d;
    private int side;

    Square() {
        a = new Point2D(getRandAxis(), getRandAxis());
        side = (int) (Math.random() * (Main.FIELD_SIZE / 4));
        if ((a.getX() + side < Main.FIELD_SIZE) & (a.getY() + side <Main.FIELD_SIZE)) {
            Point2D b = new Point2D(a.getX() + side , a.getY());
            Point2D c = new Point2D( a.getX(), a.getY() + side);
            Point2D d = new Point2D( a.getX() + side, a.getY() + side);
        }
        else
        {
            Point2D b = new Point2D(a.getX() - side, a.getY());
            c = new Point2D( a.getX(), a.getY() - side);
            d = new Point2D( a.getX() - side, a.getY() - side);
        }
        color = new Color(randColor());
        square = side*side;
    }
    Square(int figSize) {
        side = (int) (Math.random() * figSize - 1) +1;
        color = new Color(randColor());
        square = side*side;
    }

    public int getSide(){
        return side;
    }
    String uniqueMethod(){
        return "Side = " + side + " parrots";
    }
    void printFigure() {
        for(int i = 0; i < side; i++){
            for(int j = 0; j < side; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
