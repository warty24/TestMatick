public class Color {
    String name;
    String value;

    public Color(String color)
    {
        switch (color)
        {
            case "red":
            {
                name = color;
                value = "FF0000";
            }
            case "black":
            {
                name = color;
                value = "000000";
            }
            case "yellow":
            {
                name = color;
                value = "FFFF00";
            }
            case "blue":
            {
                name = color;
                value = "0000FF";
            }
            case "green":
            {
                name = color;
                value = "00FF00";
            }
            case "gray":
            {
                name = color;
                value = "808080";
            }

        }

    }
}
