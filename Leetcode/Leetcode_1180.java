import java.util.HashMap;
import java.util.Map;

public class Leetcode_1180 {

    public int countLetters(String S) {
        Map<Character, Integer> map = new HashMap<>();
        for(char s : S.toCharArray()){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        map.forEach((k, v) -> System.out.println(k + " " + v));

        return 0;
    }

    public int getCombination(int num){
        int output = 0;
        return output;
    }

    public static void main(String[] args){
        Leetcode_1180 obj = new Leetcode_1180();
        String input1 = "aaaaaaaa";
        String input2 = "aaaba";
        System.out.println(obj.countLetters(input2));
    }
}
