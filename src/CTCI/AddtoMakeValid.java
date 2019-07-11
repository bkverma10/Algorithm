package CTCI;
import java.util.Stack;

class Solution1 {
    public int minAddtoMakeValid(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            switch (ch) {
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                    break;
                case '(':
                    stack.push('(');
                    break;
            }
        }
        return stack.size();
    }


    public int minAddtoMakeValid1(String S) {
        int leftExtraCount = 0, rightExtraCount = 0;
        for (char ch : S.toCharArray()) {
            if (ch == '(') {
                leftExtraCount++;
            } else {
                if (leftExtraCount > 0) {
                    leftExtraCount--;
                } else {
                    rightExtraCount++;
                }
            }
        }
        return leftExtraCount + rightExtraCount;
    }
}
public class AddtoMakeValid {
    public static void main(String args[]) {
        Solution1 sl = new Solution1();
        System.out.println(sl.minAddtoMakeValid1("(())()"));

    }
}
