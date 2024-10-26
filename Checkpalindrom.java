public class Checkpalindrom {
    public static void main(String[] args) {
        String str="raceujor";
        int n=str.length();
        for(int i=0;i<str.length()/2;i++) {

            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("it is not palindrom");

            } else {
                System.out.println("it is  palindrom");
            }
        }
    }
}



