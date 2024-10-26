//public class MaxSumSubArray {
//    public static int maxsumsubarr(){
//       int arr[]={2,3,-1,2,6,-2};
//        int maxsum=0;
//        int cursum=0;
//        for(int i=0;i<arr.length;i++){
//            cursum=cursum+arr[i];
//            if(cursum>maxsum){
//                maxsum=cursum;
//            }
//            if(cursum<0){
//                cursum=0;
//            }
//        }
//        return maxsum;
//    }
//    public static void main(String[] args) {
//        System.out.println(maxsumsubarr(2,-1,5,-3,4));
//    }
//}

public class MaxSumSubArray {
    public static void main(String []args) {
        int arr[] = {2, 3, -1, 2, 6, -2};
        int maxsum = 0;
        int cursum = 0;
        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        System.out.println(maxsum);

    }
    }