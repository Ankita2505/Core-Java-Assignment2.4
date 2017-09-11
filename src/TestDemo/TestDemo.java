package TestDemo;
/*
 * Program to Check value of number entered as zero and 3 subject Marks and printing grading systems
 */
import java.util.Scanner; //Importing Scanner Class
public class TestDemo 
{
	public static void main(String[] args) // Start of Main Class
	{
		// TODO Auto-generated method stub
		int Phy_marks =0,Chem_marks=0,Math_marks=0,avg=0,n=0;		
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		System.out.println("Enter value ");//user input 
		n=sc.nextInt();
		if(n==0) 
		{
			System.out.println("You Have Entered Zero");
			System.out.println("ASCII value of the Number"+n+"is="+(char)n);
		}
		else if(n>0) 
		{
			System.out.println("You Have Entered Positive Value");
			System.out.println("ASCII value of the Number"+n+"is="+(char)n);
		}		    
		else if(n<0) 
		{
			System.out.println("You Have Entered Negative Value");
			System.out.println("ASCII value of the Number"+n+"is="+(char)n);
		}
		else
			System.out.println("Wrong Input");
		//Checking Average of 3 Marks and Grading System
	    System.out.println("Enter Physics marks ");//user input for Physics Marks
	    Phy_marks=sc.nextInt();
	    System.out.println("Enter Chemistry marks ");//user input for Chemistry Marks
	    Chem_marks=sc.nextInt();
	    System.out.println("Enter Maths marks ");//user input for Math Marks
	    Math_marks=sc.nextInt();
	    sc.close();	 
	    avg =(Phy_marks+Chem_marks+Math_marks)/3;
	    System.out.println("Average marks of 3 Subjects =" +avg);
	    if(avg>70)
	    	System.out.println("Grade A");
	    else if(avg>=61 && avg<=70)
	    	System.out.println("Grade B");
	    else if(avg<61)
	    	System.out.println("Grade C");
	    else
	    	System.out.println("Invalid Average Marks");		
	} // Close Of Main Class
}

