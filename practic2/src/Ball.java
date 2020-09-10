import java.lang.*;
public class Ball {
    public String type;
    public int diameter;
    public String color;

    Ball(String type, int diameter, String color) {
        this.type = type;
        this.diameter = diameter;
        this.color = color;
    }

    public String toString() {
        return this.type + ", " + this.diameter + ", " + this.color;

    }
}
