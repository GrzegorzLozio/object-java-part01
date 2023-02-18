import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        ContactsManager myContactsManager = new ContactsManager();



        System.out.println("Enter name ");
         String name = scanner.nextLine();
        Contact newContact = new Contact( name);
       
        System.out.println("You live at: " + address);
    }
}