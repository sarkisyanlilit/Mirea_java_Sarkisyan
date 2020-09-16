import java.lang.*;
public class TestHuman {
    public static void main(String[] agr) {

        Human.Head h= new Human.Head("blonde", "small");
        Human.Leg l1= new Human.Leg(39);
        Human.Hand ha=new Human.Hand("black");
        Human hu = new Human("male", "Nick");
        System.out.println ("The gender of the human is "+hu.getGender()+" and the name is "+hu.getName());
        System.out.println("Hair color is "+ h.getHair_color()+", the size of the head is  "+ h.getSize());
        System.out.println("The foot size is "+l1.getLeg_size());
        System.out.println("The color of the nails is "+ha.getNail_color());

    }
}








