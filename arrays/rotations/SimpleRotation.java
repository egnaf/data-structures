import java.util.Arrays;

public class SimpleRotation {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotate(array)));
    }

    private static int[] rotate(int[] array) {
        int[] rotatedArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            rotatedArray[i] = array[i];
        }
        return rotatedArray;
    }
}
