package learn.himanen;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contactToUpdate, Contact newContact) {
        int positionToUpdate = findContact(contactToUpdate);
        if (positionToUpdate >= 0) {
            myContacts.set(positionToUpdate, newContact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());


    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        ;
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }

    public Contact queryContact(String name) {
        for (Contact c : myContacts) {
            if (c.getName().equals(name)) {
                return c;
            }

        }
        return null;
    }
}


class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {

        return new Contact(name, phoneNumber);

    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
