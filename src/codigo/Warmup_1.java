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
            default: System.out.println("No method with that name.");
        }
    }
    
    private boolean sleepIn (boolean weekday, boolean vacation){
        return !weekday || vacation;
    }
    
    private boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
    
    private int sumDouble (int a, int b){
        if(a==b){
            return 2*(a+b);
        }        
        return a+b;
    }    
    
    private int diff21 (int n){
        if(n > 21){
            return (n - 21)*2; 
        }        
        return 21 - n;
    }
    
    private boolean parrotTrouble (boolean talking, int hour){
        return talking && (hour<7 || hour>20);
    }
    
    private boolean makes10(int a, int b){
        return a==10 || b==10 || a+b==10;
    }
    
    private boolean nearHundred(int n) {
        return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
    }
    
    private boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return a<0 && b<0;
        } else {
            return (a<0 && b>0) || (a>0 && b<0);
        }
    }
    
    private String notString(String str) {
        if(str.length()>2 && str.substring(0,3).equals("not")){
            return str;
        }        
        return "not "+str;
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
        misEjercicios.testfunctions("notString");
        
        
        
        
        
    }
    
}
