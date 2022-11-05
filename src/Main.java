public class Main {
    public static void main(String[] args) {


        int M = 10, Y = 10;

        int[][] grid = {{0, 0, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
        };

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < Y; j++) {
                if (grid[i][j] == 0) {
                    System.out.print(" ");
                    System.out.print(".");
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("   ");
        }
        System.out.println("   ");
        nextGeneration(grid, M, Y);
        System.out.println(" ");
    }


    static void nextGeneration(int grid[][], int M, int N) {
        int[][] gameTable = new int[M][N];

        for (int l = 0; l < M; l++) {
            for (int m = 0; m < N; m++) {

                int aliveNeighbours = 0;

                //sayim yapilan yer
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((l + i >= 0 && l + i < M) && (m + j >= 0 && m + j < N)) {
                            aliveNeighbours += grid[l + i][m + j];
                        }
                    }
                    aliveNeighbours -= grid[l][m];

                    //set living cells
                    if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                        gameTable[l][m] = 0;


                    else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                        gameTable[l][m] = 0;


                    else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                        gameTable[l][m] = 1;

                    else
                        gameTable[l][m] = grid[l][m];
                }
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (gameTable[i][j] == 0)
                        System.out.print(".");
                    else
                        System.out.print("*");
                }
                System.out.println();
            }

        }


    }
}