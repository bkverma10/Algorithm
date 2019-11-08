public class Leetcode_905 {
    public int[] sortArrayByParity(int[] A) {

        int start = 0;
        int end = A.length -1;
        while(start < end){
            if(A[start]%2 == 0){
                start++;
            }
            else{
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                end--;
            }
        }
        return A;
    }
    public static void main(String[] args){

        int[] A= {3,1,2,4};

        Leetcode_905 obj = new Leetcode_905();
        for(int i:obj.sortArrayByParity(A)){
            System.out.println(i);
        }


    }
}
