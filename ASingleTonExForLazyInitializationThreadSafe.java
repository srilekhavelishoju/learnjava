package EdyodaPractice.Threads.AssignmentOnThreads;

public class ASingleTonExForLazyInitializationThreadSafe
{
    private static volatile ASingleTonExForLazyInitializationThreadSafe instance;
    private static Object mutex=new Object();

    private ASingleTonExForLazyInitializationThreadSafe()
    {

    }
    public static ASingleTonExForLazyInitializationThreadSafe getInstance()
    {
        ASingleTonExForLazyInitializationThreadSafe result=instance;
        if(result==null)
        {
            synchronized (mutex)
            {
                result=instance;
                if(result==null)
                {
                    instance=result=new ASingleTonExForLazyInitializationThreadSafe();

                }
            }
        }
        return result;
    }
}
