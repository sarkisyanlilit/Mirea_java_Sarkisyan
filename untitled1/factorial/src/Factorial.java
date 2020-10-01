

    import java.util.Scanner;
public class Factorial {
    public void Fact()
    {


            int f=1;
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            for (int i=1; i<=num;  i++)
            {
                f*=i;
            }
            System.out.println("\nfactorial= "+f);

    }
}
