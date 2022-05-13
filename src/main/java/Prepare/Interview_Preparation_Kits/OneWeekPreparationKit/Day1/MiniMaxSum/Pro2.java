package main.java.Prepare.Interview_Preparation_Kits.OneWeekPreparationKit.Day1.MiniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        arr.sort(Comparator.naturalOrder());

        long a = (long)arr.get(0)+(long)arr.get(1)+(long)arr.get(2)+(long)arr.get(3);
        long b = (long)arr.get(1)+(long)arr.get(2)+(long)arr.get(3)+(long)arr.get(4);


        System.out.println( a+ " " + b);


    }

}

public class Pro2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result2.miniMaxSum(arr);

        bufferedReader.close();
    }
}
