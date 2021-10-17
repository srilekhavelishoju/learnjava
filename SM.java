class SM
{
int a,b,c;
public void sum(int x,int y)
{
  System.out.println("sum of two num is:"+(x+y));
}
public void sum(int x,int y,int z)
{
  System.out.println("sum of three num is:"+(x+y+z));
}
public void mul(int x,int y)
{
System.out.println("mul of two num is:"+(x*y));
 
}
public void mul(int x,int y,int z)
{
System.out.println("mul of three num is:"+(x*y*z));
}
public static void main(String args[])
{
SM sm=new SM();
sm.sum(2,3);
sm.sum(2,3,4);
sm.mul(2,3);
sm.mul(2,3,4);
}
}

 