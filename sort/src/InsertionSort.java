import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        new InsertionSort();
    }

    public InsertionSort() {
        Integer[] list = {0,9,4,6,2,8,5,1,7,3};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public void insertionSort(Integer[] array){
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
    }
}
