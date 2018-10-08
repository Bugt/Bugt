package u2;

public class ArithOpUebung {

    public static void main(String[] args) {
        int i, j, k, l, m, n;
        i = 7 * 4 - 6 * 1;
        j = (7 - 3 * 6 ) % 7 - 7 + (-9 * 2);
        k = -8 / 8 / 2 * 5 % 7;
        l = 45 - 34 + 11 % 3 -6;
        System.out.println("7 * 4 - 6 * 1 \t\t\t=> " + i);
        System.out.println("(7 - 3 * 6 ) % 7 - 7 + (-9 * 2) => " + j);
        System.out.println("-8 / 8 / 2 * 5 % 7 \t\t=> " + k);
        System.out.println("45 - 34 + 11 % 3 -6\t\t=> " + l);

        m = 5;
        n = m++ + 3;
        System.out.println("m = 5;\nn = m++ + 3 \t\t\t=> n: " + n + "\tm: " + m);
        m = 5;
        n = --m - 1 + m++;
        System.out.println("m = 5;\nn = --m - 1 + m++ \t\t=> n: " + n + "\tm: " + m);
    }
}
