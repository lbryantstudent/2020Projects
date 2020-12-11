import java.util.ArrayList;

public class User{

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private ArrayList<String> passwordList = new ArrayList<String>();


    public User(String username, String password, String firstName, String lastName, ArrayList<String> passwords) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwordList = passwords;
        System.out.println("New user created.");
        System.out.println("User: " + username + ", " + "Password: " + password + ", " + "First Name: " + firstName + ", " + "Last Name: " + lastName);
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("New user created. (No First/Last name specified.)");
        System.out.println("User: " + username + ", " + "Password: " + password);
    }

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New user created.");
        System.out.println("User: " + username + ", " + "Password: " + password + ", " + "First Name: " + firstName + ", " + "Last Name: " + lastName);
    }
    
    public String getPasswordList() {
        String blah;
        for (String i : this.passwordList) {
            blah += i;
        }
        return blah;
    }
    

    public void createPassword(String passwordGen) {
        this.passwordList.add(passwordGen);
    }

    public void modifyPassword(int passwordIndex, String newPass) {
        for (int i=0; i<this.passwordList.size();i++) {
            if (i==passwordIndex-1){
                this.passwordList.set(passwordIndex-1, newPass);
            }
        }
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirst(String f) {
        this.firstName = f;
    }

    public String getFirst() {
        return this.firstName;
    }

    public void setLast(String l) {
        this.lastName = l;
    }

    public String getLast() {
        return this.lastName;
    }

    public String getUser() {
        return this.username;
    }

}
