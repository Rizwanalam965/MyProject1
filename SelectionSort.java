public class SelectionSort {
    public static void main(String [] args){
        int [] arr={5,4,1,3,2};
        for(int i=0;i<arr.length;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            System.out.print(arr[i]);
        }
    }
}
