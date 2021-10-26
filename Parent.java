package Edyodaprograms.InterfaceAssignment;

public interface Parent
{
    void Message();
}
class Child1 implements Parent
{
    public void Message()
    {
        System.out.println("This is first subclass");
    }
}
class Child2 implements Parent
{
    public void Message()
    {
        System.out.println("This is second subclass");
    }
}