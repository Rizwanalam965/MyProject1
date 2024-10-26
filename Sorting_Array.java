public class Sorting_Array {
    public static void main(String[] args) {
        int[] arr = {10, 45, 4, 15, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.print(arr[i] + " ");


        }
        //System.out.println(arr[arr.length-2]);



    }
}
