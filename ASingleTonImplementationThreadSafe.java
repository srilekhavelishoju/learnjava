package EdyodaPractice.Threads.AssignmentOnThreads;

public class ASingleTonImplementationThreadSafe
{
    private static volatile ASingleTonImplementationThreadSafe instance;
    private static Object mutex=new Object();

    private ASingleTonImplementationThreadSafe()
    {

    }
    public static ASingleTonImplementationThreadSafe getInstance()
    {
        ASingleTonImplementationThreadSafe result=instance;
        if(result==null)
        {
            synchronized (mutex)
            {
                result=instance;
                if(result==null)
                {
                    instance=result=new ASingleTonImplementationThreadSafe();

                }
            }
        }
        return result;
    }
}
