public class Leetcode_200 {
    public int numIslands(char[][] grid){
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    helper(grid, i, j);
                    count++;
                    System.out.println("time-> " + count);
                }
            }
        }

        return count;
    }

    public void helper(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!='1'){
            return;
        }
        grid[i][j] = '0';
        helper(grid, i,j-1);
        helper(grid, i, j+1);
        helper(grid, i-1,j);
        helper(grid, i+1,j);
    }


    public static void main(String[] args){
        Leetcode_200 obj = new Leetcode_200();
        char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};

        System.out.println(obj.numIslands(grid));

    }
}
