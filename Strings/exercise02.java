/*
 1. WAP to convert a string to lowercase. 
 2. WAP to replace spaces with underscores. 
 3. WAP to fill in a letter template which looks like below:- 
    letter = "Dear <|name|>, Thanks a lot"
    replace <|name|> with a string (some name) 
 4. WAP to detect double and triple spaces in a string. 
 5. WAP to format the following letter using escape sequence characters. 
*/
package Strings;
 import java.util.Scanner;
 public class exercise02 { 
    public static void main(String[] args) { 
        // prob 1. 
        String name = "James ";
        name.toLowerCase();

        // prob2. 
        String s1 ="   hello";
        s1.replace(" ","_");

        // prob3. 
        String letter = "Dear name, Thanks a lot!";
       String modifiedLetter = letter.replace(name,"James");

        //    prob4. 
        String mystr= "This string consists of some  double and    triple spaces";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("   "));

        // prob5. 
        String str3="Dear James, \n\t Thanks for enrolling \n\t into this course.";
        System.out.println(str3);

    }
 }