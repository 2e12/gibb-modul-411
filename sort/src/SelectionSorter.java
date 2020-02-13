import java.util.Arrays;

public class SelectionSorter {

    private int[] array;

    public static void main(String[] args) {
        int[] array = {2,1,6,3,5,4,9,8,7};
        new SelectionSorter(array).sort();
        System.out.println(Arrays.toString(array));
    }

    public SelectionSorter(int[] array) {
        this.array = array;
    }

    public void sort() {
        for(int current = 0; current < array.length; current++){
            int smallest = array[current];
            int indexFromSmallest = current;

            int i = current;
            while (i < array.length){
                if(array[i] < smallest){
                    smallest = array[i];
                    indexFromSmallest = i;
                }
                i++;
            }
            swap(this.array, current, indexFromSmallest);
        }
    }

    public static final <T> void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
