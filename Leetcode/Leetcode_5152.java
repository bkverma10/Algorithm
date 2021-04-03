import java.util.Arrays;

public class Leetcode_5152 {
    public void diagMatirx(int[][] matrix){
        int m = matrix[0].length;
        int n = matrix.length;
        for(int k = 0;k<m;k++){

            for(int i=0, j = k;i<=m && i<=n - (m-n) && j<= n;i++,j++){
                //System.out.println(matrix[i][j]);

            }
        }

        Arrays.sort(matrix, (a, b) -> Integer.compare(b[0], a[0]));
        Arrays.sort(matrix, (a, b) -> Integer.compare(b[1], a[1]));

        for(int[] rest : matrix){
            System.out.println(rest[0]);
        }

    }

    public static void main(String[] args){
        Leetcode_5152 obj = new Leetcode_5152();
        int[][] matrix = {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};
        String str =  "abb";
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        //int[][] matrix1 = {{3,3,1},{2,2,1},{1,1,1}};
        obj.diagMatirx(matrix);
    }
}
//[[1,4,1,40,10],[2,8,0,50,5],[3,8,1,30,4],[4,10,0,10,3],[5,1,1,15,1]]

