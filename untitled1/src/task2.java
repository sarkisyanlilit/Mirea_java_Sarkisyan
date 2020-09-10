public class task2 {
    public static void main(String[] agr)
    {
        int n=10;
        double G=0, sum=0;
        for (int i=1;i<=n; i++)
        {
            G+=1./i;
            System.out.println(G);
            sum+=G;

        }
        System.out.println("\nsum= "+ sum);
    }
}
