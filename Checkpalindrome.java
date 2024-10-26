import java.util.Scanner;

public class Checkpalindrome {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c, r;
        int p = 0;
        c = n;//NUMBER KO ASSIGN KR DIYE HAI ANOTHER VARIABLE ME KI COMPARE KARNE KE LIYE
        while (n > 0) {
            r = n % 10;//REMAINDER
            p = (p * 10) + r; //PELINDROME
            n = n / 10;
        }
        if (c == p) {
            System.out.println("it is pelindrome num");
        } else {
            System.out.println(" it is not pelindrome num");
        }

    }
}
