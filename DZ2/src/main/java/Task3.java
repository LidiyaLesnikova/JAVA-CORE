import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением
 */
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 5, 0, 0, 9, 8, -1};
        System.out.println(checkForNull(arr));
    }

    private static boolean checkForNull(int[] arr) {
        return IntStream.range(0, arr.length-2).filter(i -> arr[i]==0 & arr[i+1]==0).count()>0;
    }
}
