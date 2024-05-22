package dataStructure;

public class J016_MultiDimensionalArrays {

    public static void main(String[] args){
        int [] marks;   // A 1-D array.
        int [][] flats;  // A 2-D array.
        flats = new int[2][3];
        flats[0][0]= 101;
        flats[0][1]= 102;
        flats[0][2]= 103;
        flats[1][0]= 104;
        flats[1][1]= 105;
        flats[1][2]= 106;

        //Displaying the 2-D array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.println(flats[i][j]);
                System.out.println(" ");
            }
            System.out.println("");
        }
    }
}


/*
 Multi-Dimensional Arrays:-
 - These are an array of arrays. Each elements of an M-D array is an array itself. 
 
 Syntax -->>
    // creating a 2D array.
    int [][] flats = new int[2][3]     // A 2-D array of 2 rows + 3 columns. 

    (Adding elements to the array):- 
    flats[0][1]=100
    flats[0][1]=101
    flats[0][2]=102 .....

    Simillarly, a 3D array can be created as:-
    String [][][] = new String [2][3][4]


*/