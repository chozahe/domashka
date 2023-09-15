import java.lang.Math;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int  year, animal;
       System.out.println("напишите ваш год рождения!");
       year = scan.nextInt();
       animal = year % 12;
       //цикл начинается с 1996 года, поэтому он съезжает на 4 года вот1
       switch(animal){
           case 0:
               System.out.println("Поздравляю, вы - обезьяа!!!");
               break;
           case 1:
               System.out.println("Поздравляю, вы - петух!!!");
               break;
           case 2:
               System.out.println("Поздравляю, вы - собака!!!");
               break;
           case 3:
               System.out.println("Поздравляю, вы - свинья!!!");
               break;
           case 4:
               System.out.println("Поздравляю, вы - крыса!!!");
               break;
           case 5:
               System.out.println("Поздравляю, вы - корова!!!");
               break;
           case 6:
               System.out.println("Поздравляю, вы - тигр!!!");
               break;
           case 7:
               System.out.println("Поздравляю, вы - зайчик :3!!!");
               break;
           case 8:
               System.out.println("Поздравляю, вы - дракон!!!");
               break;
           case 9:
               System.out.println("Поздравляю, вы - змей!!!");
               break;
           case 10:
               System.out.println("Поздравляю, вы - лошадь!!!");
               break;
           case 11:
               System.out.println("Поздравляю, вы - овца!!!");
               break;
       }


    }
}
