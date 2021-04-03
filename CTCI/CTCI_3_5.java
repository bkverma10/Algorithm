import org.testng.annotations.Test;

import java.util.*;
public class CTCI_3_5 {
    Stack<Integer> stack = new Stack<>();
    public void sortStack(Stack<Integer> stack){
        Stack<Integer>  tempStack = new Stack();
        while(!stack.isEmpty()){
            helper(stack.pop(), tempStack);
        }
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        display();
    }

    void helper(int val, Stack<Integer> tempStack){

            while (!tempStack.isEmpty() && tempStack.peek() > val) {
                stack.push(tempStack.pop());
            }

        tempStack.push(val);
    }

    void display(){

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


    @Test
    public void callingFunction(){
        //stack = {3, 8, 12, 5, 10}
        stack.push(3);
        stack.push(8);
        stack.push(12);
        stack.push(5);
        stack.push(10);
        sortStack(stack);
    }

}


