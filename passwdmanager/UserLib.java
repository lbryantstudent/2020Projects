import java.util.*;

public class UserLib {


    static boolean loggedIn = false;
    static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {
        
        userList.add(new User("Squareguy", "mcmc", "Minecraft", "Steve"));
        loginForm();
        
        

    }
    
    public static void loginForm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Password Manager Program. Please Login.\n Available commands: ");
        System.out.println("");
        System.out.println("1: Login");
        System.out.println("2: Users");
        System.out.println("3: Help");
        System.out.println("4: Register");

        String userCommand = in.nextLine();
        if (userCommand.equals("1" || "login" || "Login")) {
            enterUserPass();
        }

        else if (userCommand.equals("2" || "users" || "Users")) {
            System.out.println("")
        }


            
        }

        //https://intellipaat.com/community/294/java-clear-the-console
    public static void clearScreen() {  

        System.out.print("\033[H\033[2J");  
        
        System.out.flush();  
        
        }    
    }