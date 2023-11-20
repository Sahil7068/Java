package chrome;

import java.util.HashSet;
import java.util.Set;

public class ddp {
    public static void main(String[] args) {
        String names[] = {"java", "mava", "moca", "chai", "moca"};

        Set<String> ss = new HashSet<String>();
        for (int i =0; i< names.length; i++){
            String k = names[i];
            if (ss.add(k) == false){
                System.out.println("The duplicate elemts is " + k);
            }
        }


    }
}
