import java.util.HashSet;
import java.util.Set;

class CodeJam {
    int sum = 0;
    int rowSum = 0;
    int colSum = 0;

    public int[] question1(int[][] grid) {
        for (int i = 0, j = 0; i < grid[0].length && j < grid.length; i++, j++) {
            sum += grid[i][j];
        }

            for (int i = 0; i < grid[0].length; i++) {
                Set<Integer> set = new HashSet<>();
                for (int j = 0; j < grid.length; j++) {
                    set.add(grid[i][j]);
                }
                if(set.size() < grid[0].length){
                    rowSum++;
                }
            }
        for (int i = 0; i < grid[0].length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < grid.length; j++) {
                set.add(grid[j][i]);
            }
            if(set.size() < grid[0].length){
                colSum++;
            }
        }

        return new int[]{sum, rowSum, colSum};
    }
}
class CodeJamQuest1{

    public static void main(String[] args) {
        System.out.println("Hello vs Code");
        int[][] grid = {{1, 2, 3, 4},
                {2, 1, 4, 3},
                {3, 4, 1, 2},
                {4, 3, 2, 1}};

        int[][] grid1  =
                {{2, 2, 2, 2},
                {2, 3, 2, 3},
                {2, 2, 2, 3},
                {2, 2, 2, 2}};
        int[][] grid3 = {{2, 1, 3},
                {1, 3, 2},
                {1, 2, 3}};
        CodeJam obj = new CodeJam();
        /*for(int i: obj.question1(grid)){
            System.out.println(i);
        }*/
        for(int i: obj.question1(grid)){
            System.out.println(i);
        }

    }

}