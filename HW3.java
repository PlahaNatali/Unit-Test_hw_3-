package third.hw;

public class HW3 {
    // HW 3.1. Напишите тесты, покрывающие на 100% метод evenOddNumber, 
    // который проверяет, является ли переданное число четным(true) или нечетным(false).
    public boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    // HW 3.2. Разработайте и протестируйте метод numberInInterval, который проверяет, 
    // попадает ли переданное число в интервал (25;100) возвращает true, если попадает и false - если нет.
    public boolean numberInInterval(int n) {
        return (n > 25) && (n < 100);
    }
}