
import java.lang.*;
public class Dog {
    public String name;
    int age;
    public Dog(String a, int b)
{ name=a;
age=b;
}
    public void setName (String name)
    {
        this.name=name;
    }
    public void setAge( int age)
    {
        this.age=age;
    }
    public String getName(String name)
    {
        return name;
    }
    public int getAge( int age)
    {
        return age;
    }
    public void HumanAge( )
    {
        System.out.println(name+"'age in human years is "+age*7+" years");}
    public String toString() {
        return this.name+", age-"+this.age;

    }



    }


