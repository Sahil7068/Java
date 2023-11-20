package chrome;

import java.util.Scanner;

public class reversearray {

    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for (int i =0; i<n; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        String sum = "";

        for (int i =n-1; i>= 0; i--){
            sum = sum + a[i];

        }
        System.out.println(sum);
    }
}
