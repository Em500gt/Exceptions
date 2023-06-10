import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr;
        while (true) {
            try {
                System.out.print("Введите строку: ");
                inputStr = scanner.nextLine();
                if (inputStr.isEmpty()) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Пустые строки вводить нельзя, попробуйте еще раз");
            }
        }
        scanner.close();
        System.out.println("Вы ввели строку: " + inputStr);
    }
}
