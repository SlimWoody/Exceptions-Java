package homework;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task4 {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        logger.info(getStringConsole("Введите значение: "));

    }

    public static String getStringConsole(String message) {
        String stringValue = "";
        Scanner scanner = new Scanner(System.in);

        while (stringValue.isEmpty()) {
            try {
                System.out.println(message);
                stringValue = scanner.nextLine();
                if (stringValue.isEmpty()) {
                    throw new RuntimeException("Пустые строки вводить нельзя!");
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return stringValue;
    }
}