package EdyodaPractice.Streams;
import java.util.*;
import java.util.Arrays;
public class FindFirstElementInListUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer> list= Arrays.asList(10,15,8,49,28,98,98,32,15);
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
