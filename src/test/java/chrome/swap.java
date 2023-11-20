package chrome;

public class swap {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before swap " + "a = " + a + ", " + "b= " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The swapped number is " + "a = " + a + ", " + "b = " + b);

    }
}
