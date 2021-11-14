package Edyodaprograms;
import java.util.Scanner;
public class RemoveLeadingZero {
    public static String removeLeadingZeroes(String str)
    {
        String strPattern = "^0+(?!$)";
        str = str.replaceAll(strPattern, "");
        return str;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String num = sc.next();
        String result = RemoveLeadingZero.removeLeadingZeroes(num);
        System.out.println(result);
    }

}
