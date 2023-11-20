package CollectionFramework.Map;

import java.util.HashMap;
import java.util.HashSet;

public class compareHashmap {

    public static void main(String[] args) {

        HashMap<Integer, String> n1 = new HashMap<Integer, String>();
        n1.put(1, "M");
        n1.put(2, "A");
        n1.put(3, "P");



        HashMap<Integer, String> n2 = new HashMap<Integer, String>();
        n2.put(1, "M");
        n2.put(3, "P");
        n2.put(2, "A");


        HashMap<Integer, String> n3 = new HashMap<Integer, String>();
        n3.put(2, "A");
        n3.put(3, "P");
        n3.put(1, "M");
        n3.put(4, "G");


        //System.out.println(n1.equals(n3));

        HashSet<Integer> c1 = new HashSet<>(n1.keySet());
        c1.addAll(n3.keySet());
        c1.removeAll(n1.keySet());
        System.out.println(c1);



    }
}
