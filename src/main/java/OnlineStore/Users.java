package OnlineStore;

public enum Users {
    JONAS("kastonas2569", "jonas@gmail.com", 865437201),
    DONATAS("password","donatas@gmail.com", 86558293),
    NERINGA("slaptazodis", "neringa@gmail.com", 863204017),
    MATAS("ilgasslaptazodis", "matas@gmail.com", 86579354);

    String password;
    String email;
    int phoneNumber;

    Users(String password, String email, int phoneNumber) {
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
}
