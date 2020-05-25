import javafx.geometry.Point2D;

class Circle extends Figure {
    private Point2D a;
    private int radius;
    Circle(){
        radius = (int) (Math.random() * (Main.FIELD_SIZE / 4));
        while(true){
            a = new javafx.geometry.Point2D(getRandAxis(), getRandAxis());
            if(a.getX()+ radius > Main.FIELD_SIZE | a.getY() + radius > Main.FIELD_SIZE | a.getX() - radius < -Main.FIELD_SIZE | a.getY() - radius < -Main.FIELD_SIZE ) {
            }
            else break;
        }
        color = new Color(randColor());
        square = Math.PI *radius *radius;
    }
    int getRadius() {
        return radius;
    }
    String uniqueMethod(){
        return "Radius = " + radius + " parrots";
    }
}
