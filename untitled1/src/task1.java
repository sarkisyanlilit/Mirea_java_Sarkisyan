public class task1{
    public static void main(String[] agr)
    {
        int myArr[]={8, 13,2, 9, 15,21,1, 11, 6, 7};
        int sum=0;
        for (int i=0; i<myArr.length; i++)
        {
            sum+=myArr[i];
            System.out.println(sum);
        }
        System.out.println("\nsum= "+ sum);
    }
}
