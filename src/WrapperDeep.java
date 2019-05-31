/*
Name: Sean Fox
Date: 5-30-19
Class: CIT-130
Purpose: Assignment 4, Part 1 - Create a deep wrapper class.
*/

public class WrapperDeep {

    private int[] a;

    public WrapperDeep() {
        a = new int[] {2, 3, 4};
    }

    public WrapperDeep(WrapperDeep ws) {
        a = new int[3];
        for (int i = 0; i < 3; i++) a[i] = ws.a[i];
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
            WrapperDeep wd = (WrapperDeep)obj;
            return (a[0] == wd.a[0] && a[1] == wd.a[1] && a[2] == wd.a[2] );
        }
    }

}
