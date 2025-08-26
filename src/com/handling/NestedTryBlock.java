package com.handling;

public class NestedTryBlock {
    public static void main(String[] args) {
                try {

                    System.out.println("Try Block!!!");
                    try {
                        int a = 10;
                        int b = 0;
                        int result = a / b;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("don't divide by 0"+" "+e.getMessage());
                    }
                    try {
                        String str = null;
                        System.out.println("String" + str.length());
                    } catch (NullPointerException e) {
                        System.out.println("NullPointerException Caught");
                    }
                }
                catch (Exception e){
                    System.out.println("Caught an unexpected Exception"+e.getMessage());
                }
            }
        }



