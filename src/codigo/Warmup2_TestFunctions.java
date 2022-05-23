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
            default: System.out.println("No method with that name.");
        }
    }
    
    public void testWarmup_2functions (){

//        testFunctions("stringTimes");
//        testFunctions("frontTimes");
//        testFunctions("countXX");
//        testFunctions("doubleX");
        testFunctions("stringBits");
    }
}
