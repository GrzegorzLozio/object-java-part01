import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file =new File("sample3.txt");
        Scanner scanner = new Scanner(file);
         int words=0;
         while(scanner.hasNextLine()){
             String line= scanner.nextLine();;
             words +=line.split(" ").length;
         }
        System.out.println("The words in the file is: "+words );
    }
}