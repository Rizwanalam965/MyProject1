public class Strings {
    public static void main(String[ ] args){
        StringBuilder sb= new StringBuilder ("tony");
        System.out.println(sb);
        //Char At Index 0
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(2));

        // Set CharAt Index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // Insert index
       sb.insert(3,'n');
        System.out.println(sb);

        //delete index
       sb.delete(2,3);
        System.out.println(sb);

        // append character ke last me letter jut jata hai
        StringBuilder sb1= new StringBuilder ("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
        System.out.println(sb1.length());

    }
}
