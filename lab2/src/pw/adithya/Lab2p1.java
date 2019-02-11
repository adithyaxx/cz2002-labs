package pw.adithya;

import java.util.Scanner;
public class Lab2p1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println(divide(sc.nextInt(), sc.nextInt()));
                    break;
                case 3:
                    System.out.println(modulus(sc.nextInt(), sc.nextInt()));
                    break;
                case 4:
                    int num = countDigits(sc.nextInt());
                    if (num == -1)
                        System.out.println("Error Input!!\n");
                    else
                        System.out.printf("count = %d\n", num);
                    break;
                case 5:
                    System.out.printf("position : %d\n", position(sc.nextInt(), sc.nextInt()));
                    break;
                case 6:
                    long n = extractOddDigits(sc.nextInt());
                    if (n == -1)
                        System.out.println("Error Input!!\n");
                    else if (n == 0)
                        System.out.println("oddDigits = -1\n");
                    else
                        System.out.printf("oddDigits = %d\n", n);
                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }

    /* add method code here */
    public static void mulTest()
    {
        Scanner sc = new Scanner(System.in);

        int countCorrect = 0, countWrong = 0;
        for (int i=0; i < 5; i++) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            System.out.printf("How much is %d times %d? ", num1, num2);

            if (sc.nextInt() == num1 * num2)
                countCorrect++;
        }

        System.out.printf("\n%d answers out of 5 are correct\n\n", countCorrect);
    }

    public static int divide(int m, int n)
    {
        int i = 0;

        while (m > 0 && m >= n)
        {
            m -= n;
            i++;
        }

        return i;
    }

    public static int modulus(int m, int n)
    {
        while (m >= n)
        {
            m -= n;
        }

        return m;
    }

    public static int countDigits(int n)
    {
        int i = 0;

        if (n <= 0)
            return -1;

        while (n != 0)
        {
            n /= 10;
            i++;
        }

        return i;
    }

    public static int position(int n, int digit)
    {
        int i = 0;

        while (n != 0)
        {
            i++;

            if (n % 10 == digit)
                return i;
            else
                n /= 10;
        }

        return -1;
    }

    public static long extractOddDigits(long n)
    {
        long newNum = 0;

        if (n <= 0)
            return -1;

        String num = n + "";

        for (int i=0; i < num.length(); i++)
        {
            int digit = Integer.parseInt(num.substring(i,i+1));
            if (digit % 2 == 1)
            {
                newNum = newNum*10 + digit;
            }
        }

        return newNum;
    }
}