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
public class String1_TestFunctions extends String1_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public void testFunctions (String method){
        switch(method){
            case "helloName": {
                System.out.println("stringTimes(\"Bob\") = "+helloName("Bob"));
                System.out.println("stringTimes(\"Alice\") = "+helloName("Alice"));
                System.out.println("stringTimes(\"X\") = "+helloName("X"));
            } break;            
            case "makeAbba": {
                System.out.println("makeAbba(\"Hi\", \"Hi\") = "+makeAbba("Hi", "Bye"));
                System.out.println("makeAbba(\"Yo\", \"Alice\") = "+makeAbba("Yo", "Alice"));
                System.out.println("makeAbba(\"What\", \"Up\") = "+makeAbba("What", "Up"));
            } break;
            case "makeTags": {
                System.out.println("makeTags(\"i\", \"Yay\") = "+makeTags("i", "Yay"));
                System.out.println("makeTags(\"i\", \"Hello\") = "+makeTags("i", "Hello"));
                System.out.println("makeTags(\"What\", \"Yay\") = "+makeTags("cite", "Yay"));
            } break;
            case "makeOutWord": {
                System.out.println("makeOutWord(\"<<>>\", \"Yay\") = "+makeOutWord("<<>>", "Yay"));
                System.out.println("makeOutWord(\"<<>>\", \"WooHoo\") = "+makeOutWord("<<>>", "WooHoo"));
                System.out.println("makeOutWord(\"[[]]\", \"word\") = "+makeOutWord("[[]]", "word"));
            } break;
            case "extraEnd": {
                System.out.println("makeOutWord(\"Hello\") = "+extraEnd("Hello"));
                System.out.println("makeOutWord(\"ab\") = "+extraEnd("ab"));
                System.out.println("makeOutWord(\"Hi\") = "+extraEnd("Hi"));
            } break;
            case "firstTwo": {
                System.out.println("firstTwo(\"Hello\") = "+firstTwo("Hello"));
                System.out.println("firstTwo(\"abcdefg\") = "+firstTwo("abcdefg"));
                System.out.println("firstTwo(\"ab\") = "+firstTwo("ab"));
            } break;
            case "firstHalf": {
                System.out.println("firstHalf(\"WooHoo\") = "+firstHalf("WooHoo"));
                System.out.println("firstHalf(\"HelloThere\") = "+firstHalf("HelloThere"));
                System.out.println("firstHalf(\"abcdef\") = "+firstHalf("abcdef"));
            } break;
            case "withoutEnd": {
                System.out.println("withoutEnd(\"Hello\") = "+withoutEnd("Hello"));
                System.out.println("withoutEnd(\"java\") = "+withoutEnd("java"));
                System.out.println("withoutEnd(\"coding\") = "+withoutEnd("coding"));
            } break;
            case "comboString": {
                System.out.println("comboString(\"Hello\", \"hi\") = "+comboString("Hello", "hi"));
                System.out.println("comboString(\"hi\", \"Hello\") = "+comboString("hi", "Hello"));
                System.out.println("comboString(\"aaa\", \"b\") = "+comboString("aaa", "b"));
            } break;
            case "nonStart": {
                System.out.println("nonStart(\"Hello\", \"There\") = "+nonStart("Hello", "There"));
                System.out.println("nonStart(\"java\", \"code\") = "+nonStart("java", "code"));
                System.out.println("nonStart(\"shotl\", \"java\") = "+nonStart("shotl", "java"));
            } break;
            case "left2": {
                System.out.println("left2(\"Hello\") = "+left2("Hello"));
                System.out.println("left2(\"java\") = "+left2("java"));
                System.out.println("left2(\"Hi\") = "+left2("Hi"));
            } break;
            case "right2": {
                System.out.println("right2(\"Hello\") = "+right2("Hello"));
                System.out.println("right2(\"java\") = "+right2("java"));
                System.out.println("right2(\"Hi\") = "+right2("Hi"));
            } break;
            case "theEnd": {
                System.out.println("theEnd(\"Hello\", true) = "+theEnd("Hello", true));
                System.out.println("theEnd(\"Hello\", false) = "+theEnd("Hello", false));
                System.out.println("theEnd(\"oh\", true) = "+theEnd("oh", true));
            } break;
            case "withouEnd2": {
                System.out.println("withouEnd2(\"Hello\") = "+withouEnd2("Hello"));
                System.out.println("withouEnd2(\"abc\") = "+withouEnd2("abc"));
                System.out.println("withouEnd2(\"ab\") = "+withouEnd2("ab"));
            } break;
            case "middleTwo": {
                System.out.println("middleTwo(\"string\") = "+middleTwo("string"));
                System.out.println("middleTwo(\"code\") = "+middleTwo("code"));
                System.out.println("middleTwo(\"Practice\") = "+middleTwo("Practice"));
            } break;
            case "endsLy": {
                System.out.println("endsLy(\"oddly\") = "+endsLy("oddly"));
                System.out.println("endsLy(\"y\") = "+endsLy("y"));
                System.out.println("endsLy(\"oddy\") = "+endsLy("oddy"));
            } break;
            case "nTwice": {
                System.out.println("nTwice(\"Hello\", 2) = "+nTwice("Hello", 2));
                System.out.println("nTwice(\"Chocolate\", 3) = "+nTwice("Chocolate", 3));
                System.out.println("nTwice(\"Chocolate\", 1) = "+nTwice("Chocolate", 1));
            } break;
            case "twoChar": {
                System.out.println("twoChar(\"java\", 0) = "+twoChar("java", 0));
                System.out.println("twoChar(\"java\", 2) = "+twoChar("java", 2));
                System.out.println("twoChar(\"java\", 3) = "+twoChar("java", 3));
                System.out.println("twoChar(\"java\", -1) = "+twoChar("java", -1));
            } break;
            case "middleThree": {
                System.out.println("middleThree(\"Candy\") = "+middleThree("Candy"));
                System.out.println("middleThree(\"and\") = "+middleThree("and"));
                System.out.println("middleThree(\"solving\") = "+middleThree("solving"));
            } break;
            case "hasBad": {
                System.out.println("hasBad(\"badxx\") = "+hasBad("badxx"));
                System.out.println("hasBad(\"xbadxx\") = "+hasBad("xbadxx"));
                System.out.println("hasBad(\"xxbadxx\") = "+hasBad("xxbadxx"));
            } break;
            case "atFirst": {
                System.out.println("atFirst(\"hello\") = "+atFirst("hello"));
                System.out.println("atFirst(\"hi\") = "+atFirst("hi"));
                System.out.println("atFirst(\"h\") = "+atFirst("h"));
                System.out.println("atFirst(\"\") = "+atFirst(""));
            } break;
            case "lastChars": {
                System.out.println("lastChars(\"last\", \"chars\") = "+lastChars("last", "chars"));
                System.out.println("lastChars(\"yo\", \"java\") = "+lastChars("yo", "java"));
                System.out.println("lastChars(\"hi\", \"\") = "+lastChars("hi", ""));
            } break;
            default: System.out.println("No method with that name."); break;
        }
    }
    
    public void testWarmup_2functions (){

//        testFunctions("helloName");
//        testFunctions("makeAbba");
//        testFunctions("makeTags");
//        testFunctions("makeOutWord");
//        testFunctions("extraEnd");
//        testFunctions("firstTwo");
//        testFunctions("firstHalf");
//        testFunctions("withoutEnd");
//        testFunctions("comboString");
//        testFunctions("nonStart");
//        testFunctions("left2");
//        testFunctions("right2");
//        testFunctions("theEnd");
//        testFunctions("withouEnd2");
//        testFunctions("middleTwo");
//        testFunctions("endsLy");
//        testFunctions("nTwice");
//        testFunctions("twoChar");
//        testFunctions("middleThree");
//        testFunctions("hasBad");
//        testFunctions("atFirst");
        testFunctions("lastChars");
    }
}
