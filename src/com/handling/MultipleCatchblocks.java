package com.handling;

public class MultipleCatchblocks {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        try {

            System.out.println(arr[5]);

        } catch (ArithmeticException ae) {
            System.out.println("don't divide by 0" +" "+ ae.getMessage());
        }
        catch(RuntimeException r){
            System.out.println("Runtime exception nothing but unchecked exceptions"+" "+r.getMessage());
        }catch (Exception e){
            System.out.println("Exception parent throwable"+" "+e.getMessage());
        }
    }
}
