package main.java.Prepare.Interview_Preparation_Kits.OneWeekPreparationKit.Day1.PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        float positive = 0.000000f;
        float negative = 0.000000f;
        float zero = 0.000000f;

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>0){
                positive++;
            }else if(arr.get(i)==0){
                zero++;
            }else{
                negative++;
            }
        }

        positive = positive/(float)arr.size();
        negative = negative/(float)arr.size();
        zero = zero/(float)arr.size();


        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);




    }

}

public class Pro1 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }

}





