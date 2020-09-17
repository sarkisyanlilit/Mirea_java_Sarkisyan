import java.lang.*;
public class Human {
    private String gender;
    private String name;

    public Human (String g, String n)
    {
        gender=g;
        name=n;
    }
    public void  setGender(String gender){
        this.gender=gender;}
    public void  setName(String name)
    {
        this.name=name;
    }
    public String getGender(){
        return gender;
    }
    public String getName(){
        return name;}
    public static class Head{
        private String hair_color;
        private String size;
        public Head( String a, String b)
        {
            hair_color=a;
            size=b;
        }
        public void  setHair_color(String hair_color)
        {
            this.hair_color=hair_color;
        }
        public void  setSize( String size)
        {
            this.size=size;
        }
        public String getHair_color()
        {
            return hair_color;
        }
        public String getSize()
        {
            return size;
        }

    }
    public static class Leg{
        private int leg_size;
        public Leg(int l)
        {
            leg_size=l;
        }
        public void  setLeg_size(int leg_size)
        {
            this.leg_size=leg_size;
        }
        public int getLeg_size()
        {
            return leg_size;
        }

    }
    public static class Hand{
        private String nail_color;
        public Hand(String n)
        {nail_color=n;

        }
        public void  setNail_color(String nail_color)
        {
            this.nail_color=nail_color;
        }
        public String getNail_color()
        {
            return nail_color;
        }

    }
    public Human()
    {
        Head h=new Head("blonde", "small");
        Leg l1=new Leg(39);
        Hand ha=new Hand ("black");
    }
}
