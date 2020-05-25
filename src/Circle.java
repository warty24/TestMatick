import javafx.geometry.Point2D;

public class Circle extends Figure {
    Point2D a;
    int radius;
    public Circle(){
        radius = (int) (Math.random() * (Main.FIELD_SIZE / 4));
        while(true){
            a = new javafx.geometry.Point2D(getRandAxis(), getRandAxis());
            if(a.getX()+ radius > Main.FIELD_SIZE | a.getY() + radius > Main.FIELD_SIZE | a.getX() - radius < -Main.FIELD_SIZE | a.getY() - radius < -Main.FIELD_SIZE )
                continue;
            else break;
        }
        color = new Color(randColor());
        square = Math.PI *radius *radius;
    }
    int getRadius() {
        return radius;
    }
}
