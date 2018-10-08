package u2;

public class Bit_Beispiele {

    public static void main(String[] args) {
        int x = 0x2d,  y = 0xab, z;

        System.out.printf("\tx : %d\t0x%x\n\ty : %d\t0x%x\n\n",x,x,y,y);
        z = x & y;      // ?
        System.out.printf(" x & y\t\t:%d  \t0x%x\n",z,z);
        z = x | y;      // ?
        System.out.printf(" x | y\t\t:%d  \t0x%x\n",z,z);
        z = x ^ y;      // ?
        System.out.printf(" x ^ y\t\t:%d  \t0x%x\n",z,z);
        z = ~x;      // ?
        System.out.printf(" ~x\t\t:%d  \t0x%x\n",z,z);

        System.out.println();
     }
}
