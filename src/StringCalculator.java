public class StringCalculator {

    public String calculate(String action, String a, String b) {
        if (action.equals("+")) {
            return sum(a, b);
        } else if (action.equals("-")) {
            return minus(a, b);
        } else if (action.equals("*")) {
            return proizv(a, b);
        } else if (action.equals("/")) {
            return divide(a, b);
        } else {
            throw new ArithmeticException("Введена некорректная операция");
        }
    }

    private String sum(String a, String b) {

        return "\"" + a.concat(b) + "\"";
    }

    private String minus(String a, String b) {
        return "\"" + a.replace(b, "") + "\"";
    }

    private String proizv(String a, String b) {
        String result;
        int n;
        try {
            n = Integer.parseInt(b);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Введенные значения не удовлетворяют заданию");
        }
        if (n < 1 || n > 10) {
            throw new ArithmeticException("Введенные значения не удовлетворяют заданию");
        }

        result = ("\"" + a.repeat(n) + "\"");
        if (result.length() > 40) {
            return result.substring(0, 40) + "...";
        } else if (result.length() < 40) {
            return result;
        }
        return result;
    }

    private String divide(String a, String b) {
        int n;
        try {
            n = Integer.parseInt(b);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("Введенные значения не удовлетворяют заданию");
        }

        if (n < 1 || n > 10) {
            throw new ArithmeticException("Введенные значения не удовлетворяют заданию");
        }
        int num = a.length() / n;
        return "\"" + a.substring(0, num) + "\"";

    }

}
