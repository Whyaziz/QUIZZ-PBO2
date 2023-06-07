package InfoCenter;

import java.util.ArrayList;

public class AccountManager {

    static ArrayList<Account> listAccount = new ArrayList<>();

    public static Account newAccount(String nama, String noHP, String email, String password) {
        return new Account(nama, noHP, email, password);
    }

    public static void totalAccount() {

        System.out.println("There Are Curently " + listAccount.size() + " accout");

    }
}
