public class Grid {

    private int width;
    private int height;
    private boolean[][] grid;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.generateGrid();
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

    private void generateGrid(){
        this.grid = new boolean[this.height][this.width];
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
