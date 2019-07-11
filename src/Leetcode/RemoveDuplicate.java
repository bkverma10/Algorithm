import java.util.Stack;

class Solution{
    public String removeDuplicate(String S)
    {
        Stack<Character> st = new Stack<>();
        int strLength = S.length();

        for(int i=0;i<strLength; i++){
            if(st.isEmpty()){
                st.push(S.charAt(i));
            }
            else{
                if(S.charAt(i)  == st.peek()){
                    st.pop();
                }
                else{
                    st.push(S.charAt(i));
                }
            }
        }
        String res = "";
        while(!st.isEmpty()){
            res =  Character.toString(st.pop()) + res ;
        }
        return res;
    }
}


public class RemoveDuplicate {

    public static void main(String args[]){
        Solution sl = new Solution();
        System.out.println(sl.removeDuplicate("aabbca"));
    }
}
