package pw.adithya;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c = s.toLowerCase().charAt(0);

        switch(c)
        {
            case 'a':
                System.out.print("Action movie fan\n");
                break;
            case 'c':
                System.out.print("Comedy movie fan\n");
                break;
            case 'd':
                System.out.print("Drama movie fan\n");
                break;
            default:
                System.out.print("Invalid choice\n");
                break;
        }
    }
}
