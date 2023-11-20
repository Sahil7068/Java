package CollectionFramework;

import java.util.ArrayList;

public class iteratingArrayList {

    public static void main(String[] args) {

        ArrayList<String> st = new ArrayList<String>();
        st.add("sahil");
        st.add("free");
        st.add("naive");
        st.add("confident");

        //Typical for loop
        for (int i=0; i< st.size(); i++){
            System.out.println(st.get(i));
        }

        System.out.println("--------");

        //for each loop
        for(String s : st){
            System.out.println(s);
        }
    }
}
