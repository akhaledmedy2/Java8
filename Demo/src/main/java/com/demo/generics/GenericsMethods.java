package com.demo.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsMethods {

    public static <T> List<T> arrayToList(T[] array, List<T> list){
       for(T object : array){
           list.add(object);
       }
       return list;
    }
}
