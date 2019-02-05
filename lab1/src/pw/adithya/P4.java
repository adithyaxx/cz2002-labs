package pw.adithya;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i=1; i <= height; i++)
        {
            String s = "";

            for(int j=1; j <= i; j++)
            {
                if (i % 2 ==1)
                {
                    if (j % 2 == 1)
                        s += "AA";
                    else
                        s += "BB";
                }
                else
                {
                    if (j % 2 == 1)
                        s += "BB";
                    else
                        s += "AA";
                }
            }

            System.out.println(s);
        }
    }
}
