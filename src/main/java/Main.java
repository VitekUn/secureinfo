public class Main {

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();

        System.out.printf("PowMods %d\n", lab1.powMod(175,235,257));
        System.out.printf("PowMods %d\n", lab1.powMod(595,703,991));

        long out[] = lab1.gcd(28,19);
        System.out.printf("NOD: %d X: %d Y: %d\n", out[0], out[1], out[2]);

        out = lab1.dh();
        System.out.printf("DH Zab: %d Zba: %d\n", out[0], out[1]);

        System.out.printf("BSGS %d\n", lab1.bsgs(6, 12, 229));


        System.out.println("/////////////////////////////////////////////");

        System.out.printf("PowMods %d\n", lab1.powMod(lab1.genLong(18),lab1.genLong(18),lab1.genLong(18)));

        out = lab1.gcd(lab1.genLong(9),lab1.genLong(9));
        System.out.printf("NOD: %d X: %d Y: %d\n", out[0], out[1], out[2]);

        out = lab1.dh();
        System.out.printf("DH Zab: %d Zba: %d\n", out[0], out[1]);

        System.out.printf("BSGS %d\n", lab1.bsgs(lab1.genLong(9), lab1.genLong(9), lab1.getLongPrime(9)));
    }
}