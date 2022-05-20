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
        misEjercicios.testfunctions("icyHot");
        
        
        
        
        
    }
    
}
