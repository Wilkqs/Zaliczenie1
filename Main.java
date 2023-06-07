import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj równanie w formie ax + b = y");
        System.out.print("Podaj wartość a:");
        double a = scanner.nextDouble();
        System.out.print("Podaj wartość b:");
        double b = scanner.nextDouble();

        if (a==0) {
            System.out.println("To nie jest rownanie liniowe.");
        } else {
            System.out.println("To jest rownanie liniowe.");
        }
    }
}