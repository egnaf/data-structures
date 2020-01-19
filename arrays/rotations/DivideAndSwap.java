import java.util.Arrays;

public class DivideAndSwap {

    public static int[] rotate(int[] array) {
        int center = array.length / 2;
        for (int i = 0; i < center; i++) {
            swap(array, i, array.length - 1 - i);
        }
        return array;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        rotate(array);
        System.out.println(Arrays.toString(array));
    }
}

