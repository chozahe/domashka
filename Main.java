import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double alpha, z1,  z2, z12, z22, z13, z23;
        Scanner scan = new Scanner(System.in);
        System.out.println("введите значение аргумента");
        alpha = scan.nextDouble();
        z1 = Math.cos(alpha) + Math.sin(alpha) + Math.sin(alpha * 3) + Math.sin(alpha * 3);
        z2 = 0.25 - 0.25 * Math.sin((2.5 * Math.PI) - (8 * alpha)) ;
        //System.out.println(z1);
        //System.out. println(z2);
        z12 = Math.round(z1 * 1000);
        z22 = Math.round(z2 * 1000);
        z13 = z12/1000;
        z23 = z22/1000;
        System.out.println(z13);
        System.out.println(z23);

    }
}