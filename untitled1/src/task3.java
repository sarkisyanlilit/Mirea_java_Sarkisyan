public class task3 {
    public static void main(String[] agr) {
        int[] arr;
        arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 201-100));

            System.out.println(arr[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






