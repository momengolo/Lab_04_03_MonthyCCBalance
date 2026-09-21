public class Main {

    public static void main(String[] args) {

        double startingBalance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double monthOneInterest = 0.0;
        double monthOneBalance = 0.0;
        double monthTwoInterest = 0.0;
        double monthTwoBalance = 0.0;

        monthOneInterest = startingBalance * monthlyInterestRate;
        monthOneBalance = startingBalance + monthOneInterest;

        monthTwoInterest = monthOneBalance * monthlyInterestRate;
        monthTwoBalance = monthOneBalance + monthTwoInterest;

        System.out.println("The starting credit card balance is: $" + startingBalance);
        System.out.println("The annual interest rate is: " + (annualInterestRate * 100) + "%");
        System.out.println("The monthly interest rate is: " + (monthlyInterestRate * 100) + "%");
        System.out.println();
        System.out.println("The interest due after one month on a balance of $" + startingBalance
                + " is: $" + monthOneInterest);
        System.out.println("The balance after one month is: $" + monthOneBalance);
        System.out.println();
        System.out.println("The interest due after two months on a balance of $" + monthOneBalance
                + " is: $" + monthTwoInterest);
        System.out.println("The balance after two months is: $" + monthTwoBalance);
    }
}
