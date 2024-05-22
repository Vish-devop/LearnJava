// Switch stmt, are mostly used when you have multiple conditions and you have to make choice between number of alternatives. 

package conditional;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class J010_switchSTMT {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Welcome, you're coming under teen age.");
                break;
            case 22: 
            System.out.println("Congrates you're getting into corporate");
            break;
            case 60:
            System.out.println("You're getting retired");
            break;
            default:
            System.out.println("Enjoy you're life. Chill!! ");
                break;
        }


    }
    
}

/*
 break -: break means you're juggling between two cases. 
          It will run only (1) condition depending on which condition it's getting executed. 
 value can be "integer", "character", "string".
 */