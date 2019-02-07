package week1;

/**
 * 4. Есть значения трех сторон треугольника a, b и c.
 * Определить, является ли он прямоугольным. Ответ вывести в виде сообщения true/false.
 */
public class Task4 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
