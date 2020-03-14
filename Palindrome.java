import java.util.*;
public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System .in);
        int n = sc.nextInt(); 
        int rev_n = 0,rem, temp;

        temp = n;

        while( n != 0 )
        {
            rem = n % 10;
            rev_n = rev_n * 10 + rem;
            n  /= 10;
        }

        if (temp == rev_n)
            System.out.println("Given Integer" + " is a palindrome.");
        else
            System.out.println("Given Integer" + " is not a palindrome.");
    }
}