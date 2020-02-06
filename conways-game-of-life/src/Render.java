public class Render {

    private Grid gird;

    public Render(Grid gird) {
        this.gird = gird;
    }

    public char getSymbol(boolean cell){
        if(cell){
            return '░';
        }else{
            return '▓';
        }
    }

    public void drawGrid(){
        for (boolean[] line : this.gird.getGrid()) {
            for(boolean cell : line){
                System.out.print(getSymbol(cell));
            }
            System.out.println(); //New line
        }
    }
}
