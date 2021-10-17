import java.io.*;
public class GreatestOfThreeNo
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c,temp,great;
System.out.println("enter three numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
temp=(a>b)?a:b;
great=(c>temp)?c:temp;
System.out.println("the greatest no is:"+great);
}
}
