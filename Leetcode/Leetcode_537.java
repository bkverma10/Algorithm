public class Leetcode_537 {
    public String complexNumberMultiply(String a, String b){
        String[] rNum = a.split("\\+|i");
        String[] iNum = b.split("\\+|i");
        //System.out.println(rNum[0] + " "+ " "+ rNum[1]);
        //System.out.println(iNum[0] + " "+ " "+ iNum[1]);
        int a_real = Integer.parseInt(rNum[0]);
        int a_imaginary = Integer.parseInt(rNum[1]);
        int b_real = Integer.parseInt(iNum[0]);
        int b_imaginary = Integer.parseInt(iNum[1]);
        return (a_real*b_real - a_imaginary * b_imaginary) + "+" + (a_real*b_imaginary + a_imaginary * b_real) + "i";
    }


    public static void main(String[] args){
        Leetcode_537 obj = new Leetcode_537();
        String a = "1+1i";
        String b = "1+1i";

        System.out.println(obj.complexNumberMultiply(a,b));

    }
}
