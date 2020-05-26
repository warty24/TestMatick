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
    Circle(int figSize){
        radius = (int) (Math.random() * (figSize - 1) +1);
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
    void printFigure() {
        for(int i = 1; i <= radius; i ++){
            for(int j = radius - i; j > 0 ; j--){
                System.out.print(' ');
            }
            for (int j = (i*2) -1; j > 0; j -- ){
                System.out.print('*');
            }
            for(int j = radius - i; j > 0 ; j--){
                System.out.print(' ');
            }
            System.out.println();
        }
        for(int i = radius - 1; i > 0; i --){
            for(int j = radius - i; j > 0 ; j--){
                System.out.print(' ');
            }
            for (int j = (i*2) -1; j > 0; j -- ){
                System.out.print('*');
            }
            for(int j = radius - i; j > 0 ; j--){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
