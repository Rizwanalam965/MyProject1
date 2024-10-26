public class Ripitation2DArray {
    public static void main(String [] args){
        int max=0;
        int [][] arr={{0,1,1},{0,1,0}};
        for( int i=0;i<arr.length;i++){
            int count=0;
            for (int j = 0; j <=arr.length; j++) {
                if(arr[i][j]==1)
                    count++;
               System.out.print(arr[i][j]);
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println(max);
        System.out.println(arr.length);
    }
}
