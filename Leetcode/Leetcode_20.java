import java.util.Stack;

public class Leetcode_20 {
    public boolean isValid(String s){
        if(s.length()==0){return false;}
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            System.out.println(c);
            switch (c){
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.peek()=='(')
                    {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.peek()=='{')
                    {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.peek()=='[')
                    {
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                    break;
            }
        }

        if(!stack.isEmpty()){return false;}
        return true;
    }

    public static void main(String[] args){
        Leetcode_20 obj = new Leetcode_20();
        String input = "";
        System.out.println(obj.isValid(input));
    }
}





