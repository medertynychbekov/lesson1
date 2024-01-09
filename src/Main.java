public class Main {
//    public static void main(String[] args) {
//
//        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.ownerName = "Meder";
//        bankAccount.accountNumber = 2354;
//        bankAccount.balance = 0;
//
//        bankAccount.accountInfo();
//
//        bankAccount.deposit(5_000);
//
//        bankAccount.accountInfo();
//
//        bankAccount.withdraw(2_500);
//
//        bankAccount.accountInfo();
//    }

    public static void main(String[] args) {
        Contact samira = new Contact();
        samira.name = "Samira";
        samira.email = "samira@gmail.com";
        samira.number = 782847848;

        Contact eles = new Contact();
        eles.name = "Eles";
        eles.email = "eles@gmail.com";
        eles.number = 384785;

        ContactList contactList = new ContactList();


        contactList.addContact(samira);
        contactList.allContacts();

        contactList.addContact(eles);
        contactList.allContacts();
    }

}
