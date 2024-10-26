public class Touppercase {
    public static void main(String[] args) {
        String s="i am rizwan alam";
        String [] arr=s.split(" ");
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=arr[i].charAt(0);
            String c1=String.valueOf(c).toUpperCase();
            String sub=arr[i].substring(1);
            System.out.println(s);
        }

    }
}
