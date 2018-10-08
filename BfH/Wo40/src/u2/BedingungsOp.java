// Demonstrates the ? operator
package u2;

public class BedingungsOp {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int max = a > b ? a : b;

        System.out.print("max = " + max + " und ");

        System.out.println(max%2 == 0 ? "gerade" : "ungerade");
     }
}
