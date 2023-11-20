package chrome;

import java.util.HashSet;
import java.util.Set;

public class DUPLIUSINGASAHSET {
    public static void main(String[] args) {


        String arr[] = {"java", "python", "ruby", "java"};

        Set<String> store = new HashSet<String>();
        for (int i =0; i<arr.length; i++){
            String k = arr[i];
            if (store.add(k) == false){
                System.out.println("The duplicate element is: " + k);
            }
        }


    }
}
