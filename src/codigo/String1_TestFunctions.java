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
            default: System.out.println("No method with that name."); break;
        }
    }
    
    public void testWarmup_2functions (){

//        testFunctions("helloName");
//        testFunctions("makeAbba");
//        testFunctions("makeTags");
//        testFunctions("makeOutWord");
        testFunctions("extraEnd");
    }
}
