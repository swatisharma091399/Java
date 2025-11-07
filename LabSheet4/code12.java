package LabSheet4;

class Fibonacci {
    int fibo(int x) {
        if (x <= 1) return x;
        return fibo(x - 1) + fibo(x - 2);
    }
}

public class code12 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.print(f.fibo(i) + " ");
        }
    }
}
