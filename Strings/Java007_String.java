package Strings;
// Strings-> 

import java.util.Scanner;
public class Java007_String {

    public static void main(String[] args) {
        String name = "James";
        System.out.println(name);
        
        int a =6;
        float b= 5.6745f;
        System.out.printf("The value is a is %d and value of b is %f.",a,b);
    }
}


/*
 Under java, STRING is a class. 

 String:- 
 A string is a sequence of characters .
 A string is instantiated as follows:- 
    String name = "James";
 Strings are immutable, and can't be changed. 

 Qos: What is "System.out.printf();"
 ans:- System.out.printf() is used for formatting the string. 
 System.out.printf("%d",ch)-> %d is used for (int). 
                              %f is used for (float). 
                              %c is used for (char).
                              %s is used for (string). 
*/