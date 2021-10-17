import java.io.*;
class Factorial
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
long fact=1;
System.out.println("enter a number");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("factorial:"+fact);
}
}