public class InsertionSort {
    public static void main(String[]args){
        int [] arr={5,4,3,1,2};
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp) {
                    arr[j + 1] = arr[j];
                }
                    else{
                    break;
                }
                arr[j+1]=temp;
                System.out.println(arr[j]);
            }
        }
    }
}
