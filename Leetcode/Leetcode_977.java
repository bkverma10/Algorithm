import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_977 {

    /*
    * Brute Force Approach
    * */
    public int[] sortedSquares(int[] A) {

        for(int i=0; i<A.length; i++){
            A[i] = (int) Math.pow(A[i],2);
        }
        Arrays.sort(A);

        return A;
    }
    /**
     * Second Approach
     *
     */
    public int[] sortedSquares1(int[] A) {

        for(int i=0; i<A.length; i++){
            A[i] = (int) Math.pow(A[i],2);
        }
        Arrays.sort(A);

        return A;
    }

    public static void main(String[] args){
        Leetcode_977 obj = new Leetcode_977();
        int[] A = {1,2,3,4};
        for(int i:obj.sortedSquares(A)){
            System.out.println(i);
        }

    }
}
