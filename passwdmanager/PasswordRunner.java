import java.util.Scanner;

public class PasswordRunner {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PasswordRecord leaguePassword = new PasswordRecord("Gaming","ariSux");
        PasswordRecord csgoPassword = new PasswordRecord("Gaming","0neTapp3dF00l");
        PasswordRecord minecraftPassword = new PasswordRecord("Religion","th3On3Tru35t3v3willReignFor3ver<3");
        //OpenCloseFile.writeString("category, password\nluke, rox\ncaleb, luvsrose");
        //OpenCloseFile.saveAndClose();
        System.out.println("Made past adding passwords");
        Library lukePWS = new Library();
        //LukePWS.createNewPassword("Gaming","ariSux");
        System.out.println("Made past library");
        modifyPassword(lukePWS);
    }

    public static void modifyPassword(Library lukePWS){
        System.out.println("Which password did you want to change(enter the category)");
        String cat = in.next();
        for(PasswordRecord i: lukePWS.getCurrentUserPasswords()){
            if(cat.equals(i.getCategory())){
                System.out.println("Enter the new password");
                String newPass = in.next();
                i.setPassword(newPass);
                savePasswords(lukePWS);
            }
        }
    }

    public static void savePasswords(Library lukePWS){
        for(PasswordRecord i: lukePWS.getCurrentUserPasswords()){
            //System.out.println(i.getCategory()+" "+i.getPassword()+"\n");
            OpenCloseFile.writeString(i.getCategory()+" "+i.getPassword()+"\n");
        }
        OpenCloseFile.saveAndClose(); 
    }

    
}