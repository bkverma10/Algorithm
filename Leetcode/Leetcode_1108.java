

class Solution_1108 {
    public static String defangIPaddr(String address) {
        String output="";
        for(int i=0; i<address.length(); i++){
            if(address.charAt(i)=='.'){
                output=output+"[.]";
            }
            else{
                output=output+address.charAt(i);
            }
        }
        return output;
    }
}


public class Leetcode_1108 {
    public static void main(String args[]){
        System.out.println(Solution_1108.defangIPaddr("1.1.1.1"));
    }

}