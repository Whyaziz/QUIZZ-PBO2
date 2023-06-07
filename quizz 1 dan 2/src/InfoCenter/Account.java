package InfoCenter;

public class Account {

    String nama;
    String noHp;
    String email;
    String Password;

    public Account(String nama, String noHp, String email, String password) {
        this.nama = nama;
        this.noHp = noHp;
        this.email = email;
        Password = password;

        AccountManager.listAccount.add(this);

    }
}
