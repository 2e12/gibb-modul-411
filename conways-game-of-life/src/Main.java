import java.util.Scanner;

public class Main {

    private boolean running = true;
    private Grid grid = new Grid(10, 10);
    private Render render = new Render(grid);
    private GameController gameController = new GameController(grid);


    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        this.loop();
    }

    private void loop(){
        while(this.running){
            this.render.drawGrid();
            System.out.println("Press 'n' and enter for the next generation.");
            gameController.processGeneration();
            new Scanner(System.in).next();
        }
    }
}
