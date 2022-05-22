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
public class Warmup_1 {
    
    //Exercises from: https://codingbat.com/java
    
    private Boolean[][]  boolArray = {{true, true},{true, false}, {false, true}, {false, false}};
    
    private void testFunction2BooleanParameters (String method){
        boolean var1 = false;
        boolean var2 = false;
        
        switch(method){
            case "sleepIn": {
                System.out.println("Weekday / Vacation;\n");
                for(int i=0; i <4; i++){            
                    for(int j=0; j<2; j++){
                        //System.out.println("boolArray["+i+"]["+j+ "] = "+ misEjercicios.boolArray[i][j]);
                        if(j%2==0){
                            var1= boolArray[i][j];
                        } else {
                            var2= boolArray[i][j];
                        }
                    }
                    System.out.println("("+var1+" / "+var2+")"+"\t-> Sleep = "+sleepIn(var1, var2));
                }
                System.out.println("\n");
            } break;
            case "monkeyTrouble": {
                System.out.println("aSmile / bSmile;\n");
                for(int i=0; i <4; i++){            
                    for(int j=0; j<2; j++){
                        if(j%2==0){
                            var1= boolArray[i][j];
                        } else {
                            var2= boolArray[i][j];
                        }
                    }
                    System.out.println("("+var1+" / "+var2+")"+"\t-> Trouble = "+monkeyTrouble(var1, var2));
                }
                System.out.println("\n");
            } break;
            default: System.out.println("No method with that name.");
        }
    }
    
    private boolean sleepIn (boolean weekday, boolean vacation){
        //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        return !weekday || vacation;
    }
    
