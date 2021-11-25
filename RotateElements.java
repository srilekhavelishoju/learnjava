package EdyodaPractice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElements
{
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);
        System.out.println("Original List:"+myList);
        Collections.rotate(myList,2);
        System.out.println("Rotated List:"+myList);
    }
}
