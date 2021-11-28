package EdyodaPractice.Streams;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsUsingStreams
{
    public static void main(String[] args)
    {
        List<Integer>list=Arrays.asList(22,32,45,67,98,65,65,23);
        Set<Integer>set=new HashSet<>();
        list.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);
    }
}
