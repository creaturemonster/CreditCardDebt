import java.awt.*;
import javax.swing.JOptionPane;
import java.math.*;
import java.lang.Math;
import java.util.Scanner;
public class StudentCreditCardDebt2 {
	private double Principal;
	private double InterestRate;

public StudentCreditCardDebt2()
{
	Principal=5000;
	InterestRate=0.18;
}
public  double getPrincipal()
{
	return Principal;
}
public  double getInterestRate()
{
	return InterestRate;
}
public StudentCreditCardDebt2(double iPrincipal, double iInterestRate)
{
	Principal=iPrincipal;
	InterestRate=iInterestRate;
	
}

public  double MinimumPayment(double n)
{
	return n*0.02;
}
public double InterestPayment(double n)
{
	return ((0.18/12)*n);
}
public double PrincipalPayment(double n)
{
	return (n*0.02-(0.18/12*n));
}
public double RemainingBalance(double n)
{
	double InterestPay=0.18/12*n;
	return Math.round((n-(n*0.02-InterestPay*100.0)))/100.0;
}


	

public static void RemainingBalanceAfterMMonths(int m, double balance)
{
	int months=1;
	double minP=0;
	double InterestPay=0;
	double AccuInterest=0;
	for(int i=1;i<=months;i++)
	{
		minP=Math.round(balance*0.02*100.0)/100.0;
		if(minP<15)
		{
			minP=15;
		}
		InterestPay=Math.round(0.18/12*balance*100.0)/100.0;
		AccuInterest=Math.round((InterestPay+AccuInterest)*100.0)/100.0;
		balance=Math.round((balance-(minP-InterestPay))*100.0)/100.0;
		
		System.out.println("This is your credit card balance after "+ i+" months: "+ balance);
		System.out.println("This is your minimum payments after "+ i+" months: "+minP);
		System.out.println("This is your Accumulate Interest:"+" "+AccuInterest);
	}
}




public static void TimeToPayOffDebt1(double balance)
{

	Double InterestPay1=0.0;
	Double minP1=0.0;
	int months1=0;
		while(balance>=0)
		{
			minP1=Math.round(balance*0.02*100.0)/100.0;
			if(minP1<15.0)
				minP1=15.0;
			InterestPay1=Math.round(0.18/12*balance*100.0)/100.0;
			balance=Math.round((balance-(minP1-InterestPay1))*100.0)/100.0;
				months1++;
			
		}
		System.out.println("This is the number of months you will pay off your debt:"+" "+months1);

}
public static void main(String[] args) 
{
	Scanner one=new Scanner(System.in);
	StudentCreditCardDebt2 two=new StudentCreditCardDebt2();
	System.out.print("What is the  balance:");
	double balance=one.nextDouble();
	double balance1=balance;
	System.out.println("The interest rate is:"+two.getInterestRate());
	System.out.println("The minimum payment is:"+two.MinimumPayment(balance));
	System.out.print("Number of Months:");
	int months=one.nextInt();
	RemainingBalanceAfterMMonths(70,5000);
	TimeToPayOffDebt1(5000);
