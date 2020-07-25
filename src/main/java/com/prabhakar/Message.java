package com.prabhakar;

import java.util.List;
import java.util.stream.Collectors;

public class Message {
    public static List<String> check(List<String> fi){
        return fi.stream().filter(word ->word.equals(new StringBuffer(word).reverse().toString())).collect(Collectors.toList());
    }
}
