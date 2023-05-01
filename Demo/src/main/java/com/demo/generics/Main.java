package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Character[] charArray = {'h','e','l','l','o'};
    private static Integer[] intArray = {1,2,3,4,5};
    private static Boolean[] boolArray = {true,false,true,false,true};

    public static void main(String[] args) {

        List<Character> charList = GenericsMethods.arrayToList(charArray,new ArrayList<>());
        List<Integer> intList = GenericsMethods.arrayToList(intArray,new ArrayList<>());
        List<Boolean> boolList = GenericsMethods.arrayToList(boolArray,new ArrayList<>());

        charList.forEach(System.out::println);
        intList.forEach(System.out::println);
        boolList.forEach(System.out::println);

        List<String> itemsWithoutVarArgs =  VarArgs.printShoppingListWithoutVarArgs("ahmed", "Khaled");
        itemsWithoutVarArgs.forEach(System.out::println);

        List<String> itemsWithVarArgs =  VarArgs.printShoppingListWithVarArgs("ahmed", "Khaled");
        itemsWithVarArgs.forEach(System.out::println);

    }

}