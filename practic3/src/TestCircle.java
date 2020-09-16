
public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(1.0, "blue", "checked");
        System.out.println("Radius is " + c1.getRadius()
                        + " Color is " + c1.getColor()
                + " Pattern is " + c1.getPattern()

        + " Area is " + c1.getArea()
                +"Diameter is " + c1.getDiameter());

        Circle c2 = new Circle(3.1, "pink");
        System.out.println("Radius is " + c2.getRadius()
                + " Color is " + c2.getColor()
                + " Pattern is " + c2.getPattern()
                + " Area is " + c2.getArea()
                +"Diameter is " + c2.getDiameter());
        Circle c3 = new Circle(2.3);
        System.out.println("Radius is " + c3.getRadius()
                + " Color is " + c3.getColor()
                + " Pattern is " + c3.getPattern()
                + " Area is " + c3.getArea()
                +"Diameter is " + c3.getDiameter());
        Circle c4 = new Circle();
        System.out.println("Radius is " + c4.getRadius()
                + " Color is " + c4.getColor()
                + " Pattern is " + c4.getPattern()
                + " Area is " + c4.getArea()
                +"Diameter is " + c4.getDiameter());
    }
}