import java.util.Scanner;

public class Rizwan {
        public static void calculatesum(){
            Scanner sc=new Scanner (System.in);
            System.out.println("enter  a");
            int a = sc.nextInt();
            System.out.println("enter  b");
            int b = sc.nextInt();
            int sum=a+b;
            System.out.println("sum is "+sum);
        }
        public static void main(String [] args){

            calculatesum();

        }
    }

