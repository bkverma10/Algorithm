public class Leetcode_994 {
    public int orangeRotting(int[][] grid){
        int time = 0;
         int row = grid.length;
        int col = grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 2){
                time += rottenAdj(grid, i, j);
                System.out.println("time-> " + time);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }
    public int rottenAdj(int[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;
        int flag = 0;
        if(j<col-1 &&  grid[i][j+1] == 1){
            grid[i][j+1] = 2;
            flag = 1;
        }
        if(j>0 && grid[i][j-1] == 1){
            grid[i][j-1] = 2;
            flag = 1;
        }
        if(i>0 && grid[i-1][j] == 1){
            grid[i-1][j] = 2;
            flag = 1;
        }
        if(i<row -1 && grid[i+1][j] == 1){
            grid[i+1][j] = 2;
            flag = 1;
        }

        return flag;
    }

    public static void main(String[] args){
        Leetcode_994 obj = new Leetcode_994();

        //int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        //int[][] grid = {{0,2}};
        //int[][] grid ={{2,1,1},{0,1,1},{1,0,1}};
        //int[][] grid = {{1,2}};
        int[][] grid = {{1,1,2,0,2,0}};
         System.out.println(obj.orangeRotting(grid));
    }
}
