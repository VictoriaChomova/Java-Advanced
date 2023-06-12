package problem9;

public class User implements java.io.Serializable {
    String username;
    String password;
    String registrationDate;

    public User(String username, String password, String registrationDate) {
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public void printUser() {
        System.out.printf("Username: %s%nPassword: %s%nRegistration name: %s",
                this.username, this.password, this.registrationDate);
    }
}
