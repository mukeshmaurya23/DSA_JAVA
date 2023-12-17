public class primecount {
    public static int countPrimes(int n2) {

        // 10 2 3 5 7
        int count = 0;
        // int p = 1;

        // There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
        // for 2 prime no is 0
        boolean prime[] = new boolean[n2];

        for (int i = 2; i < n2; i++) {
            // optimize the code time complexity
            if (!prime[i]) {
                count++;
            }
            for (int j = 2; i * j < n2; j++) {
                prime[i * j] = true;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        // int n1 = 2;
        int n2 = 10;
        // System.out.println(countPrimes(n));
        // countPrimes(n2);
        System.out.println(countPrimes(n2));

    }
}
