/*
Name: Sean Fox
Date: 5-30-19
Class: CIT-130
Purpose: Assignment 4, Part 1 - Create a shallow wrapper class.
*/

public class WrapperShallow {

    private int[] a;

    public WrapperShallow() {
        a = new int[] {7, 17, 77};
    }

    public WrapperShallow(WrapperShallow ws) {
        a = ws.a;
    }

    public void setArray(int num1, int num2, int num3) {
        a[0] = num1;
        a[1] = num2;
        a[2] = num3;
    }

    public String toString() {
        String contents = "";
        for(int number : a)
            contents += number + " ";
        return contents;
    }

    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        else if(getClass() != obj.getClass())
            return false;
        else {
            WrapperShallow ws = (WrapperShallow)obj;
            return (a[0] == ws.a[0] && a[1] == ws.a[1] && a[2] == ws.a[2] );
        }
    }
}
