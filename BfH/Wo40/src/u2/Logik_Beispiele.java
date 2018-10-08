package u2;

public class Logik_Beispiele {

    public static void main(String[] args) {
        int i = 10; short s = 20;
        boolean b;

        b = i > s;      // ?
        System.out.println(" i > s\t\t\t: " + b);
        b = i <= s;     // ?
        System.out.println(" i <= s\t\t\t: " + b);
        b = i != s;     //
        System.out.println(" i != s\t\t\t: " + b);
        b = (s > i) && (s == i);
        System.out.println(" (s > i) && (s == i)\t: " + b);
        b = (s > i) || (s == i);
        System.out.println(" (s > i) || (s == i)\t: " + b);
        b = !b;
        System.out.println(" !b\t\t\t: " + b);
        b = s > i || s == i;
        System.out.println(" s > i || s == i\t: " + b);
        System.out.println();
     }
}
