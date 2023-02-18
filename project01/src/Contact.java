public class Contact {
    String name;
    String email;
    String phoneNumber;

    Contact(String name, String email, String phoneNumber){
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    Contact(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    Contact(String name){
        this.name=name;
    }
}
