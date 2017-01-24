package exampleForPupils;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
	private int colExample;
	private int startNum;
	private int endNum;
	
	private int[] num1;
	private int[] num2;

	Example (){
		this.colExample = 15;
		this.startNum = 2;
		this.endNum = 9;
		this.initNumArr();
		this.RandomEX();
	}
	Example (int colExample){
		this();
		this.colExample = colExample;
		
	}
	Example (int colExample, int startNum, int endNum){
		this(colExample);		
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	@Override
	public String toString() {
		return  "количество примеров : " + colExample + '\n' +
				"Example [num1=" + Arrays.toString(num1) + "]" + '\n' +
				"Example [num2=" + Arrays.toString(num2) + "]";
	}
	
	private void RandomEX(){
		int n = 0;
		for (int i = 0; i < colExample; i++){
			n = (int) Math.ceil(Math.random()*(endNum - startNum + 1)+1);
			num1[i] = n;			
			n = (int) Math.ceil(Math.random()*(endNum - startNum + 1)+1);
			num2[i] = n;
			if (exampleWasInArr(i)) i--;
		}
	}
		
	private void initNumArr(){
		this.num1 = new int[this.colExample];
		this.num2 = new int[this.colExample];
		for (int i = 0; i < colExample; i++){			
			this.num1[i] = 0;			
			this.num2[i] = 0;		
	}
		
	}
	
	private boolean exampleWasInArr(int numIter){
		int n1 = num1[numIter];
		int n2 = num2[numIter];
		
		for (int i = 0; i < numIter; i++){
			if ((n1 == num1[i]) && (n2 == num2[i])) return true;
			else if ((n1 == num2[i]) && (n2 == num1[i])) return true;					
		}
		return false;
	}

	public void printExample(){
		for (int i = 0; i < colExample; i++){
			System.out.println(num1[i] + " * " + num2[i] + " = ");
		}
	}
	
	public void startTest(){
		Scanner sc = new Scanner(System.in);
		int otv = 0;
		for (int i = 0; i < colExample; i++){
			
			do{
				System.out.print(num1[i] + " * " + num2[i] + " = ");
				try {
					otv = Integer.parseInt(sc.nextLine());
				}
				catch (Exception e){
					System.out.println("некорректный ввод...");
				}
				
			} while (otv != (num1[i]*num2[i]));
			
			System.out.println();
			}
	}
}
