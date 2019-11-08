import java.util.HashSet;
import java.util.Set;

 public class Leetcode_804 {

    public int uniqueMorseRepresentations(String[] words){

        String[] morse_code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> morse_set = new HashSet<>();
        for(String word : words){
            StringBuffer sb = new StringBuffer();
            for(int i=0; i<word.length(); i++){
                sb.append(word.charAt(i) - 'a');
            }
            morse_set.add(sb.toString());

        }
        return morse_set.size();
    }

    public static void main(String[] args){
        Leetcode_804 obj = new Leetcode_804();
        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(obj.uniqueMorseRepresentations(words));


    }
}
