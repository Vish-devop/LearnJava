package Strings;

import javax.sound.midi.Soundbank;

public class Java008_StringMethods {
    public static void main(String[] args) {
        String name = "James";
        System.out.println("The length of name: "+name.length());

        System.out.println("The lowercase of name is: "+name.toLowerCase());
        System.out.println("The uppercase of name is: "+name.toUpperCase());

        String Name = "     James     ";
        System.out.println("The trimed string is: "+Name.trim());

        System.out.println("The one of the substring of name would be: "+name.substring(1));
        // System.out.println("The substring within a range would be: ",name.substring(1, 3));

        System.out.println("I am replacing the char: "+name.replace("J","A"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('J'));
         
        System.out.println(name.equals("James"));
        System.out.println(name.equalsIgnoreCase("james"));
    }
}

/*
 1. You can create a string in (2) formats:- 
    1.1>> String a = "harry";
    1.2>> String b = new String("James"); 

 2. String methods operate on Java Strings. they can be used to find length of the string. 
 Convert to lowerCase, convert to UpperCase, etc.. 

 3. Strings are immutable, which means strings can't be changed once defined. 

 4. Some commonly used string methods are -> 
 e.g. -> String name = "James";

    4.1)) name.length() -> returns length of string name. 
    4.2)) name.toLowerCase() -> return a new string which has all the lowercase characters from the string name. 
    4.3)) name.toUpperCase() -> return a new string which has all the uppercase characters from the string name. 
    4.4)) name.trim() -> returns a new string after removing all the leading and trailing spaces form the original string.
    4.5)) name.substring(int start) -> returns a substring from start to the end. Substring(3) return "ry". [Note that index start from 0]
    4.6)) name.substring(int start, int end) -> returns a substring from start index to the end index. Start index is included and end index is excluded.
    4.7)) name.replace(char,char) -> returns a new string  after replacing a char with another char.
    4.8)) name.startWith("string") -> returns true if name starts with string (let's say-> "ha")
    4.9)) name.charAt(index)-> returns the char present on that index. 
    4.10)) name.indexof(character)-> returns the index of that character. 
    4.11)) name.indexof(character, index) -> returns the last index of the given string before index. 
    4.12)) name.equals(String) -> returns true if the given string is equal to written_string.
    4.13)) name.equalIgnoreCase(string) ->  retrun true if two strings are equal ignoring in whichever case of characters they're present. 

 <> Escape Sequence Characters:-
    Sequence of characters after backslash "\" = escape sequence characters. 
    escape sequence characters consissts of more than one characters but represent one character when used within the strings. 
    e.g. -> \n, \t, \\,  \', etc. 

 */