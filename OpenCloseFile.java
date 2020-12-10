import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class OpenCloseFile {
//no need for a main function since it is a class
private static final String DATA_FILE = "LukeBryantPasswords.txt";
private static Scanner in;
private static BufferedWriter out;
private static String s = "";

public static String readString(){
  if(in == null){
    try{
      in = new Scanner(new File(DATA_FILE));
    }
    catch(Exception e){
      System.err.println("Cannot open file for input!");
      e.printStackTrace();
    }
  }
  try{
    while(true){
      if(in.hasNext()){
        s += in.nextLine()+"\n";
        //return s;
      }
      else{
        return s;
      }
    }
  }
  catch(Exception e){
    System.err.println("Cannot read the file.....");
    e.printStackTrace();
  }
  return null;
}

  public static void writeString(String s){
    if(out == null){
      try{
        out = new BufferedWriter(new FileWriter(DATA_FILE));
      }
      catch(Exception e){
        System.err.println("Cannot open file for output!");
        e.printStackTrace();
      }
    }
    try{
      out.write(s);
      //out.newLine(); //adds in a new line of data
      out.write("|"); //this is like the byte space from FileWriting
    }
    catch(Exception e){
        System.err.println("Cannot write the file!");
        e.printStackTrace();
      }
  }

  public static void saveAndClose(){
    if (in != null) {
      try{
        //close() closes and saves the file you are writing to 
        in.close();
        in=null;
      }
      catch (Exception e) {
        System.err.println("Cannot close input file!");
        e.printStackTrace();
      }
    }
    //closes after the BufferedWriter is done writing to the file
    if (out != null) {
      try{
        //close() closes and saves the file you are writing to 
        out.close();
        out=null;
      }
      catch (Exception e) {
        System.err.println("Cannot close output file!");
        e.printStackTrace();
      }
    }
  }
}