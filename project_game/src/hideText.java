public class hideText {
    char [] password;
    public char [] hideText(String text){
        password = text.toCharArray();
        char [] finalText = password;
        for(int i = 0;i<text.length();i++){
           if (password[i]==' '){
               finalText[i]=' ';
            }else{
               finalText[i]='_';
           }
            System.out.print(password[i]);
        }
        System.out.println();
    return finalText;
    }
}
