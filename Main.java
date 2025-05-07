/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double number,num1 ,result;
		char operator;
		int count;
		System.out.println("how many numbers you want to calculate ?");
		count= sc.nextInt ();
		System.out.println("enter the first number");
		num1= sc.nextDouble ();
		for (int i = 1; i < count; i++) {
          System.out.println("enter the number" +(i+1)+":");
		   	number= sc.nextDouble ();
		  	System.out.println("enter the operator (+,-,*,/,%) you want ");
	        operator= sc.next().charAt(0);
	        switch (operator) {
	            case'+':
	            num1 += number;
	            break;
	            case'-':
	            num1 -= number;
	            break;
	            case'*':
	            num1 *= number;
	            break;
	            case'/':
	                if(number !=0){
	                    num1 += number; 
	                }
	                else{
	                    System.out.println("error:division zero is not allowed");
	                }
	            break;
	             case'%':
	                if(number !=0){
	                    num1 =  (num1 * number) / 100;
	                }
	                else{
	                    System.out.println("error:modulo zero is not allowed");
	                }
	            break;
	        }
		}
		System.out.printf("Final result:  %.2f", num1);
	}
}