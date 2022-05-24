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
public class String1_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public String helloName(String name) {
        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        return "Hello "+name+"!";
    }
    
    public String makeAbba(String a, String b) {
        //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        return a+b+b+a;
    }
    
    public String makeTags(String tag, String word) {
        //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        //In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        //Given tag and word strings, create the HTML  string with tags around the word, e.g. "<i>Yay</i>".
        return "<"+tag+">"+word+"</"+tag+">";
    }
    
    public String makeOutWord(String out, String word) {
        //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
        //e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
        return out.substring(0,2)+word+out.substring(2);
    }
    
    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end+end+end;
    }
    
    public String firstTwo(String str) {
        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
        //If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
        //Note that str.length() returns the length of a string.
        if(str.length()>2){
            return str.substring(0, 2);
        }
        return str;
    }
    
    
    public String firstHalf(String str) {
        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        return str.substring(0, str.length()/2);
    }
    
    public String withoutEnd(String str) {
        //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        return str.substring(1, str.length()-1);
    }
    
    public String comboString(String a, String b) {
        //Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
        //The strings will not be the same length, but they may be empty (length 0).
        if(a.length()>b.length()){
            return b+a+b;
        }
        return a+b+a;
    }
    
    public String nonStart(String a, String b) {
        //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        String result = "";
        if(a.length()>1){
            result += a.substring(1);
        }
        if(b.length()>1){
            result += b.substring(1);
        }
        return result;
    }
    
    public String left2(String str) {
        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
        if(str.length()<3){
            return str;
        }
        return str.substring(2)+str.substring(0,2);
    }
    
    public String right2(String str) {
        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
        if(str.length()<3){
            return str;
        }
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);
    }
    
    public String theEnd(String str, boolean front) {
        //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back..
        //The string will be non-empty.
        return front ? str.substring(0,1) : str.substring(str.length()-1);
    }
    
    public String withouEnd2(String str) {
        //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        return (str.length()>2) ? str.substring(1, str.length()-1) : "";
    }
    
    public String middleTwo(String str) {
        //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
        return (str.length()>2) ? str.substring(str.length()/2-1, str.length()/2+1) : str;
    }
    
    public boolean endsLy(String str) {
        //Given a string, return true if it ends in "ly".
        return (str.length()>=2 && (str.substring(str.length()-2)).equals("ly")) ? true : false;
    }
    
    
}
