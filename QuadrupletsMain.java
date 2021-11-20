package EdyodaPractice.Collections;

import java.util.ArrayList;

public class QuadrupletsMain
{
    public static void main(String[] args)

    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(0);
        arr.add(-2);
        arr.add(2);
        int K = 0;
        Quadruplets.GetQuadruplets(arr, K);
    }
}


