import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageofThreenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num");
        double x=sc.nextDouble();
        System.out.println("enter the 2nd num");
        double y=sc.nextDouble();
        System.out.println("enter the 3rd num");
        double z=sc.nextDouble();
        System.out.println("the avg of three num"+" "+ averages(x,y,z)+" ");
    }

    public static double averages(double x,double y,double z) {
        return (x+y+z)/3;
    }

}
