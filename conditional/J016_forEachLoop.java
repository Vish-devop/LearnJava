package conditional;

public class J016_forEachLoop {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,4};
        for (int i:arr)
        {
            System.out.println(i);
        }
    }
}


/*
 for-each loop:-
 1. for-each loop is an enhanced version of loop.
 2. It travels each elements of the data structure one-by-one. 
 3. Note that you can't skip any element in for-loop and it's also not possible to traverse elements in reverse order with the help of for-each loop.
 4. It increases the readability of the code.
 5. If you just want to simply traverse an array from start to end then it's recommended to use for-each loop. 

 Syntax:- 
 for(int element: arr)
 {
    System.out.println(element); // prints all the elements. 
 }
*/
// ----------------

/*
 Qos:- How (for) loop and (for-each) loop is different from each-other? 
 ans:- 
 */