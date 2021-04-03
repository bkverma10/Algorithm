public class KadansAlgo {

    int kadans(int[] input){
        int res = 0;
        int[] dp = new int[input.length];
        dp[0] = input[0];
        for(int i=1; i<input.length; i++){
            dp[i] =  Math.max(dp[i-1] , 0) + input[i];
            res = Math.max(res, dp[i]);
        }

        return res;
    }

    int kadans2(int[] input){
        int res = Integer.MIN_VALUE;
        int a = 0;
        for(int i=0; i<input.length; i++){
           a +=input[i];
           res = Math.max(res, a);
           a = Math.max(a,0);
        }

        return res;
    }

    public static void main(String[] args){
        KadansAlgo obj = new KadansAlgo();
        //int[] input = {1,2,3,4,5,-4,2,9,-5};
        int[] input = {-2,-3,-4,-5};
        System.out.println(obj.kadans2(input));
    }
}
