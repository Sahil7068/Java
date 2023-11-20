package chrome;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class duplicateArrayElements {

    public static void main(String[] args) {
        System.out.println("Enter the size of strings: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String a[] = new String[s];
        sc.nextLine();

        System.out.println("Enter the string of size " + s);

        for (int i = 0; i < s; i++) {
            a[i] = sc.nextLine();
        }

        for (int i = 0; i < s; i++) {
            System.out.print(" " + "------" +  a[i] + "-------");
        }
        System.out.println();



        Set<String> store = new HashSet<>();
            for(int i=0; i<s; i++){
                String k = a[i];
                if(store.add(k) == false){
                    System.out.println("duplicate element is " + k);

            }
        }

    }
}

//        String sa[] = {"java", "python", "ruby", "java"};
//
//        for (int i = 0; i < sa.length; i++) {
//            for (int j = i + 1; j < sa.length; j++) {
//                if (sa[i].equals(sa[j])) {
//                    System.out.println("The duplicate element is " + sa[i]);
//                }
//            }
//        }
//    }
//}

