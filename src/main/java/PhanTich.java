import java.util.ArrayList;
import java.util.Scanner;

public class PhanTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap");
        int a = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
       for (int i = a -1; i != 0; i--) {
            if (a % i == 0) {
                array.add(a/i);
                a = i;
            }
        }
        System.out.println(array);
    }
}
