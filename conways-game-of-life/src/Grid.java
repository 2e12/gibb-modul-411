import java.util.Random;

public class Grid {

    private int width;
    private int height;
    private boolean[][] grid;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = this.fillGridRandomly(this.generateGrid());
    }

    public void set(int x, int y, boolean value){
        this.grid[y][x] = value;
    }

    public boolean get(int x, int y){
        return this.grid[y][x];
    }

    public int getGridSize(){
        return this.width * this.height;
    }

    public boolean[][] generateGrid(){
        boolean[][] grid = new boolean[this.height][this.width];
        return grid;
    }

    private boolean[][] fillGridRandomly(boolean[][] grid){
        Random random = new Random();
        int y = 0;

        while (y < this.height) {
            int x = 0;
            while (x < this.width) {
                int randomNumber = random.nextInt(10);
                if (randomNumber < 6) {
                    grid[y][x] = true;
                }
                x++;
            }
            y++;
        }
        return grid;
    }

    public boolean[][] getGrid() {
        return grid;
    }

    public void setGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public int countLivingSurroundingCells(int initX, int initY){
        int livingCells = 0;
        int startX = initX - 1;
        int startY = initY - 1;
        int scanLength = 3;
        int arrayIndex = 0;
        for (int y = startY; y < startY + scanLength; y++) {
            if (y < 0 || y > this.height - 1) {
                continue;
            }
            for (int x = startX; x < startX + scanLength; x++) {
                if (x < 0 || x > this.width - 1) {
                    continue;
                }
                if(initX != x && initY != y) {
                    if (this.get(x, y)) livingCells++;
                }
            }
        }
        return livingCells;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
