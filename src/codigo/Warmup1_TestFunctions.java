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
public class Warmup1_TestFunctions  extends Warmup1_Exercises {
    
    //Exercises from: https://codingbat.com/java
    
    public Boolean[][]  boolArray = {{true, true},{true, false}, {false, true}, {false, false}};
    
    public void testFunction2BooleanParameters (String method){
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
    
    public void testFunctions (String method){
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
    
    public void testWarmup_1functions (){
        testFunction2BooleanParameters("sleepIn");
        testFunction2BooleanParameters("monkeyTrouble");
        
        testFunctions("sumDouble");
        testFunctions("diff21");
        testFunctions("parrotTrouble");
        testFunctions("makes10");
        testFunctions("nearHundred");
        testFunctions("posNeg");
        testFunctions("notString");
        testFunctions("missingChar");
        testFunctions("frontBack");
        testFunctions("front3");
        testFunctions("backAround");
        testFunctions("or35");
        testFunctions("front22");
        testFunctions("startHi");
        testFunctions("icyHot");
        testFunctions("in1020");
        testFunctions("hasTeen");
        testFunctions("loneTeen");
        testFunctions("delDel");
        testFunctions("mixStart");
        testFunctions("startOz");
        testFunctions("intMax");
        testFunctions("close10");
        testFunctions("in3050");
        testFunctions("max1020");
        testFunctions("stringE");
        testFunctions("lastDigit");
        testFunctions("endUp");
        testFunctions("everyNth");
    }
    
    
}
