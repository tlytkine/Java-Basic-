import java.util.Scanner;

public class Calculator {

public static int Multiplication(int x, int y){
int product = x * y;
return product;
}
public static int Division(int x, int y){
int quotient = x / y;
return quotient;
}
public static int Addition(int x, int y){
int sum = x + y;
return sum;
}
public static int Subtraction(int x, int y){
int difference = x - y;
return difference;
}

public static void main(String[]args){
Scanner scnr = new Scanner(System.in);
System.out.println("Enter the first digit you would like to perform an operation on.");
int x = scnr.nextInt();
System.out.println("Enter the second digit you would like to perform an operation on.");
int y = scnr.nextInt();
System.out.println("Enter a number 1-4 to select which operation you would like to perform.");
System.out.println("1: Multiplication, 2: Division, 3: Addition, 4: Subtraction");
int z = scnr.nextInt();
if(int z==1){
  System.out.println("The product is: " + Multiplication(x,y));
}
else if (int z==2) {
  System.out.println("The quotient is: " + Division(x,y));
}
else if (int z==3) {
  System.out.println("The sum is: " + Addition(x,y));
}
else if (int z==4) {
  System.out.println("The difference is: " + Subtraction(x,y));
}                 
}
}
