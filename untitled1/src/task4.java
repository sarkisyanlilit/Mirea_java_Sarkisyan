import java.util.Scanner;
public class task4 {
    public static void main(String[] agr)
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
