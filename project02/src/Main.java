import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       int randomNumber = (int) ((Math.random()*100)+1);
        System.out.println("I have randomly chosen a number between 1 and 100");
        System.out.println("Try to guess it");
        int guessNumber;
        boolean win=false;
        Scanner scanner=new Scanner(System.in);

        //guessNumber=scanner.nextInt();


        for(int i=10;i>0;i--){
            System.out.println("You have "+i+"tries left");
            guessNumber=scanner.nextInt();
            if(guessNumber>randomNumber){
                System.out.println("The drawn number is less");
            } else if (guessNumber<randomNumber) {
                System.out.println("The drawn number is greater");
            }else if (guessNumber == randomNumber)  {
                System.out.println("You are Winner!!!");
                win=true;
                break;
            }
        }
        if(!win){
            System.out.println("You are Losser");
            System.out.println("Try again");
        }

    }
}