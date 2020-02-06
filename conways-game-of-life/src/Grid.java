import java.util.Random;

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
        this.fillGridRandomly();
    }

    private void fillGridRandomly(){
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
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
