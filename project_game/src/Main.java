import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        randomTitle randomTitle = new randomTitle();
        String password=randomTitle.randomTitle();
        hideText hideText=new hideText();
        char [] displayingString= hideText.hideText(password);
        findChars findChars = new findChars();
        Scanner checkChar = new Scanner(System.in);
        char check;
        checkResult checkResult =new checkResult();
        for(int i = 10;i>=0;i--){
            System.out.println("Zostało "+i+" prób");
            System.out.println("Podaj Literę: ");
            check = checkChar.nextLine().toCharArray()[0];
            findChars.findChars(password.toCharArray(),displayingString,check);
            System.out.println(displayingString);
            if(checkResult.checkResult(displayingString)) {
                System.out.println("Wygrałeś");
                break;
            }
        }
        if(!checkResult.checkResult(displayingString)) {
            System.out.println("Hasło brzmiało: "+password);
            System.out.println("spróbuj ponownie ");

        }









    }
}