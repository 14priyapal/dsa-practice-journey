import java.util.*;
public class ArmstrongNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check is an Armstrong: ");
        int num = sc.nextInt();

        int temp = num;
        // fint the number of didgit present in given number
        int len = String.valueOf(num).length();

        int sum = 0;

        while(temp > 0){
            int ld = temp % 10;
            sum += Math.pow(ld, len);
            temp /= 10;
        }

        if(sum == num){
            System.out.println(num + " is an Armstrong Number.");
        }else{
            System.out.println(num + " is not an Armstrong Number.");
        }

    }
}
