public class GameController {
    Grid grid;

    public GameController(Grid grid) {
        this.grid = grid;
    }

    public boolean isCellAlive(int x, int y){
        int neighbours = this.grid.countLivingSurroundingCells(x, y);
        if(neighbours == 3){
            return true;
        }
        if(neighbours == 2 && this.grid.get(x, y)){
            return true;
        }
        return false;
    }

    public void processGeneration(){
        boolean[][] nextGeneration = this.grid.generateGrid();
        int y = 0;

        while (y < this.grid.getHeight()) {
            int x = 0;
            while (x < this.grid.getWidth()) {
                nextGeneration[y][x] = isCellAlive(x, y);
                x++;
            }
            y++;
        }
        this.grid.setGrid(nextGeneration);
    }
}
