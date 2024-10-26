public class reverseprint {
    public static void main (String [] args ){
        int r, n=123;
        while(n>0) {
             r = n % 10;
            System.out.print(r);
            n=n/10;

        }
    }
}
