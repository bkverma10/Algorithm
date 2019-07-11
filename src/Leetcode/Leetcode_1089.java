//1089. Duplicate Zeros
class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int arrLength = arr.length-1;
        int end;
        for(int i=0;i<arrLength;i++){
            end = arrLength;
            if(arr[i] == 0){
                while(end > i)
                {
                    arr[end] = arr[end-1];
                    end--;
                }
                arr[end] = 0;
                i++;
            }
        }
        for(int i=0;i<arrLength;i++){
            System.out.println(arr[i]);
        }
    }
}

public class Leetcode_1089 {

    public static void main(String args[]){
        Solution1089 sl = new Solution1089();
        int[] arr = {1,0,2,0,3,4};
        sl.duplicateZeros(arr);
    }
}
