public class Optimizeprime {
    public static void main(String [] args){
        int n=5;int count=0;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
            if(count >2){
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println(n+" is not prime");
            else
                System.out.println(n + "is prime");

    }
}
