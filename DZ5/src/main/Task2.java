/*
Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой,
например, состояния ячеек поля для игры в крестики-нолики, где
0 – это пустое поле,
1 – это поле с крестиком,
2 – это поле с ноликом,
3 – резервное значение.
Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
Записать в файл 9 значений так, чтобы они заняли три байта.
 */

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 3, 2, 1, 0, 0, 1};
        String fileName = "Tic-tac-toe1";
        saveArray(arr, fileName);
    }

    private static void saveArray(int[] arr, String fileName) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            int count = 1;
            int rez = 0;
            for (int num : arr) {
                rez += num;
                if (count < 3) {
                    rez = rez << 2;
                    count++;
                } else {
                    outputStream.writeByte(rez);
                    rez = 0;
                    count = 1;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
