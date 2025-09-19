import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number that you want to reverse:  ");
        int n = sc.nextInt();
        int revNo = 0;
        while (n > 0) {
            int ld = n % 10;
            revNo = (revNo * 10) + ld;
            n /= 10;
        }
        System.out.println("The Lenght of you number is: " + revNo);

    }
}
