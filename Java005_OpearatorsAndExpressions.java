// Operators and Expressions:- 

/*
 Operators-> These are used to perform operations on variables and values. 
 e.g. -> 7+11 = 18 (operand: 7,11; +-> operator; 18-> result)

 There are different types of operators:- 
 1. Arithemetic Operators:- +,-,*,/,%,++,--
 2. Assignment Operators:- =,+=, -=, *=, /=, etc.
 3. Comparison Operators:- ==,>=,<=
 4. Logical Operators:- &&, ||, !
 5. Bitwise Operators:- &, | (operates bitwise)

 <> Precedence of Operators-> 
 The operators are applied and evaluated based on precendence. 
 e.g. -> (+,-) has less precendece compared to (*,/). hence (*,/) are evaluated first. 
 In-case we like to change this order, we use parenthesis. 

 <> Associativity -> 
 Associativity tells the direction of execution of operators. 
 It can either be "left to right" or "Right to left". 
*/
public class Java005_OpearatorsAndExpressions {

    public static void main(String[] args) {
        int a=4; 
        int b=6;
        int sum=a+b;
        System.out.println(sum);
    }
}