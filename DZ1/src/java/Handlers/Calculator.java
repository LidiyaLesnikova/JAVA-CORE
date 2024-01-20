package Handlers;

/**
 * Класс расчета математических выражений
 */
public class Calculator {
    /**
     * Суммирует два переданных числа
     * @param a - первое переданное число
     * @param b - первое переданное число
     * @return - сумма чисел
     */
    public int summ(int a, int b) {
        return a+b;
    }

    /**
     * Умножает два переданных числа
     * @param a - первое переданное число
     * @param b - первое переданное число
     * @return - произведение чисел
     */
    public int multiply(int a, int b) {
        return a*b;
    }

    /**
     * Считает разность двух переданных чисел
     * @param a - первое переданное число
     * @param b - первое переданное число
     * @return - разность чисел
     */
    public int diff(int a, int b) {
        return a-b;
    }

    /**
     * Считает остаток от деления двух чисел
     * @param a - первое переданное число
     * @param b - первое переданное число
     * @return - остаток от деления чисел
     */
    public int dividing(int a, int b) {
        return a/b;
    }
}
