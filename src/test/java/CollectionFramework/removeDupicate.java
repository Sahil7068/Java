package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class removeDupicate {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(13);
        al.add(12);
        al.add(114);

        LinkedHashSet<Integer> likhashset = new LinkedHashSet<Integer>(al);
        ArrayList<Integer> numwithoutd = new ArrayList<Integer>(likhashset);
        System.out.println(numwithoutd);


    }

}
