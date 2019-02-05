package pw.adithya;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int inc = scanner.nextInt();

        if (end < start) {
            System.out.println("Error input!!");
        }
        else {
            System.out.print("US$        S$\n" + "--------------\n");
            for (int i = start; i <= end; i += inc) {
                System.out.printf("%-2d       %-2.2f\n", i, (i * 1.82));
            }

            int temp = start;
            System.out.print("\nUS$        S$\n" + "--------------\n");
            while (temp <= end) {
                System.out.printf("%-2d       %-2.2f\n", temp, (temp * 1.82));
                temp += inc;
            }

            System.out.print("\nUS$         S$\n" + "--------------\n");
            do {
                System.out.printf("%-2d       %-2.2f\n", start, (start * 1.82));
                start += inc;
            }
            while (start <= end);
        }
    }
}
