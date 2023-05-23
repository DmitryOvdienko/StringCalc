import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String str = scanner.nextLine();

        StringCalculator calc = new StringCalculator();
        String[] array = str.split(" ");
        String a = array[0].replace("\"", "");
        String action = array[1];
        String b = array[2].replace("\"", "");
        Checker.check(a,b, array);
        System.out.println (calc.calculate(action, a, b));
    }
}