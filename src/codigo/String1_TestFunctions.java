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
            case "conCat": {
                System.out.println("conCat(\"abc\", \"cat\") = "+conCat("abc", "cat"));
                System.out.println("conCat(\"dog\", \"cat\") = "+conCat("dog", "cat"));
                System.out.println("conCat(\"abc\", \"\") = "+conCat("abc", ""));
            } break;
            case "lastTwo": {
                System.out.println("lastTwo(\"coding\") = "+lastTwo("coding"));
                System.out.println("lastTwo(\"cat\") = "+lastTwo("cat"));
                System.out.println("lastTwo(\"ab\") = "+lastTwo("ab"));
            } break;
            case "seeColor": {
                System.out.println("seeColor(\"redxx\") = "+seeColor("redxx"));
                System.out.println("seeColor(\"xxred\") = "+seeColor("xxred"));
                System.out.println("seeColor(\"blueTimes\") = "+seeColor("blueTimes"));
            } break;
            case "frontAgain": {
                System.out.println("frontAgain(\"edited\") = "+frontAgain("edited"));
                System.out.println("frontAgain(\"edit\") = "+frontAgain("edit"));
                System.out.println("frontAgain(\"ed\") = "+frontAgain("ed"));
            } break;
            case "minCat": {
                System.out.println("minCat(\"Hello\", \"Hi\") = "+minCat("Hello", "Hi"));
                System.out.println("minCat(\"Hello\", \"java\") = "+minCat("Hello", "java"));
                System.out.println("minCat(\"java\", \"Hello\") = "+minCat("java", "Hello"));
            } break;
            case "extraFront": {
                System.out.println("extraFront(\"Hello\") = "+extraFront("Hello"));
                System.out.println("extraFront(\"ab\") = "+extraFront("ab"));
                System.out.println("extraFront(\"H\") = "+extraFront("H"));
            } break;
            case "without2": {
                System.out.println("without2(\"HelloHe\") = "+without2("HelloHe"));
                System.out.println("without2(\"HelloHi\") = "+without2("HelloHi"));
                System.out.println("without2(\"Hi\") = "+without2("Hi"));
            } break;
            case "deFront": {
                System.out.println("deFront(\"Hello\") = "+deFront("Hello"));
                System.out.println("deFront(\"java\") = "+deFront("java"));
                System.out.println("deFront(\"away\") = "+deFront("away"));
            } break;
            case "startWord": {
                System.out.println("startWord(\"hippo\", \"hi\") = "+startWord("hippo", "hi"));
                System.out.println("startWord(\"hippo\", \"xip\") = "+startWord("hippo", "xip"));
                System.out.println("startWord(\"hippo\", \"i\") = "+startWord("hippo", "i"));
            } break;
            case "withoutX": {
                System.out.println("withoutX(\"xHix\") = "+withoutX("xHix"));
                System.out.println("withoutX(\"xHi\") = "+withoutX("xHi"));
                System.out.println("withoutX(\"Hxix\") = "+withoutX("Hxix"));
                System.out.println("withoutX(\"xxHi\") = "+withoutX("xxHi"));
                System.out.println("withoutX(\"xx\") = "+withoutX("xx"));
            } break;
            case "withoutX2": {
                System.out.println("withoutX2(\"xHi\") = "+withoutX2("xHi"));
                System.out.println("withoutX2(\"Hxi\") = "+withoutX2("Hxi"));
                System.out.println("withoutX2(\"Hi\") = "+withoutX2("Hi"));
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
//        testFunctions("lastChars");
//        testFunctions("conCat");
//        testFunctions("lastTwo");
//        testFunctions("seeColor");
//        testFunctions("frontAgain");
//        testFunctions("minCat");
//        testFunctions("extraFront");
//        testFunctions("without2");
//        testFunctions("deFront");
//        testFunctions("startWord");
//        testFunctions("withoutX");
        testFunctions("withoutX2");
    }
}
