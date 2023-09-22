public class DZ {
    public static void main(String[] args) {
        for(int x = 10; x<100; x++){
            int x1, x2;
            x1 = x%10;
            x2 = (x - x1) /10;
            if (((x1 * x1) + (x2 * x2)) % 10 == 0){
                System.out.println(x);
            }
        }
    }
}
