public class BinaryDec {
    public static void binTODec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastdigt = binNum % 10;
            dec = dec + (lastdigt *(int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of =" + mynum + " " + dec);
    }
    public static void main(String[] args) {
       binTODec(101);

    }
}
