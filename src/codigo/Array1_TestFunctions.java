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
                System.out.println("rotateLeft3([5, 11, 9]) = "+Arrays.toString(rotateLeft3(new int[] {5, 11, 9})));
                System.out.println("rotateLeft3([7, 0, 0]) = "+Arrays.toString(rotateLeft3(new int[] {7, 0, 0})));
            } break;
            case "reverse3": {
                System.out.println("reverse3([1, 2, 3]) = "+Arrays.toString(reverse3(new int[] {1, 2, 3})));
                System.out.println("reverse3([5, 11, 9]) = "+Arrays.toString(reverse3(new int[] {5, 11, 9})));
                System.out.println("reverse3([7, 0, 0]) = "+Arrays.toString(reverse3(new int[] {7, 0, 0})));
            } break;
            case "maxEnd3": {
                System.out.println("maxEnd3([1, 2, 3]) = "+Arrays.toString(maxEnd3(new int[] {1, 2, 3})));
                System.out.println("maxEnd3([11, 5, 9]) = "+Arrays.toString(maxEnd3(new int[] {11, 5, 9})));
                System.out.println("maxEnd3([2, 11, 3]) = "+Arrays.toString(maxEnd3(new int[] {2, 11, 3})));
            } break;
            case "sum2": {
                System.out.println("sum2([1, 2, 3]) = "+sum2(new int[] {1, 2, 3}));
                System.out.println("sum2([1, 1]) = "+sum2(new int[] {1, 1}));
                System.out.println("sum2([1, 1, 1, 1]) = "+sum2(new int[] {1, 1, 1, 1}));
            } break;
            case "middleWay": {
                System.out.println("middleWay([1, 2, 3], [4, 5, 6]) = "+Arrays.toString(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6})));
                System.out.println("middleWay([7, 7, 7], [3, 8, 0]) = "+Arrays.toString(middleWay(new int[] {11, 5, 9}, new int[] {3, 8, 0})));
                System.out.println("middleWay([5, 2, 9], [1, 4, 5]) = "+Arrays.toString(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5})));
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
//        testFunctions("reverse3");
//        testFunctions("maxEnd3");
//        testFunctions("sum2");
        testFunctions("middleWay");
    }
}
