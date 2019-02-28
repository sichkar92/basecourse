package week1;

/**
 * 5. Известны две скорости, одна в километрах в час, другая в метрах в секунду.
 * Какая из них больше? (нужно вывести на консоль наибольшее)
 */
public class Task5 {
    public static void main(String[] args) {
        int metersPerSecond = Integer.parseInt(args[0]);
        int kilometersPerHour = Integer.parseInt(args[1]);

        if (kilometersPerHour / 3.6 > metersPerSecond ){
            System.out.println(kilometersPerHour);
        } else if (kilometersPerHour / 3.6 < metersPerSecond) {
            System.out.println(metersPerSecond);
        }else {
            System.out.println("The same speed");
        }

    }
}
