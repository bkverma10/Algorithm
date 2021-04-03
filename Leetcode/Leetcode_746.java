public class Leetcode_746 {

    public int minCostClimbingStairs(int[] cost) {
        int output = 0;
        int i=0;
        while(i<cost.length-1){
            if(cost[i]<cost[i+1]){
                output+=cost[i];
                i++;
            }
            else {
                output+=cost[i+1];
                i+=2;
            }
        }

        return output;
    }


    public static void main(String[] args){
        Leetcode_746 obj = new Leetcode_746();
        //int[] cost = {10,15,20};
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(obj.minCostClimbingStairs(cost));
    }
}
