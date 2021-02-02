package _02_java_loop.exercises;
public class Check100Primes {
    public static void main(String[] args) {
        System.out.println("prime numbers in the range 2-100 :");
        for (int i = 2; i <= 100; i++) {
            int j=2 ;
            boolean check = true;
            while (j <= Math.sqrt(i)) {
                if (i % j== 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check)
                System.out.println(i);
        }
    }
}

