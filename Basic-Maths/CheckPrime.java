public class CheckPrime {
    public static void main(String args[]) {
        int nums = 19;

        // Edge case: Numbers less than or equal to 1 are not prime
        if (nums <= 1) {
            System.out.println("False");
            return;
        }

        // Check divisibility from 2 to sqrt(nums)
        for (int i = 2; i <= Math.sqrt(nums); i++) {
            if (nums % i == 0) {
                System.out.println("False"); // Not prime
                return;
            }
        }

        // If no divisors are found, it's prime
        System.out.println("True");
    }
}
