/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author alejandroserranol
 */
public class Array1_TestFunctions extends Array1_Exercises {
    //Exercises from: https://codingbat.com/java
    
    public void testFunctions (String method){
        switch(method){
            case "firstLast6": {
                System.out.println("firstLast6([1, 2, 6]) = "+firstLast6(new int[] {1, 2, 6}));
                System.out.println("firstLast6([6, 1, 2, 3]) = "+firstLast6(new int[] {6, 1, 2, 3}));
                System.out.println("firstLast6([13, 6, 1, 2, 3]) = "+firstLast6(new int[] {13, 6, 1, 2, 3}));
            } break;
            case "sameFirstLast": {
                System.out.println("sameFirstLast([1, 2, 3]) = "+sameFirstLast(new int[] {1, 2, 3}));
                System.out.println("sameFirstLast([1, 2, 3, 1]) = "+sameFirstLast(new int[] {1, 2, 3, 1}));
                System.out.println("sameFirstLast([1, 2, 1]) = "+sameFirstLast(new int[] {1, 2, 1}));
            } break;
            case "makePi": {
                System.out.println("makePi() = "+Arrays.toString(makePi()));
            } break;
            case "commonEnd": {
                System.out.println("commonEnd([1, 2, 3], [7, 3]) = "+commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
                System.out.println("commonEnd([1, 2, 3], [7, 3, 2]) = "+commonEnd(new int[] {1, 2, 3, 1}, new int[] {7, 3, 2}));
                System.out.println("commonEnd([1, 2, 3], [1, 3]) = "+commonEnd(new int[] {1, 2, 1}, new int[] {1, 3}));
            } break;
            case "sum3": {
                System.out.println("sum3([1, 2, 3]) = "+sum3(new int[] {1, 2, 3}));
                System.out.println("sum3([5, 11, 2]) = "+sum3(new int[] {5, 11, 2}));
                System.out.println("sum3([7, 0, 0]) = "+sum3(new int[] {7, 0, 0}));
            } break;
            case "rotateLeft3": {
                System.out.println("rotateLeft3([1, 2, 3]) = "+Arrays.toString(rotateLeft3(new int[] {1, 2, 3})));
                System.out.println("rotateLeft3([5, 11, 9) = "+Arrays.toString(rotateLeft3(new int[] {5, 11, 9})));
                System.out.println("rotateLeft3([7, 0, 0]) = "+Arrays.toString(rotateLeft3(new int[] {7, 0, 0})));
            } break;
            case "reverse3": {
                System.out.println("reverse3([1, 2, 3]) = "+Arrays.toString(reverse3(new int[] {1, 2, 3})));
                System.out.println("reverse3([5, 11, 9) = "+Arrays.toString(reverse3(new int[] {5, 11, 9})));
                System.out.println("reverse3([7, 0, 0]) = "+Arrays.toString(reverse3(new int[] {7, 0, 0})));
            } break;
            default: System.out.println("No method with that name."); break;
        }
    }
    
    public void testWarmup_2functions (){

//        testFunctions("firstLast6");
//        testFunctions("sameFirstLast");
//        testFunctions("makePi");
//        testFunctions("commonEnd");
//        testFunctions("sum3");
//        testFunctions("rotateLeft3");
        testFunctions("reverse3");
    }
}
