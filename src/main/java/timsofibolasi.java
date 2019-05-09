import com.sun.net.httpserver.HttpServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class timsofibolasi {
    private static boolean check(int[][] array) {
        for (int i=0; i < array[array.length - 1].length; i++) {
            boolean check = true;
            for (int[] anArray : array) {
                if (anArray[i] == 1) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return false;
            }
        }
       return true;
    }

    public static String check(String name) throws Exception {
        boolean check = true;
        for (int i = 0; i < name.length(); i++) {
            if (!String.valueOf(name.charAt(i)).matches("^[a-zA-Z]")) {
                check = false;
                break;
            }
        }
        if (check) {
            return name;
        } else {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
//        int[][] array = {{1,1,0,1,0},{0,0,1,0,0},{0,1,0,1,0},{0,0,1,0,0}};
//        System.out.println(check(array));
//        int [] superArray = {1,2,3};
//        Arrays.fill(superArray, 5);
//        List<int[]> s =  Arrays.asList(superArray);
//        System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean check = true;
        while (check) {
            try {
                String trueName = check(name);
                System.out.println(trueName);
                check = false;
            } catch (Exception e) {
                name = scanner.next();
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap");
//        int a = scanner.nextInt();
//        int[] array = new int[a];
//        array[0] = array [1] = 1;
//        int sum = 0;
//        for (int i =0; i < array.length - 2; i++) {
//            array[i + 2] = array[i] + array[i + 1];
//            sum = sum + array[i];
//        }
//        sum = sum + array[a - 2] + array[a - 1];
//        System.out.println(sum);
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 0; j <= 9; j++) {
//                int a = i*100001 + j*11110;
//                int b = i*110011 + j*1100;
//                arrayList.add(a);
//                arrayList.add(b);
//            }
//        }
//        System.out.println(arrayList);
//        String s = "001";
//        System.out.println(s);
    }
}
