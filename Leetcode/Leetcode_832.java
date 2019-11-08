public class Leetcode_832 {

    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i<A[0].length; i++){
            int start = 0;
            int end = A.length-1;
            while (start<=end){

                if(start!=end){
                    int temp = A[i][start];
                    A[i][start] = A[i][end] == 0 ? 1 : 0;
                    A[i][end] = temp == 0 ? 1 : 0;
                }
                else {
                    A[i][start] = A[i][start] == 0 ? 1 : 0;
                }
                start++;
                end--;
            }

        //Output: [[1,0,0],[0,1,0],[1,1,1]]
        }
        return A;
    }

    public static void main(String[] args){

        int[][] A= {{1,1,0},{1,0,1},{0,0,0}};

        Leetcode_832 obj = new Leetcode_832();
        obj.flipAndInvertImage(A);
        System.out.println();

    }
}
