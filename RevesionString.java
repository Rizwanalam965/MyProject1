public class RevesionString {
    public static void main(String [] args){
        String firstName="Rizwan ";
        String lastName="Alam";
        String FullName=firstName+lastName;
        System.out.println(FullName);
        System.out.println(FullName.length());
        //charAt
        for(int i=0;i<FullName.length();i++)
        System.out.println(FullName.charAt(i));

    }
}
