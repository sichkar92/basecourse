package week1;

/**
 * 13. Известны площади круга и квадрата. Определить:
 * а) уместится ли круг в квадрат;
 * б) уместится ли квадрат в круге.
 *
 * Взависимости от результата сделать вывод "Круг уместится в квадрат" / "Квадрат уместится в круг" / "Фигуры не вмещаются друг в друга"
 */
public class Task13 {
    public static void main(String[] args) {
        int circle = Integer.parseInt(args[0]);
        int square = Integer.parseInt(args[1]);

        if (Math.sqrt(2*square) <= 2*Math.sqrt(circle/Math.PI)) {
            System.out.println("Квадрат уместится в круг");
        } else if (2*Math.sqrt(circle/Math.PI) <= Math.sqrt(square)) {
            System.out.println("Круг уместится в квадрат");
        } else {
            System.out.println("Фигуры не вмещаются друг в друга");
        }

    }
}
