public class PasswordRecord {

    private String category;
    private String password;

    public PasswordRecord(String category, String password){
        this.category = category;
        this.password = password;
        System.out.println("A new password has been created!");
        System.out.println(category+" "+password);
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setPassword(String Password){
        this.password = password;
    }

    public String getCategory(){
        return this.category;
    }

    public String getPassword(){
        return this.password;
    }
}