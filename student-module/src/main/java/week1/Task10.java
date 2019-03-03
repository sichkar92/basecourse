package week1;

/**
 * 10. Дано трехзначное число. Определить:
 * а) верно ли, что все его цифры одинаковые;
 * б) есть ли среди его цифр одинаковые.
 *
 * Взависимости от результата сделать вывод "Все цифры одинаковые" / "Некоторые цифры одинаковые" / "Нету одинаковых цифр"
 */
public class Task10 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

       if(number / 100 == number % 10 && number / 100 == (number / 10) % 10 && number % 10 == (number / 10) % 10 ){
           System.out.println("Все цифры одинаковые");
       }else if (number / 100 == number % 10 || number / 100 == (number / 10) %10 || number % 10 == (number / 10) %10) {
           System.out.println("Некоторые цифры одинаковые");
       }else {
           System.out.println("Нету одинаковых цифр");
       }
    }
}
