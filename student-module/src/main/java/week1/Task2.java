package week1;

/**
 * 2. Есть три числа, нужно вывести на консоль наибольшее
 */
public class Task2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c && c > a) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
