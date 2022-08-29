package demo;

import java.util.*;

class Solve {

    public static void main(String[] args) {
        String str = "abababababhhhjhjhhfwsgfdtrwyw";
        firstSolution(str); // array (advanced technique)
        System.out.println("***********************************");
        secondSolution(str); // map
    }

    private static void firstSolution(String str) {
        int[] arr = new int['z' - 'a' + 1]; //26 
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            arr[current - 'a']++;
        }
        //loop to print occurrences
        for (int i = 0; i < arr.length; i++) {
            System.out.println((char) (i + 'a') + " ---> " + arr[i]);
        }
    }

    private static void secondSolution(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (map.containsKey(current)) { // ket already in map 
                map.replace(current, map.get(current) + 1);
            } else { // first occurrence
                map.put(current, 1);
            }
        }
        //loop to print occurrences , forEach and Lambda ,Java 8 only
        map.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
    }
}
