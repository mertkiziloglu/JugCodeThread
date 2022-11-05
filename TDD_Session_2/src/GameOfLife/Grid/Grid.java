package GameOfLife.Grid;

public class Grid {
    public Grid() {
    }

    public int[][] createGrid() {
        int[][] grid = {
                {1, 0, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 1, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 1, 1, 1, 0, 0},
                {1, 0, 1, 0, 0, 1, 1, 0, 0, 1},
                {1, 1, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 1, 1, 0, 0}};

        return grid;

    }

    public void printGrid(int[][] grid){
        int M=grid.length;
        int L=grid[0].length;
        for(int i=0;i<M;++i){
            for(int j=0;j<L;++j){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
