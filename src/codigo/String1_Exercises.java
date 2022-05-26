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
    
    public String nTwice(String str, int n) {
        //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
        return str.substring(0,n)+str.substring(str.length()-n);
    }
    
    public String twoChar(String str, int index) {
        //Given a string and an index, return a string length 2 starting at the given index.
        //If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
        return (index>=0 && index <= str.length()-2) ? str.substring(index, index+2) : str.substring(0,2);
    }
    
    public String middleThree(String str) {
        //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
        return (str.length()>3) ? str.substring(str.length()/2-1,str.length()/2+2) : str;
    }
    
    public boolean hasBad(String str) {
        //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
        //The string may be any length, including 0. Note: use .equals() to compare 2 strings.
        if(str.length()>2 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if(str.length()>3 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
    
    public String atFirst(String str) {
        //Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        String result = "";
        if(str.length()<2){
            result += str;
            while (result.length()<2) {
                result += "@";
            }
        } else {
            result += str.substring(0,2);
        }
        return result;
    }
    
    public String lastChars(String a, String b) {
        //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
        //If either string is length 0, use '@' for its missing char.
        String result = "";
        if(a.length()<1){
            result += "@";
        } else {
            result += a.substring(0, 1);
        }
        if(b.length()<1){
            result += "@";
        } else {
            result += b.substring(b.length()-1);
        }
        return result;
    }
    
    public String conCat(String a, String b) {
        //Given two strings, append them together (known as "concatenation") and return the result.
        //However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        if(a.length()==0){
            return b;
        }
        if (b.length()==0){
            return a;
        }
        return (a.charAt(a.length()-1) == b.charAt(0)) ? a+b.substring(1) : a+b;
    }
    
    public String lastTwo(String str) {
        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
        return (str.length()>1) ? str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2) : str;
    }
    
    public String seeColor(String str) {
        //Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
        if(str.length()>3 && str.substring(0, 4).equals("blue")){
            return str.substring(0, 4);
        } else if (str.length()>2 && str.substring(0, 3).equals("red")){
            return str.substring(0, 3);
        }
        return "";
    }
    
    public boolean frontAgain(String str) {
        //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
        return (str.length()>1 && str.substring(0,2).equals(str.substring(str.length()-2))) ? true : false;
    }
    
    public String minCat(String a, String b) {
        //Given two strings, append them together (known as "concatenation") and return the result.
        //However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
        //So "Hello" and "Hi" yield "loHi". The strings may be any length.
        String result = "";
        if (a.length()==b.length()) {
            result += a+b;            
        } else if (a.length()>b.length()){
            result += a.substring(a.length()-b.length()) + b;
        } else {
            result += a + b.substring(b.length()-a.length());
        }
        return result;
    }
    
    public String extraFront(String str) {
        //Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length.
        //If there are fewer than 2 chars, use whatever is there.
        return (str.length()<2) ? str+str+str : str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
    }
    
    public String without2(String str) {
        //Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
        //The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
        String result = "";
        if(str.length()<2){
            result += str;
        } else if (str.length() > 2){
            if(str.substring(0, 2).equals(str.substring(str.length()-2))){
                result += str.substring(2);
            } else {
                result += str;
            }
        }
        return result;
    }
    
    public String deFront(String str) {    
        //Given a string, return a version without the first 2 chars.
        //Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        String front = "";
        if(str.charAt(0) == 'a'){
            front += str.charAt(0);
        }
        if(str.charAt(1) == 'b'){
            front += str.charAt(1);
        }
        if(str.length() <= 2){
            return front;
        }
        return front + str.substring(2);
    }
    
    public String startWord(String str, String word) {
        //Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
        //except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
        //So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        if(str.length()>= word.length() && str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        return "";
    }
    
    public String withoutX(String str) {
        //Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
        String front = "";
        String end = "";
        
        if(str.length()>0 && str.charAt(0) != 'x'){
            front += str.substring(0,1);
        }        
        if(str.length()>1 && str.charAt(str.length()-1) != 'x'){
            end += str.substring(str.length()-1);
        }
        if(str.length()<3){
            return front + end;
        }
        return front + str.substring(1, str.length()-1)+end;
    }
    
    public String withoutX2(String str) {
        //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
        //This is a little harder than it looks.
        String front = "";
        if(str.length() >=1 && str.charAt(0) != 'x'){
            front += str.substring(0, 1);
        }
        if(str.length() >=2 && str.charAt(1) != 'x'){
            front += str.substring(1, 2);
        }
        return (str.length()<3) ? front : front + str.substring(2);
    }
    
}
