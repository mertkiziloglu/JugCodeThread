package GameOfLife;


import GameOfLife.Grid.Grid;
import GameOfLife.Neighbour.Neighbour;

public class GameOfLife {

    public int[][] createGrid(){
        Grid grid=new Grid();
        return grid.createGrid();
    }

    public void printGrid(int[][] grid){
        Grid gridInstance=new Grid();
        gridInstance.printGrid(grid);
    }

    public int countLivingNeighbours(int[][] grid){
        Neighbour neighbour=new Neighbour(grid);
        return neighbour.countLivingNeighbours();
    }
    public int countDeathNeighbours(int[][] grid){
        Neighbour neighbour=new Neighbour(grid);
        return neighbour.countDeathNeighbours();
    }

}
