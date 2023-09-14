import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double alpha, z1,  z2;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите значение аргумента");
        alpha = scan.nextDouble();
        z1 = Math.cos(alpha) + Math.sin(alpha) + Math.sin(alpha * 3) + Math.sin(alpha * 3);
        z2 = 0.25 - 0.25 * Math.sin((2.5 * Math.PI) - (8 * alpha)) ;


        System.out.println(z1);
        System.out.println(z2);

    }
}