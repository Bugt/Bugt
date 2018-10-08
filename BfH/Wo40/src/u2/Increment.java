package u2;
// Demonstrates the ? operator

public class Increment {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        a = ++b;
        System.out.println("a = " + a + "   b = " + b);

        a = 5;
        b = 7;

        a = b++;
        System.out.println("a = " + a + "   b = " + b);
     }
}
