import java.io.File;
import java.util.Scanner;

public class randomTitle {

    public String randomTitle() throws Exception{
        File file =new File("movie-titles-raw.txt");
        Scanner scanner = new Scanner(file);
        int randomLine = (int) (Math.random()*600)+1;
        //System.out.println(randomLine);
        String titleFilm="";

        for(int i=1;i<=randomLine && scanner.hasNextLine() ;i++){
           // System.out.print(i + "  ");
                titleFilm = scanner.nextLine();
        }
        return titleFilm;
    }
}
