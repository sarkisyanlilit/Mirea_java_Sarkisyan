
package shape;
import java.math.*;
public class Circle extends Shape{

protected double radius;

public Circle(double radius){
    this.color="red";
    this.filled=false;
    this.radius=radius;
}
public Circle (){
    this.color="red";
    this.filled=false;
    this.radius=2;
}
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
public void setRadius(double radius){this.radius=radius;}
public double getRadius(){return radius;}
@Override
    public double getArea(){return this.radius*this.radius*MATH.PI;}
    @Override
    public double getPerimeter(){return 2*this.radius*MATH.PI;}
    @Override
    public String toString(){
    return this.color+"The color of the circle is "+this.filled+this.radius+", the radius is "+", area is "+this.getArea()+", perimeter is "+this.getPerimeter()+", filled: " + this.filled;
    }
}
