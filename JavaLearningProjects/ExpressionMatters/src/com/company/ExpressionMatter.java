package com.company;

public class ExpressionMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        int total = 0;

        if(a >= b && a >= c){
            return total = (b+c)*a;
        }else if(b >= a && b >= c){
            return total = (a+c)*b;
        }else if(c >= a && c >= b){
            return total = (b+a)*c;
        }
        return total;
    }
}
