import java.util.Scanner;
public class CountOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number to check the lenght of the number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int ld = n % 10;
            count = count+1;
            n = n/10;
        }
        System.out.println("The Lenght of you number is: "+ count);
    }
} 