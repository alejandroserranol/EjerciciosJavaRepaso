/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjavarepaso;

/**
 *
 * @author alejandroserranol
 */
public class EjerciciosJavaRepaso {

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
        return !weekday || vacation;
    }
    
    private boolean monkeyTrouble (boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosJavaRepaso misEjercicios = new EjerciciosJavaRepaso();
        
        misEjercicios.testFunction2BooleanParameters("sleepIn");
        misEjercicios.testFunction2BooleanParameters("monkeyTrouble");
        
        
        
    }
    
}
