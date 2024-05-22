package dataStructure;

public class J015_array {

    public static void main(String[] args){
        //creating an array of storing all the marks of a student.
        int [] marks = {90,98,34,56,34};
        for(int i=0; i<=marks.length-1; i++){
            System.out.println(marks[i]);
        }
    }
}
 
/*
 - An array is a collection of simillar types of data having contiguous memory allocation. 
 - The indexing of the array starts from 0, i.e. 1st element will be stored at the 0th index, 2nd element at 1st index, 3rd at 2nd index, and so-on.
 - The size of the array can't be increased at run-time therefore we can store only a fixed size of elements in array.
 - Array start from 0th index. 

 1. Defining an array.
        int [] marks = new int[5]        (marks -> reference; int -> object)
        (or) 
        int [] marks;          -->> Declaration.
        marks = new int[5];    -->> Mameroy alocation.
        (or) 
        int [] marks = {1,2,3,4,5};
  
 2. Accessing Array Elements:-
        e.g. >> marks = [1,2,3,4,5,5,7,7]
                // accessing the elements:-
                marks[1]=2
 
  3. Finding the array.length()
        e.g. >> marks.length

  4. Displaying an array.
        e.g. -> 
        for (int i=0; i<=marks.length; i++){
            System.out.println(marks[i]);
        }

 */