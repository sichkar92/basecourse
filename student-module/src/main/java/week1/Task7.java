package week1;

/**
 * 7. Есть число от 1 до 12 (номер месяца). По номеру месяца выдать сообщение о времени года (Winter, Spring, Summer, Autumn).
 * Если число лежит вне диапазона номеров месяца, программа должна выдать сообщение об ошибке (Wrong input!).
 */
public class Task7 {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);


        if (month > 12 || month < 1){
            System.out.println("Wrong input!");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }else if (month >= 9 && month <= 11){
            System.out.println("Autumn");
        }else {
            System.out.println("Winter");
        }
    }
}
