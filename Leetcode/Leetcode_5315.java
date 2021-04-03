import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode_5315 {

        public int maximum69Number (int num) {
            int max = num;
            String str = num + "";
            for(int i=0;i<str.length();i++){
                StringBuilder builder = new StringBuilder(str);
                builder.setCharAt(i, '9');
                int val = Integer.parseInt(builder.toString());
                if(val > max){
                    max = val;
                }
            }

            return max;
        }

    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] strArray = s.split(" ");
        int slen = 0;
        for(String str : strArray){
            if(str.length()>slen){
                slen = str.length();
            }
        }
        for(int i=0; i<slen;i++){
            StringBuilder builder  = new StringBuilder();
            for(String str : strArray){
                builder.append((i>=str.length())? " ":str.charAt(i));
            }
            res.add(builder.toString());
        }

        return res;
    }

    public String removeOuterParentheses(String S) {
        Stack<Character> st = new Stack();
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                continue;
            }
            if(c == '('){
                st.push(c);
                builder.append(c);
                continue;
            }
            if(c == ')' && st.size() == 1){
                st.pop();
            }
            else{
                builder.append(c);
                st.pop();
            }
        }
        return builder.toString();
    }
    public static void main(String[] args){
        int input = 9996;
        String strInput = "()()";
        String strInput2 = "TO BE OR NOT TO BE";
        Leetcode_5315 obj = new Leetcode_5315();
        //System.out.println(obj.maximum69Number(input));
        //System.out.println(obj.printVertically(strInput));
        System.out.println(obj.removeOuterParentheses(strInput));

    }
}
