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
public class Warmup1_Exercises {
    
    //Exercises from: https://codingbat.com/java
    
    
    public boolean sleepIn (boolean weekday, boolean vacation){
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        return !weekday || vacation;
    }
    
    public boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        //We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        return aSmile == bSmile;
    }
    
    public int sumDouble (int a, int b){
        //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        if(a==b){
            return 2*(a+b);
        }        
        return a+b;
    }    
    
    public int diff21 (int n){
        //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
        if(n > 21){
            return (n - 21)*2; 
        }        
        return 21 - n;
    }
    
    public boolean parrotTrouble (boolean talking, int hour){
        //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        return talking && (hour<7 || hour>20);
    }
    
    public boolean makes10(int a, int b){
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        return a==10 || b==10 || a+b==10;
    }
    
    public boolean nearHundred(int n) {
        //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }
    
    public boolean posNeg(int a, int b, boolean negative) {
        //Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
        if(negative){
            return a<0 && b<0;
        } else {
            return (a<0 && b>0) || (a>0 && b<0);
        }
    }
    
    public String notString(String str) {
       //Given a string, return a new string where "not " has been added to the front. 
       //However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
        if(str.length()>2 && str.substring(0,3).equals("not")){
            return str;
        }        
        return "not "+str;
    }
    
    public String missingChar(String str, int n) {
        //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        //The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
        return str.substring(0,n)+str.substring(n+1);
    }
    
    public String frontBack(String str) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        if(str.length()<=1){
            return str;
        }
        return str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0);
    }
    
    public String front3(String str) {
        //Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
        //the front is whatever is there. Return a new string which is 3 copies of the front.
        String front;  
        if (str.length() >= 3) {
          front = str.substring(0, 3);
        } else {
          front = str;
        }
        return front + front + front;
    }
    
    public String backAround(String str) {
        //Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
        //The original string will be length 1 or more.
        String end = str.substring(str.length()-1);
        return end+str+end;
    }
    
    public boolean or35(int n) {
        //Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
        return n%3==0 || n%5==0;
    }
    
    public String front22(String str) {
        //Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". 
        //If the string length is less than 2, use whatever chars are there.
        String front; 
        if(str.length()>1){
            front = str.substring(0, 2);
        } else {
            front = str;
        }
        return front+str+front;
    }
    
    public boolean startHi(String str) {
        //Given a string, return true if the string starts with "hi" and false otherwise.
        if(str.length()<2){
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }
    
    public boolean icyHot(int temp1, int temp2) {
        //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        return (temp1<0 && temp2>100) || (temp1>100 && temp2<0);
    }
    
    public boolean in1020(int a, int b) {
        //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        return (a>=10 && a<=20) || (b>=10 && b<=20);
    }
    
    public boolean hasTeen(int a, int b, int c) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
    
    public boolean loneTeen(int a, int b) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
        boolean aTeen = (a>=13 && a<=19);
        boolean bTeen = (b>=13 && b<=19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    
    public String delDel(String str) {
        //Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
        if(str.length()>3 && str.substring(1, 4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
         return str;
    }
    
    public boolean mixStart(String str) {
        //Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
        if(str.length()<3){
            return false;
        }
        return str.substring(1,3).equals("ix");
    }
    
    public String startOz(String str) {
        //Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' 
        //and include the second only if it is 'z', so "ozymandias" yields "oz".
        String result = "";
        if(str.length()>=1 && str.charAt(0) == 'o'){
            result += str.charAt(0);
        }
        if(str.length()>=2 && str.charAt(1) == 'z'){
            result += str.charAt(1);
        }
        return result;
    }
    
    public int intMax(int a, int b, int c) {
        //Given three int values, a b c, return the largest.
        if(a>b){
            if(b<c){
                if(a<c){
                    return c;
                } 
            }
        } else {
            if(b>c){
                return b;
            } else {
                return c;
            }
        }
        return a;
    }
    
    public int close10(int a, int b) {
        //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        //Note that Math.abs(n) returns the absolute value of a number.
        if(Math.abs(a-10)>Math.abs(b-10)){
            return b;
        } else if(Math.abs(a-10)<Math.abs(b-10)) {
            return a;
        }        
        return 0;
    }
    
    public boolean in3050(int a, int b) {
        //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        boolean firstRange = (a>= 30 && a <= 40) && (b>= 30 && b <= 40);
        boolean secondRange = (a>= 40 && a <= 50) && (b>= 40 && b <= 50);
        return firstRange || secondRange;
    }
    
    public int max1020(int a, int b) {
        //Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
        boolean isAInTheRange = a>=10 && a<=20;
        boolean isBInTheRange = b>=10 && b<=20;        
        if(isAInTheRange && isBInTheRange){
            if(a>b){
                return a;
            } else {
                return b;
            }
        } else if (!isAInTheRange && isBInTheRange) {
            return b;
        } else if (isAInTheRange && !isBInTheRange) {
            return a;
        }
        return 0;
    }
    
    public boolean stringE(String str) {
        //Return true if the given string contains between 1 and 3 'e' chars.
        int countE = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e'){
                countE++;
            }
        }
        return countE>=1 && countE<=3;
    }
    
    public boolean lastDigit(int a, int b) {
        //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
        //Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        return (a%10 == b%10);
    }
    
    public String endUp(String str) {
        //Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
        //Note that str.toUpperCase() returns the uppercase version of a string.
        if(str.length()<=3){
            return str.toUpperCase();
        }
        return str.substring(0, str.length()-3)+str.substring(str.length()-3).toUpperCase();
    }
    
    public String everyNth(String str, int n) {
        //Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
        //So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(i%n==0){
                result += str.charAt(i);
            }
        }
        return result;
    }
    
    
}
