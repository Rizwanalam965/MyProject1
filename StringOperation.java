import java.lang.*;
public class StringOperation {
    public static void main(String [] args){
        String sb= (" Gulzar group of institutes ");
        sb=sb.trim();
        int count=0;
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)==' ')
            {
                count=i;
            }
        }
//        System.out.println(sb.length());
//       String a =sb.substring(16);
//       System.out.print(a);
        System.out.println(sb.substring(count+1));
    }
}
