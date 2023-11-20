package chrome;

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            int i = 9/0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Abc");
    }
}
