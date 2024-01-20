import java.util.Arrays;

/**
 *Написать метод, возвращающий количество чётных элементов массива:
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));

        arr = new int[] {2, 2, 0};
        System.out.println(countEvens(arr));

        arr = new int[] {1, 3, 5};
        System.out.println(countEvens(arr));
    }

    public static String countEvens(int[] arr) {
        int sumElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sumElements++;
            }
        }
        return Arrays.toString(arr) + " -> " + sumElements;
    }
}
