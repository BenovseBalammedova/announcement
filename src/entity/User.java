package entity;

public class User {
   private String fullname;
   private int number;
   private  String Password;
   private  String email;

    public User() {
    }

    public User(String fullname, int number, String password, String email) {
        this.fullname = fullname;
        this.number = number;
        Password = password;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullname='" + fullname + '\'' +
                ", number=" + number +
                ", Password='" + Password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
