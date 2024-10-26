import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer");
        int n=sc.nextInt();
        int sum = 0;
        int integer = 0;
            while (n > 0) {
                sum = n % 10;
                integer = integer + sum;
                //n = n / 10;
            }
        System.out.println(integer);
    }
}
