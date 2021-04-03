public class Leetcode_64 {
    int min = Integer.MAX_VALUE;
    int sum = 0;
    public int minPathSum(int[][] grid){

        return helper(grid, 0,0);

    }
    public int helper(int[][] grid, int i,int j){
            if(i == grid.length || j == grid[0].length){
                return Integer.MAX_VALUE;
            }
            if(i == grid.length - 1 && j == grid[0].length - 1){
                return grid[i][j];
            }
            System.out.println(grid[i][j]);
            //sum += grid[i][j];
            //min = Math.min(min,sum);
            //System.out.println(min);
            return grid[i][j] + Math.min(helper(grid,i+1,j),helper(grid,i,j+1));
    }
    public static void main(String[] args){
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        Leetcode_64 obj = new Leetcode_64();
        System.out.println(obj.minPathSum(grid));
    }
}
