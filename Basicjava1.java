import java.util.Scanner;

public class Basicjava1 {
    public static void printhelloworld() {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
        // Agar method ka returntype void hai to return sirf return likh sakte hai.
        // lekin agar int hota to hame return statement likhana padta
        //public static void printhelloworld(){}
        //return 4;
    }
        public static void calculatesum() {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the value of A:");
            int a = sc.nextInt();
            System.out.print("enter the value of B:");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("sum is " + sum);
        }
    public static void main(String[] args) {
      //  printhelloworld();//call function
        calculatesum();

    }
}
