package main.java.Prepare.Interview_Preparation_Kits.OneWeekPreparationKit.Day1.TimeConversion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here

        String[] strings = s.split(":");
        int hour = Integer.parseInt(strings[0]);
        int minute = Integer.parseInt(strings[1]);
        int second = Integer.parseInt(strings[2].substring(0,2));
        String st = strings[2].substring(2);
        String sHour="";
        String sMinute="";
        String sSecond="";


        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(st);

        if(st.equals("PM")){
            if(hour==12){

                sHour = String.valueOf(hour);
            }else if(hour<12){
                hour+=12;
                sHour = String.valueOf(hour);
            }else{
                System.out.println("Error");
            }

            if(minute<10){
                sMinute = "0" + minute;

            }else{
                sMinute = String.valueOf(minute);
            }
            if(second<10){
                sSecond = "0" + second;

            }else{
                sSecond = String.valueOf(second);
            }

        }else{ // AM
            if(hour==12){
                sHour = "00";
            }else if(hour<10){
                sHour = "0"+hour;
            }else{
                sHour = String.valueOf(hour);
            }

            if(minute<10){
                sMinute = "0" + minute;

            }else{
                sMinute = String.valueOf(minute);
            }
            if(second<10){
                sSecond = "0" + second;

            }else{
                sSecond = String.valueOf(second);
            }
        }




        s = sHour+":"+sMinute+":"+sSecond;
        return s;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
