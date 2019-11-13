public class Leetcode_852 {
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int i=1;
            for(; i<A.length-1; i++){
                if(A[i-1]<A[i] && A[i]>A[i+1])
                {
                    break;
                }
            }
            return i;
        }
    }
}
