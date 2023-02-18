public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CheckingAccount  account1 = new CheckingAccount();
        SavingsAccount account2 =new SavingsAccount();
        CertificateOfDeposit account3 = new CertificateOfDeposit();

        account1.numberAccount="1234";
        account2.numberAccount="098765";
        account3.numberAccount="4872468877";

    }
}