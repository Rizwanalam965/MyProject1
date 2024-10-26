public class UpdateFunArray {
    public static void updates(int marks[],int nonchangeable){
         nonchangeable=8;
        for(int i = 0; i< marks.length; i++){
            marks[i]=marks[i]+1;

        }
    }
    public static void main(String[] args) {
        int nonchangeable=5;
        int marks []={7,8,9};
         updates(marks,nonchangeable);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            System.out.println(nonchangeable);
        }
    }
}
