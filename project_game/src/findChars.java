public class findChars {

    public char [] findChars(char [] password,char [] displayingString,char guessChar){
        for(int i=0;i<password.length;i++){
            if(password[i]==guessChar){
                displayingString[i]=guessChar;
            }
        }
        return displayingString;



    }

}
