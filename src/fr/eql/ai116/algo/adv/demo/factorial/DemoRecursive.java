package fr.eql.ai116.algo.adv.demo.factorial;

public class DemoRecursive {

    public static void main(String[] args) {
        System.out.println("Factoriel de 6 : " + fact(6));
        System.out.println("Sum(9) : " + sum(9));
        System.out.println("Fibonacci de 10 : " + fibonacci(10));
    }

    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n-1);
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n-1);
    }

    static int fibonacci(int n) {
        int n1 = 0, n2 = 1;
        if (n == 0) return n1;
        if (n == 1) return n2;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
