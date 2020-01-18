import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        // 1 - Double Int Accumulator
        int[] testIntArray = new int[]{1,2,3,4,5};
        System.out.println("1 - doubleInt: " + Arrays.toString(doubleInt(testIntArray)));


        // 2 - Multiply Numbers in Array
        int[] multiplyNumbersArray = new int[]{1,2,3,4,5};
        System.out.println("2 - multiplyNumbers: " + Arrays.toString(multiplyNumbers(multiplyNumbersArray, 3)));


        // 3 - Double letters in a string
        String dstring = "abcdef";
        System.out.println("3 - doubleLetters: " + doubleLetters(dstring));

        // 4 - Interleave
        String[] strArr1 = new String[]{"a", "c", "e", "g"};
        String[] strArr2 = new String[]{"b", "d", "f", "h"};
        System.out.println("4 - Interleave" + Arrays.toString(interleave(strArr1, strArr2)));

        // 5 - createRange
        int num = 6;
        String word = "hello";
        System.out.println("5 - createRange: " + Arrays.toString(createRange(num, word)));

        // 6 - flipArray
        String[] strArr = new String[]{"the", "quick", "brown", "fox", "jumps", "over"};
        System.out.println("6 - flipArray: " + flipArray(strArr));

        // 7 - arraysToObject
        String[][] multiDimensionStrArr = new String[][]{{"2014", "Horse"}, {"2015", "Sheep"}};
        System.out.println("7 - arraysToObject: " + arraysToObject(multiDimensionStrArr));

        // 8 - reverseString
        String revStr = "hello";
        System.out.println("8 - reverseString: " + reverseString(revStr));

        // 9 - repeats (Checks if first half of string is equal to second half)
        System.out.println("9 - repeats: " + repeats("haha"));

        // 10 - everyOther
        System.out.println("10 - everyOther: " + everyOther("abcdef"));

        // 11 - allEqual
        System.out.println("11 - allEqual: " + allEqual("aaa"));

        // 12 - sumLetters
        System.out.println("12 - sumLetters: " + sumLetters("246"));

        // 13 - countVowels
        System.out.println("13 - countVowels: " + countVowels("youasdfghjki"));


    }

    // 1 - Double Int Accumulator
    public static int[] doubleInt (int[] intArr){
        int[] accumlator = new int[5];

        for (int i = 0; i < intArr.length; i++) {
            accumlator[i] = intArr[i]*2;
        }
        return accumlator;
    }

    // 2 - Multiple Numbers in Array
    public static int[] multiplyNumbers (int[] intArr, int multiple){
        int[] accumulator = new int[5];

        for (int i = 0; i < intArr.length; i++) {
            accumulator[i] = intArr[i]*multiple;
        }
        return accumulator;
    }

    // 3 - Double letters in string
    public static String doubleLetters (String str){
        String accumulator = "";

        for (int i = 0; i < str.length(); i++) {
            accumulator += String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i));
        }
        return accumulator;
    }

    // 4 - Interleave
    public static String[] interleave (String[] strArr1, String[] strArr2){
        String[] accumulator = new String[(strArr1.length*2)];

        for (int i = 0; i < strArr1.length; i++) {
            accumulator[i*2] = strArr1[i];
            accumulator[(i*2)+1] = strArr2[i];
        }
        return accumulator;
    }

    // 5 - createRange
    public static String[] createRange (int num, String value){
        String[] accumulator = new String[num];

        for (int i = 0; i < num; i++) {
            accumulator[i] = value;
        }
        return accumulator;
    }

    // 6 - flipArray
    public static HashMap<String, Integer> flipArray(String[] strArr){
        HashMap<String, Integer> accumulator = new HashMap<String, Integer>();

        for (int i = 0; i < strArr.length; i++) {
            accumulator.put(strArr[i], i);
        }
        return accumulator;
    }

    // 7 - arraysToObject
    public static HashMap<String, String> arraysToObject(String[][] strArr){
        HashMap<String, String> accumulator = new HashMap<String, String>();

        for (int i = 0; i < strArr.length; i++) {
            accumulator.put(strArr[i][0], strArr[i][1]);
        }
        return accumulator;
    }

    // 8 - reverseString
    public static String reverseString(String str){
        String accumulator = "";

        for (int i = str.length()-1; i >= 0; i--) {
            accumulator += String.valueOf(str.charAt(i));
        }
        return accumulator;
    }

    // 9 - repeats
    public static Boolean repeats(String str){
        String half1 = "";
        String half2 = "";

        if(str.length() % 2 == 1){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(i < str.length()/2){
                half1 += String.valueOf(str.charAt(i));
            } else {
                half2 += String.valueOf(str.charAt(i));
            }
        }

        if(half1.equals(half2)){
            return true;
        } else {
            return false;
        }
    }

    // 10 - everyOther
    public static String everyOther(String str){
        String accumulator = "";

        for (int i = 0; i < str.length(); i++) {
            if(i == 0 || i % 2 == 0){
                accumulator += String.valueOf(str.charAt(i));
            }
        }
        return accumulator;
    }

    // 11 - allEqual
    public static Boolean allEqual(String str){
        String firstLetter = String.valueOf(str.charAt(0));

        for (int i = 0; i < str.length(); i++) {
            if(firstLetter.equals(String.valueOf(str.charAt(i)))){
            }else {
                return false;
            }
        }
        return true;
    }

    // 12 - sumLetters
    public static String sumLetters(String str){
        int accumulator = 0;

        for (int i = 0; i < str.length(); i++) {
            accumulator += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return String.valueOf(accumulator);
    }

    // 13 - countVowels
    public static int countVowels(String str){
        int accumulator = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                accumulator++;
            }
        }
        return accumulator;
    }
}
