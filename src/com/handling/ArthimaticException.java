package com.handling;

public class ArthimaticException {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
           int  result = a / b;
            System.out.println(result);
        }catch (ArithmeticException ae){
            System.out.println("don't divide with zero"+ ae.getMessage());
        }
        finally{
            System.out.println("finally always printing");
        }
    }
}
