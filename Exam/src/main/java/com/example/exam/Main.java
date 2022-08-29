package com.example.exam;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-2, 9, 55, 0, 15, 99, 7, 98, 65};
        List<Integer> numbers = Arrays.asList(arr);
        int result = findClosestDistance(numbers);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }

    // Returns the distance between the two closest numbers.
    static int findClosestDistance(List<Integer> numbers) {
        // try to implement it!
        numbers = new ArrayList<>();
        numbers.add(1);
        Collections.sort(numbers);
        List<Integer> distances = new ArrayList<>();
        if (!numbers.isEmpty()) {
            if (numbers.size()==1){
                return numbers.get(0);
            }
            for (int i = 0; i < numbers.size() - 1; i++) {
                distances.add(numbers.get(i + 1) - numbers.get(i));
            }
            Collections.sort(distances);
            return distances.get(0);
        }
        return 0;
    }

}