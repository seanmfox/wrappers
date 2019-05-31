/*
Name: Sean Fox
Date: 5-30-19
Class: CIT-130
Purpose: Assignment 4, Part 1 - Test the shallow and deep wrapper classes to identify the difference between deep and shallow copying.
*/

public class TestWrappers {

    public static void main(String[] args) {
        WrapperShallow ws = new WrapperShallow();
        WrapperShallow ws2 = new WrapperShallow(ws);

        System.out.println("**** TESTING SHALLOW OBJECTS ****");
        System.out.println("initial ws object contains");
        System.out.println(ws);
        System.out.println("copy ws object contains");
        System.out.println(ws2);
        System.out.println("initial object changed to");
        ws.setArray(13, 14, 15);
        System.out.println(ws);
        System.out.println("copy ws object not changed contains");
        System.out.println(ws2);
        if(ws.equals(ws2))
            System.out.println("WOOPS! ws.equals(ws2) is true");
        else
            System.out.println("RIGHT! ws.equals(ws2) is false");

        System.out.println();

        System.out.println("**** TESTING DEEP OBJECTS ****");
        WrapperDeep wd = new WrapperDeep();
        WrapperDeep wd2 = new WrapperDeep(wd);
        System.out.println("initial wd object contains");
        System.out.println(wd);
        System.out.println("copy wd object contains");
        System.out.println(wd2);
        System.out.println("initial object changed to");
        wd.setArray(7, 6, -5);
        System.out.println(wd);
        System.out.println("copy wd object not changed contains");
        System.out.println(wd2);
        if(wd.equals(wd2))
            System.out.println("WOOPS! wd.equals(wd2) is true");
        else
            System.out.println("RIGHT! wd.equals(wd2) is false");
    }
}
