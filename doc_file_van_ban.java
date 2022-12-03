package test;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class doc_file_van_ban {
    public static void readFile(String fileName){
        try{
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here        
        readFile("DATA.in");
        
    }
    
}
