package week1;
import java.util.Scanner;
/**
 * 9. Написать программу вычисления идеального веса пользователя.
 * Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name!");
        String name = sc.nextLine();
        System.out.println("Enter you gender! (M or W)");
        String gender = sc.nextLine();
        System.out.println("Enter you weight!");
        double weight = sc.nextDouble();
        System.out.println("Enter you height!");
        double height = sc.nextDouble();

        if (gender.equals("M")) {   // This operations for Man
            double perfectWeightM = (height - 100) * 1.15;
            double differWeightM = weight - perfectWeightM ; // with Different Weight we understand you fat or thin
            if (differWeightM <= -3) {
                System.out.println(name + ", your perfect weight is " + perfectWeightM + " You are THIN!!! You need to add " +
                        -differWeightM+ " kilograms");
            } else if (differWeightM >= 3) {
                System.out.println(name + ", your perfect weight is " + perfectWeightM + " You are FAT!!! You need to lose " +
                        differWeightM+ " kilograms");
            } else {
                System.out.println(name + ", you are beautiful, because you have perfect weight -  " + perfectWeightM);
            }
        } else {  // this operations for Women
            double perfectWeightW = (height - 100) - (height - 150) / 2;
            double differWeightW = weight - perfectWeightW ;
            if (differWeightW <= -3) {
                System.out.println(name + ", your perfect weight is " + perfectWeightW + " You are THIN!!! You need to add " +
                        -differWeightW+ " kilograms");
            } else if (differWeightW >= 3) {
                System.out.println(name + ", your perfect weight is " + perfectWeightW + " You are FAT!!! You need to lose " +
                        differWeightW+ " kilograms");
            } else {
                System.out.println(name + ", you are beautiful, because you have perfect weight -  " + perfectWeightW);
            }
        }

    }
}
