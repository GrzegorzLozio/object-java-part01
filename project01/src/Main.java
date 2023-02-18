public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact newContact = new Contact();
        newContact.name="Kamil";
        newContact.phoneNumber="963852741";
        myContactsManager.addContact(newContact);
        Contact new1Contact = new Contact();
        new1Contact.name="Kuba";
        new1Contact.phoneNumber="91243576";
        myContactsManager.addContact(new1Contact);
        Contact new2Contact = new Contact();
        new2Contact.name="Hubert";
        new2Contact.phoneNumber="852159741";
        myContactsManager.addContact(new2Contact);

        System.out.println(myContactsManager.searchContact("Hubert").phoneNumber);
    }
}