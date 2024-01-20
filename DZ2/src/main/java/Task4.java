import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать метод, принимающий на вход размеры двумерного массива и выводящий массив в виде
 * инкременированной цепочки чисел, идущих по спирали
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(printMassive());
    }

    private static String printMassive() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество столбцов двумерного массива: ");
            int col = scanner.nextInt();
            System.out.println("Введите количество строк двумерного массива: ");
            int row = scanner.nextInt();

            String[][] arr = new String[row][col];
            int count = 1;
            int size = row * col;
            for (int i = 0; count <= size; i++) {
                //right
                for (int j = i; j < col-i & count <= size; j++) {
                    arr[i][j] = String.format("% 4d",count++);
                }
                //down
                for (int j = i+1; j < row-i & count <= size; j++) {
                    arr[j][col-1-i] = String.format("% 4d",count++);
                }
                //left
                for (int j = col-2-i; j >= i & count <= size; j--) {
                    arr[row-1-i][j] = String.format("% 4d",count++);
                }
                //up
                for (int j = row-2-i; j > i & count <= size; j--) {
                    arr[j][i] = String.format("% 4d",count++);
                }
            }
            return Arrays.deepToString(arr).replace("[","").replace("], ", "\n").replace("]","");
        } catch (Exception e) {
            System.out.println("Ошибка ввода типа данных. Попробуйте снова");
        }
        return printMassive();
    }
}
