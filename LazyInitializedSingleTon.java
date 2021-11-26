package EdyodaPractice.Threads.AssignmentOnThreads;

public class LazyInitializedSingleTon
{
    private static LazyInitializedSingleTon instance;
    private LazyInitializedSingleTon()
    {

    }
    public static LazyInitializedSingleTon getInstance()
    {
        if(instance==null)
        {
            instance=new LazyInitializedSingleTon();
        }
        return  instance;
    }
}
