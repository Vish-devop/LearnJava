import java.util.Scanner;


public class Java004_takeInput {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        // int b = sc.nextInt();
        float b= sc.nextFloat();
        float sum = a+b;
        System.out.println("The sum of both number is: "+ sum);

    }
}

/*
 In-order to read data from user, you need to use a java class -> Scanner

 Scanner sc = new Scanner(system.in);
 */