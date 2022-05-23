/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author alejandroserranol
 */
public class Warmup2_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public String stringTimes(String str, int n) {
        //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
    
    public String frontTimes(String str, int n) {
        //Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
        //Return n copies of the front;
        String result = "";
        if(str.length()<3){
            for(int i=0; i<n; i++){
                result += str;
            }
        } else{
            for(int i=0; i<n; i++){
                result += str.substring(0,3);
            }
        }
        
        return result;
    }
    
    public int countXX(String str) {
        //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
        int count = 0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }
    
    public boolean doubleX(String str) {
        //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        boolean isFirstX = true;
        boolean isDoubleX = false;
        if(str.length()<2){
            return isDoubleX;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'x' && isFirstX){
                if (str.charAt(i+1) == 'x') {
                    isDoubleX = true;
                }
                isFirstX = false;
            }
        }
        return isDoubleX;
    }
    
    public String stringBits(String str) {
        //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
        String result = "";
        for (int i = 0; i < str.length(); i+=2) {
            result += str.charAt(i);
        }        
        return result;
    }
    
    public String stringSplosion(String str) {
        //Given a non-empty string like "Code" return a string like "CCoCodCode".
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0,i+1);
        }
        
        return result;
    }
    
    public int last2(String str) {
        //Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string,
        //so "hixxxhi" yields 1 (we won't count the end substring).
        int count = 0;
        String aux = str.substring(str.length()-2);
        for (int i=0; i<str.length()-2; i++) {
            if(str.substring(i,(i+2)).equals(aux)){
                count++;
            }
        }
        return count;
    }
    
    public int arrayCount9(int[] nums) {
        //Given an array of ints, return the number of 9's in the array.
        int count = 0;
        for(int num : nums){
            if(num == 9){
                count++;
            }
        }
        return count;
    }    
    
    public boolean arrayFront9(int[] nums) {
        //Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
        for(int i=0; i<nums.length; i++){
            if(i<4 && nums[i]==9){
                return true;
            }
        }
        return false;
    }
    
    public boolean array123(int[] nums) {
        //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        for (int i=0; i<nums.length-2; i++) {
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }
    
    public int stringMatch(String a, String b) {
        //Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
        //So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
        int count = 0;
        String substringA = "";
        String substringB = "";
        if(b.length()<a.length()){
            String temp = a;
            a = b;
            b = temp;
        }
        
        for (int i= 0; i<a.length()-1; i++) {
            substringA = a.substring(i, i+2);
            substringB = b.substring(i, i+2);
            if(substringA.equalsIgnoreCase(substringB)){
                count++;
            }
        }
        return count;
    }
    
}
