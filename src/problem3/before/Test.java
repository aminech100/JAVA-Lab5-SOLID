package problem3.before;

import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void main(String[] args){
        Account account = new Account(500);
        FixedTermAccount fixedTermAccount = new FixedTermAccount(1000);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(fixedTermAccount);

        Bank.chargeMonthlyFee(accounts);
    }

}
