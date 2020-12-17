package com.company;
import java.util.Scanner;

import static java.lang.System.out;
class Task4 {
    private int Start;
    private int End;

    ////////
    Task4() {
    }

    Task4(int start, int end) {
        this.Start = start;
        this.End = end;
    }

    private static int getStart() {
        return Start;
    }

    private static int getEnd() {
        return End;
    }

    private int[] GetOdd() {
        int[] b = new int[100];
        int i = 1;
        if (getStart() % 2 != 0) {
            b[0] = getStart();
        } else {
            b[0] = getStart() + 1;
        }
        while (getEnd() - 1 > b[i - 1]) {
            b[i] = b[i - 1] + 2;
            i++;
        }
        b[i] = 9999;
        return b;
    }

    private int[] GetEven() {
        int[] b = new int[100] ;
        int i = 1;
        if (getEnd() % 2 == 0) {
            b[0] = getEnd();
        } else {
            b[0] = getEnd() - 1;
        }
        while (getStart() + 1 < b[i - 1]) {
            b[i] = b[i - 1] - 2;
            i++;
        }
        b[i] = 9999;
        return b;
    }

    private int sum(int[] b) {
        int i = 0;
        int sum = 0;
        while (b[i] != 9999) {
            sum += b[i];
            i++;
        }
        return sum;
    }

    private int[] Mosts() {
        int[] rtr = new int[100];
        int bigOdd, bigEven;
        if (getEnd() % 2 != 0) {
            bigOdd = getEnd();
        } else {
            bigOdd = getEnd() - 1;
        }
        rtr[0] = bigOdd;
        if (getEnd() % 2 == 0) {
            bigEven = getEnd();
        } else {
            bigEven = getEnd() - 1;
        }
        rtr[1] = bigEven;
        return rtr;
    }

    private int[] Fibonacci(int length, int[] numbers) {
        int i = 2;
        for (; i < length; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        numbers[i] = 9999;
        return numbers;
    }

    private void printPercentages(int length, int[] numbers) {
        int odds = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 != 0) {
                odds++;
            }
        }
        out.println(odds / length * 100 + "% - of odd numbers in Fibonacci array");
        out.println(100 - odds / length * 100 + "% - of even numbers in Fibonacci array");
    }

    private void printNumbers(int[] numbers) {
        int i = 0;
        while (numbers[i] != 9999) {
            out.print(" "+numbers[i]);
        }
    }
    public void start()
    {
       out.println("Odd numbers: "); printNumbers(GetOdd());
       out.println("Even numbers: "); printNumbers(GetEven());
       out.println("Sum of odd"); out.print(sum(GetOdd()));
       out.println("Sum of even"); out.print(sum(GetEven()));
       out.println("Input length of Fibonacci array:");
       Scanner mun=new Scanner(System.in);
       int length=mun.nextInt();
       out.println("Array of Fibonacci:"); printNumbers(Fibonacci(length,Mosts()));
       out.println("Percentages: "); printPercentages(length,Fibonacci(length,Mosts()));


    }
}
public class Main extends Task4{
    static int a;
    static char b;
    static double c;
    public static void main(String[] args) {

        out.println("1. Hello World!");
        out.println("2. Default initialisation int "+a);
        out.println("   Default initialisation char "+b);
        out.println("3. Input 3 args (int, char, double):");
        Scanner num = new Scanner(System.in);
        a= num.nextInt();
        b=num.next().charAt(0);
        c= num.nextDouble();
        out.println(a);
        out.println(b);
        out.println(c);
        ///////////////
        int start, end;
        out.println("4. Input interval: ");
        start=num.nextInt();
        end=num.nextInt();
        new Task4 (start,end).start();
    }
}
