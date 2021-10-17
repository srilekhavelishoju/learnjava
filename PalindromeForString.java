import java.util.*;
public class PalindromeForString
{
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = sc.nextLine();
        int length = str.length();
        for(int i = length - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}