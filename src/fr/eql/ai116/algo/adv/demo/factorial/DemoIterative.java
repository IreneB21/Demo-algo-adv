package fr.eql.ai116.algo.adv.demo.factorial;

public class DemoIterative {

    public static void main(String[] args) {
        System.out.println("Factoriel de 6 : " + fact(6));
        System.out.println("Sum(9) : " + sum(9));
        System.out.println("Fibonacci de 10 : " + fibonacci(10));
    }

    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int fibonacci(int n) {
        int n1 = 0, n2 = 1;
        if (n == 0) return n1;
        if (n == 1) return n2;
        int n3 = 0;

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}


