import java.lang.*;
public class TestDog {
    public static void main(String[] agr)
    { Dog d1=new Dog("Rex", 1);
Dog d2=new Dog("Rose", 3);
System.out.println(d1);
System.out.println(d2);
d1.HumanAge();
d2.HumanAge();
        String[] Dogs={"Dalmatian", "Beagle"};
        for (int i = 0; i < 2; i++) {
            System.out.println(Dogs[i]);
        }
}
}