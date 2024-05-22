/*
 Variable is a container that can store some value. 
 This value can be changed during the execution of the program. 
 e.g. -> int number = 8 [ int -> datatype; number -. variable name; 8-> value it stores]

 There are (2) types of datatypes:- 
 1. primitive datatypes (Intrinsic) --
    (byte, int, long, float, char, bool, double, short)

 2. non-primitive datatypes (Derived) --
    They are dervied using primitve datatypes.
    ()
 */
public class java002_variable{
    public static void main(String[] args){
        // defining a variable that's storing a value of 8. 
        int num1 = 8;
        int num2 = 5;
        int sum;
        sum=num1+num2;

        System.out.println("sum of num1,num2 is: : "+sum +" "+ num2);
    }
}


