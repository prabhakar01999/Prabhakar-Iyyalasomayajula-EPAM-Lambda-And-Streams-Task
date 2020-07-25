package com.prabhakar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App{

    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int i=0; i<n; i++){
            s[i]=in.nextInt();
        }
        Double avg=findAverageUsingStream(s);
        System.out.println(avg);

        List<String> words=new ArrayList<String>();
        for(int i=0;i<n;i++){
            words.add(in.next());
        }
        List<String> filter = checkString(words);
        filter.forEach(string-> System.out.println(string));

        Messagable hello = Message::check;
        List<String> res=hello.check(words);
        res.forEach(x-> System.out.println(x));

    }

    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static List<String> checkString(List<String> result){
        return result.stream().filter(word -> word.length()==3 && word.charAt(0)=='a').collect(Collectors.toList());

    }
}