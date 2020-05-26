import javafx.geometry.Point2D;

class Triangle extends Figure {
    private Point2D a,b,c;
    private int height, side;
    Triangle(){
        a = new Point2D(getRandAxis(), getRandAxis());
        b = new Point2D(getRandAxis(), getRandAxis());
        c = new Point2D(getRandAxis(), getRandAxis());
//double        height = a.midpoint(b).distance(c);
        color = new Color(randColor());
//double        side = a.distance(b);
        square = (side * height)/2;
    }
    Triangle(int figSize){
        height =(int)(Math.random() * figSize -2) +2;
        side = height;
        square = (side * height)/2;
        color = new Color(randColor());
    }
    double getHeight() {
        return height;
    }
    String uniqueMethod(){
        return "Height = " + (int)height + " parrots";
    }
    void printFigure() {
        for (int i=0; i<= height; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
