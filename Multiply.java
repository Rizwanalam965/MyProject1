public class Multiply {
    public  static int multiplys(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int prod=multiplys(a,b);
        System.out.println("a*b="+prod);
         prod=multiplys(8,10);
        System.out.println("a*b="+prod);


    }
}
