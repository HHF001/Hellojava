public class SieveOfEratosthenes080803 {
    void sieveOfEratosthenes(int limit) {
        boolean output[] = new boolean[limit + 1];
        for (int x = 0; x <= limit; x++) {
            output[x] = true;
        }
        output[0] = false;
        output[1] = false;
        for (int i = 2; i <= limit; i++) {
            if (output[i] == true) {
                for (int j = i * 2; j <= limit; j = j + i) {
                    output[j] = false;
                }
            }
        }
    }
}