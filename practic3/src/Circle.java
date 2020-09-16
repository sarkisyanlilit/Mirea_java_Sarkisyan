import java.lang.*;
public class Circle {
    private double radius;
    private String color;
    private String pattern;
    public Circle() {
        radius = 2.0;
        color = "black";
        pattern="striped";
    }
    public Circle(double r)
    {
        radius = r;
        color = "black";
        pattern="striped";
    }
    public Circle(double r, String c){
        radius = r;
        color = c;
        pattern="striped";
    }
    public Circle(double r, String c, String p) {
        radius = r;
        color = c;
        pattern=p;
    }
        public double getRadius() {
            return radius;
        }
        public String getColor() {
            return color;
        }
    public String  getPattern() {
        return pattern;
    }
        public double getArea() {
            return radius*radius*Math.PI;
        }
    public double getDiameter() {
        return radius*2;
    }
    }

