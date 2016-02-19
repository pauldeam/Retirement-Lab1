package cisc181.glacurts;
//Paul Jureidini, Garrett LaCurts, Andy Lopez, Joaquin Martinez

import java.util.Scanner;
import java.lang.Math.*;

public class Main 
{
	int yearsRetired, annualReturn, yearsToWork, annualReturn2;
	double requiredIncome, monthlySSI, Savings, savingsMonthly, roundMonthlySavings;
	
	public void userInfo()
	{
		
		
		//Creates Scanner object to collect user input
		Scanner scanner = new Scanner(System.in);
		
		//Equation 1
		
		//User enters the number of years they expect to be retired
		System.out.println("Enter the number of years you expect to draw from your Social Security: ");
		yearsRetired = scanner.nextInt();
		
		//User enters their annual return
		System.out.println("Enter your expected annual return on investment during retiremnet (percent): ");
		
		//Monthly calculation
		annualReturn = scanner.nextInt();
		
		//User enters the required retirement income
		System.out.println("Enter your work income: ");
		requiredIncome = scanner.nextDouble();
		
		//User enters the monthly SSI
		System.out.println("Enter your expected SSI income: ");
		monthlySSI = scanner.nextDouble();
		
		//Equation 2
				
		//User enters the number of years they expect to work
		System.out.println("Enter the number of years you expect to work: ");
		yearsToWork = scanner.nextInt();
		
		//Equation 2 annual return
		System.out.println("Enter the annual return while working (percent): ");
		
		//Yearly calculation
		annualReturn2 = scanner.nextInt();
	}

	public void equations()
	{
		
		
		Savings = (requiredIncome-monthlySSI)
				*((1-(1/(Math.pow(1+(annualReturn*.01)/12,yearsRetired*12 )))))/
				((annualReturn*.01)/12);
		
		savingsMonthly = Savings *(((annualReturn2*.01)/12)/((Math.pow(1+(annualReturn2*.01)/12, 
				yearsToWork*12))-1));
		
		roundMonthlySavings = Math.round(savingsMonthly * 100.0) / 100.0;
		
		
		System.out.println("You would need to save $" + roundMonthlySavings + " per month" +
				" in order to stay on track.");
		
	}
	
	public static void main(String[] args) 
	{
		Main main = new Main();
		main.userInfo();
		main.equations();
		

	}

}
