import java.util.Arrays;

/**
 * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
 * переданного не пустого массива
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(diffElements(new int[]{1, 2, 3, 0, -4, 5, -1}));
            System.out.println(diffElements(new int[]{}));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив пустой");
        }
    }

    private static int diffElements(int[] arr) throws IndexOutOfBoundsException {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}
