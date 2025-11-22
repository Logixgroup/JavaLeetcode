import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int[] arr = {
            51,
            1,
            7,
            9,
            6,
            8,
            3,
            2
        };
        int target = 10;

        Set < Integer > seen = new HashSet < > ();
        Set < String > finaloutput = new HashSet < > ();

        for (int a: arr) {

            int complement = target - a;

            String key = "";
            seen.add(a);
            if (seen.contains(complement)) {

                key = Math.min(a, complement) + "-" + Math.max(a, complement);

                finaloutput.add(key);

            }
        }

        System.out.println(finaloutput);


    }
}