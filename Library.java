import java.util.ArrayList;

public class Library {
    
    private ArrayList<PasswordRecord> currentUserPasswords = new ArrayList<PasswordRecord>();

    public Library(){
    
        //This imports the txt file with the read string function from open close file as a string
        String temp = OpenCloseFile.readString();
        
        // String method split splits this string based on the
        // specified token and returns an array of individual substrings
        System.out.println(temp);
        
        int i=0;
        while(i<temp.length());
         {
            String[] tokens = temp.split(", ");
            String category = tokens[0];
            String password = tokens[1];
            // add the book to the array list
            currentUserPasswords.add(new PasswordRecord(category, password));
            i+=category.length()+password.length();
         }
         
    }
      
    public ArrayList<PasswordRecord> getCurrentUserPasswords(){
      return currentUserPasswords;
      }

    public void createNewPassword(String category, String password){
        PasswordRecord tempPassword = new PasswordRecord(category, password);
        OpenCloseFile.writeString(tempPassword.getCategory()+" "+tempPassword.getPassword()+"\n");
    }
}