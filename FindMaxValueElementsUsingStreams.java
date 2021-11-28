package EdyodaPractice.Streams;

import java.util.*;

public class FindMaxValueElementsUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(20,45,76,89,76,23,89);
        int max=list.stream()
                .max(Integer::compare)
                .get();
                System.out.println(max);
    }
}
