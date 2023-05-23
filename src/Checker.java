public class Checker {

    public static void check (String a, String b, String[] array) {
        if (array.length > 3) {
            throw new ArithmeticException("Количество операндов не удовлетворяет заданию");
        }
        if (a.length() > 10 || b.length() > 10) {
            throw new ArithmeticException("Введенные значения не удовлетворяют заданию");
        }
        if (!array[0].contains("\"")) {
            throw new ArithmeticException("Первым аргументом выражения, подаваемого на вход, должна быть строка");
        }

    }

}
