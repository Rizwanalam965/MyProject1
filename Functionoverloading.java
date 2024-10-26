//public class Functionoverloading {
//    //using parameter
//    //function to calculate sum of 2 no.
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    //function to calculate sum of 3 no.
//    public static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(5,6));
//        System.out.println(sum(5,6,7));
//    }
//}
public class Functionoverloading {

    //using data type
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,5));
        System.out.println(sum(2.3f,3.5f));

    }
}
