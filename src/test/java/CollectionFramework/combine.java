package CollectionFramework;

import java.util.ArrayList;

public class combine {

    public static void main(String[] args) {

        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("selenium");
        ar1.add("automation");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("sahil");
        ar2.add("raza");

        ar1.addAll(ar2);
        System.out.println(ar1);


    }
}
