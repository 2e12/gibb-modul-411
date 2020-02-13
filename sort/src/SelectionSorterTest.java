import java.util.Arrays;
import java.util.Random;

public class SelectionSorterTest {
    public static void main(String[] args) {
        int[] a = randomArray(20, 80);
        System.out.println(Arrays.toString(a));

        SelectionSorter selectionSorter = new SelectionSorter(a);
        selectionSorter.sort();
        
        System.out.println(Arrays.toString(a));
    }

    public static int[] randomArray(int length, int numberSize){
        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0; i < length; i++){
            array[i] = random.nextInt(numberSize);
        }
        return array;
    }
}
