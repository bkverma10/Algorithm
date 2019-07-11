package Leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class  PathInZigzagBinaryTree {

    public List<Integer> pathInZigzagTree1(int label) {
    List<Integer> result = new ArrayList<>();
        int currentLevel = findCurrentLevel(label);
        while(currentLevel > 1){
            result.add(label);
            if(currentLevel % 2 ==0){
                int startLabel = (int) Math.pow(2,currentLevel) -1;
                int distance = startLabel - label;
                int prevLevel = currentLevel - 1;
                int parent = (int) Math.pow(2,prevLevel - 1) + distance/2;
                label = parent;
                currentLevel = prevLevel;
            }
            else{
                int startLabel = (int) Math.pow(2, currentLevel -1);
                int distance = label - startLabel;
                int prevLavel = currentLevel - 1;
                int parent = (int) Math.pow(2, prevLavel) - 1 - distance/2;
                label = parent;
                currentLevel = prevLavel;
            }
        }
        result.add(currentLevel);
        Collections.reverse(result);
    return result;
    }
    private int findCurrentLevel(int label) {
        int n = 0;
        while(Math.pow(2,n)<=label){
            n++;
        }
        return n;
    }
    public static void main(String args[]){
        PathInZigzagBinaryTree p = new PathInZigzagBinaryTree();
        System.out.println(p.pathInZigzagTree1(10));
        System.out.println(p.pathInZigzagTree1(14));
        System.out.println(p.pathInZigzagTree1(26));
    }
}
