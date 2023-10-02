package homework;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public final static String regValue = "^\\-?(\\d+(\\.\\d+)?)$";

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        logger.info("Введено " + getFloatConsole("Введите число: "));
    }

    public static float getFloatConsole(String message) {
        boolean valueIsNotRight = true;
        float value = 0;
        Pattern pattern = Pattern.compile(regValue);

        while (valueIsNotRight) {
            String valueToConvert = getStringConsole(message);

            Matcher matcher = pattern.matcher(valueToConvert);

            if (matcher.matches()) {
                value = Float.parseFloat(valueToConvert);
                valueIsNotRight = false;
            } else {
                System.out.println("Неверный формат числа! Повторите ввод.");
            }
        }
        return value;
    }

    public static String getStringConsole(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);
        return scanner.next();
    }

}