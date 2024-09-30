package Training;

import java.util.Scanner;

public class Demo_Java {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = scanner.nextInt();

//        if (n % 2 != 0) {
//            n++;
//        }

//        for (int i = n; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("So chia het cho 2 la: " + i);
//            }
//        }

        int i = n;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println("So chia het cho 2 la: " + i);
            }
            i++;
//            i += 2;
//            System.out.println("So chia het cho 2 la: " + i);
        }
    }
}
