package week1;

/**
 * 11. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
 * Например, 1 копейка, 5 копеек, 42 копейки.
 */
public class Task11 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

       if (number < 1 || number > 99){
           System.out.println("Incorrect number");
       } else if (number >= 11 && number <= 14){
           System.out.println(number+" копеек");
       } else if (number % 10 == 1){
           System.out.println(number+" копейка");
       } else if (number % 10 >= 2 && number % 10 <= 4) {
           System.out.println(number+" копейки");
        }else {
           System.out.println(number+" копеек");
        }

    }
}
