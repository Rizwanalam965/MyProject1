import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        int marks [] =new int [100];
        //size  of array
        System.out.println("the size of array is "+marks.length);
       Scanner sc=new Scanner(System.in);
        //msg pass
        System.out.println("enter the marks");
        //int phy;
        //phy=sc.nextInt();
        marks [0]=sc.nextInt();
        marks [1]=sc.nextInt();
        marks [2]=sc.nextInt();
        System.out.println("phy marks ="+marks[0]);//phy
        System.out.println("phy marks ="+marks[1]);//che
        System.out.println("phy marks ="+marks[2]);//math
        marks[2]=marks[2]+1;
        System.out.println("phy marks ="+marks[2]);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage="+percentage+"%");
    }
}