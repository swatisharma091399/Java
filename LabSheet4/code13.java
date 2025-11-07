package LabSheet4;

class GCD {
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

public class code13 {
    public static void main(String[] args) {
        GCD g = new GCD();
        System.out.println("GCD of 48 and 18: " + g.gcd(48, 18));
    }
}
