import java.util.Scanner;
public class PrimeInteger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int integer = sc.nextInt();
        boolean isPrime = integer > 1;
        for(int i = 3; i <= 10; i++){
            if(integer < 1) {
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println(integer + " is a prime");
        } else {
            System.out.println(integer + " is not a prime");
        }


    }
}
