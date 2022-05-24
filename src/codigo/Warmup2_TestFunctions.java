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
public class Warmup2_TestFunctions extends Warmup2_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public void testFunctions (String method){
        switch(method){
            case "stringTimes": {
                System.out.println("stringTimes(\"Hi\", 2) = "+stringTimes("Hi", 2));
                System.out.println("stringTimes(\"Hi\", 3) = "+stringTimes("Hi", 3));
                System.out.println("stringTimes(\"Hi\", 1) = "+stringTimes("Hi", 1));
            } break;
            case "frontTimes": {
                System.out.println("frontTimes(\"Chocolate\", 2) = "+frontTimes("Chocolate", 2));
                System.out.println("frontTimes(\"Chocolate\", 3) = "+frontTimes("Chocolate", 3));
                System.out.println("frontTimes(\"Abc\", 1) = "+frontTimes("Abc", 1));
            } break;
            case "countXX": {
                System.out.println("countXX(\"abcxx\") = "+countXX("abcxx"));
                System.out.println("countXX(\"xxx\") = "+countXX("xxx"));
                System.out.println("countXX(\"xxxx\") = "+countXX("xxxx"));
                System.out.println("countXX(\"\") = "+countXX(""));
            } break;
            case "doubleX": {
                System.out.println("doubleX(\"axxbb\") = "+doubleX("axxbb"));
                System.out.println("doubleX(\"axaxax\") = "+doubleX("axaxax"));
                System.out.println("doubleX(\"xxxxx\") = "+doubleX("xxxxx"));
                System.out.println("doubleX(\"\") = "+doubleX(""));
            } break;
            case "stringBits": {
                System.out.println("stringBits(\"Hello\") = "+stringBits("Hello"));
                System.out.println("stringBits(\"Hi\") = "+stringBits("Hi"));
                System.out.println("stringBits(\"Heeololeo\") = "+stringBits("Heeololeo"));
                System.out.println("stringBits(\"\") = "+stringBits(""));
                System.out.println("stringBits(\"Hello Kitten\") = "+stringBits("Hello Kitten"));
                System.out.println("stringBits(\"Hellok itten\") = "+stringBits("Hellok itten"));
            } break;
            case "stringSplosion": {
                System.out.println("stringBits(\"Code\") = "+stringSplosion("Code"));
                System.out.println("stringBits(\"abc\") = "+stringSplosion("abc"));
                System.out.println("stringBits(\"ab\") = "+stringSplosion("ab"));
            } break;
            case "last2": {
                System.out.println("last2(\"hixxhi\") = "+last2("hixxhi"));
                System.out.println("last2(\"xaxxaxaxx\") = "+last2("xaxxaxaxx"));
                System.out.println("last2(\"axxxaaxx\") = "+last2("axxxaaxx"));
            } break;
            case "arrayCount9": {
                System.out.println("arrayCount9(1, 2, 9) = "+arrayCount9(new int[] {1, 2, 9}));
                System.out.println("arrayCount9(1, 9, 9) = "+arrayCount9(new int[] {1, 9, 9}));
                System.out.println("arrayCount9(1, 9, 9, 3, 9) = "+arrayCount9(new int[] {1, 9, 9, 3, 9}));
            } break;
            case "arrayFront9": {
                System.out.println("arrayFront9(1, 2, 9, 3, 4) = "+arrayFront9(new int[] {1, 2, 9, 3, 4}));
                System.out.println("arrayFront9(1, 2, 3, 4, 9) = "+arrayFront9(new int[] {1, 2, 3, 4, 9}));
                System.out.println("arrayFront9(1, 2, 3, 4, 5) = "+arrayFront9(new int[] {1, 2, 3, 4, 5}));
            } break;
            case "array123": {
                System.out.println("array123(1, 1, 2, 3, 1) = "+array123(new int[] {1, 1, 2, 3, 1}));
                System.out.println("array123(1, 1, 2, 4, 1) = "+array123(new int[] {1, 1, 2, 4, 1}));
                System.out.println("array123(1, 1, 2, 1, 2, 3) = "+array123(new int[] {1, 1, 2, 1, 2, 3}));
            } break;
            case "stringMatch": {
                System.out.println("stringMatch(\"xxcaazz\", \"xxbaaz\") = "+stringMatch("xxcaazz", "xxbaaz"));
                System.out.println("stringMatch(\"abc\", \"abc\") = "+stringMatch("abc", "abc"));
                System.out.println("stringMatch(\"abc\", \"axc\") = "+stringMatch("abc", "axc"));
                System.out.println("stringMatch(\"aabbccdd\", \"abbbxxd\") = "+stringMatch("aabbccdd", "abbbxxd"));
                System.out.println("stringMatch(\"aaxxaaxx\", \"iaxxai\") = "+stringMatch("aaxxaaxx", "iaxxai"));
                System.out.println("stringMatch(\"iaxxai\", \"aaxxaaxx\") = "+stringMatch("iaxxai", "aaxxaaxx"));
            } break;
            case "stringX": {
                System.out.println("stringX(\"xxHxix\") = "+stringX("xxHxix"));
                System.out.println("stringX(\"abxxxcd\") = "+stringX("abxxxcd"));
                System.out.println("stringX(\"xabxxxcdx\") = "+stringX("xabxxxcdx"));
            } break;
            case "altPairs": {
                System.out.println("altPairs(\"kitten\") = "+altPairs("kitten"));
                System.out.println("altPairs(\"Chocolate\") = "+altPairs("Chocolate"));
                System.out.println("altPairs(\"CodingHorror\") = "+altPairs("CodingHorror"));
            } break;
            case "stringYak": {
                System.out.println("stringYak(\"yakpak\") = "+stringYak("yakpak"));
                System.out.println("stringYak(\"pakyak\") = "+stringYak("pakyak"));
                System.out.println("stringYak(\"yak123ya\") = "+stringYak("yak123ya"));
            } break;
            case "array667": {
                System.out.println("array667(6, 6, 2) = "+array667(new int[] {6, 6, 2}));
                System.out.println("array667(6, 6, 2, 6) = "+array667(new int[] {6, 6, 2, 6}));
                System.out.println("array667(6, 7, 2, 6) = "+array667(new int[] {6, 7, 2, 6}));
            } break;
            case "noTriples": {
                System.out.println("noTriples(1, 1, 2, 2, 1) = "+noTriples(new int[] {1, 1, 2, 2, 1}));
                System.out.println("noTriples(1, 1, 2, 2, 2, 1) = "+noTriples(new int[] {1, 1, 2, 2, 2, 1}));
                System.out.println("noTriples(1, 1, 1, 2, 2, 2, 1) = "+noTriples(new int[] {1, 1, 1, 2, 2, 2, 1}));
            } break;
            case "has271": {
                System.out.println("has271(1, 2, 7, 1) = "+has271(new int[] {1, 2, 7, 1}));
                System.out.println("has271(1, 2, 8, 1) = "+has271(new int[] {1, 2, 8, 1}));
                System.out.println("has271(2, 7, 1) = "+has271(new int[] {2, 7, 1}));
                System.out.println("has271(2, 7, 4) = "+has271(new int[] {2, 7, 4}));
            } break;
            default: System.out.println("No method with that name."); break;
        }
    }
    
    public void testWarmup_2functions (){

//        testFunctions("stringTimes");
//        testFunctions("frontTimes");
//        testFunctions("countXX");
//        testFunctions("doubleX");
//        testFunctions("stringBits");
//        testFunctions("stringSplosion");
//        testFunctions("last2");
//        testFunctions("arrayCount9");
//       testFunctions("arrayFront9");
//        testFunctions("array123");
//        testFunctions("stringMatch");
//        testFunctions("stringX");
//        testFunctions("altPairs");
//        testFunctions("stringYak");
//        testFunctions("array667");
//        testFunctions("noTriples");
        testFunctions("has271");
    }
}
