import java.util.Scanner;

public class Main {

    private boolean running = true;
    private Grid grid = new Grid(35, 12);
    private Render render = new Render(grid);


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
            new Scanner(System.in).next();
        }
    }
}