    private boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        //We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
        return aSmile == bSmile;
    }
    
    private int sumDouble (int a, int b){
        //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        if(a==b){
            return 2*(a+b);
        }        
        return a+b;
    }    
    
    private int diff21 (int n){
        //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
        if(n > 21){
            return (n - 21)*2; 
        }        
        return 21 - n;
    }
    
    private boolean parrotTrouble (boolean talking, int hour){
        //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        //We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
        return talking && (hour<7 || hour>20);
    }
    
    private boolean makes10(int a, int b){
        //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        return a==10 || b==10 || a+b==10;
    }
    
    private boolean nearHundred(int n) {
        //Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }
    
    private boolean posNeg(int a, int b, boolean negative) {
        //Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
        if(negative){
            return a<0 && b<0;
        } else {
            return (a<0 && b>0) || (a>0 && b<0);
        }
    }
    
    private String notString(String str) {
       //Given a string, return a new string where "not " has been added to the front. 
       //However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
        if(str.length()>2 && str.substring(0,3).equals("not")){
            return str;
        }        
        return "not "+str;
    }
    
    private String missingChar(String str, int n) {
        //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        //The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
        return str.substring(0,n)+str.substring(n+1);
    }
    
    private String frontBack(String str) {
        //Given a string, return a new string where the first and last chars have been exchanged.
        if(str.length()<=1){
            return str;
        }
        return str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0);
    }
    
    private String front3(String str) {
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
    
    private String backAround(String str) {
        //Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
        //The original string will be length 1 or more.
        String end = str.substring(str.length()-1);
        return end+str+end;
    }
    
    private boolean or35(int n) {
        //Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
        return n%3==0 || n%5==0;
    }
    
    private String front22(String str) {
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
    
    private boolean startHi(String str) {
        //Given a string, return true if the string starts with "hi" and false otherwise.
        if(str.length()<2){
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }
    
    private boolean icyHot(int temp1, int temp2) {
        //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        return (temp1<0 && temp2>100) || (temp1>100 && temp2<0);
    }
    
    private boolean in1020(int a, int b) {
        //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        return (a>=10 && a<=20) || (b>=10 && b<=20);
    }
    
    private boolean hasTeen(int a, int b, int c) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
    
    private boolean loneTeen(int a, int b) {
        //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
        boolean aTeen = (a>=13 && a<=19);
        boolean bTeen = (b>=13 && b<=19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    
    private String delDel(String str) {
        //Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
        if(str.length()>3 && str.substring(1, 4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
         return str;
    }
    
    private boolean mixStart(String str) {
        //Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
        if(str.length()<3){
            return false;
        }
        return str.substring(1,3).equals("ix");
    }
    
    private String startOz(String str) {
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
    
    private int intMax(int a, int b, int c) {
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
    
    private int close10(int a, int b) {
        //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        //Note that Math.abs(n) returns the absolute value of a number.
        if(Math.abs(a-10)>Math.abs(b-10)){
            return b;
        } else if(Math.abs(a-10)<Math.abs(b-10)) {
            return a;
        }        
        return 0;
    }
    
    private boolean in3050(int a, int b) {
        //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        boolean firstRange = (a>= 30 && a <= 40) && (b>= 30 && b <= 40);
        boolean secondRange = (a>= 40 && a <= 50) && (b>= 40 && b <= 50);
        return firstRange || secondRange;
    }
    
    private int max1020(int a, int b) {
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
    
    private boolean stringE(String str) {
        //Return true if the given string contains between 1 and 3 'e' chars.
        int countE = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='e'){
                countE++;
            }
        }
        return countE>=1 && countE<=3;
    }
    
    private boolean lastDigit(int a, int b) {
        //Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
        //Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        return (a%10 == b%10);
    }
    
    private String endUp(String str) {
        //Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
        //Note that str.toUpperCase() returns the uppercase version of a string.
        if(str.length()<=3){
            return str.toUpperCase();
        }
        return str.substring(0, str.length()-3)+str.substring(str.length()-3).toUpperCase();
    }
    
    private String everyNth(String str, int n) {
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
    
    private void testfunctions (String method){
        switch(method){
            case "sumDouble": {
                System.out.println("sumDouble: 1 + 2 = "+ sumDouble(1, 2));
                System.out.println("sumDouble: 3 + 2 = "+ sumDouble(3, 2));
                System.out.println("sumDouble: 2 + 2 = "+ sumDouble(2, 2));                
            } break;
            case "diff21": {
                System.out.println("diff21(2) = "+ diff21(2));
                System.out.println("diff21(11) = "+ diff21(11));
                System.out.println("diff21(0) = "+ diff21(0));
                System.out.println("diff21(0) = "+ diff21(30));
            } break;
            case "parrotTrouble": {
                System.out.println("parrotTrouble(true, 6) = "+parrotTrouble(true, 6));
                System.out.println("parrotTrouble(true, 7) = "+parrotTrouble(true, 7));
                System.out.println("parrotTrouble(false, 6) = "+parrotTrouble(false, 6));
            } break;
            case "makes10": {
                System.out.println("makes10(9, 10) = "+makes10(9, 10));
                System.out.println("makes10(9, 9) = "+makes10(9, 9));
                System.out.println("makes10(1, 9) = "+makes10(1, 9));
            } break;
            case "nearHundred": {
                System.out.println("nearHundred(93) = "+nearHundred(93));
                System.out.println("nearHundred(90) = "+nearHundred(90));
                System.out.println("nearHundred(89) = "+nearHundred(89));
            } break;
            case "posNeg": {
                System.out.println("posNeg(1, -1, false) = "+posNeg(1, -1, false));
                System.out.println("posNeg(-1, 1, false) = "+posNeg(-1, 1, false));
                System.out.println("posNeg(-4, -5, true) = "+posNeg(-4, -5, true));
                System.out.println("posNeg(-4, 5, false) = "+posNeg(-4, 5, false));
            } break;
            case "notString": {
                System.out.println("notString(candy) = "+notString("candy"));
                System.out.println("notString(x) = "+notString("x"));
                System.out.println("notString(not bad) = "+notString("not bad"));
                System.out.println("notString(not) = "+notString("not"));
            } break;
            case "missingChar": {
                System.out.println("missingChar(\"kitten\", 1) = "+missingChar("kitten", 1));
                System.out.println("missingChar(\"kitten\", 0) = "+missingChar("kitten", 0));
                System.out.println("missingChar(\"kitten\", 4) = "+missingChar("kitten", 4));
                System.out.println("missingChar(\"kitten\", 5) = "+missingChar("kitten", 5));
            } break;
            case "frontBack": {
                System.out.println("frontBack(\"code\") = "+frontBack("code"));
                System.out.println("frontBack(\"a\") = "+frontBack("a"));
                System.out.println("frontBack(\"ab\") = "+frontBack("ab"));
            } break;
            case "front3": {
                System.out.println("frontBack(\"Java\") = "+front3("Java"));
                System.out.println("frontBack(\"Chocolate\") = "+front3("Chocolate"));
                System.out.println("frontBack(\"abc\") = "+front3("abc"));
            } break;
            case "backAround": {
                System.out.println("backAround(\"cat\") = "+backAround("cat"));
                System.out.println("backAround(\"Hello\") = "+backAround("Hello"));
                System.out.println("backAround(\"a\") = "+backAround("a"));
            } break;
            case "or35": {
                System.out.println("or35() = "+or35(3));
                System.out.println("or35() = "+or35(10));
                System.out.println("or35() = "+or35(8));
            } break;
            default: System.out.println("No method with that name.");
            case "front22": {
                System.out.println("front22(\"kitten\") = "+front22("kitten"));
                System.out.println("front22(\"Ha\") = "+front22("Ha"));
                System.out.println("front22(\"abc\") = "+front22("abc"));
                System.out.println("front22(\"a\") = "+front22("a"));
                System.out.println("front22(\"\") = "+front22(""));
            } break;
            case "startHi": {
                System.out.println("startHi(\"hi there\") = "+startHi("hi there"));
                System.out.println("startHi(\"hi\") = "+startHi("hi"));
                System.out.println("startHi(\"hello hi\") = "+startHi("hello hi"));
            } break;
            case "icyHot": {
                System.out.println("icyHot(120, -1) = "+icyHot(120, -1));
                System.out.println("icyHot(-1, 120) = "+icyHot(-1, 120));
                System.out.println("icyHot(2, 120) = "+icyHot(2, 120));
            } break;
            case "in1020": {
                System.out.println("in1020(12, 99) = "+in1020(12, 99));
                System.out.println("in1020(21, 12) = "+in1020(21, 12));
                System.out.println("in1020(8, 99) = "+in1020(8, 99));
            } break;
            case "hasTeen": {
                System.out.println("hasTeen(13, 20, 10) = "+hasTeen(13, 20, 10));
                System.out.println("hasTeen(20, 19, 10) = "+hasTeen(20, 19, 10));
                System.out.println("hasTeen(20, 10, 13) = "+hasTeen(20, 10, 13));
            } break;
            case "loneTeen": {
                System.out.println("loneTeen(13, 99) = "+loneTeen(13, 99));
                System.out.println("loneTeen(21, 19) = "+loneTeen(21, 19));
                System.out.println("loneTeen(13, 13) = "+loneTeen(13, 13));
            } break;
            case "delDel": {
                System.out.println("delDel(\"adelbc\") = "+delDel("adelbc"));
                System.out.println("delDel(\"adelHello\") = "+delDel("adelHello"));
                System.out.println("delDel(\"adedbc\") = "+delDel("adedbc"));
            } break;
            case "mixStart": {
                System.out.println("mixStart(\"mix snacks\") = "+mixStart("mix snacks"));
                System.out.println("mixStart(\"pix snacks\") = "+mixStart("pix snacks"));
                System.out.println("mixStart(\"piz snacks\") = "+mixStart("piz snacks"));
            } break;
            case "startOz": {
                System.out.println("startOz(\"ozymandias\") = "+startOz("ozymandias"));
                System.out.println("startOz(\"bzoo\") = "+startOz("bzoo"));
                System.out.println("startOz(\"oxx\") = "+startOz("oxx"));
            } break;
            case "intMax": {
                System.out.println("intMax(1, 2, 3) = "+intMax(1, 2, 3));
                System.out.println("intMax(1, 3, 2) = "+intMax(1, 3, 2));
                System.out.println("intMax(3, 2, 1) = "+intMax(3, 2, 1));
                System.out.println("intMax(6, 2, 6) = "+intMax(6, 2, 6));
            } break;
            case "close10": {
                System.out.println("intMax(8, 13) = "+close10(8, 13));
                System.out.println("intMax(13, 8) = "+close10(13, 8));
                System.out.println("intMax(13, 7) = "+close10(13, 7));
            } break;
            case "in3050": {
                System.out.println("in3050(30, 31) = "+in3050(30, 31));
                System.out.println("in3050(30, 41) = "+in3050(30, 41));
                System.out.println("in3050(40, 50) = "+in3050(40, 50));
            } break;
            case "max1020": {
                System.out.println("max1020(11, 19) = "+max1020(11, 19));
                System.out.println("max1020(19, 11) = "+max1020(19, 11));
                System.out.println("max1020(11, 9) = "+max1020(11, 9));
            } break;
            case "stringE": {
                System.out.println("stringE(\"Hello\") = "+stringE("Hello"));
                System.out.println("stringE(\"Heelle\") = "+stringE("Heelle"));
                System.out.println("stringE(\"Heelele\") = "+stringE("Heelele"));
            } break;
            case "lastDigit": {
                System.out.println("lastDigit(7, 17) = "+lastDigit(7, 17));
                System.out.println("lastDigit(6, 17) = "+lastDigit(6, 17));
                System.out.println("lastDigit(3, 113) = "+lastDigit(3, 113));
            } break;
            case "endUp": {
                System.out.println("lastDigit(\"Hello\") = "+endUp("Hello"));
                System.out.println("lastDigit(\"hi there\") = "+endUp("hi there"));
                System.out.println("lastDigit(\"hi\") = "+endUp("hi"));
            } break;
            case "everyNth": {
                System.out.println("everyNth(\"Miracle\", 2) = "+everyNth("Miracle", 2));
                System.out.println("everyNth(\"abcdefg\", 2) = "+everyNth("abcdefg", 2));
                System.out.println("everyNth(\"abcdefg\", 3) = "+everyNth("abcdefg", 3));
            } break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Warmup_1 misEjercicios = new Warmup_1();
        
        //misEjercicios.testFunction2BooleanParameters("sleepIn");
        //misEjercicios.testFunction2BooleanParameters("monkeyTrouble");
        
        //misEjercicios.testfunctions("sumDouble");
        //misEjercicios.testfunctions("diff21");
        //misEjercicios.testfunctions("parrotTrouble");
        //misEjercicios.testfunctions("makes10");
        //misEjercicios.testfunctions("nearHundred");
        //misEjercicios.testfunctions("posNeg");
        //misEjercicios.testfunctions("notString");
        //misEjercicios.testfunctions("missingChar");
        //misEjercicios.testfunctions("frontBack");
        //misEjercicios.testfunctions("front3");
        //misEjercicios.testfunctions("backAround");
        //misEjercicios.testfunctions("or35");
        //misEjercicios.testfunctions("front22");
        //misEjercicios.testfunctions("startHi");
        //misEjercicios.testfunctions("icyHot");
        //misEjercicios.testfunctions("in1020");
        //misEjercicios.testfunctions("hasTeen");
        //misEjercicios.testfunctions("loneTeen");
        //misEjercicios.testfunctions("delDel");
        //misEjercicios.testfunctions("mixStart");
        //misEjercicios.testfunctions("startOz");
        //misEjercicios.testfunctions("intMax");
        //misEjercicios.testfunctions("close10");
        //misEjercicios.testfunctions("in3050");
        //misEjercicios.testfunctions("max1020");
        //misEjercicios.testfunctions("stringE");
        //misEjercicios.testfunctions("lastDigit");
        //misEjercicios.testfunctions("endUp");
        misEjercicios.testfunctions("everyNth");
        
        
        
        
        
    }
    
}
