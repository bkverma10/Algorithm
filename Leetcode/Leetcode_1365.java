import java.util.*;

public class Leetcode_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        //Arrays.asList(nums);
        Set<Integer> set = new TreeSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }
        int minCount = 0;
        for(int i: set){
            System.out.println(i);
            map.put(i, minCount);
            minCount++;
        }

        for(int i=0;i<nums.length;i++){
            output[i] = map.get(nums[i]);
        }
        return output;
    }
    public static void main(String[] args){
        Leetcode_1365 obj = new Leetcode_1365();
        int[] nums = {8,1,2,2,3};
        for(int i:obj.smallerNumbersThanCurrent(nums)){
            System.out.println(i);
        }


    }
}
