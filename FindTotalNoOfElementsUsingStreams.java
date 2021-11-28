package EdyodaPractice.Streams;

import java.util.*;
import java.util.Arrays;

public class FindTotalNoOfElementsUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(10,20,30,45,46,59,60);
        Long Count=list.stream()
                .count();
                System.out.println(Count);
    }

}
