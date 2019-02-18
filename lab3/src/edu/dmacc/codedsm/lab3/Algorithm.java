package edu.dmacc.codedsm.lab3;

import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
 
		System.out.println("Books selection Panel");
		System.out.println("Code Name $$                      Code Name $$   ");
		System.out.println("FICTION                         NON-FICTION");
		System.out.println("1. Frozen  2$                     2. FortKnox     1$");
		System.out.println("3. Moana   3$                     4. Constitution 4$");
		System.out.println("5. Harry Potter 4$                6.  Area51      5$");
		System.out.println("Enter Number of books you want to purchase");
		Scanner scanner=new Scanner(System.in);
		int total_no_of_books = scanner.nextInt();
//	scanner.close();
		Scanner in = new Scanner(System.in);
		int[] vars = new int[total_no_of_books];
		 
		System.out.println("Enter "+vars.length+" book Codes: ");
		for(int i = 0; i < vars.length; i++)
		  vars[i] = in.nextInt();
//		scanner.close();
		int fiction=0;
		int nonfiction=0;
		int sum=0;
		for(int i = 0; i < vars.length; i++)
				
//			  if (vars[i]==1 || vars[i]==3 ||vars[i]==5 )
//			  {
//				  fiction=fiction+1; 
//			  }
//			  else
//			  {
//				  nonfiction=nonfiction+1;
//			  }
			switch (vars[i]) {
			case 1:
				fiction=fiction+1;
				sum=sum+2;
				break;

			case 2:
				nonfiction=nonfiction+1;
				sum=sum+1;
				break;

			case 3:
				fiction=fiction+1;
				sum=sum+3;
				break;

			case 4:
				nonfiction=nonfiction+1;
				sum=sum+4;
				break;

			case 5:
				fiction=fiction+1;
				sum=sum+4;
				break;

			case 6:
				nonfiction=nonfiction+1;
				sum=sum+5;
				break;

				
			default:
				break;
			}
		System.out.println("Fiction Count:"+fiction);
		System.out.println("NonFiction Count"+nonfiction);
		System.out.println("sum:"+sum);
	}

}
