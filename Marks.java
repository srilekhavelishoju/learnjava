package Edyodaprograms;
import java.lang.Float;

    public abstract class Marks
{
    public abstract Float getPercentage();
}
 class A extends Marks
{
    int m1,m2,m3;

    public A(int m1, int m2, int m3)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public Float getPercentage()
    {
        Float Total=((m1+m2+m3)/(float)300)*100;
        return Total;
    }
}
 class B extends Marks
{
    int mm1,mm2,mm3,mm4;
    public B(int mm1,int mm2,int mm3,int mm4)
    {
        this.mm1=mm1;
        this.mm2=mm2;
        this.mm3=mm3;
        this.mm4=mm4;
    }
    public Float getPercentage()
    {
        Float Total1=((mm1+mm2+mm3+mm4)/(float)400)*100;
        return Total1;
    }
}
    class MainAbstract
{
    public static void main(String[] args)
    {
        A a1=new A(20,30,40);
        System.out.println("Marks Of Student A :"+a1.getPercentage());
        B b1=new B(20,30,40,50);
        System.out.println("Marks of Student B :"+b1.getPercentage());
    }

}