import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap");
        int so = in.nextInt();
        System.out.println(so);
        ArrayList<Integer> array = new ArrayList<Integer>();
        long time = System.nanoTime();
        for (int i = 0; i <= so; i++) {
            boolean inter = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    inter = false;
                    break;
                }
            }
            if (inter) {
                array.add(i);
            }
        }
        long time1 = System.nanoTime();
        System.out.println(time1 - time);
        System.out.println(array);
    }
}
