package Edyodaprograms;
import java.lang.Cloneable;
class Student implements Cloneable
{
    int i;
    String s;
    public Student(int i,String s)
    {
        this.i=i;
        this.s=s;
    }
    @Override
    protected Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}

public class CloneTest
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Student student=new Student(1,"Srilekha");
        Student stu=(Student)student.clone();
        System.out.println("Student Rollno:" +stu.i +"\nStudent Name:" +stu.s);


    }
}
