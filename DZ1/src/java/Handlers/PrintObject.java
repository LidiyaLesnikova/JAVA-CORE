package Handlers;

/**
 * Класс вывода печатной строки
 */
public class PrintObject {
    /**
     * Выводит строку с математическим выражением
     * @param a - первое переданное число
     * @param b - второе переданное число
     * @param expression - математическое выражение
     * @param result - результат вычисления
     * @return - строка
     */
    public String output(int a, int b, String expression, int result) {
        return a + " "+ expression + " " + b + " = "+result;
    }
}
