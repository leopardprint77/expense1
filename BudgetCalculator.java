/* MIS350 Project 
   12/08/2020
   Kiran Cardozo
   This program helps calculate how long it will take for an user
   to buy a car considering the amount of money they make, their expenditures, and 
   the price of the car they will purchase
*/
public class BudgetCalculator {

   double monthlyExpenses;
   double originalSavings;
   
   //Constructor
   public BudgetCalculator() {
   }
   
   // Method 1
   public double calculateNetBalance(double rentExpenses, double utilityExpenses, double transportExpenses, double foodExpenses, double entertainExpenses,double monthlyPaycheck) {
   double netBalance = 0;
   
   // First calculate the total expenses
   monthlyExpenses = rentExpenses + utilityExpenses + transportExpenses + foodExpenses + entertainExpenses;
   // Calculate net balance
   netBalance = monthlyPaycheck - monthlyExpenses;
   System.out.println("\nThe net balance from your paycheck is: " + netBalance);
   
   return netBalance;
   }
   
   
   
   // Method 2
   public double calculateBudget(double savePercent, double monthlyPay) {
   double budget = 0;
   //Calclate oriinal saving amount
   originalSavings = (savePercent/100) * monthlyPay;
   //Budget based on monthly pay and original saving amount
   budget = monthlyPay - originalSavings;
   
   return budget;
   }
   
   
   // Method 3
   public double calculateYears(double interestRate, double totalSavings, double carPrice) {
   double numYears = 0;
   //Annual yield based on interest rate compounded annually
   double annualYield = (interestRate/100) * totalSavings;
   //Total amount of balance per year
   double yearlyBalance = annualYield + totalSavings;
   
   System.out.println("You save " + yearlyBalance + " per year");
   //Computed remaining balance by subtracting total car price from bank balance
   double remBalance = yearlyBalance - carPrice;
   
   if (remBalance >=0) {
      System.out.println("\nYou can buy a car within a year!!");
   } 
   else {
      numYears = carPrice / yearlyBalance;
      System.out.printf("\nYou can buy a car within %.2f years", numYears);
   }
   
   return numYears;
   
   }

}
