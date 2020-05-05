package OnlineStore;

public class Login {

    String userName;
    String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
        //System.out.println("Welcome " + userName);
    }
    public String getUserName() {
        return userName;
    }
}
