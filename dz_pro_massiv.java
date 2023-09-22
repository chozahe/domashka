import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        //создадим и заполним массив с n элементами
        int summa = 0;
        int chet = 0;
        int n = (int) (Math.random() * 101);
        int last = n - 1;//пушта если нулевых элементов не будет, надо чтобы считалось до конца
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = -100 + (int) (Math.random() * 201);
        }

        //найду последний нулевой элемент

        for (int i = 0; i < n; i++) {
            if (m[i] == 0){
                last = i;
            }
        }
        //найду сумму элементов до последнего нулевого элемента'

        for(int i =0; i <= last; i++){
            summa = summa + m[i];
        }
        System.out.println("Сумма элементов до последнего нулевого элемента: " + summa);

        // найду кол-во отрицат. элементов массива с четными номерами!

        for(int i = 0; i<n; i++){
            if(m[i] <0 && (i+1) % 2 == 0){
                chet++;
            }
        }

        System.out.println("Количество отрицательных элементов с четными номерами: " + chet);

        for (int i = 0; i < n; i++) {
            System.out.print(" " + m[i]);
        }
    }
}
