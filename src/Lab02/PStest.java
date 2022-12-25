package Lab02;

public class PStest {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
//        int num1 = 55, num2 = 121, gcd = 1;
//        for(int i = 1; i <= num1 && i <= num2; i++)
//        {
//            if(num1%i==0 && num2%i==0)
//                gcd = i;
//        }
//        System.out.println(gcd);
    }
}
