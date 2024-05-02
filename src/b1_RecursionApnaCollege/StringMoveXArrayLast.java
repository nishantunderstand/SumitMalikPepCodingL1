package b1_RecursionApnaCollege;

import java.util.Scanner;

public class StringMoveXArrayLast {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Values:");
		String str = sc.next();
		System.out.println("Entered Values For String :"+str);
		MoveXArrayLast(str,0,0,"");
		sc.close();
	}

	private static void MoveXArrayLast(String str, int idx,int count ,String newString) {
		if(idx==str.length()-1)
		{
			for(int i=0;i<count;i++)
			{
				newString +='x';
			}
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		if(currChar=='x')
		{
			count++;
			MoveXArrayLast(str,idx+1,count,newString);
		}
		else {
			newString +=currChar;
			MoveXArrayLast(str,idx+1,count,newString);
		}
		 
	}

	
}


