import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        randomTitle randomTitle = new randomTitle();
        String password=randomTitle.randomTitle();
        System.out.println(password);
        hideText hideText=new hideText();
        char [] displayingString= hideText.hideText(password);
        findChars findChars = new findChars();
        findChars.findChars(password.toCharArray(),displayingString,'a');
        System.out.println(displayingString);




    }
}