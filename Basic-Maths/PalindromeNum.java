public class PalindromeNum {
    public static void main(String args[]){
        int num = 1391;
        int temp = num;
        int reverse = 0;

        while(temp > 0){
            int ld = temp % 10;
            reverse = (reverse * 10) + ld;
            temp /= 10;
        }

        if(reverse == num){
            System.out.println("Give number is a Palindrome number: " + num);
        }else{
             System.out.println("Give number is not a Palindrome number: " + num);
        }
    }
}
