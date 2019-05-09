import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap");
        int so = scanner.nextInt();
        int sum = 0;
        for (;so >= 1;so/=10) {
            int b = so % 10;
            sum += b;
        }
        System.out.println(sum);
    }
}
