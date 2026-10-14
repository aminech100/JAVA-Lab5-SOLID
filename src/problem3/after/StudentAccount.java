package problem3.after;

public class StudentAccount extends CurrentAccount{
    public StudentAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount){
        if (amount > 200) {
            throw new IllegalArgumentException("Exceeds student transaction limit of 200 MAD." );
        }
        super.withdraw(amount);
    }
}
