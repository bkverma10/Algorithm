import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leetcode_1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> output = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            list1.add(arr2[i]);
            list2.add(arr3[i]);
        }

        for(int i=0;i<arr1.length;i++){
            if(list1.contains(arr1[i]) && list2.contains(arr1[i])){
                output.add(arr1[i]);
            }
        }

        for(int i:output){
            System.out.println(i);
        }


        return output;
    }
    public static void main(String[] args){
        Leetcode_1213 obj = new Leetcode_1213();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        System.out.println(obj.arraysIntersection(arr1,arr2,arr3));
    }
}
