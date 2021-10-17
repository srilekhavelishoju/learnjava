class OppositeSigns
{
static boolean oppositeSigns(int x,int y)
{
return((x^y)<0);
}
public static void main(String args[])
{
int x=100,y=-100;
if(oppositeSigns(x,y)==true)
System.out.println("signs are opposite");
else
System.out.println("signs are not opposite");
}
}
