import java.util.*;

public class UserLib {


    static boolean loggedIn = false;
    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {
        
        userList.add(new User("Squareguy", "mcmc", "Minecraft", "Steve"));
        loginForm();
        
        

    }

    public static void loggedIn() {
        Scanner in = new Scanner(System.in);
        clearScreen();
        System.out.println("Welcome to your password manager program. What would you like to do?");
        
        System.out.println("Commands: ");
        System.out.println("1: Create");
        System.out.println("2. Modify");
        System.out.println("3. Logout");
        System.out.println("4. Quit");
        System.out.println("5. Delete");
        System.out.println("6. List");

        String userCommand = in.nextLine();
        if (userCommand.equals("1") || userCommand.equals("create") || userCommand.equals("Create")) {
            System.out.println("What is the password");
            String pass = in.next();
            User.createPassword(pass);
        }

        else if (userCommand.equals("2") || userCommand.equals("modify") || userCommand.equals("Modify")) {
            
        }

        else if (userCommand.equals("3") || userCommand.equals("logout") || userCommand.equals("Logout")) {

        }

        else if (userCommand.equals("4") || userCommand.equals("quit") || userCommand.equals("Quit")) {
            
        }

        else if (userCommand.equals("5") || userCommand.equals("delete") || userCommand.equals("Delete")) {
            
        }

        else if (userCommand.equals("6") || userCommand.equals("list") || userCommand.equals("List")) {
            for (User u: userList) {
                u.getPasswordList();
            }
        }
*/
    }

    
    public static void enterPassword() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter password: ");
        String userCommand = in.nextLine();
        for (User u: userList) {
            if (userCommand.equals(u.getPassword())) {
                System.out.println("Welcome. You are now logged in as " + u.getUser());
                loggedIn();
            }

            else if (userCommand.equals("2") || userCommand.equals("users") || userCommand.equals("Users")) {
                System.out.println("Printing out users...");
                for (User uu : userList) {
                    System.out.println(uu.getUser());
                    enterPassword();
                }
            }
    
            else if (userCommand.equals("3") || userCommand.equals("Help") || userCommand.equals("help")) {
                System.out.println("Commands:");
                System.out.println("1: Login");
                System.out.println("2: Users");
                System.out.println("3: Help");
                System.out.println("4: Register");
                System.out.println("5: Quit");
                enterPassword();
            }
    
            else if (userCommand.equals("4") || userCommand.equals("Register") || userCommand.equals("register")) {
                registerForm();
            }
    
            else if (userCommand.equals("5") || userCommand.equals("Quit") || userCommand.equals("quit")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }

            else {
                System.out.println("Sorry, that password/command was not recognized. Please try entering a valid command.");
                enterPassword();
            }   

        }
    }

    public static void enterUsername() {
        Scanner in = new Scanner(System.in);
        clearScreen();
        System.out.println("Enter username: ");
        String userCommand = in.nextLine();
        for (User u: userList) {
            if (userCommand.equals(u.getUser())) {
                System.out.println("Welcome, " + u.getUser());
                    enterPassword();
                }
            

            else if (userCommand.equals("2") || userCommand.equals("users") || userCommand.equals("Users")) {
                System.out.println("Printing out users...");
                for (User uu : userList) {
                    System.out.println(uu.getUser());
                    enterUsername();
                }
            }
    
            else if (userCommand.equals("3") || userCommand.equals("Help") || userCommand.equals("help")) {
                System.out.println("Commands:");
                System.out.println("1: Login");
                System.out.println("2: Users");
                System.out.println("3: Help");
                System.out.println("4: Register");
                System.out.println("5: Quit");
                enterUsername();
            }
    
            else if (userCommand.equals("4") || userCommand.equals("Register") || userCommand.equals("register")) {
                registerForm();
            }
    
            else if (userCommand.equals("5") || userCommand.equals("Quit") || userCommand.equals("quit")) {
                System.out.println("Goodbye!");
                System.exit(0);
            }

            else {
                System.out.println("Sorry, that password/command was not recognized. Please try entering a valid command.");
                enterUsername();
            }    
        }

}


    public static void loginForm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Password Manager Program. Please Login.\n Available commands: ");
        System.out.println("");
        System.out.println("1: Login");
        System.out.println("2: Users");
        System.out.println("3: Help");
        System.out.println("4: Register");
        System.out.println("5: Quit");

        String userCommand = in.nextLine();
        if (userCommand.equals("1") || userCommand.equals("login") || userCommand.equals("Login")) {
            enterUsername();
        }

        else if (userCommand.equals("2") || userCommand.equals("users") || userCommand.equals("Users")) {
            System.out.println("Printing out users...");
            for (User u : userList) {
                System.out.println(u.getUser());
                loginForm();
            }
        }

        else if (userCommand.equals("3") || userCommand.equals("Help") || userCommand.equals("help")) {
            System.out.println("Commands:");
            System.out.println("1: Login");
            System.out.println("2: Users");
            System.out.println("3: Help");
            System.out.println("4: Register");
            System.out.println("5: Quit");
            loginForm();
        }

        else if (userCommand.equals("4") || userCommand.equals("Register") || userCommand.equals("register")) {
            registerForm();
        }

        else if (userCommand.equals("5") || userCommand.equals("Quit") || userCommand.equals("quit")) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        else {
            System.out.println("Sorry, that password/command was not recognized. Please try entering a valid command.");
            loginForm();
        }   
}


    public static void registerForm() {
        System.out.println("Registered...");
        loginForm();
    }


        //https://intellipaat.com/community/294/java-clear-the-console
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
        
        System.out.flush();  
        
        }    
    }