import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int [] arr={5,4,3,1,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
