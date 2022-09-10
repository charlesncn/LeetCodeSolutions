public class Islands {
    public static int numIslands(char[][] grid){
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(grid[i][j] =='1'){
                    count +=1;
                    callBFS(grid, i,j);
                }
            }
        }
        System.out.println(count);
        return count;
    }
    public static void callBFS(char[][] grid, int i, int j){
        boolean b = i < 0 || i >= grid.length || j < 0 || j >= grid.length || grid[i][j] == '0';
        if(b)
            return;
        grid[i][j] = '0';
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j+1);
        callBFS(grid, i, j-1);
    }

    public static void main(String[] args) {
        char[][] test = {{'1','1','0','1','1','1'},{'1','1','1','0','0','1'},{'1','1','0','1','1','1'},{'1','0','0','1','1','1'}};
        numIslands(test);
    }
}
