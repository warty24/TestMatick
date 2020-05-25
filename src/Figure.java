class Figure {
    private final int COLORS_QUANTITY = 6;
    double square;
    Color color;
    /*
     * void Draw();
     */
    int getRandAxis(){
        return (int) ((Math.random()*Main.FIELD_SIZE * 2) - Main.FIELD_SIZE);
    }
    String randColor (){
        int t =(int) (Math.random()*COLORS_QUANTITY);
        switch (t){
            case 0:
                return "red";
            case 1:
                return "black";
            case 2:
                return "yellow";
            case 3:
                return "blue";
            case 4:
                return "green";
            case 5:
                return "gray";
            default:
//             throw RuntimeException;
                System.out.println("ColorERR");
                return "red";
        }
    }
    String uniqueMethod(){
        return "No figure";
    }

}
