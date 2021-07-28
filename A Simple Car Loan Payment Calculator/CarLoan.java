public class CarLoan {

  public CarLoan(){}

  public void CalculateMonthlyPayment(int carLoan, int loanLength, int interestRate, int downPayment){
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if (downPayment >= carLoan) {
      System.out.println("Car can be paid in full.");
    }
    else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
  }

	public static void main(String[] args) {
    CarLoan loanOne = new CarLoan();
    loanOne.CalculateMonthlyPayment(10000, 3, 5, 2000);
    loanOne.CalculateMonthlyPayment(10000, 0, 5, 2000);
    loanOne.CalculateMonthlyPayment(1000, 3, 5, 2000);
	}
}
