package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if (number / 100000 +(number / 10000) % 10 + (number / 1000) % 10 == (number / 100) % 10 + (number / 10) % 10 +
                + number % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
