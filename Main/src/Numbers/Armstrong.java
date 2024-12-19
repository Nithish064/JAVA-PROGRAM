package Numbers;
import java.util.*;

/*
First, given number (number)'s value is stored in another integer variable, originalNumber. This is because, we need to compare the values of final number and original number at the end.
Then, a while loop is used to loop through originalNumber until it is equal to 0.
On each iteration, the last digit of num is stored in remainder.
Then, remainder is powered by 3 (number of digits) using Math.pow() function and added to result.
Then, the last digit is removed from originalNumber after division by 10.
Finally, result and number are compared. If equal, it is an Armstrong number. If not, it isn't.
 */

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int Orginalnumber,  remainder, result = 0;

        Orginalnumber = num;
        while(Orginalnumber != 0) {
            remainder = Orginalnumber % 10;
            result += Math.pow(remainder, 3);
            Orginalnumber = Orginalnumber / 10;
        }

        if(result == num) {
            System.out.println(num + " is Armstrong Number");
        }
        else {
            System.out.println(num + " is not Armstrong Number");
        }
    }
}
