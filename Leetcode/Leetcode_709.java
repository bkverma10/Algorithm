/*
*
* 709. To Lower Case
*
* */


public class Leetcode_709 {

    public String toLowerCase(String str){
        String output = "";
        for(int i=0; i<str.length(); i++){
            char capChar = str.charAt(i);
            if(capChar >= 'A' && capChar <= 'Z'){
                capChar += 32;
            }
            output += capChar ;
        }
        return output;

    }

    public static void main(String[] args){

        Leetcode_709 objt = new Leetcode_709();
        String str = "Hello";
        System.out.println(objt.toLowerCase(str));

    }
}

