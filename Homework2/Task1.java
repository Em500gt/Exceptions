import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float num = readFloatFromUser();
        System.out.println("Вы ввели число: " + num);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float num;
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                num = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат числа, попробуйте еще раз");
                scanner.nextLine(); // Очистка буфера ввода
            }
        }
        scanner.close();
        return num;
    }
}
