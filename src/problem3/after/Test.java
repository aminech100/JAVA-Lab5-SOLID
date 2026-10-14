package problem3.after;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(500);
        FixedTermAccount fixedTermAccount = new FixedTermAccount(1000);

        List<WithdrawableAccount> accounts = new ArrayList<>();
        accounts.add(currentAccount);

        Bank.chargeMonthlyFee(accounts);

        System.out.println("Current account balance: "
                + currentAccount.getBalance());
        System.out.println("Fixed-term account balance: "
                + fixedTermAccount.getBalance());
    }
}
