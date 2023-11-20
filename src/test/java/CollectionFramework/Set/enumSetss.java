package CollectionFramework.Set;

import java.util.EnumSet;

public class enumSetss {

    enum Tang{
        java,
        Ruby,
        javascript
    }

    public static void main(String[] args) {
        EnumSet<Tang> langs = EnumSet.allOf(Tang.class);
        System.out.println(langs);
    }
}
