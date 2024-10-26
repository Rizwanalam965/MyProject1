public class MissingValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        int[] hash = new int[6];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for(int i=0;i<hash.length;i++)
        {
            System.out.print(hash[i]+" ");
        }

        System.out.println();
        for (int i = 0; i < hash.length; i++)
        {
            if(hash[i]==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
