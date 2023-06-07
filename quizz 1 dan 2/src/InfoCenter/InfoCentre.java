package InfoCenter;

public class InfoCentre implements AccountRegistration {

    Account account = makeAccount("Revandra", "0812xxxxxxxx", "repan@mail.com", "12345");
    Account account2 = makeAccount("Rachmad", "0811xxxxxxxx", "mamad@mail.com", "12345");

    @Override
    public Account makeAccount(String nama, String noHP, String email, String password) {
        return AccountManager.newAccount(nama, noHP, email, password);
    }
    public void activeAccount(){
        AccountManager.totalAccount();
    }

}