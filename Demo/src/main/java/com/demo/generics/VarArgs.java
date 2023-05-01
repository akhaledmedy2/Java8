package com.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class VarArgs {
    public static List<String> printShoppingListWithVarArgs(String... items){
        List<String> list = new ArrayList<>();
        for(String item : items){
            list.add(item);
        }

        return list;
    }

    public static List<String> printShoppingListWithoutVarArgs(String item1 , String item2){
        List<String> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        return list;
    }
}
