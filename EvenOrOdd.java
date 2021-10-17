import java.io.*;
class EvenOrOdd
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n,rem;
    System.out.println("Enter n value:");
    n=Integer.parseInt(br.readLine());
    rem=n%2;
    if(rem==0)
      System.out.println("even number");
    else
      System.out.println("odd number");
  }
}
