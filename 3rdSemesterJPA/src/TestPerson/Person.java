
package TestPerson;


public class Person implements IUser {
    String userName = "Bo";
    String password = "Test";
    String role = "Admin";

    public Person(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getRole() {
        return role;
    }
}
