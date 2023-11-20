package chrome;

import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp = 0;


        for (int i = 0; i < 5; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }

    }
}
