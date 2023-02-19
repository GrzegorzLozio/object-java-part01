import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        randomTitle randomTitle = new randomTitle();
        String password=randomTitle.randomTitle();
       // System.out.println(password);
        hideText hideText=new hideText();
        char [] displayingString= hideText.hideText(password);
        findChars findChars = new findChars();
        //findChars.findChars(password.toCharArray(),displayingString,'a');
        //System.out.println(displayingString);
        Scanner checkChar = new Scanner(System.in);
        //System.out.println("Podaj Literę: ");
        char check;// = checkChar.nextLine().toCharArray()[0];
        //findChars.findChars(password.toCharArray(),displayingString,check);
        //System.out.println(displayingString);
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
            System.out.println("spróbuj ponownie ");

        }









    }
}