public class ContactList {
    Contact[] contacts = new Contact[10];
//    int counterOfContacts = 0;


    void addContact(Contact contact) {
        contacts[0] = contact;
//        counterOfContacts++;
//        for (int i = 0; i < contacts.length; i++) {
//            if (contacts[i] == null) {
//                contacts[i] = contact;
//                counterOfContacts++;
//            }
//        }

        System.out.println("Вы успешно добавили " + contact.name + " в наш список контактов!!!");
    }

    void deleteContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].equals(contact)) {
                contacts[i] = null;
            }
        }
    }

    void allContacts() {
        System.out.println("****************************************************");
        for (int i = 0; i < 1; i++) {
            System.out.println("---------------------");
            System.out.println(contacts[i].name);
            System.out.println(contacts[i].email);
            System.out.println(contacts[i].number);
        }
    }
}
