package pw.adithya;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int salary = scanner.nextInt();
            int merit = scanner.nextInt();

            if (salary >= 500 && salary < 600)
                System.out.print("Grade C\n");
            else if (salary >= 600 && salary <= 649) {
                if (merit < 10)
                    System.out.print("Grade C\n");
                else
                    System.out.print("Grade B\n");
            } else if (salary > 649 && salary < 700)
                System.out.print("Grade B\n");
            else if (salary >= 700 && salary <= 799) {
                if (merit < 20)
                    System.out.print("Grade B\n");
                else
                    System.out.print("Grade A\n");
            } else
                System.out.print("Grade A\n");
        }
    }
}
