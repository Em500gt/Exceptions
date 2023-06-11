import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО, дату рождения, номер телефона и пол через пробел: ");
        String input = scanner.nextLine();

        String[] inputData = input.split(" ");
        if (inputData.length != 6) {
            System.out.println("Ошибка: введено неверное количество данных");
            return;
        }

        String fullName = inputData[0] + ' ' + inputData[1] + ' ' + inputData[2];
        String birthDate = inputData[3];
        String phoneNumber = inputData[4];
        String gender = inputData[5];

        try {
            validateName(fullName);
            validateBirthDate(birthDate);
            validatePhoneNumber(phoneNumber);
            validateGender(gender);
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
            return;
        }

        String[] nameParts = fullName.split("\\s+");
        String lastName = nameParts[0];

        StringBuilder output = new StringBuilder();
        output.append(fullName).append(birthDate).append(" ").append(phoneNumber).append(gender).append("\n");

        try (FileWriter fileWriter = new FileWriter(lastName + ".txt", true)) {
            fileWriter.write(output.toString());
        } catch (IOException e) {
            System.err.println("Ошибка при записи данных в файл");
            e.printStackTrace();
        }

    }

    private static void validateName(String name) throws InvalidDataException {
        String[] nameParts = name.split("\\s+");
        if (nameParts.length < 3) {
            throw new InvalidDataException("Ошибка: введено неверное ФИО");
        }
    }

    private static void validateBirthDate(String birthDate) throws InvalidDataException {
        if (!birthDate.matches("\\d\\d\\.\\d\\d\\.\\d\\d\\d\\d")) {
            throw new InvalidDataException("Ошибка: неверный формат даты рождения");
        }
    }

    private static void validatePhoneNumber(String phoneNumber) throws InvalidDataException {
        if (!phoneNumber.matches("\\d+")) {
            throw new InvalidDataException("Ошибка: неверный формат номера телефона");
        }
    }

    private static void validateGender(String gender) throws InvalidDataException {
        if (!gender.matches("[fm]")) {
            throw new InvalidDataException("Ошибка: неверное значение пола");
        }
    }

    private static class InvalidDataException extends Exception {
        public InvalidDataException(String message) {
            super(message);
        }
    }

}