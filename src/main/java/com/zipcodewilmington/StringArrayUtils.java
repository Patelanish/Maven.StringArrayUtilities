package com.zipcodewilmington;


import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List list = new ArrayList(asList(array));
        if (list.contains(value)) {
            return true;
        }
        return false;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String reverse[] = new String[array.length];
        int word = 0;
        for (int count = array.length - 1; count >= 0; count --){
            reverse[word] = array[count];
            word++;
        }

        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String[] chars = Arrays.toString(array).toLowerCase().split("");
        for (Character c = 'a'; c < 'z'; c++){
            if(!contains(chars, c.toString())){
                return false;
            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
                counter++;
            }
            }
        return counter;
    }



    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length - getNumberOfOccurrences(array, valueToRemove)];
        int num = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count].equalsIgnoreCase(valueToRemove)) {
                continue;
            }
            newArray[num] = array[count];
            num++;
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String index = "";
        List list = new ArrayList();
        for(String str : array){
            if(!str.equals(index)){
                index = str;
                list.add(str);

            }
        }

        String[] Char = new String[list.size()];
        list.toArray(Char);
        return Char;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        Set<String> dups = new HashSet<String>();
        for (String str: array) {
            if (!dups.add(str));
            String[] dupArr = str.split(" ", 2);
            return dupArr;

        }

        return null;
    }


}
