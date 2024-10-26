public class sumdigit {
    public static void main(String args []){
        int n=265;
        int sum=0;
        do{
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        while(n>0);
        System.out.println(sum);
    }
}
